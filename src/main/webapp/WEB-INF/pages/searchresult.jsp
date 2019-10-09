<%@page isELIgnored="false"%>
<html>
<body>
	<h3>Customer-Details</h3>
	<hr>
	<pre>
	    Email    ${transporter.email}
		Password ${transporter.password}
		Name	 ${transporter.name}
		City	 ${transporter.city}
		Docs	<img src="LoadImage?code=${transporter.email}" />
		Idproof	<img src="LoadIdentity?email=${transporter.email}" />
	</pre>
	<hr>
	<a href="search">Search-More</a>
	<br>
	<a href="index.jsp">Home</a>
</body>
</html>