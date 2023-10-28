<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.simplilearn.dao.UserDao,com.simplilearn.bean.*,java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<JarScanFilter defaultPluggabilityScan="true" defaultTldScan="false"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW STUDENTS </title>
</head>
<body>
	<h1>STUDENTS LIST</h1>

	<%
		List<Students> list = UserDao.getAllStudents();
		request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Fname</th>
			<th>Lname</th>
			<th>Age</th>
			<th>Aclass</th>
			
			
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getFname()}</td>
				<td>${u.getLname()}</td>
				<td>${u.getAge()}</td>
				<td>${u.getAclass()}</td>


				
			</tr>
		</c:forEach>
	</table>
	<br />

</body>
</html>