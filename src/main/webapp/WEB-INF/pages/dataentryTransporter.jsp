<html>
<head>
<title>Shipment Transport 
	</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords"
	content="Shipment a Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<script>
        window.onload = function() {
            document.getElementById("password1").onchange = validatePassword;
            document.getElementById("password2").onchange = validatePassword;
        }

        function validatePassword() {
            var pass2 = document.getElementById("password2").value;
            var pass1 = document.getElementById("password1").value;
            if (pass1 != pass2)
                document.getElementById("password2").setCustomValidity("Passwords Don't Match");
            else
                document.getElementById("password2").setCustomValidity('');
            //empty string means no validation error
        }
    </script>
    <script>  
function validateform(){  
var name=document.getElementById("validationDefault01").value; 
var password1=document.getElementById("password1").value;  
var password2=document.getElementById("password2").value;  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password1.length<6||password2.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
</script>  
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
	background: url(./images/truck.jpg) no-repeat;background-size:cover;
	-webkit-background-size:cover;
	-moz-background-size:cover;
	-o-background-size:cover;
	-moz-background-size:cover;
	min-height:1000px;
}

table {
	height: 250px;
	width: 25%;
	top:50px;
	/* border-style: solid;
	border-width: 5px; */
}
td {
color: black;
font-family: raleway;
 font-size: 25px;
 font-weight: bold;
 }
  input[type="submit"]{
  width:100%;
  margin-top:0px;
  font-size: 15px;
  color:#fff;
  letter-spacing: 1px;
  border:none;
  background: #e01f3d;
  -webkit-appearance:button;
  cursor:pointer;
  box-sizing: border-box;
  align:center;
  display: inline-block;
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
								<a class="navbar-brand" href="index.html"> Shipment</a>
							</h1>
						</div>
						<button class="navbar-toggler" type="button"
							data-toggle="collapse" data-target="#navbarSupportedContent"
							aria-controls="navbarSupportedContent" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class="navbar-toggler-icon"> </span>

						</button>

						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<ul class="navbar-nav ml-lg-auto text-right">
								<li class="nav-item active"><a class="nav-link"
									href="index.jsp">Home <span class="sr-only">(current)</span>
								</a></li>
								<li class="nav-item"><a class="nav-link" href=""></a>
								</li>
								
							</ul>


						</div>

					</nav>
				
			



	<form  name="myform"  action="savetransporter" method='post' onsubmit="return validateform()"
		enctype="multipart/form-data">
		
		<table align="center">
			
			<tr>
				
				<h2 align="center" style="color:white">Welcome Transporter</h2>
			</tr>
			<br>
			<tr>
				<td>Email-id</td>
				<td><input type="email" name="email"   class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp" placeholder=""
					required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<br>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" class="form-control"
					id="validationDefault01" placeholder="" required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" class="form-control"
					id="password1" placeholder="" required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="cpass" class="form-control"
					id="password2" placeholder="" required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" class="form-control"
					id="validationDefault01" placeholder="" required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="tel" name="contact" class="form-control"
					id="validationDefault01" size="10" maxlength="10"  placeholder="" required=""></td>
					
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Organization Name</td>
				<td><input type="text" name="orgname" class="form-control"
					id="validationDefault01" placeholder="" required=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Organization Documents</td>
				<td><input type="file" name="orgdocuments" class="form-control"
					 placeholder=""></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td>Id Proof</td>
				<td><input type="file" name="idproof" 
					 placeholder=""></td>
			</tr>
			<br>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td align="center"><input type="submit"  onclick="incrementValue()"  value="Register"></td>
				<br>
				
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
		</table>
	</form>
	</div>
		</div>
		</header>
</body>
<script>
		window.onload = function() {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}

		function validatePassword() {
			var pass2 = document.getElementById("password2").value;
			var pass1 = document.getElementById("password1").value;
			if (pass1 != pass2)
				document.getElementById("password2").setCustomValidity(
						"Passwords Don't Match");
			else
				document.getElementById("password2").setCustomValidity('');
			//empty string means no validation error
		}
	</script>
</html>
