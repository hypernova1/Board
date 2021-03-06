<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../include/header.jsp" %>
	<div class="box-body">
	<div class="form-group">
		<label for="exampleInputEmail1">Title</label>
		<input type="text" name="title" class="form-control" value="${boardVO.title}" readonly="readonly">
	</div>
	<div class="form-group">
		<label for="exampleInputPassword1">Content</label>
		<textarea name="content" class="form-control" rows="3" readonly="readonly" style="resize: none;">${boardVO.content}</textarea>
	</div>
	<div class="form-group">
		<label for="exampleInputEmail1">Writer</label>
		<input type="text" name="writer" class="form-control" value="${boardVO.writer}" readonly="readonly">
	</div>
	
	<div class="box-footer">
		<button type="submit" class="btn btn-warning modifyBtn">Modify</button>
		<button type="submit" class="btn btn-danger removeBtn">ROMOVE</button>
		<button type="submit" class="btn btn-primary goListBtn">GO LIST</button>
	</div>
	</div>
	
	<form role="form" action="modifyPage" method="post">
		<input type="hidden" name="bno" value="${boardVO.bno}">
		<input type="hidden" name="page" value="${cri.page}">
		<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
	</form>

<%@ include file="../include/footer.jsp" %>
</body>
<script>
	let formObj = document.querySelector("form[role='form']");
	
	document.querySelector(".modifyBtn").addEventListener('click', function(){
		formObj.setAttribute("action", "/board/modifyPage");
		formObj.setAttribute("method", "get");
		formObj.submit();
	})
	document.querySelector(".removeBtn").addEventListener('click', function(){
		formObj.setAttribute("action", "/board/removePage");
		formObj.setAttribute("method", "get");
		formObj.submit();
	})
	document.querySelector(".goListBtn").addEventListener('click', function(){
		formObj.setAttribute("method", "get");
		formObj.setAttribute("action", "/board/listPage");
		formObj.submit();
	})
	
</script>
</html>