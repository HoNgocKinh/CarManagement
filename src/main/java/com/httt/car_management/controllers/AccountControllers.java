package com.httt.car_management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.httt.car_management.services.AccountService;

@Controller
@RequestMapping(value = "/admin/accounts")
public class AccountControllers {
	
	private AccountService accountService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAccounts() {
		
//		this.accountService.findAll();
		return "account/index";
	}
	
	/**
	 * Getter / Setter Beans
	 */
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	public AccountService getAccountService() {
		return this.accountService;
	}
	
}
