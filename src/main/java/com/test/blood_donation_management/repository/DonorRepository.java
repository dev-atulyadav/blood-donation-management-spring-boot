package com.test.blood_donation_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.blood_donation_management.dto.Donor;

/**
 * @author Atul
 */
public interface DonorRepository extends JpaRepository<Donor, Integer> {

	public Donor findByEmail(String email);

	public Donor findByPhone(long phone);
}
