<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int count = 0; %>
	<%
		String id = request.getParameter("id");
		if (session.getAttribute(id) == null) {
			count = 0;
			session.setAttribute(id, count);
			out.print("hello new user: " + request.getParameter("name"));
		} else {
			session.setAttribute(id, count++);
			out.println("welcome again user: " + request.getParameter("name"));
		}
	%>
	<br>
	<%
		out.println("count for you is: " + count);
	%>
</body>
</html>