<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<% 

String a=(String)request.getAttribute("a");
String b=(String)request.getAttribute("b");
String c=(String)request.getAttribute("c");
if(a!=null)
{
	out.println("<script>alert('Registered successfully');</script>");

}
if(b!=null)
{
	out.println("<script>alert('Updated successfully');</script>");
}
if(c!=null)
{
	out.println("<script>alert('Your account deleted successfully');</script>");
}
%>

<h1>Login Page</h1>
<form action="login">
Enter userid:<input type="text" name="lid"><br><br>
Enter password:<input type="password" name="pwd"><br><br>
<input type="submit" value="Login"><br><br>
<a href="signup.jsp">SignUp</a>
</form>
</body>
</html>