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
		
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="이름"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" value="나이"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="button">전송</button></td>
			</tr>
		</table>
	</form>
</body>
</html>