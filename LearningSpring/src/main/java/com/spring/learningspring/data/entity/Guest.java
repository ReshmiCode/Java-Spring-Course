package com.spring.learningspring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GUEST")
public class Guest {
   @Id
   @Column(name="GUEST_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long guestId;

   @Column(name="FIRST_NAME")
   private String firstName;

   @Column(name="LAST_NAME")
   private String lastName;

   @Column(name="EMAIL_ADDRESS")
   private String emailAddress;

   @Column(name="COUNTRY")
   private String country;

   @Column(name="STATE")
   private String state;

   @Column(name="PHONE_NUMBER")
   private String phoneNumber;

   public long getGuestId() {
      return guestId;
   }

   public void setGuestId(long aGuestId) {
      guestId = aGuestId;
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

   public String getEmailAddress() {
      return emailAddress;
   }

   public void setEmailAddress(String aEmailAddress) {
      emailAddress = aEmailAddress;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String aCountry) {
      country = aCountry;
   }

   public String getState() {
      return state;
   }

   public void setState(String aState) {
      state = aState;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String aPhoneNumber) {
      phoneNumber = aPhoneNumber;
   }
}
