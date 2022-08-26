package com.service;
import java.util.*;
import com.model.*;
interface AccountService{
	public void createAccount(Account account);
	public Account searchByFirstName(String name);
	public Account searchById(String id);
	public boolean deleteById(String id);
}
public class AccountServiceImpl implements AccountService {
	ArrayList<Account> users=new ArrayList<Account>();
	public void createAccount(Account account) {
		users.add(account);
		System.out.println("Account created");
	}
	public Account searchByFirstName(String name) {
		Account temp=null;
		for(Account a:users) {
			if(a.getFirstName().equals(name)) {
				temp=a;
			}
		}
		return temp;
	}
	public Account searchById(String id) {
		Account temp=null;
		for(Account a:users) {
			if(a.getLoginId().equals(id)) {
				temp=a;
			}
		}
		return temp;
	}
	public boolean deleteById(String id) {
		boolean del=false;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getLoginId().equals(id)) {
				users.remove(i);
				del=true;
			}
		}
		return del;
	}
}

