<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="day7.Acorn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border:1px solid black;
	width:600px;
	margin:0 auto;
	border_collapse:collapse;
}
td{
	border:1px solid black;
}
</style>
</head>
<body>

<table>
	<tr>
	<td>아이디</td>
	<td>패스워드</td>
	<td>이름</td>
	</tr>
<% ArrayList<Acorn> list = (ArrayList<Acorn>) request.getAttribute("list");

	for(Acorn acorn:list){
		
		
	
%>

	<tr>
	<td><%=acorn.getId()%></td>
	<td><%=acorn.getPw() %></td>
	<td><%=acorn.getName() %></td>
	</tr>
<% } %>	
</table>


</body>
</html>