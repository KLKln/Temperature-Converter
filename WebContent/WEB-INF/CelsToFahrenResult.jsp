<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius to Fahrenheit Result</title>
</head>
<body>
<p>${fahrenheitResult.getCelsius()} degrees celsius is <br />
	${fahrenheitResult.getFahranheit()} degrees fahrenheit.<br />
	</p>
	<a href="index.jsp"> Would you like to see another conversion?</a>
</body>
</html>