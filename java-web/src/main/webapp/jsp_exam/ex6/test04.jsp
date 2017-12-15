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
객체의 세터/게터 메서드 호출 시 사용

<h2>JSP 코드</h2>
<pre class="jsp">
<jsp:setProperty name="member" property="name" value="홍길동"/>
</pre>

<h2>자바 코드</h2>
<pre class="java">
member.setName("홍길동");
</pre>

</body>
</html>
 





