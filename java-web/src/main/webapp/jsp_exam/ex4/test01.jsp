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
<h1>선언부(declaration element)</h1>
서블릿 클래스에 필드나 메서드를 만들 때 사용한다.<br>
필드를 선언하는 경우 주의해야 한다.<br>
서블릿 객체는 오직 한 개만 생성되기 때문에 필드도 한 개만 생성된다.<br>
그리고 그 필드를 여러 클라이언트가 공유한다.<br>
따라서 클라이언트마다 구분되어야 할 값을 필드에 저장하면 안된다.<br>
클라이언트들이 공유하는 값은 서블릿 필드에 저장해도 된다.<br>
메서드 또한 여러 클라이언트들이 공유한다는 것을 주지할 것<br>

<h2>JSP 코드</h2>
<pre class="jsp">
&lt;%! 
    public int a;
    private void m() {}
    static {}
    {}
    %>
</pre>

<h2>생성된 자바 코드</h2>
태그 안의 모든 내용은 그대로 서블릿 클래스 블록 안에 복사된다.<br>
즉 출력문의 파라미터로 들어갈 수 있는 문장이 '표현식'<br />
<pre class="java">
public class test01_jsp extends HttpJspBase {
...
    public int a;
    private void m() {}
    static {}
    {}
...
}
</pre>
</body>
</html>