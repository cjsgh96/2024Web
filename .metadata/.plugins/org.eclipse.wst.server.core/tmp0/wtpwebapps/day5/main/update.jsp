<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
	border:1px solid black;
	height:100px;
}
h2{
	text-align:center;
}
nav{
	border:1px solid black;
	margin-bottom:20px;
}
ul{
	display:flex;
}
ul li{
	list-style:none;
	
	
}

a{
	padding:10px;
	text-align:center;
}
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

<header><h2>항공권 조회 프로그램</h2></header>
<nav>
	<ul>
		<li class="li1"><a href="check.jsp">구매조회</a></li>
		<li><a href="update.jsp">변경</a></li>
	</ul>
</nav>

<table>
	<tr>
		<td>티켓번호</td>
		<td>좌석등급</td>
		<td>출발시간</td>
		<td>연령</td>
		<td>가격</td>
		<td>구매</td>
		
		
	</tr>
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
		 
		String sql  ="select * from airplane_ticket_tbl ";
		PreparedStatement  pst =con.prepareStatement(sql);
			 //왼쪽 물음표부터 	 
		
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {
 
 %>
	<tr>
		<form name="frm" action="update2.jsp" method="post">
		    <td>
	            <input type="hidden" name="ticket_id" value="<%=rs.getString(1)%>"><%=rs.getString(1)%>
	        </td>
	        <td>
	            <input type="hidden" name="ticket_type" value="<%=rs.getString(2)%>"><%=rs.getString(2)%>
	        </td>
	        <td>
	            <input type="hidden" name="ticket_time" value="<%=rs.getString(3)%>"><%=rs.getString(3)%>
	        </td>
	        <td>
	            <input type="hidden" name="ticket_age" value="<%=rs.getString(4)%>"><%=rs.getString(4)%>
	        </td>
	        <td>
	            <input type="hidden" name="ticket_price" value="<%=rs.getString(5)%>"><%=rs.getString(5)%>
	        </td>
	        <td>
	            <button type="submit">변경</button>
	        </td>
	      </form>
	</tr>
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