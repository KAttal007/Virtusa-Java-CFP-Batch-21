package com.example.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.model.Login;

public interface ILoginService {
	public boolean login(Login lo);
	public boolean createLogin(Login lo);
	public boolean updateLogin(Login lo,HttpServletRequest req);
	public boolean deleteLogin(Login lo);
	public Login printUser(HttpServletRequest request);
	public List<Login> printUsers();
}
