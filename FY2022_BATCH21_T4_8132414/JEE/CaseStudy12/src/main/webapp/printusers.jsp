<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*,com.example.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<% 
List<Login> ulist=(List<Login>)request.getAttribute("usersList");
out.println("<table border='1' align='center'>");
out.println("<tr><th>First Name</th><th>Last Name</th><th>Gender</th></tr>");
for(int i=0;i<ulist.size();i++){
	String fn=ulist.get(i).getFname();
	String ln=ulist.get(i).getLname();
	String gen=ulist.get(i).getGender();
	out.println("<tr><td>"+fn+"</td><td>"+ln+"</td><td>"+gen+"</td></tr>");
}
out.println("</table>");
%>

</body>
</html>