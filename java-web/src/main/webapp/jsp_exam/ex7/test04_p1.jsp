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
<h1>HttpSession 보관소</h1>

<%
session.setAttribute("name", "홍길동");
%>

<hr>

<p>
<jsp:include page="test04_p2.jsp"></jsp:include>
</p>

<hr>
<%=session.getAttribute("name") %>
</body>
</html>
 





