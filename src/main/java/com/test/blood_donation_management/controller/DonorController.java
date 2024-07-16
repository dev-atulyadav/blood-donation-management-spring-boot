package com.test.blood_donation_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Atul
 */
@RestController
@RequestMapping(value = "/donor")
public class DonorController {

	@GetMapping(value = "/saveDonor")
	public String saveDonorController() {
		return "Hello World";
	}

}
