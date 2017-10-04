<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="resources/common/quickpoll_bootstrap/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="resources/common/quickpoll_bootstrap/assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Paper Dashboard PRO by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


     <!-- Bootstrap core CSS     -->
    <link href="resources/common/quickpoll_bootstrap/assets/css/bootstrap.min.css" rel="stylesheet" />

    <!--  Paper Dashboard core CSS    -->
    <link href="resources/common/quickpoll_bootstrap/assets/css/paper-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="resources/common/quickpoll_bootstrap/assets/css/demo.css" rel="stylesheet" />


    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="resources/common/quickpoll_bootstrap/assets/css/themify-icons.css" rel="stylesheet">
</head>

<body>
	<div class="wrapper">
	    <div class="sidebar" data-background-color="brown" data-active-color="danger">
	    <!--
			Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
			Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
		-->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text">
					Creative Tim
				</a>
			</div>
			<div class="logo logo-mini">
				<a href="http://www.creative-tim.com" class="simple-text">
					Ct
				</a>
			</div>
	    	<div class="sidebar-wrapper">
				<div class="user">
	                <div class="photo">
	                    <img src="resources/common/quickpoll_bootstrap/assets/img/faces/face-2.jpg" />
	                </div>
	                <div class="info">
	                    <a data-toggle="collapse" href="#collapseExample" class="collapsed">
	                        Chet Faker
	                        <b class="caret"></b>
	                    </a>
	                    <div class="collapse" id="collapseExample">
	                        <ul class="nav">
	                            <li><a href="#profile">My Profile</a></li>
	                            <li><a href="#editprofile">Edit Profile</a></li>
	                            <li><a href="#settings">Settings</a></li>
	                        </ul>
	                    </div>
	                </div>
	            </div>
	            <ul class="nav">
	                <li class="active">
	                    <a data-toggle="collapse" href="#dashboardOverview" aria-expanded="true">
	                        <i class="ti-panel"></i>
	                        <p>Dashboard
                                <b class="caret"></b>
                            </p>
	                    </a>
                        <div class="collapse in" id="dashboardOverview">
							<ul class="nav">
								<li class="active"><a href="overview.html">Overview</a></li>
								<li><a href="stats.html">Stats</a></li>
							</ul>
						</div>
	                </li>
					<li>
						<a data-toggle="collapse" href="#componentsExamples">
							<i class="ti-package"></i>
							<p>Components
							   <b class="caret"></b>
							</p>
						</a>
						<div class="collapse" id="componentsExamples">
							<ul class="nav">
								<li><a href="../components/buttons.html">Buttons</a></li>
								<li><a href="../components/grid.html">Grid System</a></li>
								<li><a href="../components/panels.html">Panels</a></li>
								<li><a href="../components/sweet-alert.html">Sweet Alert</a></li>
								<li><a href="../components/notifications.html">Notifications</a></li>
								<li><a href="../components/icons.html">Icons</a></li>
								<li><a href="../components/typography.html">Typography</a></li>
							</ul>
						</div>
					</li>
					<li>
						<a data-toggle="collapse" href="#formsExamples">
	                        <i class="ti-clipboard"></i>
	                        <p>
								Forms
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="formsExamples">
	                        <ul class="nav">
								<li><a href="../forms/regular.html">Regular Forms</a></li>
								<li><a href="../forms/extended.html">Extended Forms</a></li>
								<li><a href="../forms/validation.html">Validation Forms</a></li>
	                            <li><a href="../forms/wizard.html">Wizard</a></li>
	                        </ul>
	                    </div>
	                </li>
	                <li>
						<a data-toggle="collapse" href="#tablesExamples">
	                        <i class="ti-view-list-alt"></i>
	                        <p>
								Table list
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="tablesExamples">
	                        <ul class="nav">
								<li><a href="../tables/regular.html">Regular Tables</a></li>
								<li><a href="../tables/extended.html">Extended Tables</a></li>
								<li><a href="../tables/bootstrap-table.html">Bootstrap Table</a></li>
								<li><a href="../tables/datatables.net.html">DataTables.net</a></li>
	                        </ul>
	                    </div>
	                </li>
					<li>
						<a data-toggle="collapse" href="#mapsExamples">
	                        <i class="ti-map"></i>
	                        <p>
								Maps
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="mapsExamples">
	                        <ul class="nav-second-level nav">
								<li><a href="../maps/google.html">Google Maps</a></li>
								<li><a href="../maps/vector.html">Vector Maps</a></li>
								<li><a href="../maps/fullscreen.html">Full Screen Map</a></li>
	                        </ul>
	                    </div>
	                </li>
					<li>
	                    <a href="../charts.html">
	                        <i class="ti-bar-chart-alt"></i>
	                        <p>Charts</p>
	                    </a>
	                </li>
					<li>
	                    <a href="../calendar.html">
	                        <i class="ti-calendar"></i>
	                        <p>Calendar</p>
	                    </a>
	                </li>
					<li>
						<a data-toggle="collapse" href="#pagesExamples">
	                        <i class="ti-gift"></i>
	                        <p>
								Pages
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="pagesExamples">
	                        <ul class="nav-second-level nav">
								<li><a href="../pages/timeline.html">Timeline Page</a></li>
								<li><a href="../pages/user.html">User Page</a></li>
								<li><a href="../pages/login.html">Login Page</a></li>
								<li><a href="../pages/register.html">Register Page</a></li>
								<li><a href="../pages/lock.html">Lock Screen Page</a></li>
	                        </ul>
	                    </div>
	                </li>
	            </ul>
	    	</div>
	    </div>

	    <div class="main-panel">
	        <div class="content">
	            <div class="container-fluid">

					<div class="row">
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="blue">
								<div class="header text-center">
	                                <h5 class="title">Dashboard</h5>
	                                <p class="description">Monthly sales target</p>
	                            </div>
								<div class="content">
									<div id="chartDashboard" class="chart-circle" data-percent="10">1/10</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="green">
								<div class="header text-center">
	                                <h5 class="title">Orders</h5>
	                                <p class="description">Completed</p>
	                            </div>
								<div class="content">
									<div id="chartOrders" class="chart-circle" data-percent="34">34%</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="orange">
								<div class="header text-center">
	                                <h5 class="title">New Visitors</h5>
	                                <p class="description">Out of total number</p>
	                            </div>
								<div class="content">
									<div id="chartNewVisitors" class="chart-circle" data-percent="62">62%</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="brown">
								<div class="header text-center">
	                                <h5 class="title">Subscriptions</h5>
	                                <p class="description">Monthly newsletter</p>
	                            </div>
								<div class="content">
									<div id="chartSubscriptions" class="chart-circle" data-percent="10">10%</div>
								</div>
							</div>
						</div>
					</div>
                </div>
	        </div>
           
	    </div>
	</div>
