package com.sda.javaee14.springdemojavaee14.repository;


import com.sda.javaee14.springdemojavaee14.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends
        // first argument is Entity
        // second is type of primary key of Entity
        JpaRepository<Reservation, Long> {
}