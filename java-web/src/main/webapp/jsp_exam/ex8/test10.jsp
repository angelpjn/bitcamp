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
java.util.HashMap<String, Object> map = new java.util.HashMap<>();
map.put("name", "홍길동");
map.put("age", 20);
map.put("working", true);

pageContext.setAttribute("map", map);
%>
<h2>List</h2>
name : ${pageScope.map["name"]}<br>
name : ${pageScope.map.name}<br>
name : ${pageScope.map.name}<br>
name : ${map.name}<br>
age : ${map.age}<br>
working : ${map.working}<br>
</body>
</html>














































