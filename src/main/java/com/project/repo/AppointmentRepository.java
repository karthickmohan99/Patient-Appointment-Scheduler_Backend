package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	
	

}
