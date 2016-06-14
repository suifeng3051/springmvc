<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Employees in System</h2>
	<sf:form method="POST" commandName="spitter">
		First Name: <sf:input path="firstName" /><br/>
		Last Name: <sf:input path="lastName" /><br/>
		Email: <sf:input path="email" /><br/>
		Username: <sf:input path="username" /><br/>
		Password: <sf:password path="password" /><br/>
		<input type="submit" value="Register" />
	</sf:form>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>

			<tr>
				<td>${user.name}</td>
				<td>${user.password}</td>
				<td>${user.accountNo}</td>
			</tr>

	</table>

</body>
</html>