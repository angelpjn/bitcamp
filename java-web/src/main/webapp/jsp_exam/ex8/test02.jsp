<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>EL(Expression Language)</h1>
OGNL 표기법 : Object-Graph Navigation Language

<h2>PageContext에서 값 꺼내기</h2>

<%
pageContext.setAttribute("name", "홍길동");
pageContext.setAttribute("age", 20);
pageContext.setAttribute("working", true);
%>
${pageScope.name}<br>
${pageScope.age}<br>
${pageScope.working}<br>

<p>EL에 미리 등록된 객체 이름</p>
<%-- 
pageContext    => PageContext        => ${pageContext}
ServletContext => ServletContext     => ${pageContext.servletContext.프로퍼티명}
session        => HttpSession        => ${pageContext.session.프로퍼티명}
request        => ServletRequest     => ${pageContext.request.프로퍼티명}
response       => ServletResponse    => ${pageContext.response.프로퍼티명}

param   => request.getParameter(파라미터명)
        => ${param.파라미터명}
        
paramValues => request.getParameterValues(파라미터명)
            => ${paramValues.파라미터명}

header => request.getHeader("User-Agent")
       => ${header["User-agent"]}
       => ${header.헤더명}

headerValues => request.getHeaders(헤더명)
             => ${headerValues.헤더명}
cookie => Cookie[] cookies = request.getCookies();
          반복문으로 쿠키 값 꺼냄
       => ${cookie.쿠키명}
       
initParam => config.getInitParameter(파라미터명)
          => ${initParam.파라미터명}
          
pageScope => pageContext.getAttribute(프로퍼티명)
          => ${pageScope.프로퍼티명}
          
requestScope => request.getAttribute(프로퍼티명)
          => ${requestScope.프로퍼티명}
          
sessionScope => session.getAttribute(프로퍼티명)
          => ${sessionScope.프로퍼티명}
          
applicationScope => application.getAttribute(프로퍼티명)
          => ${applicationScope.프로퍼티명}
--%>
       
</body>
</html>














































