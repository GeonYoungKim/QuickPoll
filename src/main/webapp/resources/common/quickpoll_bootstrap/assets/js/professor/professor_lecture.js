$(document).ready(function() {
	
	var sock = null;
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
		message.name = "kim";
		sock.send(JSON.stringify(message));
		
	};
	
	$("#sendDirectQuestionBtn").click(function() {
		var direct_question_content = $("#direct_question_content").val();
		message = {};
		message.coure_id = "cs";
		message.type = "sendDirectQuestion";
		message.id = $("#id").val();
		message.question_type = 1;
		message.question_content = direct_question_content;
		sock.send(JSON.stringify(message));
		var table_html = '<div class="content"><div class="container-fluid"><div class="row"><div class="col-md-12"><div class="card"><div id="table_content" class="content"><div class="toolbar"></div><table id="bootstrap-table" class="table"><thead><th data-field="state" data-checkbox="true"></th><th data-field="id" class="text-center">번호</th><th data-field="city">답안</th></thead><tbody><tr><td></td><td>1</td><td>1</td></tr></tbody></table></div></div></div></div></div></div>'
		$('#question_content').html(table_html);
		
//		$('#question_content').html('<button type="button" class="btn btn-info btn-fill btn-wd btn-next pull-center" id="sendDirectQuestionBtn">결과보기</button>');
		var $table = $('#bootstrap-table');
		
        function operateFormatter(value, row, index) {
            return [
				'<div class="table-icons">',
	                '<a rel="tooltip" title="View" class="btn btn-simple btn-info btn-icon table-action view" href="javascript:void(0)">',
						'<i class="ti-image"></i>',
					'</a>',
	                '<a rel="tooltip" title="Edit" class="btn btn-simple btn-warning btn-icon table-action edit" href="javascript:void(0)">',
	                    '<i class="ti-pencil-alt"></i>',
	                '</a>',
	                '<a rel="tooltip" title="Remove" class="btn btn-simple btn-danger btn-icon table-action remove" href="javascript:void(0)">',
	                    '<i class="ti-close"></i>',
	                '</a>',
				'</div>',
            ].join('');
        }

        $().ready(function(){
            window.operateEvents = {
                'click .view': function (e, value, row, index) {
                    info = JSON.stringify(row);

                    swal('You click view icon, row: ', info);
                    console.log(info);
                },
                'click .edit': function (e, value, row, index) {
                    info = JSON.stringify(row);

                    swal('You click edit icon, row: ', info);
                    console.log(info);
                },
                'click .remove': function (e, value, row, index) {
                    console.log(row);
                    $table.bootstrapTable('remove', {
                        field: 'id',
                        values: [row.id]
                    });
                }
            };

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
		});
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
			var length = ($('#bootstrap-table > tbody').length)+1;
			var tr_html = '<tr><td></td><td>'+length+'</td><td>'+parsedJson.question_anwser+'</td></tr>';
			$('#bootstrap-table > tbody:last').append(tr_html);
		}
		// sock.close();
	},

	onClose : function(evt) {

		$("#data").append("연결 끊김");

	},
	
	closeMessage : function() {

	}

}

