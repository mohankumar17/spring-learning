<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Admission</title>
</head>
<body>
	<h2>The student with below details is confirmed.</h2>
	<p>First Name: ${student.firstName}  </p>
	<p>Last Name:  ${student.lastName} </p>
	<p>Country: ${student.country} </p> 
	<p>Favorite Language: ${student.favoriteLanguage} </p> 
	<p>Known Operating Systems: 
		<ul>
	      <c:forEach var="eachOS" items="${student.operatingSystems}">
	        <li>${eachOS}</li>
	      </c:forEach>
	    </ul>
	</p> 
</body>
</html>