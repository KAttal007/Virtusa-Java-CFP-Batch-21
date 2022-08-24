package com.service;

import com.exception.AccountNotFoundException;
import com.model.Account;

public interface AccountService {
	
	public void createAccount(Account account);
	
	public Account searchById(String id);
	
	public Account searchByFirstName(String name) throws AccountNotFoundException;
	
	public Boolean deleteId(String id);
	
	
		
	

}
