<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@page import="java100.app.domain.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>게시물관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
	<div class='container'>
		<jsp:include page="/header.jsp"></jsp:include>
		<h1>게시물 변경</h1>
		<%
		    BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
		    try {
		        Board board = new Board();
		        board.setNo(Integer.parseInt(request.getParameter("no")));
		        board.setTitle(request.getParameter("title"));
		        board.setContent(request.getParameter("content"));

		        if (boardDao.update(board) > 0) {
		%>

		<p>변경하였습니다.</p>

		<%
		    } else {
		%>

		<%=board.getNo()%>의 게시물이 없습니다.

		<%
		    }
		    } catch (Exception e) {
		        e.printStackTrace(); // for developer
		        out.println(e.getMessage()); // for user
		    }
		%>

		<p>
			<a href='list.jsp' class='btn btn-primary btn-sm'>목록</a>
		</p>
		<jsp:include page="/footer.jsp"></jsp:include>
	</div>
	<%@ include file="../jslib.txt" %>
</body>
</html>
