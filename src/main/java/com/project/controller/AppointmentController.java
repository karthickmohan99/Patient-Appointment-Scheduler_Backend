package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.AppointmentRequest;
import com.project.entity.Appointment;
import com.project.entity.Doctor;
import com.project.service.*;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	
	@GetMapping
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }
		
	
	@PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        Doctor doctor = new Doctor(); // You need to fetch or create the Doctor entity here
        doctor.setName(appointmentRequest.getDoctor_name());
       // doctor.setId(appointmentRequest.getDoctorId());
        Appointment appointment = new Appointment();
        appointment.setDoctor(doctor.getName());
        appointment.setStartTime(appointmentRequest.getStartTime());
        appointment.setPatientName(appointmentRequest.getPatientName());

        Appointment savedAppointment = appointmentService.createAppointment(appointment);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAppointment);
    }
	
	@DeleteMapping("/{appointmentId}")
	public ResponseEntity<String> deleteAppointment(@PathVariable Long appointmentId) {
	    appointmentService.deleteAppointment(appointmentId);
	    
	    
        return ResponseEntity.noContent().build();

	    
	}

}
