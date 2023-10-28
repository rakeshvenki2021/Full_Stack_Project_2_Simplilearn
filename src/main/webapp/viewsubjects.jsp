<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.simplilearn.dao.UserDao,com.simplilearn.bean.*,java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<JarScanFilter defaultPluggabilityScan="true" defaultTldScan="false"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW SUBJECTS</title>
</head>
<body>
	<h1>SUBJECTS LIST</h1>

	<%
		List<Subjects> list = UserDao.getAllSubjects();
		request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Shortcuts</th>
			
			
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getName()}</td>
				<td>${u.getShortcuts()}</td>


				
			</tr>
		</c:forEach>
	</table>
	<br />

</body>
</html>