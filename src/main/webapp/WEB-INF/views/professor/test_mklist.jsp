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

<title>Quick Poll Homepage</title>

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
	<div class="wrapper">
		<div class="sidebar" data-background-color="brown"
			data-active-color="danger">
			<!--
			Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
			Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
		-->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text">
					QuickPoll </a>
			</div>
			<div class="logo logo-mini">
				<a href="http://www.creative-tim.com" class="simple-text"> QP </a>
			</div>
			<div class="sidebar-wrapper">
				<div class="user">
					<div class="photo">
						<img
							src="resources/common/profile_image/${professorInfo[0].profile_img}" />
					</div>
					<div class="info">
						<a data-toggle="collapse" href="#collapseExample"
							class="collapsed"> ${professorInfo[0].name} <b class="caret"></b>
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
					<li class="active"><a href="#tablesExamples"> <i
							class="ti-view-list-alt"></i>
							<p>강의 목록</p>
					</a></li>
					<li><a href="menteeList?id=${professorInfo[0].professor_id}">
							<i class="ti-clipboard"></i>
							<p>멘티 목록</p>
					</a></li>

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
						<a class="navbar-brand" href="#datatable">강의 목록</a>
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
							<li class="dropdown"><a href="#notigfications"
								class="dropdown-toggle" data-toggle="dropdown"> <i
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

			<!-- form of Problem -->
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-10 col-md-offset-1">
							<div class="card">
								<div class="header">
									<h4 class="title">Tabs</h4>
									<p class="category">Plain text tabs</p>
								</div>
								<div class="content">
									<div class="nav-tabs-navigation">
										<div class="nav-tabs-wrapper">
											<ul id="tabs" class="nav nav-tabs" data-tabs="tabs">
												<li class="active"><a href="#home" data-toggle="tab">객관식</a></li>
												<li><a href="#profile" data-toggle="tab">주관식</a></li>
												<li><a href="#messages" data-toggle="tab">O/X 퀴즈</a></li>
											</ul>
										</div>
									</div>
									<div id="my-tab-content" class="tab-content text-left">
										<div class="tab-pane active" id="home">

											<form id="MultipleChoiceForm" class="form-horizontal"
												method="POST">

												<fieldset>
													<div class="form-group">
														<div class="col-md-11">
															<label class="text-info">Q.문제</label> <input type="text"
																placeholder="Q.문제" class="form-control" id="mul_problem"
																name="quiz_required" required="required" />
														</div>
													</div>
												</fieldset>

												<div class="row">
													<div class="col-md-6">
														<label class="text-warning">Q.1번</label> <input
															type="text" placeholder="객관식 1번" class="form-control"
															id="mul_example1" name="answer1_required"
															required="required" />
													</div>
												</div>
												<br />
												<div class="row">
													<div class="col-md-6">
														<label class="text-warning">Q.2번</label> <input
															type="text" placeholder="객관식 2번" class="form-control"
															id="mul_example2" name="answer2_required"
															required="required" />
													</div>
												</div>
												<br />
												<div class="row">
													<div class="col-md-6">
														<label class="text-warning">Q.3번</label> <input
															type="text" placeholder="객관식 3번" class="form-control"
															id="mul_example3" name="answer3_required"
															required="required" />
													</div>
												</div>
												<br />
												<div class="row">
													<div class="col-md-6">
														<label class="text-warning">Q.4번</label> <input
															type="text" placeholder="객관식 4번" class="form-control"
															id="mul_example4" name="answer4_required"
															required="required" />
													</div>
												</div>
												<br />
												<div class="row">
													<div class="col-sm-2">
														<br /> <label class="text-success">A.정답</label> <select
															class="selectpicker" data-title="A.정답"
															data-style="btn-danger btn-block"
															data-menu-style="dropdown-blue" id="mul_answer"
															name="right_answer_required" required="required">
															<option>1번</option>
															<option>2번</option>
															<option>3번</option>
															<option>4번</option>
														</select>
													</div>
												</div>
												<br />
												<div class="card-footer text-center">
													<button type="submit" class="btn btn-info btn-fill"
														onclick="saveQuestion.multipleChoice();">저장하기</button>
												</div>
											</form>
										</div>

										<div class="tab-pane" id="profile">
											<form id="EssayQuestionsForm" class="form-horizontal"
												method="post">

												<fieldset>
													<div class="form-group">
														<div class="col-md-11">
															<label class="text-info">Q.문제</label>
															<textarea class="form-control" placeholder="문제를 작성해주세요"
																rows="3" name="essay_questions_required"
																required="required"></textarea>
														</div>
													</div>
												</fieldset>
												<div class="row">
													<div class="col-md-10">
														<label class="text-warning">A.정답</label> <input
															type="text" placeholder="A.정답" class="form-control"
															name="e_right_answer_required" required="required" />
													</div>
												</div>
												<br />
												<br />

												<div class="row">
													<div class="col-md-6">
														<label class="text-warning">A.유사답안</label>
													</div>
												</div>
												<input type="button" class="btn btn-sm btn-fill"
													value="추가하기" id="add_btn" onclick="add_item()"> <br />
												<br />
												<div class="row">
													<div class="col-md-12" id="field"></div>
												</div>

												<br />
												<div class="card-footer text-center">
													<button type="submit" class="btn btn-info btn-fill"
														id="save_btn" onclick="saveQuestion.essayQuestions();">저장하기</button>
												</div>
											</form>
										</div>

										<div class="tab-pane" id="messages">
											<form id="OXQuizForm" class="form-horizontal" method="POST">

												<fieldset>
													<div class="form-group">
														<div class="col-md-11">
															<label class="text-info">Q.문제</label>
															<textarea class="form-control" placeholder="문제를 작성해주세요"
																rows="3" name="ox_quiz_required" required="required"></textarea>
														</div>
													</div>
												</fieldset>
												<div class="row">
													<div class="col-sm-2">
														<br /> <label class="text-success">A.정답</label> <select
															class="selectpicker" data-title="A.정답"
															data-style="btn-danger btn-block"
															data-menu-style="dropdown-blue" name="ox_answer_required"
															required="required">
															<option value="ko">O</option>
															<option value="ko">X</option>
														</select>
													</div>
												</div>
												<br />
												<div class="card-footer text-center">
													<button type="submit" class="btn btn-info btn-fill" onclick="saveQuestion.OXQuestions();">저장하기</button>
												</div>
											</form>
										</div>

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
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-1.10.2.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-ui.min.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/bootstrap.min.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/professor/save_question.js?ver=3" charset="utf-8"></script>

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


<script type="text/javascript">
	$().ready(function() {
		$('#MultipleChoiceForm').validate();
		$('#EssayQuestionsForm').validate();
		$('#OXQuizForm').validate();
	});
</script>
<script type="text/javascript">
	    function add_item() {
		// pre_set 에 있는 내용을 읽어와서 처리..
		var i = $("#field").children().length;
		//0부터 시작
		var div = document.createElement('div');
		div.innerHTML = '<div class="form-group">'
				+ '<div class="col-md-10">'
				+ '<input type="text" placeholder="A.유사답안"'+
				'class="form-control" name="e_like_answer_required'+i+'" required="required" />'
				+ '</div>' + '<div class="col-md-1">'
				+ '<input type="button" class="btn btn-sm btn-fill"'
				+ 'value="x" onclick="remove_item(this)">' + '</div>'
				+ '<br />' + '</div>';

		//div.innerHTML = document.getElementById('add_form').innerHTML;
		document.getElementById('field').appendChild(div);
		//var count = $("#field").children().length;
		//alert(count);

	}

	function remove_item(obj) {
		// obj.parentNode 를 이용하여 삭제
		document.getElementById('field').removeChild(
				obj.parentNode.parentNode.parentNode);
	}
</script>

</html>
