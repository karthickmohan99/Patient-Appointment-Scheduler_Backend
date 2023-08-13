package com.project.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Appointment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;


    private String doctor;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    private String patientName;
}
