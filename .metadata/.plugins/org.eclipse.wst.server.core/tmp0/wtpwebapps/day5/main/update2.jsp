<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
	/*border:1px solid black;*/
	width:500px;
	margin:0 auto;
	margin-bottom:20px; 
}
.wrap{
	/*border:1px solid black;*/
	width:100%;
	height:600px;
	margin:0 auto;
	border:1px solid black;
	
}

table{
	border:1px solid black;
}
button{
}
</style>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");

String ticket_id =request.getParameter("ticket_id");
String ticket_type =request.getParameter("ticket_type");
String ticket_time =request.getParameter("ticket_time");
String ticket_age =request.getParameter("ticket_age");
String ticket_price =request.getParameter("ticket_price");

%>

<header> <h2> 티켓 변경 페이지</h2></header>
<div class="wrap">
	<form name="frm" action="updateAction.jsp" method="post">
		<table>
			<tr>
				<td>티켓ID</td>
				<td>좌석등급</td>
				<td>출발시간</td>
				<td>연령</td>
				<td>가격</td>
				<td>변경<td>
			</tr>
			<tr>
				<td><input type="text" name="ticket_id" vlaue="" readonly></td>
				<td><input type="text" name="ticket_type" vlaue="" ></td>
				<td><input type="text" name="ticket_time" vlaue="" ></td>
				<td><input type="text" name="ticket_age" vlaue="" ></td>
				<td><input type="text" name="ticket_price" vlaue="" ></td>
				<td><button>변경</button><td>
			<tr>
		</table>
	</form>
</div>
</body>
</html>

<script>
let frm = document.frm;
	frm.ticket_id.value="<%=ticket_id%>"; 
	frm.ticket_type.value="<%=ticket_type%>"; 
	frm.ticket_time.value="<%=ticket_time%>"; 
	frm.ticket_age.value="<%=ticket_age%>"; 
	frm.ticket_price.value="<%=ticket_price%>"; 
</script>
