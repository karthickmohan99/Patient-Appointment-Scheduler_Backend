package com.project.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.TimeSlot;

public interface TimeSlotRepository  extends JpaRepository<TimeSlot, Long>{
	List<TimeSlot> findByStartTimeAfterOrderByStartTime(Date currentTime);

}
