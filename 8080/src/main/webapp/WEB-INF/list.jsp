<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="PP.Acorn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
	<td>아이디<td>
	<td>비밀번호<td>
	<td>이름<td>
	</tr>
	
<%
	ArrayList<Acorn> list =(ArrayList<Acorn>)request.getAttribute("list");

	
%>	
	<tr>
	<td><td>
	<td><td>
	<td><td>
	</tr>
</table>

</body>
</html>