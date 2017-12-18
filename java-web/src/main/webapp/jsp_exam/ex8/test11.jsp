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

<%
domain.Member member = new domain.Member();
member.setName("홍길동");
member.setAge(20);
member.setWorking(true);

pageContext.setAttribute("member", member);
%>
<h2>자바 객체</h2>
name : ${pageScope.member["name"]}<br>
name : ${pageScope.member.name}<br>
name : ${pageScope.member.name}<br>
name : ${member.name}<br>
age : ${member.age}<br>
working : ${member.working}<br>
</body>
</html>














































