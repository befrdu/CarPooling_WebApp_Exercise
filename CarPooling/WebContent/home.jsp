<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>TODO supply a title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/responsive.css" rel="stylesheet">
<script src="jquery-3.1.1.js"></script>
<script src="displayPost.js" ></script>
</head>
<body>
	<div class="container form-horizontal">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h1>Car-Pooling Home Page</h1>
			</div>
			<div class="panel-body">
				<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Home</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="login.jsp">Post <span
									class="sr-only">(current)</span></a></li>
							<li><a href="#">Weather</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-haspopup="true"
								aria-expanded="false">Search Nearby <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">Fairfield</a></li>
									<li><a href="#">Davenport</a></li>
									<li><a href="#">Cidar Rapids</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Separated link</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="#">Dubuque</a></li>
								</ul></li>
						</ul>
						<form class="navbar-form navbar-left">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="submit" class="btn btn-default">Search</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="login.jsp">Log_out</a></li>
							
							
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid --> </nav>
				<div class="jumbotron">

					<!-- Middle content section -->
					<div class="middle">
						<div class="container">
							<div class="col-md-9 content">
								<h2>Enjoy the car pooling App. Here you can post to let people share your ride
								or You can post people to give you a ride</h2>
								<div id="userPosts">
								
								</div>
								<div class="to-tutorial">
									<p>
										<strong><a>More...</a></strong>
									</p>
									
								</div>
							</div>
							<div class="col-md-3">
								<h2>Important Links</h2>
								<ul class="nav nav-pills nav-stacked">
									<li><a href="weather.html" target="_blank">Search for weather information</a></li>
									<li><a href="pagination.html" target="_blank">
											Sample pagination</a></li>
									<li><a href=""
										target="_blank">Search for ride</a></li>
									<li><a href="" target="_blank">
											Post share me my ride</a></li>
									<li><a href="" target="_blank">
											Post your need to have a ride with someone</a></li>
									<li><a href="" target="_blank">
											Get general information about the car pooling</a></li>
									<li><a href="" target="_blank">
											Frequestly Asked Question</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Include jQuery and bootstrap JS plugins -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>