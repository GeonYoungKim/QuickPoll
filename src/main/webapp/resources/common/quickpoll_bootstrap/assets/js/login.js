loginJS = {

	loginCheck : function() {
		var input_id = $('#id').val();
		var input_pwd = $('#password').val();
		var query = {
				id : input_id,
				password : input_pwd
		};
		$
				.ajax({
					type : "GET",
					url : "loginCheck",
					data : query,
					dataType : "json",
					success : function(json) {
						
						alert(json.loginState);
						if (json.loginState) {
							location.href = "main";
						} else {
							alert("틀렸습니다.")
							$('#id').val("");
							$('#password').val("");
						}
					}
				});
	}
	
}