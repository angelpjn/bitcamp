<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>jsp:setProperty, jsp:getProperty</h1>
게터 호출

<jsp:useBean id="m" class="domain.Member">
    <jsp:setProperty property="name" name="m" value="홍길동"/>
    <jsp:setProperty property="age" name="m" value="20"/>
    <jsp:setProperty property="working" name="m" value="true"/>
</jsp:useBean>
<p>
이름: <jsp:getProperty property="name" name="m"/>
나이: <jsp:getProperty property="age" name="m"/>
재직자: <jsp:getProperty property="working" name="m"/>
</p>
</body>
</html>
 





