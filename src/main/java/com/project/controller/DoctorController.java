package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Doctor;
import com.project.service.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	 @GetMapping
	    public List<Doctor> getAllDoctors() {
	        return doctorService.getAllDoctors();
	    }

	
}
