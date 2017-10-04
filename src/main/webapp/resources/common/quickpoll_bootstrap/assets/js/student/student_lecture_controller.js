studentLectureController = {

	checkExample : function(index) {
		alert("checkexamplefunction");
		var cnt = $('#objective_question_header_student').children().length;
		for (var i = 1; i <= 4; i++) {
			if (index == i) {
				$('#objective_question_check_example' + i + '').css('visibility',
						'visible');
			} else {
				$('#objective_question_check_example' + i + '').css('visibility',
						'hidden');
			}
		}
		// $('#objective_question_number').visibility = visible;
	}
}