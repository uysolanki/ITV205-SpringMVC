<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body>
<h1> Welcome to IT Vedant!, Please fill the form to SignUp</h1>
	
	<form:form action="saveStudentDetails" 	modelAttribute="emptyStudentObject">

	Roll Number :<form:input path="rno" /> <br>
	
	Name :<form:input path="sname"/> <br>
	
	Gender : 
	Male<form:radiobutton path="gender" value="male" />
	Female<form:radiobutton path="gender" value="female" /> <br>
	
	Programming Skills:
	Java<form:checkbox path="skills" value="Java" />
	React<form:checkbox path="skills" value="React" />
	SQL<form:checkbox path="skills" value="SQL" /> <br>
	
	<input type="submit" value="Register">
	
	</form:form>
</body>
