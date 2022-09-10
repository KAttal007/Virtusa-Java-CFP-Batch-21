<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*,com.example.model.*,com.example.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<% 
ResultSet rs=null;
try{
	HttpSession hs=request.getSession();
	Login lo=(Login)hs.getAttribute("user");
	LoginDao ld=new LoginDao();
	Connection con=ld.getConnection();
	PreparedStatement pstmt=con.prepareStatement("select * from reglog where Loginid=? and Password=?");
	pstmt.setString(1, lo.getLoginId());
	pstmt.setString(2, lo.getLoginPwd());
	rs=pstmt.executeQuery();
	rs.next();
}
catch(Exception e){
	
}
%>

<form action="update">
<table border="1" align="center">
<tr>
<td>Enter first name to be updated:</td>
<td>Enter last name to be updated:</td>
<td>Enter gender to be updated:</td>
</tr>
<tr>
<td><input type="text" name="fn" value="<%=rs.getString(1)%>"></td>
<td><input type="text" name="ln" value="<%=rs.getString(2)%>"></td>
<td><input type="text" name="gen" value="<%=rs.getString(3)%>"></td>
</tr>
</table>
<center><input type="submit" value="Update"></center>
</form>
</body>
</html>