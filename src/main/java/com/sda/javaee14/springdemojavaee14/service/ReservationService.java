package com.sda.javaee14.springdemojavaee14.service;


import com.sda.javaee14.springdemojavaee14.entity.Reservation;
import com.sda.javaee14.springdemojavaee14.repository.ReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations() {
        log.info("finding all reservations");

        return reservationRepository.findAll();
    }
}