<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Admission</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
      First name: <form:input path="firstName" />
      <br><br>
      Last name: <form:input path="lastName" />
      <br><br>
      Country:
      <form:select path="country">
        <%-- <form:option value="Brazil" label="Brazil" />
        <form:option value="France" label="France" />
        <form:option value="Germany" label="Germany" />
        <form:option value="India" label="India" /> --%>
        <form:options items="${student.countryOptions}" />
      </form:select>
      <br><br>
       Favorite Languages:
	      Java <form:radiobutton path="favoriteLanguage" value="Java" />
	      C# <form:radiobutton path="favoriteLanguage" value="C#" />
	      PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
	      Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
	  <br><br>
	  Operation Systems:
	      Linux <form:checkbox path="operatingSystems" value="Linux" />
	      macOS <form:checkbox path="operatingSystems" value="macOS" />
	      Windows <form:checkbox path="operatingSystems" value="Windows" />
      
      <br><br>
      <input type="submit" value="submit" />
    </form:form>
  </body>
</body>
</html>