<%@page import="java.io.PrintWriter"%>
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
<h1>성적 삭제</h1>
<%
ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
try {
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (scoreDao.delete(no) > 0) {
    %>
       삭제하였습니다.
    <%
    }
    else {
    %>
    
    <%=no %>의 성적 정보가 없습니다.

<%        
    }
    
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}%>

<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp"></jsp:include>

</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    