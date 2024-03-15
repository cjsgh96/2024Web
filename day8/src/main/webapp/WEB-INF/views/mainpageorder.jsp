<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id =(String) session.getAttribute("id");
	if(id!=null){
		
	}else{
		response.sendRedirect("/day8/mainpagelogin");
	}
	

%>
<h2>구매목록</h2>
<ul>
	<li>노트북</li>
	<li>컴퓨터</li>
	<li>휴지</li>
</ul>

</body>
</html>