<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 목록</title>
</head>
<body>
	<h2>자유게시판 글 목록</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="800">
		<tr>
			<th>번호</th>
			<th width="400">제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${boardList}" var="bDto">
		<tr>
			<td>${bDto.bnum}</td>
			<td>${bDto.btitle}</td>
			<td>${bDto.bname}</td>
			<td>${bDto.bdate}</td>
			<td>${bDto.bhit}</td>
		</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>