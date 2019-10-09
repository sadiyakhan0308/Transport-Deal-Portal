

<!DOCTYPE html>
<html lang="zxx">

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
</style>
</head>

<body>
	<div class="mian-content">
		<!-- main image slider container -->
		<div class="slide-window">
			<div class="slide-wrapper" style="width: 300%;">
				<div class="slide">
					<div class="slide-caption" style="left: 2%">
						<!--/Login-->
						<div>
							<div class="modal-dialog modal-dialog-centered" role="document">
								<div class="modal-content">
									<div class="modal-header text-center" style="width: 382px">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close"></button>


										<div class="login px-4 mx-auto mw-100">
											<h5 class="text-center mb-4">Login Now</h5>
											<form action="validate" method="post">
												<div class="form-group">
													<label class="mb-2">Email address</label> <input
														type="email" class="form-control" id="exampleInputEmail1"
														aria-describedby="emailHelp" placeholder="Enter Email" required="" name="email"/>
													<small id="emailHelp" class="form-text text-muted">We'll
														never share your email with anyone else.</small>
												</div>
												<div class="form-group">
													<label class="mb-2">Password</label> <input type="password"
														class="form-control" id="exampleInputPassword1"
														placeholder="Enter Password" required="" name ="password"/>
												</div>
												<div class="form-check mb-2">
													<input type="checkbox" class="form-check-input"
														id="exampleCheck1"> <label
														class="form-check-label" for="exampleCheck1">Remember-Me</label>
												</div>
												<button type="submit" class="btn btn-primary submit mb-4">Sign
													In</button>
												<p class="text-center pb-4">
													<a href="mainregister"> Don't have an account?</a>
												</p>
											</form>
										</div>
									</div>

								</div>
							</div>
						</div>
						<!--//Login-->



					</div>
				</div>

			</div>
		</div>

		<div class="header-top-w3layouts">
			<div class="container">

				<header>
					<div class="top-head-w3-agile text-left">
						<div class="row top-content-info-wthree">
							<div class="col-lg-7 top-content-right">
								<div class="row">
									<div class="col-md-6 callnumber text-left">
										<h6>
											Call Us : 8225813274 <span></span>
										</h6>
									</div>

								</div>
							</div>

						</div>
					</div>
					<div class="clearfix"></div>
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
							
								
							

							</ul>


						</div>

					</nav>
				</header>
			</div>
		</div>

	</div>







	<footer class="newsletter_right_w3agile bg-dark pymd-5 py-4">
		<div class="container">
			<div class="inner-sec-w3layouts py-md-5 py-3">


				<div class="row footer-bottom-wthree mt-lg-5 mt-3">
					<div class="col-lg-6 copyright">

						
					</div>

					<div class="clearfix"></div>

				</div>

			</div>
		</div>
	</footer>



	<!-- //model-form
    //js -->
	<script src="./js/jquery-2.2.3.min.js"></script>
	<script src="./js/minimal-slider.js"></script>
	<!--  // carousel -->
	<script src="./js/owl.carousel.js"></script>
	<script>
		$(document).ready(function() {
			$('.owl-carousel').owlCarousel({
				loop : true,
				margin : 10,
				responsiveClass : true,
				responsive : {
					0 : {
						items : 1,
						nav : true
					},
					600 : {
						items : 1,
						nav : false
					},
					900 : {
						items : 1,
						nav : false
					},
					1000 : {
						items : 3,
						nav : true,
						loop : false,
						margin : 20
					}
				}
			})
		})
	</script>
	<!--   //carousel -->
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
	<!-- <!-- //dropdown nav
   // password-script -->
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
	<!-- //password-script
    / start-smoth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 900);
			});
		});
	</script>
	<script>
		$(document).ready(function() {
			/*
									var defaults = {
										  containerID: 'toTop', // fading element id
										containerHoverID: 'toTopHover', // fading element hover id
										scrollSpeed: 1200,
										easingType: 'linear' 
									 };
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
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
	<!--   end-smoth-scrolling
	js -->
	<script src="js/bootstrap.js"></script>
	<!-- <!-- //js
    jQuery-Photo-filter-lightbox-Gallery-plugin
    // end-smoth-scrolling -->
	<script src="js/jquery-1.7.2.js"></script>
	<script src="js/jquery.quicksand.js"></script>
	<script src="js/pretty-script.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<!--  //jQuery-Photo-filter-lightbox-Gallery-plugin -->
</body>

</html>