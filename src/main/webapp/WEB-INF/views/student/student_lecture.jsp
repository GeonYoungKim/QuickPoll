<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="resources/common/quickpoll_bootstrap/assets/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="resources/common/quickpoll_bootstrap/assets/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<title>Paper Dashboard PRO by Creative Tim</title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />


<!-- Bootstrap core CSS     -->
<link
	href="resources/common/quickpoll_bootstrap/assets/css/bootstrap.min.css"
	rel="stylesheet" />

<!--  Paper Dashboard core CSS    -->
<link
	href="resources/common/quickpoll_bootstrap/assets/css/paper-dashboard.css"
	rel="stylesheet" />


<!--  CSS for Demo Purpose, don't include it in your project     -->
<link href="resources/common/quickpoll_bootstrap/assets/css/demo.css"
	rel="stylesheet" />


<!--  Fonts and icons     -->
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Muli:400,300'
	rel='stylesheet' type='text/css'>
<link
	href="resources/common/quickpoll_bootstrap/assets/css/themify-icons.css"
	rel="stylesheet">
</head>

<body>
	<input id="student_id" type="hidden" value="${student_id}">
	<div class="wrapper">
		<div class="sidebar" data-background-color="brown"
			data-active-color="danger">
			<!--
			Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
			Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
		-->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text">
					Creative Tim </a>
			</div>
			<div class="logo logo-mini">
				<a href="http://www.creative-tim.com" class="simple-text"> CT </a>
			</div>
			<div class="sidebar-wrapper">
				<div class="user">
					<div class="photo">
						<img
							src="resources/common/quickpoll_bootstrap/assets/img/faces/face-2.jpg" />
					</div>
					<div class="info">
						<a data-toggle="collapse" href="#collapseExample"
							class="collapsed"> Chet Faker <b class="caret"></b>
						</a>
						<div class="collapse" id="collapseExample">
							<ul class="nav">
								<li><a href="#profile">My Profile</a></li>
								<li><a href="#edit">Edit Profile</a></li>
								<li><a href="#settings">Settings</a></li>
							</ul>
						</div>
					</div>
				</div>
				<ul class="nav">
					<li><a data-toggle="collapse" href="#dashboardOverview"> <i
							class="ti-panel"></i>
							<p>
								Dashboard <b class="caret"></b>
							</p>
					</a>
						<div class="collapse" id="dashboardOverview">
							<ul class="nav">
								<li><a href="../dashboard/overview.html">Overview</a></li>
								<li><a href="../dashboard/stats.html">Stats</a></li>
							</ul>
						</div></li>
					<li><a data-toggle="collapse" href="#componentsExamples">
							<i class="ti-package"></i>
							<p>
								Components <b class="caret"></b>
							</p>
					</a>
						<div class="collapse" id="componentsExamples">
							<ul class="nav">
								<li><a href="../components/buttons.html">Buttons</a></li>
								<li><a href="../components/grid.html">Grid System</a></li>
								<li><a href="../components/panels.html">Panels</a></li>
								<li><a href="../components/sweet-alert.html">Sweet
										Alert</a></li>
								<li><a href="../components/notifications.html">Notifications</a></li>
								<li><a href="../components/icons.html">Icons</a></li>
								<li><a href="../components/typography.html">Typography</a></li>
							</ul>
						</div></li>
					<li class="active"><a data-toggle="collapse"
						href="#formsExamples" aria-expanded="true"> <i
							class="ti-clipboard"></i>
							<p>
								Forms <b class="caret"></b>
							</p>
					</a>
						<div class="collapse in" id="formsExamples">
							<ul class="nav">
								<li><a href="regular.html">Regular Forms</a></li>
								<li><a href="extended.html">Extended Forms</a></li>
								<li><a href="validation.html">Validation Forms</a></li>
								<li class="active"><a href="wizard.html">Wizard</a></li>
							</ul>
						</div></li>
					<li><a data-toggle="collapse" href="#tablesExamples"> <i
							class="ti-view-list-alt"></i>
							<p>
								Table list <b class="caret"></b>
							</p>
					</a>
						<div class="collapse" id="tablesExamples">
							<ul class="nav">
								<li><a href="../tables/regular.html">Regular Tables</a></li>
								<li><a href="../tables/extended.html">Extended Tables</a></li>
								<li><a href="../tables/bootstrap-table.html">Bootstrap
										Table</a></li>
								<li><a href="../tables/datatables.net.html">DataTables.net</a></li>
							</ul>
						</div></li>
					<li><a data-toggle="collapse" href="#mapsExamples"> <i
							class="ti-map"></i>
							<p>
								Maps <b class="caret"></b>
							</p>
					</a>
						<div class="collapse" id="mapsExamples">
							<ul class="nav">
								<li><a href="../maps/google.html">Google Maps</a></li>
								<li><a href="../maps/vector.html">Vector maps</a></li>
								<li><a href="../maps/fullscreen.html">Full Screen Map</a></li>
							</ul>
						</div></li>
					<li><a href="../charts.html"> <i class="ti-bar-chart-alt"></i>
							<p>Charts</p>
					</a></li>
					<li><a href="../calendar.html"> <i class="ti-calendar"></i>
							<p>Calendar</p>
					</a></li>
					<li><a data-toggle="collapse" href="#pagesExamples"> <i
							class="ti-gift"></i>
							<p>
								Pages <b class="caret"></b>
							</p>
					</a>
						<div class="collapse" id="pagesExamples">
							<ul class="nav">
								<li><a href="../pages/timeline.html">Timeline Page</a></li>
								<li><a href="../pages/user.html">User Page</a></li>
								<li><a href="../pages/login.html">Login Page</a></li>
								<li><a href="../pages/register.html">Register Page</a></li>
								<li><a href="../pages/lock.html">Lock Screen Page</a></li>
							</ul>
						</div></li>
				</ul>
			</div>
		</div>

		<div class="main-panel">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-minimize">
						<button id="minimizeSidebar" class="btn btn-fill btn-icon">
							<i class="ti-more-alt"></i>
						</button>
					</div>
					<div class="navbar-header">
						<button type="button" class="navbar-toggle">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar bar1"></span> <span class="icon-bar bar2"></span>
							<span class="icon-bar bar3"></span>
						</button>
						<a class="navbar-brand" href="#wizard">Wizard</a>
					</div>
					<div class="collapse navbar-collapse">
						<form class="navbar-form navbar-left navbar-search-form"
							role="search">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-search"></i></span>
								<input type="text" value="" class="form-control"
									placeholder="Search...">
							</div>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#stats" class="dropdown-toggle btn-magnify"
								data-toggle="dropdown"> <i class="ti-panel"></i>
									<p>Stats</p>
							</a></li>
							<li class="dropdown"><a href="#notifications"
								class="dropdown-toggle btn-rotate" data-toggle="dropdown"> <i
									class="ti-bell"></i> <span class="notification">5</span>
									<p class="hidden-md hidden-lg">
										Notifications <b class="caret"></b>
									</p>
							</a>
								<ul class="dropdown-menu">
									<li><a href="#not1">Notification 1</a></li>
									<li><a href="#not2">Notification 2</a></li>
									<li><a href="#not3">Notification 3</a></li>
									<li><a href="#not4">Notification 4</a></li>
									<li><a href="#another">Another notification</a></li>
								</ul></li>
							<li><a href="#settings" class="btn-rotate"> <i
									class="ti-settings"></i>
									<p class="hidden-md hidden-lg">Settings</p>
							</a></li>
						</ul>
					</div>
				</div>
			</nav>

			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-8 col-md-offset-2">
							<div class="card card-wizard" id="wizardCard">
								<form id="wizardForm" method="" action="">
									<div class="header text-center">
										<h4 class="title">QuickPoll</h4>
										<p class="category">수업에 적극적으로 참여해 보세요~</p>
									</div>
									<div class="content">
										<ul class="nav">
											<li><a href="#tab1" data-toggle="tab">문제 풀기</a></li>
										</ul>
										<div class="tab-content">
											<div class="tab-pane" id="tab1">
												<h5 class="text-center">문제 대기 중 입니다.</h5>

												<div class="row">
													<div id="student_question_content"
														class="col-md-10 col-md-offset-1">

														<!-- objective question  -->
														<!--
														<div class="panel panel-border panel-default"> 
															<div class="panel-heading">
																<h4 class="panel-title">Q. 물리계층의 전송 단위는?</h4>
															</div>
															<br/>	
															<button class="btn btn-icon btn-github">
					                            				<i>1</i>
				                        					</button> Frame<br/><br/>
					                        				<button class="btn btn-icon btn-github">
					                            				<i>2</i>
				                        					</button>Data<br/><br/>
				                        					<button class="btn btn-icon btn-github">
					                            				<i>3</i>
				                        					</button>Packet<br/><br/>
				                        					<button class="btn btn-icon btn-github">
					                            				<i>4</i>
				                        					</button>Bit<br/><br/>
				                        					</div>	
			                        					-->

														<!-- Subjective Question  -->
														<div class="form-group">
															<label class="control-label"> Q. 질문해보세요~ </label> <input
																class="form-control" type="text"
																id="direct_question_content"
																name="direct_question_content"
																placeholder="ex: 제출하실 답을 적어주세요" />
														</div>


														<button type="button"
															class="btn btn-info btn-fill btn-wd btn-next pull-right"
															onclick="">제출하기</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>

			<footer class="footer">
				<div class="container-fluid">
					<nav class="pull-left">
						<ul>
							<li><a href="http://www.creative-tim.com"> Creative Tim
							</a></li>
							<li><a href="http://blog.creative-tim.com"> Blog </a></li>
							<li><a href="http://www.creative-tim.com/license">
									Licenses </a></li>
						</ul>
					</nav>
					<div class="copyright pull-right">
						&copy;
						<script>document.write(new Date().getFullYear())</script>
						, made with <i class="fa fa-heart heart"></i> by <a
							href="http://www.creative-tim.com">Creative Tim</a>
					</div>
				</div>
			</footer>
		</div>
	</div>
