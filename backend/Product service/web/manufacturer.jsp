<!doctype html>
<html lang="en" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,600' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/reset.css"> 
	<link rel="stylesheet" href="css/style_5.css"> 
	<script src="js/modernizr.js"></script> 
  	
	<title>Manufacturer Page</title>
</head>
<body>
	<header class="cd-main-header">
	</header>

	<p align="center"><ul class="cd-pricing">
		
		<li>
			<header class="cd-pricing-header">
				<h2>Enter Manufacturer</h2>

				<div class="cd-price">
					<span>Details</span>
					
				</div>
			</header> <!-- .cd-pricing-header -->
			<br>
			<footer class="cd-pricing-footer">
				<a href="#0">Click here..</a>
			</footer> <!-- .cd-pricing-footer -->
		</li>
	</ul></p> 

	<div class="cd-form">
		
		<div class="cd-plan-info">
			<!-- content will be loaded using jQuery - according to the selected plan -->
		</div>
		
            <form name="f1" action="manufacturer" method="post">
			<fieldset>
				<legend>Manufacturer Registration</legend>
				<div class="half-width">
					<label for="userName">Username</label>
					<input type="text" id="userName" name="username" required="">
				</div>
				
				
				<div class="half-width">
					<label for="password">Password</label>
					<input type="text" id="password" name="password" required="">
				</div>
				<div class="half-width">
					<label for="age">email</label>
					<input type="text" id="age" name="email" required="">
				</div>
				<div class="half-width">
					<label for="email">phonenumber</label>
					<input type="text" id="email" name="phonenumber" required="">
				</div>
				<div class="half-width">
					<label for="mobile">Manufacturer Location</label>
					<input type="text" id="mobile" name="location" required="">
				</div>
								<span class="cd-select">
				
	</span>
	
		
	<b>
	
            <br>
			<input type="submit" value="UPDATE">
	
	
	
	
	
			</fieldset>
		</form>

		<a href="#0" class="cd-close"></a>
	</div> <!-- .cd-form -->
	
	<div class="cd-overlay"></div> <!-- shadow layer -->
<script src="js/jquery-2.1.4.js"></script>
<script src="js/velocity.min.js"></script>
<script src="js/main.js"></script> <!-- Resource jQuery -->
</body>
</html>