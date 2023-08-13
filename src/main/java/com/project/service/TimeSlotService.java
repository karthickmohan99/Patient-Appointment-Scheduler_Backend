package com.project.service;

import java.util.List;
import com.project.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

import com.project.repo.TimeSlotRepository;

@Service
public class TimeSlotService {

	@Autowired
	TimeSlotRepository timeSlotRepository;
	
	public List<TimeSlot> getAvailableTimeSlots() {
        // Get current date and time
        Date currentTime = new Date();

        // Fetch available time slots
        return timeSlotRepository.findByStartTimeAfterOrderByStartTime(currentTime);
    }
	
}
