<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.dao.BoardDao"%>
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
<h1>게시물 상세 정보</h1>
<form action='update.jsp' method='post'>
<%
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
try {
    int no = Integer.parseInt(request.getParameter("no"));
    Board board = boardDao.selectOne(no);
    
    if (board != null) {
%>
<div class='form-group row'>
<label for='no' class='col-sm-2 col-form-label col-form-label-sm'>번호</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='no' 
        type='number' name='no' value='<%=board.getNo()%>'>
</div>
</div>
<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label col-form-label-sm'>제목</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='title' 
        type='text' name='title' value='<%=board.getTitle()%>'>
</div>
</div>
<div class='form-group row'>
<label for='content' class='col-sm-2 col-form-label col-form-label-sm'>내용</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='content' 
        type='text' name='content' value='<%=board.getContent()%>'>
</div>
</div>
<div class='form-group row'>
<label for='redDt' class='col-sm-2 col-form-label col-form-label-sm'>등록일</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='redDt' 
        type='text' name='redDt' value='<%=board.getRegDate()%>'>
</div>
</div>
<div class='form-group row'>
<label for='viewCount' class='col-sm-2 col-form-label col-form-label-sm'>조회수</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='viewCount' 
        type='number' name='viewCount' value='<%=board.getViewCount()%>'>
</div>
</div>

<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=<%=board.getNo() %>' class='btn btn-danger btn-sm'>삭제</a>
</form>
    <%} else {%>
    
    <%=no%>의 성적 정보가 없습니다.
        
    <%}
    
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    