</body>

<!--   Core JS Files. Extra: PerfectScrollbar + TouchPunch libraries inside jquery-ui.min.js   -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-1.10.2.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-ui.min.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap.min.js"
	type="text/javascript"></script>

<!--  Forms Validations Plugin -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery.validate.min.js"></script>

<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/moment.min.js"></script>

<!--  Date Time Picker Plugin is included in this js file -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-datetimepicker.js"></script>

<!--  Select Picker Plugin -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-selectpicker.js"></script>

<!--  Checkbox, Radio, Switch and Tags Input Plugins -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-checkbox-radio-switch-tags.js"></script>

<!-- Circle Percentage-chart -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery.easypiechart.min.js"></script>

<!--  Charts Plugin -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-notify.js"></script>

<!-- Sweet Alert 2 plugin -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/sweetalert2.js"></script>

<!-- Vector Map plugin -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-jvectormap.js"></script>

<!--  Google Maps Plugin    -->
<script src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Wizard Plugin    -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery.bootstrap.wizard.min.js"></script>

<!--  Bootstrap Table Plugin    -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap-table.js"></script>

<!--  Plugin for DataTables.net  -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery.datatables.js"></script>

<!--  Full Calendar Plugin    -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/fullcalendar.min.js"></script>

<!-- Paper Dashboard PRO Core javascript and methods for Demo purpose -->
<script
	src="resources/common/quickpoll_bootstrap/assets/js/paper-dashboard.js"></script>

