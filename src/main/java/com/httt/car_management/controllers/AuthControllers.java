package com.httt.car_management.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.httt.car_management.dtos.AccountDTO;
import com.httt.car_management.services.AccountService;
import com.httt.car_management.utils.Constants;

@Controller
@RequestMapping("/auth")
public class AuthControllers {
	
	private AccountService accountService;
	
	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public String verifySignIn(@RequestParam(name = "username") String username,
		  					   @RequestParam(name = "password") String password,
		  					   RedirectAttributes redirectAttrs) {
		
		Optional<AccountDTO> accountOpl = this.accountService.verifyAccount(username, password);
		if (accountOpl.isPresent()) {
			return "index";
		}
		redirectAttrs.addFlashAttribute("ERROR_MESSAGE", Constants.LOGIN_ERROR_MESSAGE);
		return "redirect:/login";
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
