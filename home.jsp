<!DOCTYPE html>
<html>
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
<title>Home Page</title>
<link id="chromealerabat-link" rel="stylesheet" type="text/css"
	href="chrome-extension://dacdinoicboceafielngnmjjplncljhj/content.css">
</head>
<body
	style="background-position: centercentert; background-repeat: no-repeat; background-attachment: fixed; background-size: cover; background-color: honeydew;"
	data-new-gr-c-s-check-loaded="14.1045.0" data-gr-ext-installed="">
	<div id="StayFocusd-infobar" style="display: none;">
		<img
			src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
		<span id="StayFocusd-infobar-msg"></span> <span
			id="StayFocusd-infobar-links"> <a
			id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
			<a id="StayFocusd-infobar-hide">hide once</a>
		</span>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<a class="navbar-brand mt-2 mt-lg-0" href="/"> <img
			src="/static/images/up_bar.jpg" height="35" alt="" loading="lazy">
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
	<div class="function">
		<div class="container">
			<style>
.my-custom-scrollbar {
	position: center;
	height: 400px;
	overflow: auto;
}

.table-wrapper-scroll-y {
	display: block;
}
</style>
			<div class="item1"
				style="background-position: center; background-repeat: no-repeat; background-attachment: fixed; background-size: cover; background-color: honeydew;">

				<br>
				<script>
					var matching_groups = [];
					var friends_for_group = [];

					// TODO: connect with the backend
					var group_list = [];

					// TODO: connect with the backend
					var friend_list = [ "User D", "User C", "User B", "User A" ]
							.sort();

					function join_group(group_index) {
						// TODO: conect with the backend and join the group

						let b = document.getElementById("search_group_list").children[group_index].children[0];
						b.disabled = true;
						b.innerText = "Pending";
					}

					function search_group() {
						let e = null;
						while (e = document.getElementById("search_group_list").lastChild) {
							document.getElementById("search_group_list")
									.removeChild(e);
						}

						// TODO: connect with the backend. Store the names of the matches in the next list.
						matching_groups = [ document
								.getElementById("group_search").value ];
						for (let i = 0; i < matching_groups.length; i++) {
							if (matching_groups[i].trim().length >= 5) {
								let p = document.createElement("p");
								p.innerText = matching_groups[i];

								let b = document.createElement("button");
								let f = "join_group(" + i + ")";
								b.innerText = "Join";
								b.setAttribute("onclick", f);
								b.setAttribute("style", "float:right;");

								p.appendChild(b);
								document.getElementById("search_group_list")
										.appendChild(p);
							}
						}

						// TODO: connect with the backend
					}

					function add_friend_to_group(i) {
						current = document.getElementById("div_friend_list").children[i].children[0].textContent;
						if (current == "Remove") {
							var new_list = [];
							for (let index = 0; index < friends_for_group.length; index++) {
								if (friends_for_group[index].trim() != document
										.getElementById("div_friend_list").children[i].textContent
										.split("Remove")[0].trim()) {
									new_list.push(friends_for_group[index]);
								}
							}
							friends_for_group = new_list;
							if (new_list.length <= 0) {
								document.getElementById("create_group_button").disabled = true;
							}
						} else {
							friends_for_group
									.push(document
											.getElementById("div_friend_list").children[i].textContent
											.split("Add")[0]);
							document.getElementById("create_group_button")
									.removeAttribute("disabled");
						}
						document.getElementById("div_friend_list").children[i].children[0].textContent = document
								.getElementById("div_friend_list").children[i].children[0].textContent == "Remove" ? "Add"
								: "Remove";
					}

					function create_group() {
						var name = "";
						while (name == "") {
							name = prompt("Name for the group: ");
						}

						// TODO : connect with the backend, create the group

						for (var i = 1; i < document
								.getElementById("div_friend_list").children.length; i++) {
							document.getElementById("div_friend_list").children[i].children[0].textContent = "Add";
						}

						friends_for_group = [];

						// show new group in group list (only if successfull)
						if (true) {
							let p = document.createElement("p");
							p.innerText = name;
							let b1 = document.createElement("button");
							let b2 = document.createElement("button");
							b1.innerText = "Details";
							b2.innerText = "Call";
							b2.setAttribute("style",
									"float:right; margin-left: 5px");
							b1.setAttribute("style", "float:right;");
							b1.disabled = true;
							p.appendChild(b2);
							p.appendChild(b1);
							document.getElementById("div_my_groups")
									.appendChild(p);
						}

						document.getElementById("create_group_button").disabled = true;
					}
				</script>

				<div class="row">
					<style>
#row {
	height: 100%;
	width: 100%;
	font-size: 0;
}

#left, #middle, #right {
	display: inline-block;
	*display: inline;
	zoom: 1;
	vertical-align: top;
	font-size: 12px;
}

#left {
	width: 25%;
	background: blue;
}

#middle {
	width: 50%;
	background: green;
}

#right {
	width: 25%;
	background: yellow;
}
</style>
					<div class="left" style="background-color: white;">
						<h2>Tenants</h2>
						<div class="inside_div" id="div_my_groups">
							<script>
								for (let i = 0; i < group_list.length; i++) {
									document.write("<p>");
									document.write(group_list[i]);
									document
											.write("<button style='float:right; margin-left: 5px' type='button'> Call </button>")
									document
											.write("<button style='float:right;' type='button' disabled> Details </button>")
									document.write("</p>");
								}
							</script>
						</div>
					</div>
					<div class="middle"
						style="background-color: white; horizontal-align: middle">
						<h2>Search Tenants</h2>
						<div class="inside_div" id="div_friend_list">
							<script>
								for (let i = 0; i < friend_list.length; i++) {
									document.write("<p>");
									document.write(friend_list[i]);
									let f_str = "add_friend_to_group("
											+ (i + 1) + ")";
									document
											.write("<button style='float:right;' type='button' onclick='" + f_str + "'> Add </button>");
									document.write("</p>");
								}
							</script>
						</div>
						<br>
						<button type="button" onclick="create_group()" disabled
							id="create_group_button">Create group</button>
					</div>
					<div class="right" style="background-color: white;">
						<h2>Search groups</h2>
						<div class="inside_div">
							<input type="text" placeholder="Search groups" id="group_search"
								onkeyup="search_group()" style="width: 100%;">
							<div id="search_group_list">
								<script>
									
								</script>
							</div>
						</div>
					</div>
				</div>

				<script>
					function openNav() {
						document.getElementById("mySidenav").style.width = "500px";
					}

					function closeNav() {
						document.getElementById("mySidenav").style.width = "0";
					}
				</script>
			</div>
			<nav
				class="navbar navbar-expand-lg navbar-light bg-light fixed-bottom py-6 ">
				<div class="container-fluid">
					<ul class="navbar-nav mx-auto text-center nav-justified">
						<form action="dashboard.jsp">
							<li class="nav-item"><a class="nav-link"
								href="dashboard.jsp"><i class="fas fa-dashboard"></i>Dashboard</a>
							</li>
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
			<br> <br>
			<br>
			<br>
</body>
<grammarly-desktop-integration data-grammarly-shadow-root="true"></grammarly-desktop-integration>
</html>