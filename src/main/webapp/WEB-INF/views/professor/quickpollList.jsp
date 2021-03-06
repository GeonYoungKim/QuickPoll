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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	<!-- CORE CSS-->
  <link href="resources/common/mater/demo/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="resources/common/mater/demo/css/style.css" type="text/css" rel="stylesheet" media="screen,projection">
  <!-- Custome CSS-->    
  <link href="resources/common/mater/demo/css/custom/custom.css" type="text/css" rel="stylesheet" media="screen,projection">

  <!-- INCLUDED PLUGIN CSS ON THIS PAGE -->
  <link href="resources/common/mater/demo/js/plugins/prism/prism.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="resources/common/mater/demo/js/plugins/perfect-scrollbar/perfect-scrollbar.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="resources/common/mater/demo/js/plugins/chartist-js/chartist.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <!--dropify-->
  <link href="resources/common/mater/demo/js/plugins/dropify/css/dropify.min.css" type="text/css" rel="stylesheet" media="screen,projection">
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
				<a href="http://www.creative-tim.com" class="simple-text"> Quick
					Poll </a>
			</div>
			<div class="logo logo-mini">
				<a href="http://www.creative-tim.com" class="simple-text"> QP </a>
			</div>
			<div class="sidebar-wrapper">
				<div class="user">
					<div class="photo">
						<input type="hidden" id="id"
							value="${professorInfo[0].professor_id}"> <img
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
					<li class="active"><a href="lectureList?id=${professorInfo[0].professor_id}"> <i
							class="ti-view-list-alt"></i>
							<p>강의 목록</p>
					</a></li>
					<li><a href="uploadAttendance?id=${professorInfo[0].professor_id}"">
							 <i class="ti-clipboard"></i>
							<p>출석 등록</p>
					</a></li>

				</ul>
			</div>
		</div>

		<div class="main-panel">
			<div id="question_content" class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-8 col-md-offset-2">
							<div class="card card-wizard" id="wizardCard">
								<form id="wizardForm" method="" action="">
									<div class="header text-center">
										<h4 class="title">퀵폴 보기</h4>
										<p class="category">진행했었던 퀵폴을 볼 수 있습니다.</p>
									</div>
									<div class="content">
										<ul class="nav">
											<li><a onclick="createQuestion.loadQuestion();"
												href="#upload_question" data-toggle="tab">지난 퀵폴 보기</a></li>

										</ul>
										<div class="tab-content">
											
											<div class="tab-pane" id="upload_question">
												<h5 class="text-center">결과를 보고 싶은 퀵폴을 선택하세요~</h5>
												<div class="row">
													<div class="col-md-10 col-md-offset-1">

														<div class="content">
															<div class="nav-tabs-navigation">
																<div class="nav-tabs-wrapper">
																	<ul id="tabs" class="nav nav-tabs" data-tabs="tabs">
																		<li class="active"><a href="#objective"
																			data-toggle="tab">객관식 문제</a></li>
																		<li><a
																			onclick="createQuestion.loadSubjectiveQuestion();"
																			href="#subjective" data-toggle="tab">주관식 문제</a></li>
																		<li><a href="#ox" data-toggle="tab">OX 문제</a></li>
																	</ul>
																</div>
															</div>
															<div id="my-tab-content" class="tab-content text-center">
																<div class="tab-pane active" id="objective">
																	<div class="content">
																		<div id="objective_header">
																			<c:choose>
																				<c:when
																					test="${fn:length(objectiveQuestionList) > 0}">
																					<c:forEach items="${objectiveQuestionList}"
																						var="row" varStatus="status">
																						<div class="panel panel-border panel-default">
																							<a data-toggle="collapse"
																								onclick="quickpollList.displayDetailObjectiveQuickPoll('${status.count}');"
																								href=""><div
																									class="panel-heading">
																									<h4 id="objective_question_content_${status.count}" class="panel-title">
																										${row.question_content}
																									</h4>
																									<input type="hidden" id="quickpoll_question_id_${status.count}" value="${row.quickpoll_question_id}">
																									<input type="hidden" id="example1_${status.count}" value="${row.example1}">
																									<input type="hidden" id="example2_${status.count}" value="${row.example2}">
																									<input type="hidden" id="example3_${status.count}" value="${row.example3}">
																									<input type="hidden" id="example4_${status.count}" value="${row.example4}">
																									<input type="hidden" id="quickpoll_question_answer_${status.count}" value="${row.question_answer}">
																								</div></a>
																						</div>
																					</c:forEach>
																				</c:when>
																				<c:otherwise>
																					<!-- 데이터 없을 경우 -->
																				</c:otherwise>
																			</c:choose>
																			
																		</div>

																	</div>
																</div>
																<div class="tab-pane" id="subjective">
																	<div class="content">
																		<div id="subjective_header">
																		<c:choose>
																			<c:when
																				test="${fn:length(subjectiveQuestionList) > 0}">
																				<c:forEach items="${subjectiveQuestionList}"
																					var="row" varStatus="status">
																					<div class="panel panel-border panel-default">
																						<a data-toggle="collapse"
																							onclick="quickpollList.displayDetailSubjectiveQuickPoll('${status.count}');">
																							<div class="panel-heading">
																								<h4 id="subjective_question_content${status.count}" class="panel-title">
																									${row.question_content}
																								</h4>
																								<input type="hidden" id="subjective_quickpoll_question_id_${status.count}" value="${row.quickpoll_question_id}">
																								<input type="hidden" id="subjective_question_answer_${status.count}" value="${row.question_answer}">
																							</div></a>

																					</div>

																				</c:forEach>
																			</c:when>
																			<c:otherwise>
																				<!-- 데이터 없을 경우 -->
																			</c:otherwise>
																		</c:choose>
																		
																		</div>
																	</div>
																</div>
																<div class="tab-pane" id="ox">
																	<p>Here are your messages.</p>
																</div>
															</div>
														</div>

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
<script type="text/javascript"
	src="resources/common/quickpoll_bootstrap/assets/js/sockjs-0.3.4.js"></script>
<!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
<script src="resources/common/quickpoll_bootstrap/assets/js/demo.js"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/professor/quickpoll_list.js?ver=2"
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



