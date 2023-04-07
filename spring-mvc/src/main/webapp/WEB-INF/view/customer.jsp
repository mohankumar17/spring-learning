<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<h2>The customer with below details is confirmed.</h2>
	<p>First Name: ${customer.firstName}  </p>
	<p>Last Name:  ${customer.lastName} </p>
	<p>FreePasses : ${customer.freePasses}  </p>
	<p>Postal Code:  ${customer.postalCode} </p>
	<p>Course Code:  ${customer.courseCode} </p>
</body>
</html>