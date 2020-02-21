<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Converter</title>
</head>
<body>
	<h1>Fahrenheit to Celcius Converter</h1>
	<form action="fahrenToCelsServlet" method="post">
	What is the temperature in Fahrenheit you'd like to convert to Celsius:
	<input type="text" name="fahrenheit" size="4">
	<input type="submit" value="Get Celsius"/>
	</form>
	<h1>Celcius to Fahrenheit Converter</h1>
	<form action="celsToFahrenServlet" method="post">
	What is the temperature in Celsius you'd like to convert to Fahrenheit:
	<input type="text" name="celsius" size="4">
	<input type="submit" value="Get Fahrenheit"/>
	</form>

</body>
</html>