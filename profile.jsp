<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!--Font awesome icons -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/static/css/style.css">
<title>Profile Page</title>
</head>

<body
	style="background-position: center center; background-repeat: no-repeat; background-attachment: fixed; background-size: cover; background-color: honeydew;">
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<a class="navbar-brand mt-2 mt-lg-0" href="/"> <img
			src="/static/images/up_bar.jpg" height="35" alt="" loading="lazy" />
		</a>
		<button type="button" class="navbar-toggler" data-toggle="collapse"
			data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<div class="navbar-nav ml-auto">
				<p id="hello-msg" class="nav-item nav-link">Hello, user01
					&nbsp;&nbsp;&nbsp;</p>
			</div>
			<div class="navbar-nav ml-auto">
				<a href="profile.jsp" class="nav-item nav-link"><i
					class="far fa-address-card"></i>&nbsp;&nbsp;Profile</a> <a
					href="index.jsp" class="nav-item nav-link"> <i
					class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout
				</a>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<div class="container">
		<br>
		<div
			class="container d-flex align-items-center justify-content-center">
			<div class="row my-3 p-3">
				<div class="form-content">
					<form method="post" enctype="multipart/form-data">
						<input type="hidden" name="csrfmiddlewaretoken"
							value="FLCDxaUQDDqPZ2dbstC5AKlofRyOeUavd8IuJCjJM88G1L89OEYH6OiKqlMNBD3x">
						<div class="form-row">
							<div class="col-md-12">
								<div class="form-group">
									<label class="small mb-1">Username:</label> <input type="text"
										name="username" value="user01" class="form-control"
										maxlength="100" required id="id_username"> <label
										class="small mb-1">Email:</label> <input type="text"
										name="email" value="user@gmail.com" class="form-control"
										required id="id_email">
								</div>
								<div class="form-group">
									<a href="/password-change/">Change Password</a>
									<hr>
									<label class="small mb-1">Change Avatar:</label> <input
										type="file" name="avatar" class="form-control-file"
										accept="image/*" id="id_avatar">
								</div>
								<label class="small mb-1">Bio:</label>
								<textarea name="bio" cols="40" rows="5" class="form-control"
									required id="id_bio">
</textarea>
							</div>
						</div>
						<br>
						<br>
						<div class="container  align-items-center justify-content-center">
							<input class="btn btn-primary" type="submit" value="Save Changes">
							<input class="btn btn-primary" type="reset" value="Reset">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>
	<br />
	<nav
		class="navbar navbar-expand-lg navbar-light bg-light fixed-bottom py-6 ">
		<div class="container-fluid">
			<ul class="navbar-nav mx-auto text-center nav-justified">
				<form action="dashboard.jsp">
					<li class="nav-item"><a class="nav-link" href="dashboard.jsp"><i
							class="fas fa-dashboard"></i>Dashboard</a></li>
				</form>
				<form action="home.jsp">
					<li class="nav-item"><a class="nav-link" href="home.jsp"><i
							class="fas fa-home"></i>Home</a></li>
				</form>
				<form action="logs.jsp">
					<li class="nav-item"><a class="nav-link" href="logs.jsp"><i
							class="fas fa-info"></i>Logs</a></li>
				</form>
				<form action="devices.jsp">
					<li class="nav-item"><a class="nav-link" href="devices.jsp"><i
							class="fas fa-profile"></i>Device</a></li>
				</form>
				<form action="security.jsp">
					<li class="nav-item"><a class="nav-link" href="security.jsp"><i
							class="fas fa-unlock-alt"></i>Security</a></li>
				</form>
				<form action="setting.jsp">
					<li class="nav-item"><a class="nav-link" href="setting.jsp"><i
							class="fas fa-book"></i>Setting</a></li>
			</ul>
		</div>
	</nav>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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
	<!-- A plugin for password show/hide  -->
	<script
		src="https://unpkg.com/bootstrap-show-password@1.2.1/dist/bootstrap-show-password.min.js"></script>
</body>
</html>
<br />
<br />
<br />
<br />