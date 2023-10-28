<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.simplilearn.dao.UserDao,com.simplilearn.bean.User,java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<JarScanFilter defaultPluggabilityScan="true" defaultTldScan="false"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW USERS</title>
</head>
<body>
	<h1>USERS LIST</h1>

	<%
		List<User> list = UserDao.getAllUsers();
		request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Section</th>
			<th>Teacher</th>
			<th>Subject</th>
			<th>Time</th>

			
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getSection()}</td>
				<td>${u.getTeacher()}</td>
				<td>${u.getSubject()}</td>
				<td>${u.getTime()}</td>

				
			</tr>
		</c:forEach>
	</table>
	<br />

</body>
</html>