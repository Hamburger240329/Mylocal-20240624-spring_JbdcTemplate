<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2> 글 내용 보기</h2>
	<hr>
	<form action="modifyOk">
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
			<td><input type="text" name="btitle" value="${boardDto.btitle}" size="60"></td>
		</tr>
		
		<tr>
			<td height="200" valign="top">글내용</td>
			<td valign="top">
				<textarea rows="15" cols="45" name="bcontent">${boardDto.bcontent}</textarea> 
			</td>
			
		</tr>
		<tr>
			<td>등록일</td>
			<td>${boardDto.bdate }</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="완료">
				<input type="button" value="취소" onclick="javascript:history.go(-1)">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>