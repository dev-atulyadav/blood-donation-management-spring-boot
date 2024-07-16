package com.test.blood_donation_management.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 * @author Atul
 */
@Entity
@Data
public class Donor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true, nullable = false)
	private LocalDate donorDob;
	private String donorBloodGrp;
	private String email;
	@Column(length = 8, nullable = false)
	private String password;
	@OneToOne
	private Address donorAddress;

}
