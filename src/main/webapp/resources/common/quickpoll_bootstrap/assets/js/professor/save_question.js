saveQuestion={
		multipleChoice : function(){
				var quiz_required = $('#MultipleChoiceForm').find('input[name="quiz_required"]').val();
				var mul_example1 = $('#MultipleChoiceForm').find('input[name="answer1_required"]').val();
				var mul_example2 = $('#MultipleChoiceForm').find('input[name="answer2_required"]').val();
				var mul_example3 = $('#MultipleChoiceForm').find('input[name="answer3_required"]').val();
				var mul_example4 = $('#MultipleChoiceForm').find('input[name="answer4_required"]').val();
				var mul_answer = $('#MultipleChoiceForm').find('select[name="right_answer_required"]').val();
				var mul_data = {
						quiz_required : quiz_required,
						mul_example1 : mul_example1,
						mul_example2 : mul_example2,
						mul_example3 : mul_example3,
						mul_example4 : mul_example4,
						mul_answer : mul_answer
				}
				alert(mul_example4);
		}
}