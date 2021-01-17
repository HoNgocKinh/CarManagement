package com.httt.car_management.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.httt.car_management.repositories.AccountRepository;
import com.httt.car_management.repositories.CarRepository;
import com.httt.car_management.repositories.UserInfoRepository;


@RestController
@RequestMapping("/seed")
public class SeedControllers {

	
	private UserInfoRepository userInfoRepository;
	private AccountRepository accountRepository;
	private CarRepository carRepository;

	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	public ResponseEntity<String> addSeedDataForBill() {
	
		List<Long> accountIds = this.accountRepository.findAll()
													.stream()
													.map(account -> account.getUserInfoId())
													.collect(Collectors.toList());
		
		List<Long> userInfoIds = this.userInfoRepository.findAll()
													.stream()
													.map(userInfo -> userInfo.getId())
													.collect(Collectors.toList());
		
		List<Long> carIds = this.carRepository.findAll()
											.stream()
											.map(car -> car.getId())
											.collect(Collectors.toList());
		System.out.println(accountIds);
		System.out.println(userInfoIds);
		
		System.out.println(carIds);
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForBillDetail() {
		
		return null;
	}
	
	public ResponseEntity<String> addSeedDataForCoupon() {
		
		return null;
	}
	
	/**
	 * Getter/ Setters Beans
	 */
	@Autowired
	public void setUserInfoRepository(UserInfoRepository userInfoRepository) {
		this.userInfoRepository = userInfoRepository;
	}
	public UserInfoRepository getUserInfoRepository() {
		return this.userInfoRepository;
	}
	@Autowired
	public void setCarRepository(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	public CarRepository getCarRepository() {
		return this.carRepository;
	}
	@Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	public AccountRepository getAccountRepository() {
		return this.accountRepository;
	}
}
