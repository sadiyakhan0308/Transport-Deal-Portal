<%@page isELIgnored="false"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title>Shipment Transport Portal</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Shipment Transport Deal Portal" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<script>
	$(document).ready(function() {
		$(".dropdown").hover(function() {
			$('.dropdown-menu', this).stop(true, true).slideDown("fast");
			$(this).toggleClass('open');
		}, function() {
			$('.dropdown-menu', this).stop(true, true).slideUp("fast");
			$(this).toggleClass('open');
		});
	});
</script>
<!-- //dropdown nav -->

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
	background: url(./images/am.jpg) no-repeat;
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

.notification {
	text-decoration: none;
	position: relative;
	display: inline-block;
	border-radius: 2px;
	padding: 0.3em 1.1em;
	color: #fff;
	background: transparent;
	font-size: 1em;
	letter-spacing: 1px;
	font-weight: 600;
}

.notification .badge {
	position: absolute;
	top: -10px;
	right: -10px;
	padding: 5px 10px;
	border-radius: 50%;
	background: red;
	color: white;
}
</style>
</head>
<body>
	<div class="header-top-w3layouts">
		<div class="container">

			<header>

				<nav class="navbar navbar-expand-lg navbar-light">
					<div class="logo text-left">
						<h1>
							<a class="navbar-brand" href="index.jsp"> Welcome ${name}</a>
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
							<li class="nav-item"><a class="nav-link" href="index.jsp">Home
									<span class="sr-only">(current)</span>
							</a></li>
							<li class="nav-item"><a class="nav-link" href="viewdeals">View
									Deals</a></li>
							<li class="nav-item"><a class="nav-link" href="">View Registered
									Transporters</a></li>
							<li class="nav-item"><a class="nav-link" href="viewcustomers">View
									All Customers</a></li>
							 <%
 	try {
 		Class.forName("com.mysql.jdbc.Driver").newInstance();
 		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportdb", "root", "root");
 		Statement st = con.createStatement();
 		String strQuery = "SELECT COUNT(*) FROM Transporter";
 		ResultSet rs = st.executeQuery(strQuery);
 		String Countrow = "";
 		while (rs.next()) {
 			Countrow = rs.getString(1);
          %><li><a href="viewalltransporters" class="notification"> 
          <span>Inbox</span>
           <span class="badge"><%out.println(Countrow);%>
			</span>
           </a></li>

      <%
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
%> 

                            <li class="nav-item"><a
								class="nav-link" href="">Logout</a>
								</li>
                            


						
					</div>

					</nav>
				
<form name="myform" action="transporterhome" method='post'
					enctype="multipart/form-data">
		<table align="center">
			<tr></tr>
			<tr></tr>
			<tr>
				
				<h2 align="center" style="color:white"></h2>
			</tr>
			<br>
			
			<tr>
				<td><br></td>
			</tr>
		</table>
	


	</form>
	
		</div>
		</div>
		
</body>
</html>
