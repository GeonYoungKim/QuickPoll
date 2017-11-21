<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="excelUploadForm" name="excelUploadForm" enctype="multipart/form-data" method="post" action ="uploadExcel">
    <div class="contents">
        <div>첨부파일은 한개만 등록 가능합니다.</div>
 
        <dl class="vm_name">
                <dt class="down w90">첨부 파일</dt>
                <dd><input id="excelFile" type="file" name="excelFile" /></dd>
        </dl>        
    </div>
            
    <div class="bottom">
        <button type="button" id="addExcelImpoartBtn" class="btn" onclick="UploadJS.check();" ><span>추가</span></button> 
    </div>
</form> 

</body>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/jquery-1.10.2.js"
	type="text/javascript"></script>
<script
	src="resources/common/quickpoll_bootstrap/assets/js/professor/upload.js?ver=1"
	charset="UTF-8"></script>
</html>