package com.test.blood_donation_management.dao.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.blood_donation_management.dao.DonorDao;
import com.test.blood_donation_management.dto.Donor;
import com.test.blood_donation_management.repository.DonorRepository;

/**
 * @author Atul
 */
@Repository
public class DonorDaoImpli implements DonorDao {

	@Autowired
	private DonorRepository donorRepository;

	@Override
	public Donor saveDonorDao(Donor donor) {
		return donorRepository.save(donor);
	}

	@Override
	public Donor getDonorByEmailDao(String email) {
		return donorRepository.findByEmail(email);
	}

	@Override
	public Donor getDonorByPhoneDao(long phone) {
		return donorRepository.findByPhone(phone);
	}

}
