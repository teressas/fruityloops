<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Fruit Store</h1>
		</div>
		
		<table class="table">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
				
				<c:forEach var = "fruit" items="${fruitsController}">
				<tr>
    				<td>${fruit.getName() }</td>
    				<td>${fruit.getPrice() }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript" src="js/main.js"></script>

</html>