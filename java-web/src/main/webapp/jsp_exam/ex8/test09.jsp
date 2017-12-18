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
java.util.ArrayList<String> names = new java.util.ArrayList<>();
names.add("홍길동");
names.add("임꺽정");
names.add("유관순");

pageContext.setAttribute("name", names);
%>
<h2>List</h2>
name[0] : ${name[0]}<br>
name[1] : ${name[1]}<br>
name[2] : ${name[2]}<br>
name[3] : ${name[3]}<br>
</body>
</html>














































