package com.httt.car_management.services;

import java.util.Optional;

import com.httt.car_management.common.BaseService;
import com.httt.car_management.dtos.AccountDTO;

public interface AccountService extends BaseService<AccountDTO>{
	
	public Optional<AccountDTO> verifyAccount(String username, String password);
}
