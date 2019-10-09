
<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="zxx">

<head>
<title>Shipment Transport Category Bootstrap responsive Web
	Template | Home :: w3layouts</title>
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
											Call Us : <span>1234567890</span>
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
									href="index.html">Home <span class="sr-only">(current)</span>
								</a></li>
								<li class="nav-item"><a class="nav-link" href="about.html">About</a>
								</li>
								<li class="nav-item dropdown"><a
									class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
									role="button" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false"> Services <i
										class="fas fa-angle-down"></i>
								</a>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown">
										<a class="dropdown-item" href="services.html">Services</a> <a
											class="dropdown-item" href="services.html" title="">Services
											1</a> <a class="dropdown-item" href="single.html" title="">Single
											Page</a>
									</div></li>
								<li class="nav-item"><a class="nav-link" href="price.html">Pricing</a>
								</li>
								<li class="nav-item"><a class="nav-link"
									href="contact.html">Contact</a></li>

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

						<p class="copy-right mt-3">© 2018 Shipment. All Rights
							Reserved | Design by</p>
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