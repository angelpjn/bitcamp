<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>회원상세정보</h1>
<form action='update.jsp' method='post'>
<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
try {
    int no = Integer.parseInt(request.getParameter("no"));
    Member member = memberDao.selectOne(no);
    
    if (member != null) {
%>
<div class='form-group row'>
<label for='no' class='col-sm-2 col-form-label col-form-label-sm'>번호</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='no' type='number'
        name='no' value='<%=member.getNo() %>'>
</div>
</div>
                
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label col-form-label-sm'>이름</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='name' type='text'
        name='name' value='<%=member.getName() %>'> 
</div>
</div>
                
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label col-form-label-sm'>이메일</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='email' type='text' 
        name='email' value='<%=member.getEmail() %>'> 
</div>
</div>
                
<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label col-form-label-sm'>비밀번호</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' id='password' type='password' 
        name='password' value='<%=member.getPassword() %>'>
</div>
</div>
                
<div class='form-group row'>
<label for='createDate' class='col-sm-2 col-form-label col-form-label-sm'>등록일</label>
<div class='col-sm-10'>
<input class='form-control form-control-sm' readonly id='createDate' type='text' 
        name='createDate' value='<%=member.getCreatedDate() %>'>
</div>
</div>

<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=<%=member.getNo() %>' class='btn btn-danger btn-sm'>삭제</a>
</form>

    <%} else {%>
    <%=no %>의 회원 정보가 없습니다.
        
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
    