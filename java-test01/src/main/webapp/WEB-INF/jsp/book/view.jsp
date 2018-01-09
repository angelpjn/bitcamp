<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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

<h1>도서 상세 정보</h1>

<c:if test="${not empty book}">
        <form action='update' method='post'>
        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>도서번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${book.no}'>
        </div>
        </div>

        <div class='form-group row'>
        <label for='title' class='col-sm-2 col-form-label'>도서명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='title' type='text' 
                name='title' value='${book.title}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publisher' type='text' 
                name='publisher' value='${book.publisher}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='publishDate' class='col-sm-2 col-form-label'>등록일</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='publishDate' type='date' 
                value='${book.publishDate}'>
        </div>
        </div>
        
        
        <div class='form-group row'>
        <label for='price' class='col-sm-2 col-form-label'>가격</label>
        <div class='col-sm-10'>
        <input class='form-control' id='price' type='number' 
                name='price' value='${book.price}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='description' class='col-sm-2 col-form-label'>설명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='description' type='text' 
                name='description' value='${book.description}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${book.no}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        
        </form>
</c:if>
<c:if test="${empty book}">
        <p>'${param.no}'번 도서가 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<%@ include file="../jslib.jsp"%>

</body>
</html>
