package com.spring.learningspring.business.domain;

import java.util.Date;

public class RoomReservation {
   private long roomId;
   private long guestId;
   private String roomName;
   private String roomNumber;
   private String firstName;
   private String lastName;

   public long getRoomId() {
      return roomId;
   }

   public void setRoomId(long aRoomId) {
      roomId = aRoomId;
   }

   public long getGuestId() {
      return guestId;
   }

   public void setGuestId(long aGuestId) {
      guestId = aGuestId;
   }

   public String getRoomName() {
      return roomName;
   }

   public void setRoomName(String aRoomName) {
      roomName = aRoomName;
   }

   public String getRoomNumber() {
      return roomNumber;
   }

   public void setRoomNumber(String aRoomNumber) {
      roomNumber = aRoomNumber;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String aFirstName) {
      firstName = aFirstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String aLastName) {
      lastName = aLastName;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date aDate) {
      date = aDate;
   }

   private Date date;
}
