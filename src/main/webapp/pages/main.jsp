<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	pageContext.getSession().setAttribute("appPath", request.getContextPath());
%>
<title>主页面</title>
<!-- 1-引入jquery bootstrap -->
<link rel="stylesheet" href="${appPath}/bootstrap/css/bootstrap.css">
<script src="${appPath}/bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="${appPath}/bootstrap/js/bootstrap.js"></script>
</head>
<body>
	succes...
	<hr/>
	${USER.id},${USER.username},${USER.password}
</body>
</html>