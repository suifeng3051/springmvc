<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Spittr</title>
	<link rel="stylesheet" type="text/css"  >
</head>
<body>
<h1>Register</h1>
<form method="POST">
	First Name: <input type="text" name="name" /><br/>
	Last Name: <input type="text" name="accountNo" /><br/>
	Password: <input type="password" name="password" /><br/>
	<input type="submit" value="Register" />
</form>
</body>
</html>