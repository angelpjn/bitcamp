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
request.setAttribute("name", "홍길동");
request.setAttribute("age", 20);
request.setAttribute("working", true);
%>
${requestScope.name}<br>
${requestScope.age}<br>
${requestScope.working}<br>

<p>ServletRequest에서 값 꺼내기</p>
       
</body>
</html>














































