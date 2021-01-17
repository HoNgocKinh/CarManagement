package com.httt.car_management.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seed")
public class SeedControllers {

	public ResponseEntity<String> addSeedDataForUserInfo() {
		
//		try (BufferedReader br = new BufferedReader(new FileReader(new File("sql/user_info.csv")))) {
//			System.out.println(br.ready());
//		}
//		catch (IOException ex) {
//			ex.printStackTrace();
//		}
		
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForAccount() {
		
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForCars() {
		
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForBill() {
	
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForBillDetail() {
		
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForCoupon() {
		
		return null;
	}
}
