<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
        <jsp:include page="/header.jsp"></jsp:include>
<h1>성적 상세 정보</h1>
<%
ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
try {
    int no = Integer.parseInt(request.getParameter("no"));
    Score score = scoreDao.selectOne(no);
    if (score != null) {
%>

<form action='update.jsp' method='post'>
<div class='form-group row'>
<label for='no' class='col-sm-2 col-form-label col-form-label-sm'>번호</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='no' type='number' 
        name='no' value='<%=score.getNo() %>'>
</div>
</div>
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label col-form-label-sm'>이름</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='name' type='text' 
        name='name' value='<%=score.getName() %>'>
</div>
</div>
<div class='form-group row'>
<label for='kor' class='col-sm-2 col-form-label col-form-label-sm'>국어</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='kor' type='number' 
        name='kor' value='<%=score.getKor() %>'>
</div>
</div>
<div class='form-group row'>
<label for='eng' class='col-sm-2 col-form-label col-form-label-sm'>영어</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='eng' type='number' 
        name='eng' value='<%=score.getEng() %>'>
</div>
</div>
<div class='form-group row'>
<label for='math' class='col-sm-2 col-form-label col-form-label-sm'>수학</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='math' type='number' 
        name='math' value='<%=score.getMath() %>'>
</div>
</div>
<div class='form-group row'>
<label for='sum' class='col-sm-2 col-form-label col-form-label-sm'>합계</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='sum' type='text'
        value='<%=score.getSum() %>'>
</div>
</div>
<div class='form-group row'>
<label for='aver' class='col-sm-2 col-form-label col-form-label-sm'>평균</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='aver' type='text' 
        value='<%=score.getAver() %>'>
</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=<%=score.getNo() %>' class='btn btn-danger btn-sm'>삭제</a>
</div>
</div>
</form>
<%
    } else {
%>
        
        <%=no %>의 성적 정보가 없습니다.
<%         
    }
    
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
    