package com.spring.learningspring.data.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="RESERVATION_ID")
   private String reservationId;

   @Column(name="ROOM_ID")
   private long roomId;

   @Column(name="GUEST_ID")
   private long guestId;

   @Column(name="RES_DATE")
   private Date resDate;

   public String getReservationId() {
      return reservationId;
   }

   public void setReservationId(String aReservationId) {
      reservationId = aReservationId;
   }

   public long getRoomId() {
      return roomId;
   }

   public void setRoomId(long aRoomId) {
      roomId = aRoomId;
   }

   public Long getGuestId() {
      return guestId;
   }

   public void setGuestId(long aGuestId) {
      guestId = aGuestId;
   }

   public Date getResDate() {
      return resDate;
   }

   public void setResDate(Date aResDate) {
      resDate = aResDate;
   }
}
