package com.spring.learningspring.business.service;

import com.spring.learningspring.business.domain.RoomReservation;
import com.spring.learningspring.data.entity.Guest;
import com.spring.learningspring.data.entity.Reservation;
import com.spring.learningspring.data.entity.Room;
import com.spring.learningspring.data.repository.GuestRepository;
import com.spring.learningspring.data.repository.ReservationRepository;
import com.spring.learningspring.data.repository.RoomRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // or @Component
public class ReservationService {
   private final RoomRepository roomRepository;
   private final GuestRepository guestRepository;
   private final ReservationRepository reservationRepository;

   @Autowired
   public ReservationService(RoomRepository aRoomRepository,
         GuestRepository aGuestRepository,
         ReservationRepository aReservationRepository) {
      roomRepository = aRoomRepository;
      guestRepository = aGuestRepository;
      reservationRepository = aReservationRepository;
   }

   public List<RoomReservation> getRoomReservationsForDate(Date date) {
      Iterable<Room> rooms = this.roomRepository.findAll();
      Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
      rooms.forEach(room -> {
         RoomReservation roomReservation = new RoomReservation();
         roomReservation.setRoomId(room.getRoomId());
         roomReservation.setRoomName(room.getRoomName());
         roomReservation.setRoomNumber(room.getRoomNumber());
         roomReservationMap.put(room.getRoomId(), roomReservation);
      });

      Iterable<Reservation> reservations = this.reservationRepository.findReservationByResDate(new java.sql.Date(date.getTime()));
      reservations.forEach(reservation -> {
         RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
         roomReservation.setDate(date);
         Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
         roomReservation.setGuestId(guest.getGuestId());
         roomReservation.setFirstName(guest.getFirstName());
         roomReservation.setLastName(guest.getLastName());
      });

      List<RoomReservation> roomReservations = new ArrayList<>();
      for(Long id: roomReservationMap.keySet()) {
         roomReservations.add(roomReservationMap.get(id));
      }
      return roomReservations;
   }

   public List<Guest> getHotelGuests(){
      Iterable<Guest> guests = this.guestRepository.findAll();
      List<Guest> guestList = new ArrayList<>();
      guests.forEach(guest->{guestList.add(guest);});
      guestList.sort(new Comparator<Guest>() {
         @Override
         public int compare(Guest o1, Guest o2) {
            if (o1.getLastName() == o2.getLastName()){
               return o1.getFirstName().compareTo(o2.getFirstName());
            }
            return o1.getLastName().compareTo(o2.getLastName());
         }
      });
      return guestList;
   }
}
