<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
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
<h1>게시물 삭제</h1>

<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);;
try {
    
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (memberDao.delete(no) > 0) {
    %>
        <p>삭제했습니다.</p>
    <%
    } else {
    %>
    
    <%=no %> 번의 회원 정보가 없습니다. 
    
    <%
    }
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    