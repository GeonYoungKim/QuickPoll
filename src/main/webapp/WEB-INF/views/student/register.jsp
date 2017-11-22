<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="resources/common/quickpoll_bootstrap/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="resources/common/quickpoll_bootstrap/assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>학생회원가입</title>

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
    <nav class="navbar navbar-transparent navbar-absolute">
	    <div class="container">
	        <div class="navbar-header">
	            <button type="button" class="navbar-toggle navbar-toggle-black" data-toggle="collapse" data-target="#navigation-example-2">
	                <span class="sr-only">Toggle navigation</span>
	                <span class="icon-bar "></span>
	                <span class="icon-bar "></span>
	                <span class="icon-bar"></span>
	            </button>
	        </div>
	        <div class="collapse navbar-collapse">
	            <ul class="nav navbar-nav navbar-right">
	                <li>
	                   <a href="login.html" class="btn">
	                        Looking to login?
	                    </a>
	                </li>
	            </ul>
	        </div>
	    </div>
	</nav>

	<div class="wrapper wrapper-full-page">
    	<div class="register-page">
		<!--   you can change the color of the filter page using: data-color="blue | azure | green | orange | red | purple" -->
        	<div class="content">
            	<div class="container">
                	<div class="row">
                    	<div class="col-md-8 col-md-offset-2">
                        	<div class="header-text">
                            	<h2>학생 회원가입 양식</h2>
                            	<h4>*  가 표시된 영역은 모두 기입해주세요.</h4>
                            	<hr>
                        	</div>
                    	</div>
                    	
                    	<!--
                    	<div class="col-md-4 col-md-offset-2">
                        	<div class="media">
                            	<div class="media-left">
                                	<div class="icon icon-danger">
                                    	<i class="ti ti-user"></i>
                                	</div>
                            	</div>
                            	<div class="media-body">
                                	<h5>Free Account</h5>
                                	Here you can write a feature description for your dashboard, let the users know what is the value that you give them.
                            	</div>
                        	</div>
                        	<div class="media">
                            	<div class="media-left">
                                	<div class="icon icon-warning">
                                    	<i class="ti-bar-chart-alt"></i>
                                	</div>
                            	</div>
                            	<div class="media-body">
                                	<h5>Awesome Performances</h5>
                                	Here you can write a feature description for your dashboard, let the users know what is the value that you give them.
                            	</div>
                        	</div>
                        	<div class="media">
                            	<div class="media-left">
                                	<div class="icon icon-info">
                                    	<i class="ti-headphone"></i>
                                	</div>
                            	</div>
                            	<div class="media-body">
                                	<h5>Global Support</h5>
                                	Here you can write a feature description for your dashboard, let the users know what is the value that you give them.
                            	</div>
                        	</div>
                    	</div>
                    	 -->
                    	 
                    	<!-- 가운데로 쏠기 -->
                    	<div class="col-md-4 col-md-offset-4">
                        	<form id="allInputsFormValidation" method="#" action="#"  novalidate="">
                            	<div class="card card-plain">
                                	<div class="content">
                                		<fieldset>
	                                		<div class="form-group">
		                                      <input type="text" placeholder="* 학번" class="form-control" name="stuNum" number="true">
										</div>
									</fieldset>
									<fieldset>
	                                    	<div class="form-group">
	                                        	<input type="text" placeholder="* 이름" class="form-control" name="name" required="required">
	                                    	</div>
                                    	</fieldset>
										<div class="col-md-7">
                                            <select name="dept" class="selectpicker" data-title="학과" data-style="btn-danger btn-block" data-menu-style="dropdown-blue">
                                                <option value="1">금용정보공학과</option>
                                                <option value="2">나노융합공학과</option>
                                                <option value="3">도시공학과</option>
                                                <option value="4">산업경영시스템공학과</option>
                                                <option value="5">전자공학과</option>
                                                <option value="6">컴퓨터공학과</option>
                                                <option value="7">컴퓨터과학과</option>
                                                <option value="8">토목건축공학과</option>
                                                <option value="9">화학생명공학과</option>
                                            </select>
                                         </div>
                                    	<fieldset>
	                                    	<div class="form-group">
	                                        <!-- 	<input type="text" placeholder="* 학과" class="form-control" name="name2" required="required"> -->
	                                        <select name="grade" class="selectpicker" data-title="학년" data-style="btn-danger btn-block" data-menu-style="dropdown-blue">
	                                        	   <option value="1">1학년</option>
                                                <option value="2">2학년</option>
                                                <option value="3">3학년</option>
                                                <option value="4">4학년</option>
                                            </select>
	                                    	</div>
                                    	</fieldset>
                                    	<div class="form-group">
                                        	<input type="email" placeholder="  이메일" class="form-control" name="email" email="true">
                                    	</div>
                                    	<div class="form-group">
	                                        <input class="form-control"
	                                               name="password"
	                                               placeholder="비밀번호"
	                                               id="registerPassword"
	                                               type="password"
	                                               required="true"
											/>
	                                    </div>
	                                    <div class="form-group">
	                                        <input class="form-control"
	                                               name="password_confirmation"
	                                               placeholder="* 비밀번호 확인"
	                                               id="registerPasswordConfirmation"
	                                               type="password"
	                                               required="true"
	                                               equalTo="#registerPassword"
											/>
	                                    </div>

                                    	<div class="col-md-7">
                                        	<input type="text" placeholder="  사진입력" class="form-control">
                                    	</div>
									<fieldset>
	                                    	<div class="form-group">
	                                        	<button class="btn btn-wd btn-danger">사진선택 </button>
	                                    	</div>
                                    	</fieldset>
									<div class="col-md-7">
                                        	<input type="text" placeholder="  주소" class="form-control">
                                    	</div>
                                    	<fieldset>
	                                    	<div class="form-group">
	                                        	<button class="btn btn-wd btn-danger">주소검색 </button>
	                                    	</div>
                                    	</fieldset>
                                    	
                                	</div>
                                	<div class="footer text-center">
                                    	<button type="submit" class="btn btn-fill btn-danger btn-wd">회원가입</button>
                                	</div>
                                	<hr>
                            	</div>
                        	</form>
                    	</div>
                	</div>
            	</div>
        	</div>

    		<footer class="footer footer-transparent">
            	<div class="container">
                	<div class="copyright text-center">
                    	&copy; <script>document.write(new Date().getFullYear())</script>, made with <i class="fa fa-heart heart"></i> <a href="http://www.creative-tim.com">임시 URL</a>
                	</div>
            	</div>
        	</footer>
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

	<!--  Plugin for DataTables.net  -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/jquery.datatables.js"></script>

	<!--  Full Calendar Plugin    -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/fullcalendar.min.js"></script>

	<!-- Paper Dashboard PRO Core javascript and methods for Demo purpose -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/paper-dashboard.js"></script>

	<!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
	<script src="resources/common/quickpoll_bootstrap/assets/js/demo.js"></script>

	<script type="text/javascript">
        $().ready(function(){
            $('#registerFormValidation').validate();
            $('#loginFormValidation').validate();
            $('#allInputsFormValidation').validate();
            demo.checkFullPageBackgroundImage();

            setTimeout(function(){
                // after 1000 ms we add the class animated to the login/register card
                $('.card').removeClass('card-hidden');
            }, 700)
		});
	</script>

</html>
