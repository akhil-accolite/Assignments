<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>List of Students shown in terminal</h2>

<h6 style="color: red"> <c:forEach var="student" items="${students}">
	${student.studentId}:${student.studentName}
	</c:forEach>
</h6>
<br />

DO YOU WANT TO ADD STUDENT AGAIN ?
<br>
<a href="new">press here</a>
