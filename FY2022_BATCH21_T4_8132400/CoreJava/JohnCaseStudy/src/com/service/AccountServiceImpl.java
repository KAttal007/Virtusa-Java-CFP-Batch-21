package com.service;

import java.util.*;

import com.exception.AccountNotFoundException;
import com.model.Account;

public class AccountServiceImpl implements AccountService {
	
	private List <Account> accList = new ArrayList<Account>();

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		accList.add(account);
		

	}

	@Override
	public Account searchById(String id) {
		// TODO Auto-generated method stub
		Account n = null;
		for (Account a:accList) {
			if(id.equals(a.getLoginId())) {
				n = a;
			}
			
		}
		return n;
	}

	@Override
	public Account searchByFirstName(String name) throws AccountNotFoundException  {
		// TODO Auto-generated method stub
		Account b = null;
		for (Account a:accList) {
			//System.out.println(a.getFirstName());
			if(name.equals(a.getFirstName())) {
				b = a;
			}
			else {
				throw new AccountNotFoundException();
			}
			
		}
		return b;
	}

	@Override
	public Boolean deleteId(String id) {
		// TODO Auto-generated method stub
		Boolean value = null;
		for (Account a:accList) {
			if(id.equals(a.getLoginId())) {
				accList.remove(a);
				value = true;
				
			}else
				value = false;
			
		}
		return value;
	}

}
