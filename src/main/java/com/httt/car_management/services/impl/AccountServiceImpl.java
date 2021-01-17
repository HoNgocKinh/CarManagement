package com.httt.car_management.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.httt.car_management.common.BaseServiceImpl;
import com.httt.car_management.dtos.AccountDTO;
import com.httt.car_management.entities.AccountEntity;
import com.httt.car_management.repositories.AccountRepository;
import com.httt.car_management.services.AccountService;

@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountDTO, AccountEntity, AccountRepository> implements AccountService{
	
	
	@Override
	public Optional<AccountDTO> verifyAccount(String username, String password) {
		
		return Optional.ofNullable(null);
	}
	
	/**
	 * Getter / Setter Beans
	 */
	
}