</body>

    <!--   Core JS Files. Extra: PerfectScrollbar + TouchPunch libraries inside jquery-ui.min.js   -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="resources/common/quickpoll_bootstrap/assets/js/jquery-ui.min.js" type="text/javascript"></script>
	<script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Forms Validations Plugin -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/jquery.validate.min.js"></script>

	<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
	<script src="resources/common/quickpoll_bootstrap/assets/js/moment.min.js"></script>

    <!--  Date Time Picker Plugin is included in this js file -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-datetimepicker.js"></script>

    <!--  Select Picker Plugin -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-selectpicker.js"></script>

	<!--  Checkbox, Radio, Switch and Tags Input Plugins -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-checkbox-radio-switch-tags.js"></script>

	<!-- Circle Percentage-chart -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/jquery.easypiechart.min.js"></script>

	<!--  Charts Plugin -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-notify.js"></script>

    <!-- Sweet Alert 2 plugin -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/sweetalert2.js"></script>

    <!-- Vector Map plugin -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/jquery-jvectormap.js"></script>

    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js"></script>

	<!-- Wizard Plugin    -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/jquery.bootstrap.wizard.min.js"></script>

    <!--  Bootstrap Table Plugin    -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-table.js"></script>

    <!--  Full Calendar Plugin    -->
    <script src="resources/common/quickpoll_bootstrap/assets/js/fullcalendar.min.js"></script>

    <!-- Paper Dashboard PRO Core javascript and methods for Demo purpose -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/paper-dashboard.js"></script>

    <!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/demo.js"></script>

	<script type="text/javascript">
    	$(document).ready(function(){
			demo.initOverviewDashboard();
			demo.initCirclePercentage();

    	});
	</script>

</html>
