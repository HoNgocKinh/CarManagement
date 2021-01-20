package com.httt.car_management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class CommonResource {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String renderLoginPage() {
		
		return "login";
	}
	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public String renderAccountPage() {
		
		return "account/index";
	}
	
}
