package com.test.blood_donation_management.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Atul
 */
@Entity
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@Column(nullable = false)
	private String houseAddress;
	@Column(nullable = false)
	private String City;
	@Column(nullable = false)
	private int pinCode;

}
