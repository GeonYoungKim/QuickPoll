UploadJS = {
		checkFileType : function(filePath) {
			var fileFormat = filePath.split(".");
			if (fileFormat.indexOf("xlsx") > -1) {
				return true;
			} else {
				return false;
			}		
		},
		check: function() {
//			var file = $("#excelFile").val();
//			if (file == "" || file == null) {
//				alert("파일을 선택해주세요.");
//				return false;
//			} else if (!UploadJS.checkFileType(file)) {
//				alert("엑셀 파일만 업로드 가능합니다.");
//				return false;
//			}

			if (confirm("업로드 하시겠습니까?")) {
//				var options = {
//					success : function(data) {
//						alert("모든 데이터가 업로드 되었습니다.");
//
//					},
//					type : "POST"
//				};
				$("#excelUploadForm").submit();
			}
		}
}
