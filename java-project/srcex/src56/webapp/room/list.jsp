<%@page import="java100.app.domain.Room"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java.util.List"%>
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
<h1>강의실목록</h1>
<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>강의실명</th><th>지역</th><th>수용인원</th>
</tr>
</thead>
<tbody>
<%
RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
try {
    List<Room> list = roomDao.selectList();
    for (Room room : list) { %>
    <tr><td>
    <%=room.getNo()%>
    </td>
    <td>
    <%=room.getLocation()%>
    </td>
    <td>
    <%=room.getName()%>
    </td>
    <td>
    <%=room.getCapacity()%>
    </td>
    <td><a href='delete.jsp?no=<%=room.getNo() %>' class='btn btn-danger btn-sm'>
    삭제</a>
    </td>
    </tr>
    <% } %>
    <%} catch (Exception e) {
        e.printStackTrace(); // for developer
        out.println(e.getMessage()); // for user
    } %>
</tbody>
</table>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>
    