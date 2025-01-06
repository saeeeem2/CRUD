<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/member/select" method="post">
		<h1> 게시판 만들기 </h1>
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="" placeholder="이름을 입력해주세요"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" value="" placeholder="나이를 입력해주세요"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">전송</button></td>
			</tr>
		</table>
	</form>
</body>
</html>