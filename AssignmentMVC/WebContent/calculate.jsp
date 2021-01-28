<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CalculatorMVC</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>


</head>
<body>
	<div class="container">

		<form action="CalculatorServlet" method="post">
			<h3>Calculator</h3>
			<label>NUMBER 1:</label> <input type="number" name="num1"
				placeholder="NOT NULL"><br>
			<br> <label>NUMBER 2:</label> <input type="number" name="num2"
				placeholder="NOT NULL"><br>
			<br> <input type="checkbox" class="radio" name="operation"
				value="add">addition <input type="checkbox" class="radio"
				name="operation" value="sub">subtraction <input
				type="checkbox" class="radio" name="operation" value="mul">multiply
			<input type="checkbox" class="radio" name="operation" value="div">divide
			<input type="checkbox" class="radio" name="operation" value="rem">remainder<br>
			<br> <input type="submit" value="calculate">
		</form>

	</div>

	<%
		if (null == request.getAttribute("Solution"))
			out.println("Select the operation!!!");
		else
			out.println("Solution is " + request.getAttribute("Solution"));
	%>



</body>
</html>