package com.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.dao.LoginDao;
import com.example.model.Login;

public class LoginService implements ILoginService{
	LoginDao mycon=new LoginDao();
	@Override
	public boolean login(Login lo) {
		try {
			Connection con=mycon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from reglog where Loginid=? and Password=?");
			pstmt.setString(1, lo.getLoginId());
			pstmt.setString(2, lo.getLoginPwd());
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			}
			catch(Exception e) {
				
			}
		return false;
	}

	@Override
	public boolean createLogin(Login lo) {
		
		try {
		Connection con=mycon.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into reglog values(?,?,?,?,?)");
		pstmt.setString(1, lo.getFname());
		pstmt.setString(2, lo.getLname());
		pstmt.setString(3, lo.getGender());
		pstmt.setString(4, lo.getLoginId());
		pstmt.setString(5, lo.getLoginPwd());
		int r=pstmt.executeUpdate();
		if(r>0) {
			return true;
		}
		}
		catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean updateLogin(Login lo,HttpServletRequest req) {
		try {
			HttpSession hs=req.getSession();
			Login l=(Login)hs.getAttribute("user");
			Connection con=mycon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("update reglog set FirstName=?,LastName=?,Gender=? where Loginid=? and Password=?");
			pstmt.setString(1, lo.getFname());
			pstmt.setString(2, lo.getLname());
			pstmt.setString(3, lo.getGender());
			pstmt.setString(4, l.getLoginId());
			pstmt.setString(5, l.getLoginPwd());
			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			}
			}
			catch(Exception e) {
				
			}
		return false;
	}

	@Override
	public boolean deleteLogin(Login lo) {
		try {
			Connection con=mycon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from reglog where Loginid=? and Password=?");
			pstmt.setString(1, lo.getLoginId());
			pstmt.setString(2, lo.getLoginPwd());

			int r=pstmt.executeUpdate();
			if(r>0) {
				return true;
			}
			}
			catch(Exception e) {
				
			}
		return false;
	}

	@Override
	public Login printUser(HttpServletRequest request) {
		Login lo=null;
		try {
			HttpSession hs=request.getSession();
			Login l=(Login)hs.getAttribute("user");
			Connection con=mycon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from reglog where Loginid=? and Password=?");
			pstmt.setString(1, l.getLoginId());
			pstmt.setString(2, l.getLoginPwd());
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			lo=new Login();
			lo.setFname(rs.getString(1));
			lo.setLname(rs.getString(2));
			lo.setGender(rs.getString(3));
			
		}
		catch(Exception e) {
			
		}
		return lo;
	}

	@Override
	public List<Login> printUsers() {
		List<Login> usersList=new ArrayList<Login>();
		try {
			Connection con=mycon.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from reglog");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Login lo=new Login();
				lo.setFname(rs.getString(1));
				lo.setLname(rs.getString(2));
				lo.setGender(rs.getString(3));
				usersList.add(lo);
			}	
		}
		catch(Exception e) {
			
		}
		return usersList;
	}

}
