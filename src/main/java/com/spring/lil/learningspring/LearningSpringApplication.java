package com.spring.lil.learningspring;

import com.spring.lil.learningspring.data.entity.Guest;
import com.spring.lil.learningspring.data.entity.Reservation;
import com.spring.lil.learningspring.data.entity.Room;
import com.spring.lil.learningspring.data.repository.GuestRepository;
import com.spring.lil.learningspring.data.repository.ReservationRepository;
import com.spring.lil.learningspring.data.repository.RoomRepository;
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


}
