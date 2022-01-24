package com.spring.learningspring.data.repository;

import com.spring.learningspring.data.entity.Reservation;
import java.sql.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
   Iterable<Reservation> findReservationByResDate(Date date);
}
