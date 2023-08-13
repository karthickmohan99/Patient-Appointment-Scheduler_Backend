package com.project.dto;

import java.util.Date;



import lombok.Data;

@Data
public class AppointmentRequest {
	
	//private Long doctorId;
    private String doctor_name;
    private Date startTime;
    private String patientName;
}
