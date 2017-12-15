<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>게시물관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>회원 상세 정보</h1>
<form action="add.jsp" method='post'>
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label col-form-label-sm'>이름</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='name' type='text' name='name'>

</div>
</div>
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label col-form-label-sm'>이메일</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='email' type='email' name='email'>
</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label col-form-label-sm'>암호</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='password' type='text' name='password'>
</div>
</div>

<button class='btn btn-primary btn-sm'>추가</button>
</form>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
