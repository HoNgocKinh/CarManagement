package com.httt.car_management.controllers;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.httt.car_management.entities.BillDetailEntity;
import com.httt.car_management.entities.BillEntity;
import com.httt.car_management.entities.CarEntity;
import com.httt.car_management.repositories.AccountRepository;
import com.httt.car_management.repositories.BillRepository;
import com.httt.car_management.repositories.CarRepository;
import com.httt.car_management.repositories.UserInfoRepository;


@RestController
@RequestMapping("/seed")
public class SeedControllers {

	
	private UserInfoRepository userInfoRepository;
	private AccountRepository accountRepository;
	private CarRepository carRepository;
	private BillRepository billRepository;
	
	@RequestMapping(value = "/bills", method = RequestMethod.GET)
	public ResponseEntity<String> addSeedDataForBill() {
	
		List<Long> accountIds = this.accountRepository.findAll().stream()
							.map(account -> account.getUserInfoId()).collect(Collectors.toList());
		
		List<Long> userInfoIds = this.userInfoRepository.findAll().stream()
				.map(userInfo -> userInfo.getId()).collect(Collectors.toList());
		
		List<CarEntity> cars = this.carRepository.findAll();
		List<Long> carIds = cars.stream().map(car -> car.getId()).collect(Collectors.toList());
		
		userInfoIds.removeAll(accountIds);
		// after remove all account Ids - userInfoIds are customers
		
		System.out.println(accountIds);
		System.out.println(userInfoIds);
		
		BillDetailEntity billDetailEntity = null;
		BillEntity bill = null;
		Random r = new Random();
		CarEntity carEntity = null;
		
		for (int i = 0; i < 300; i++) {
			
			int indexForAccount = Math.abs(r.nextInt() % accountIds.size());
			int indexForUserInfo = Math.abs(r.nextInt() % userInfoIds.size());
			int indexForNumberCar = Math.abs(r.nextInt() % 3);
			
			bill = new BillEntity();
			bill.setStaffId(accountIds.get(indexForAccount));
			bill.setCustomerId(userInfoIds.get(indexForUserInfo));
				
			double total = 0d;
			for (int j = 0; j <= indexForNumberCar; j++) {
				total = 0d;
				int indexForCar = Math.abs(r.nextInt() % carIds.size());
				carEntity = cars.get(indexForCar);
				
	 			billDetailEntity = new BillDetailEntity();
				billDetailEntity.setBill(bill);
				billDetailEntity.setCar(carEntity);
				billDetailEntity.setQuantity(carEntity.getQuantity() - 1);
				billDetailEntity.setPrice(carEntity.getSellPrice());
				billDetailEntity.setCreatedAt(ZonedDateTime.now());
				billDetailEntity.setUpdatedAt(ZonedDateTime.now());
				billDetailEntity.setActive(true);
				
				total += carEntity.getSellPrice();
				bill.getBilldetails().add(billDetailEntity);
			}
			
			bill.setTotal(total);
			bill.setCreatedAt(ZonedDateTime.now());
			bill.setUpdatedAt(ZonedDateTime.now());
			bill.setActive(true);
			billRepository.save(bill);
		}
		
//		System.out.println(accountIds);
//		System.out.println(userInfoIds);
//		System.out.println(carIds);
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
	@Autowired
	public void setCarRepository(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	@Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	@Autowired
	public void setBillRepository(BillRepository billRepository) {
		this.billRepository = billRepository;
	}
}
