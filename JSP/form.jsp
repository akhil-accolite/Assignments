<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <form action="count.jsp" method="get">
  Name: <input type="text" name="name"><br>
  ID: <input type="text" name="id">
  <input type="submit" value="Submit">
</form>
 <%
 int count = 0;
 %>
</body>
</html>