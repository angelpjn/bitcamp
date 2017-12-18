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

<h2>기본 표기법</h2>
${객체이름.프로퍼티명}<br>

<%--
예1)
자바 => map.get("name")
EL   => ${map.name} 또는 ${map["name"]}

예2)
자바 => member.getFirstName("name")
EL   => ${member.firstName} 또는 ${member["firstName"]}

예3)
자바 => car.getEngine().getName()
EL   => ${car.engine.name} 또는 ${car["engine"]["name"]}
--%>
</body>
</html>
 





