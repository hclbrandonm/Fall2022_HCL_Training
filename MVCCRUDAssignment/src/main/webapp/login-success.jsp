<%@ page language="java" import="com.brandon.model.LoginBean" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName() + "<br>");  
%>

<input type="button" value="Continue" onclick="window.location.href='ProductDetails.jsp'">
</body>
</html>