<!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
<script src="resources/common/quickpoll_bootstrap/assets/js/demo.js"></script>
<script type="text/javascript"
	src="resources/common/quickpoll_bootstrap/assets/js/sockjs-0.3.4.js"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/student/student_lecture_socket.js?ver=1"
	charset="UTF-8"></script>
<script type="text/javascript">
        $().ready(function(){

            var $validator = $("#wizardForm").validate({
    		  rules: {
    		    email: {
                    required: true,
                    email: true,
                    minlength: 5
    		    },
    		    first_name: {
    		        required: false,
                    minlength: 5
    		    },
    		    last_name: {
    		        required: false,
                    minlength: 5
    		    },
    		    website: {
    		        required: true,
                    minlength: 5,
                    url: true
    		    },
    		    framework: {
        		    required: false,
        		    minlength: 4
    		    },
    		    cities: {
        		    required: true
    		    },
    		    price:{
        		    number: true
    		    }
    		  }
    		});

			// you can also use the nav-pills-[blue | azure | green | orange | red] for a different color of wizard
            $('#wizardCard').bootstrapWizard({
            	/* tabClass: 'nav nav-pills',
            	nextSelector: '.btn-next',
                previousSelector: '.btn-back', */
            	onNext: function(tab, navigation, index) {
            		/* var $valid = $('#wizardForm').valid();

            		if(!$valid) {
            			$validator.focusInvalid();
            			return false;
            		} */
            	},
                onInit : function(tab, navigation, index){

                    //check number of tabs and fill the entire row
                    var $total = navigation.find('li').length;
                    $width = 100/$total;

                    $display_width = $(document).width();

                    if($display_width < 600 && $total > 3){
                       $width = 50;
                    }

                    navigation.find('li').css('width',$width + '%');
                },
                onTabClick : function(tab, navigation, index){
                    // Disable the posibility to click on tabs
                    return true;
                },
                onTabShow: function(tab, navigation, index) {
/*                     var $total = navigation.find('li').length;
                    var $current = index+1;

                    var wizard = navigation.closest('.card-wizard');

                    // If it's the last tab then hide the last button and show the finish instead
                    if($current >= $total) {
                        $(wizard).find('.btn-next').hide();
                        $(wizard).find('.btn-finish').show();
                    } else if($current == 1){
                        $(wizard).find('.btn-back').hide();
                    } else {
                        $(wizard).find('.btn-back').show();
                        $(wizard).find('.btn-next').show();
                        $(wizard).find('.btn-finish').hide();
                    } */
                }
            });
        });

        function onFinishWizard(){
            //here you can do something, sent the form to server via ajax and show a success message with swal

            swal("Good job!", "You clicked the finish button!", "success");
        }
	</script>

</html>
