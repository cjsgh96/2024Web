<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border:1px solid black;
	margin:0 auto;
	text-align:center;
	width:50%;
}

tr{
	border:1px solid black;
}
td{
	
}
</style>


</head>
<body>
<header><h2>구매내역 페이지</h2></header>
<nav>
	<ul>
	<li><a href="main.jsp">메인으로</a></li>
	</ul>
</nav>
 <%
 String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";	
	
			
	try {
		//1. 드라이버 로드 (객체생성)
		Class.forName(driver);			
		//2. 데이터베이스 연결
		Connection  con = DriverManager.getConnection(url, user, password);
		
		//3. 테이블 얻어오기
		 
		String sql  ="select * from buylist_tbl ";
		PreparedStatement  pst =con.prepareStatement(sql);
			 //왼쪽 물음표부터 	 
		
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {
 
 %>
 
 
<table>
	<tr>
		<td>티켓번호</td>
		<td>좌석등급</td>
		<td>출발시간</td>
		<td>연령</td>
		<td>가격</td>
		<td>이름</td>
		<td>전화번호</td>
		<td>환불</td>
	</tr>
	<form name="frm" action="deleteAction.jsp" method="post">
		<tr>
			<td> <input type="hidden" value="<%=rs.getString(1)%>" name="ticket_id">
			<%=rs.getString(1)%>
			</td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><%=rs.getString(7)%></td>
			<td><button type="submit">환불</button></td>
		</tr>
	</form>
		<%
		}
	}
	 catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
  	%>
</table>

</body>
</html>