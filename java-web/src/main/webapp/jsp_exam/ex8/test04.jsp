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
<h1>EL(Expression Language)</h1>
OGNL 표기법 : Object-Graph Navigation Language

<h2>PageContext에서 값 꺼내기</h2>

<%
session.setAttribute("name", "홍길동");
session.setAttribute("age", 20);
session.setAttribute("working", true);
%>
${sessionScope.name}<br>
${sessionScope.age}<br>
${sessionScope.working}<br>

<p>ServletRequest에서 값 꺼내기</p>
       
</body>
</html>














































