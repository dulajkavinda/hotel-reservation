package com.spring.lil.learningspring.web;

import com.spring.lil.learningspring.business.domain.RoomReservation;
import com.spring.lil.learningspring.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class RoomReservationWebConreoller {

    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebConreoller(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReseervations(@RequestParam(value = "date", required = false) String dateString, Model model){
        Date date = DateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }
}
