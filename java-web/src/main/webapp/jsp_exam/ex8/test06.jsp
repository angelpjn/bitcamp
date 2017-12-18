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
application.setAttribute("name2", "임꺽정");
session.setAttribute("name2", "홍길동");
request.setAttribute("name2", "유관순");
pageContext.setAttribute("name2", "김구");
%>

<p>${name2}</p>
<p>PageContext: ${pageScope.name2}</p>
<p>ServletRequest: ${requestScope.name2}</p>
<p>HttpSession: ${sessionScope.name2}</p>
<p>ServletContext: ${applicationScope.name2}</p>

</body>
</html>














































