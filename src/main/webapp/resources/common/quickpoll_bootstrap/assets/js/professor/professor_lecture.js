$(document).ready(function() {	
	var sock;
	var message = {};
	sock = new SockJS("http://localhost:8080/QuickPollSocketServer/echo");
	
// 자바스크립트 안에 function을 집어넣을 수 있음.
	
// 데이터가 나한테 전달되읐을 때 자동으로 실행되는 function
	
	sock.onmessage = professorLecture.onMessage;
	
// 데이터를 끊고싶을때 실행하는 메소드
	
	sock.onclose = professorLecture.onClose;
	
	sock.onopen = function() {			
		message = {};
		message.coure_id = "cs";
		message.type = "create";
		message.id = $("#id").val();
		
		sock.send(JSON.stringify(message));
		
	};
});
professorLecture = {

	// 웸소켓을 지정한 url로 연결한다.

	sendMessage : function() {
		/* 소켓으로 보내겠다. */
		sock.send($("#message").val());
	},

	// evt 파라미터는 웹소켓을 보내준 데이터다.(자동으로 들어옴)

	onMessage : function(evt) {
		alert(evt);
		
		var data = evt.data;
		alert(data);
		$("#data").append(data + "<br/>");
		// sock.close();
	},

	onClose : function(evt) {

		$("#data").append("연결 끊김");

	},
	create : function() {
		sock = new SockJS("http://localhost:8080/QuickPollSocketServer/echo");

		// 자바스크립트 안에 function을 집어넣을 수 있음.

		// 데이터가 나한테 전달되읐을 때 자동으로 실행되는 function

		sock.onmessage = professorLecture.onMessage;

		// 데이터를 끊고싶을때 실행하는 메소드

		sock.onclose = professorLecture.onClose;
		
		sock.onopen = function() {			
			message = {};
			message.coure_id = "cs";
			message.type = "create";
			message.id = $("#id").val();

			sock.send(JSON.stringify(message));

		};
	},
	connect : function() {
		sock = new SockJS("http://localhost:8080/QuickPollSocketServer/echo");

		// 자바스크립트 안에 function을 집어넣을 수 있음.

		// 데이터가 나한테 전달되읐을 때 자동으로 실행되는 function

		sock.onmessage = professorLecture.onMessage;

		// 데이터를 끊고싶을때 실행하는 메소드

		sock.onclose = professorLecture.onClose;

		sock.onopen = function() {
			message = {};
			message.coure_id = "cs";
			message.type = "connect";
			message.id = $("#id").val();

			sock.send(JSON.stringify(message));

		};
	},
	closeMessage : function() {

	}

}
$("#createBtn").click(function() {
	professorLecture.create();
});
$("#connectBtn").click(function() {
	professorLecture.connect();
});
$("#sendBtn").click(function() {

	professorLecture.sendMessage();

});
$("#close").click(function() {
	location.href="/QuickPollSocketServer/";
});