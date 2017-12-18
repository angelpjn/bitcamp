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

<h2>연산자</h2>

<h3>산술 연산자</h3>
10 + 20 = ${10 + 20}<br>
10 - 20 = ${10 - 20}<br>
10 * 20 = ${10 * 20}<br>
10 / 20 = ${10 / 20}<br>
10 % 20 = ${10 % 20}<br>
10 div 20 = ${10 div 20}<br>
10 mod 20 = ${10 mod 20}<br>

<hr>

<h3>논리 연산자</h3>
true &amp;&amp; true = ${true && true}<br>
true &amp;&amp; false = ${true && false}<br>
true and false = ${true and false}<br>

true || true = ${true || true}<br>
true || false = ${true || false}<br>
true or false = ${true or false}<br>

!true = ${!true }<br>
not true = ${not true }<br>

<hr>

<h3>관계 연산자</h3>
3 == 5 = ${3 == 5}<br>
3 eq 5 = ${3 eq 5}<br>

3 != 5 = ${3 != 5}<br>
3 ne 5 = ${3 ne 5}<br>

3 > 5 = ${3 > 5}<br>
3 gt 5 = ${3 gt 5}<br>

3 >= 5 = ${3 >= 5}<br>
3 ge 5 = ${3 ge 5}<br>

3 < 5 = ${3 < 5}<br>
3 lt 5 = ${3 lt 5}<br>

3 <= 5 = ${3 <= 5}<br>
3 le 5 = ${3 le 5}<br>
<hr>

<h3>empty</h3>
<%
pageContext.setAttribute("money", 10000);
%>
empty name = ${empty pageScope.name}<br>
empty money = ${empty pageScope.money}<br>
<hr>

<h3>조건식</h3>
<%
pageContext.setAttribute("age", 10);
%>
age > 18 ? "성인" : "미성년" = ${age > 18 ? "성년" : "미성년" }<br>
<hr>


<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>














































