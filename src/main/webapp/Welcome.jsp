<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%="Welcome " + request.getParameter("username")%>
	
	<br/>
	<br/>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String databaseName = config.getInitParameter("datasource");
	
	if(username.equals("admin") && password.equals("root")) {
		out.println("Username or Password correct!!!");



		response.sendRedirect("AddandViewUser.jsp");
	


	}
	else{
		
		out.println("Username or Password Incorrect!!!");
		
	}
	//out.println("Database Details::");
	//out.println("DB Username: " + username);
	//out.println("DB Password: " + password);
	//out.println("DB Name: " + databaseName);
	//
	%>

</body>
</html>