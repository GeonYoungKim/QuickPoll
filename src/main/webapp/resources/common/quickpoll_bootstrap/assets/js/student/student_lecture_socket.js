$(document).ready(function() {
	var sock;
	
	var message = {};
	sock = new SockJS("http://52.78.230.143:8080/QuickPollSocketServer/echo");
	
// 자바스크립트 안에 function을 집어넣을 수 있음.
	
// 데이터가 나한테 전달되읐을 때 자동으로 실행되는 function
	
	sock.onmessage = studentLectureSocket.onMessage;
	
// 데이터를 끊고싶을때 실행하는 메소드
	
	sock.onclose = studentLectureSocket.onClose;
	
	sock.onopen = function() {
		alert($('#student_id'));
		message = {};
		message.coure_id = "cs";
		message.type = "connect";
		message.id = $("#student_id").val();
		message.name="kim";
		sock.send(JSON.stringify(message));
	};
	
	displaySubjectiveQuestion = function() {
		$('#waitting_text').html("");
		$('#student_question_content').empty();
		$('#student_question_content').html('<div class="form-group"><label class="control-label"> Q. 질문해보세요~ </label> <input class="form-control" type="text" id="direct_question_anwser" name="direct_question_anwser" placeholder="ex: 제출하실 답을 적어주세요" /></div><button type="button" class="btn btn-info btn-fill btn-wd btn-next pull-right" id="submitDirectQuestionAnswer">제출하기</button>');
		$("#submitDirectQuestionAnswer").click(function() {
			alert('click');
			message = {};
			message.coure_id = "cs";
			message.type = "directQuestionAnswer";
			message.id = $("#student_id").val();
			message.question_anwser = $('#direct_question_anwser').val();
			sock.send(JSON.stringify(message));
		});
	}
});
studentLectureSocket = {

	// 웸소켓을 지정한 url로 연결한다.

	sendMessage : function() {
		/* 소켓으로 보내겠다. */
		sock.send($("#message").val());
	},

	// evt 파라미터는 웹소켓을 보내준 데이터다.(자동으로 들어옴)

	onMessage : function(evt) {
		var data = evt.data;
		var parsedJson = JSON.parse(data);
		if (parsedJson.type == "sendDirectQuestion") {
			displaySubjectiveQuestion();
		}
			
		// sock.close();
	},

	onClose : function(evt) {

		$("#data").append("연결 끊김");

	},
	
	closeMessage : function() {

	},
	
	

}
//$("#createBtn").click(function() {
//	professorLecture.create();
//});

//$("#close").click(function() {
//	location.href="/QuickPollSocketServer/";
//});