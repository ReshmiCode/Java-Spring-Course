package com.spring.learningspring;

import com.spring.learningspring.data.entity.Guest;
import com.spring.learningspring.data.entity.Reservation;
import com.spring.learningspring.data.entity.Room;
import com.spring.learningspring.data.repository.GuestRepository;
import com.spring.learningspring.data.repository.ReservationRepository;
import com.spring.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

   public static void main(String[] args) {
      SpringApplication.run(LearningSpringApplication.class, args);
   }

   @RestController
   @RequestMapping("/rooms")
   public class RoomController {
      @Autowired
      private RoomRepository roomRepository;

      @GetMapping
      public Iterable<Room> getRooms() {
         return this.roomRepository.findAll();
      }
   }

}
