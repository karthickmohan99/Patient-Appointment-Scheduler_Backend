package com.project.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.*;
import com.project.repo.AppointmentRepository;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
	
	public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
	
	public void deleteAppointment(Long appointmentId) {
        if (appointmentRepository.existsById(appointmentId)) {
            appointmentRepository.deleteById(appointmentId);
        }
	}

}
