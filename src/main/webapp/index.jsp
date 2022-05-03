<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%
        pageContext.getSession().setAttribute("appPath", request.getContextPath());
    %>
<body>
<h2>Hello World!</h2>
<a href="/user/login.action">/登录</a>
<a href="${pageContext.request.contextPath}/user/login.action">登录</a>
<a href="${appPath}/user/login.action">appPath登录</a>
</body>
</html>
