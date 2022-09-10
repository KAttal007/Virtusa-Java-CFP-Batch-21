<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<%-- <%
Login lo=(Login)request.getAttribute("display");
out.println(lo.getFname());
out.println(lo.getLname());
out.println(lo.getGender());
%> --%>

<table border="1" align="center">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
</tr>
<tr>
<td>${fn}</td>
<td>${ln}</td>
<td>${gen}</td>
</tr>
</table>
</body>
</html>