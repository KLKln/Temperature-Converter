<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit to Celsius Result</title>
</head>
<body>
<p>${celsiusResult.getFahrenheit()} degrees fahrenheit is <br />
	${celsiusResult.getCelsius()} degrees celsius.<br />
	</p>
	<a href="index.jsp"> Would you like to see another conversion?</a>
</body>
</html>