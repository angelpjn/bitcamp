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
<h1>jsp:useBean</h1>

<h2>주요 속성</h2>

<h3>id 속성</h3>

<h3>class</h3>
<p>객체 생성 위한 클래스명</p>
반드시 Fully-Qualified Class Name<br>
패키지명 포함 클래스 이름<br>
객체 생성 시 사용

<h3>type</h3>
<p>변수를 선언할 때 사용할 타입 명
인스턴스를 만드는 용도가 아니므로 인터페이스, 추상클래스도 가능<br>
반드시 Fully-Qualified Class Name<br>
속성 생략 시 class 속성 값을 변수 선언 시 사용<br>
</p>

<h3>scope 속성</h3>
<p>객체 생성 후 저장할 보관소 지정<br>
이 속성 생략 시 PageContext 보관소에 저장<br>
서블릿은 총 4개의 보관소 제공<br>
</p>
</body>
</html>






