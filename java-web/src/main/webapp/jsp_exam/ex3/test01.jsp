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
<h1>표현식(expression element)</h1>
<p>JSP 페이지에 결과를 출력하는 출력문을 만들 때 사용한다.</p>
<p>표현식? 작업을 수행한 후 한 개의 결과를 리턴하는 명령문
<h2>JSP 표현식</h2>
<pre class="jsp">
&lt;%= 20 + 30%>
</pre>

<h2>생성된 자바 코드</h2>
표현식 안의 내용을 파라미터로 받는 자바 소스파일에 출력문이 삽입된다.<br>
즉 출력문의 파라미터로 들어갈 수 있는 문장이 '표현식'<br />
<pre class="java">
out.print(20 + 30);
</pre>
</body>
</html>