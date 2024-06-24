<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 삭제 페이지</title>
</head>
<body>
	<h2> 글 삭제 페이지</h2>
	<hr>
	<form action="deleteOk">
	<input type="hidden" name="bnum" value="${boardDto.bnum}">
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<tr>
			<td width="100">글 번호</td>
			<td>${boardDto.bnum}</td>
		</tr> 
		
		<tr>
			<td>조회수</td>
			<td>${boardDto.bhit}</td>
		</tr>
		
		<tr>
			<td>작성자</td>
			<td>${boardDto.bname }</td>
		</tr>
		<tr>
			<td>글제목</td>
			<td>${boardDto.btitle}</td>
		</tr>
		
		<tr>
			<td height="200" valign="top">글내용</td>
			<td valign="top">${boardDto.bcontent}</td>
			
		</tr>
		<tr>
			<td>등록일</td>
			<td>${boardDto.bdate}</td>
		</tr>
		<tr>
			<td colspan="2">
				정말 삭제하시겠습니까?
				<input type="submit" value="완료">
				<input type="button" value="취소" onclick="javascript:history.go(-1)">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>