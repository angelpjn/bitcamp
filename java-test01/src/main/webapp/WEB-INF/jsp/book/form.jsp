<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>도서관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>도서 목록</h1>
<form action="add" method='post' enctype="multipart/form-data">

<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>도서명</label>
<div class='col-sm-10'>
<input class='form-control' id='title' type='text' name='title'>
</div>
</div>

<div class='form-group row'>
<label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
<div class='col-sm-10'>
<textarea class='form-control' id='publisher' name='publisher'></textarea>
</div>
</div>

<div class='form-group row'>
<label for='price' class='col-sm-2 col-form-label'>가격</label>
<div class='col-sm-10'>
<textarea class='form-control' id='price' name='price'></textarea>
</div>
</div>

<div class='form-group row'>
<label for='description' class='col-sm-2 col-form-label'>설명</label>
<div class='col-sm-10'>
<textarea class='form-control' id='description' name='description'></textarea>
</div>
</div>

<div class='form-group row'>
<label for='file1' class='col-sm-2 col-form-label'>사진</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="file1" name="file">
</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>등록</button>
</div>
</div>
</form>

<jsp:include page="../footer.jsp"/>

</div>

<%@ include file="../jslib.jsp"%>

</body>
</html>
    