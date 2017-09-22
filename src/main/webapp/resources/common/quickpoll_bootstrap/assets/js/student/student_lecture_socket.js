$(document).ready(function() {
	
	var sock;
	var message = {};
	sock = new SockJS("http://localhost:8080/QuickPollSocketServer/echo");
	
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
		alert(data);
		var parsedJson = JSON.parse(data);
		if (parsedJson.type == "connect")
			$('li').remove('#' + parsedJson.id);
		// sock.close();
	},

	onClose : function(evt) {

		$("#data").append("연결 끊김");

	},
	
	closeMessage : function() {

	}
	

}
//$("#createBtn").click(function() {
//	professorLecture.create();
//});

//$("#close").click(function() {
//	location.href="/QuickPollSocketServer/";
//});