<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Shipment Transport</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords"
	content="Shipment a Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="./css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="./css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="./css/owl.theme.css" type="text/css"
	media="all">
<link rel="stylesheet" href="./css/owl.carousel.css" type="text/css"
	media="screen" property="" />
<link href="./css/prettyPhoto.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/minimal-slider.css" type="text/css"
	media="all" />
<link href="./css/fontawesome-all.css" rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800"
	rel="stylesheet">
<style type="text/css">
.modal-content {
	margin-left: 50px;
	margin-top: 68px;
	margin-bottom: -190px;
	margin-right: 137px;
	width: 394px;
	right: 76%;
}

body {
	background-color: #D3D3D3;
	background: url(./images/3.jpg) no-repeat;
	background-size: cover;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	-moz-background-size: cover;
	min-height: 1000px;
}

table {
	height: 250px;
	width: 25%;
	top: 50px;
	/* border-style: solid;
	border-width: 5px; */
}

td {
	color: white;
	font-family: raleway;
}

input[type="submit"] {
	width: 100%;
	margin-top: 0px;
	font-size: 15px;
	color: #fff;
	letter-spacing: 1px;
	border: none;
	background: #e01f3d;
	-webkit-appearance: button;
	cursor: pointer;
	box-sizing: border-box;
	align: center;
	display: inline-block;
}
</style>
</head>
<body>
	<div class="header-top-w3layouts">
		<div class="container">

			<header> <nav class="navbar navbar-expand-lg navbar-light">
			<div class="logo text-left">
				<h1>
					<a class="navbar-brand" href="index.html"> Shipment</a>
				</h1>
			</div>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"> </span>

			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-lg-auto text-right">
					<li class="nav-item active"><a class="nav-link"
						href="index.jsp">Home <span class="sr-only">(current)</span>
					</a></li>


				</ul>


			</div>

			</nav>
			<table class="table table-bordered">
				<thead>
					<tr>
				        <td>Email-id</td>
						<td>Name</td>
						<td>Password</td>
						<td>City</td>
						<td>Contact</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<c:forEach var="customer" items="${customers}">
							<tr>
								<td>${customer.email}</td>
								<td>${customer.name}</td>
								<td>${customer.password}</td>
								<td>${customer.city}</td>
								<td>${customer.contact}</td>
						</c:forEach>
					</tr>

				</tbody>
			</table>
		</div>
	</div>

</body>



</html>