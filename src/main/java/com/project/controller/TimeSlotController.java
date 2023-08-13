package com.project.controller;

import com.project.entity.TimeSlot;
import com.project.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time-slots")
public class TimeSlotController {

	@Autowired
	TimeSlotService timeSlotService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/available")
    public List<TimeSlot> getAvailableTimeSlots() {
        return timeSlotService.getAvailableTimeSlots();
    }
}
