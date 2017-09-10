createQuestion = {

	checkCollapse : function(index) {
		var cnt = $('#accordion').children().length;
		for (var i = 0; i < cnt; i++) {
			if (index==i) {				
				$('#objective_question_check'+i+'').css('visibility', 'visible');
			} 
			else {
				$('#objective_question_check'+i+'').css('visibility', 'hidden');
			}
		}
		// $('#objective_question_number').visibility = visible;
	},
	
	//  load to objective question 
	loadQuestion : function() {
		$('#accordion').empty();
		for (var i = 0; i < 3; i ++) {
			var html = '<div class="panel panel-border panel-default"><a data-toggle="collapse" onclick="createQuestion.checkCollapse('+i+');" href="#objective_collapse'+i+'"><div class="panel-heading"><h4 class="panel-title"><span id="objective_question_check'+i+'" style="visibility: hidden" class="ti-check"></span>Q. 물리계층의 전송 단위는? <i class="ti-angle-down"></i></h4></div></a><div id="objective_collapse'+i+'" class="panel-collapse collapse"><div class="panel-body">1. Bit <br/>2. Byte<br/>3. Frame<br/>4. Packet</div></div></div>';
			$('#accordion').append(html);
		} 
//		alert($('#objective_question_header').html());
	}
}