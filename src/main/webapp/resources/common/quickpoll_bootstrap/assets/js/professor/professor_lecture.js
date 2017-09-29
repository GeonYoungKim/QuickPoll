$(document).ready(function() {
	
	var sock = null;
	var message = {};
//    sock = new SockJS("http://13.124.224.234:8080/QuickPollSocketServer/echo");
	sock = new SockJS("http://localhost:8080/QuickPollSocketServer/echo");
// 자바스크립트 안에 function을 집어넣을 수 있음.
	
// 데이터가 나한테 전달되읐을 때 자동으로 실행되는 function
	
	sock.onmessage = professorLecture.onMessage;
	
// 데이터를 끊고싶을때 실행하는 메소드
	
	sock.onclose = professorLecture.onClose;
	
	sock.onopen = function() {			
		message = {};
		message.course_id = "cs";
		message.type = "create";
		message.id = $("#id").val();
		message.name = "kim";
		sock.send(JSON.stringify(message));
		
	};
	
	$("#sendDirectQuestionBtn").click(function() {
		var direct_question_content = $("#direct_question_content").val();
		message = {};
		message.type = "sendDirectQuestion";
		message.id = $("#id").val();
		message.course_id = "cs";
		message.question_type = 1;
		message.question_content = direct_question_content;
		sock.send(JSON.stringify(message));
		var table_html = '<div class="content"><div class="container-fluid"><div class="row"><div class="col-md-12"><div class="card"><div id="table_content" class="content"><div class="toolbar"></div><table id="bootstrap-table" class="table"><thead><th data-field="state" data-checkbox="true"></th><th data-field="id" class="text-center">번호</th><th data-field="city">답안</th></thead><tbody><tr><td></td><td>1</td><td>1</td></tr></tbody></table></div></div></div></div></div></div>'
		$('#question_content').html(table_html);
		
//		$('#question_content').html('<button type="button" class="btn btn-info btn-fill btn-wd btn-next pull-center" id="sendDirectQuestionBtn">결과보기</button>');
		

       
	});
	$("#close").click(function() {
		location.href="/QuickPollSocketServer/";
	});
	
});
professorLecture = {
	
	// 웸소켓을 지정한 url로 연결한다.

	sendMessage : function() {
		/* 소켓으로 보내겠다. */
		sock.send("h");
	},

	// evt 파라미터는 웹소켓을 보내준 데이터다.(자동으로 들어옴)

	onMessage : function(evt) {
		var data = evt.data;
//		alert(data);
		var parsedJson = JSON.parse(data);
		if (parsedJson.type == "connect")
			$('li').remove('#' + parsedJson.id);
		else if (parsedJson.type == "directQuestionAnswer") {
			var length = ($('#bootstrap-table > tbody > tr').length)+1;
			var tr_html = '<tr data-index="'+(length-1)+'"><td class="bs-checkbox"><input data-index="'+(length-1)+'" name="btSelectItem" type="checkbox"></td><td class="text-center" style="">'+length+'</td><td style="">'+parsedJson.question_anwser+'</td></tr>'
			$('#bootstrap-table > tbody:last').append(tr_html);
			var $table = $('#bootstrap-table');
            $table.bootstrapTable({
                toolbar: ".toolbar",
                clickToSelect: true,
                showRefresh: true,
                search: true,
                showToggle: true,
                showColumns: true,
                pagination: true,
                searchAlign: 'left',
                pageSize: 8,
                clickToSelect: false,
                pageList: [8,10,25,50,100],

                formatShowingRows: function(pageFrom, pageTo, totalRows){
                    //do nothing here, we don't want to show the text "showing x of y from..."
                },
                formatRecordsPerPage: function(pageNumber){
                    return pageNumber + " rows visible";
                },
                icons: {
                    refresh: 'fa fa-refresh',
                    toggle: 'fa fa-th-list',
                    columns: 'fa fa-columns',
                    detailOpen: 'fa fa-plus-circle',
                    detailClose: 'ti-close'
                }
            });

            //activate the tooltips after the data table is initialized
            $('[rel="tooltip"]').tooltip();

            $(window).resize(function () {
                $table.bootstrapTable('resetView');
            });
		}
		// sock.close();
	},

	onClose : function(evt) {

		$("#data").append("연결 끊김");

	},
	
	closeMessage : function() {

	}

}