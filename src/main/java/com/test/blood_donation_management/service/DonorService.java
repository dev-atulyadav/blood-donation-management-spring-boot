package com.test.blood_donation_management.service;

import com.test.blood_donation_management.dto.Donor;

/**
 * @author Atul
 */
public interface DonorService {

	public Donor saveDonorService(Donor donor);

	public Donor loginDonorWithEmailAndPasswordService(String email, String password);

	public Donor loginDonorWithPhoneAndPasswordService(long phone, String password);

}
