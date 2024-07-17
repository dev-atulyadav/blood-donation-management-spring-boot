package com.test.blood_donation_management.dao;

import com.test.blood_donation_management.dto.Donor;

/**
 * @author Atul
 */
public interface DonorDao {

	public Donor saveDonorDao(Donor donor);

	public Donor getDonorByEmailDao(String email);

	public Donor getDonorByPhoneDao(long phone);

}
