<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body>
	<form:form action="create" modelAttribute="student" method="POST">  
        
        student id: <form:input type="number" path="studentId" />
		<br>
        student name: <form:input path="studentName" />
		<br>

		<input type="submit" value="Submit" />
	</form:form>
</body>

