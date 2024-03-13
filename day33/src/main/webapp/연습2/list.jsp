<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
padding:0px;
margin:0px;
}

header{
	border:1px solid black;
	
}
h1{
	/* margin:0 auto; 적용불가 : h2 블럭태그 */
	background-color:red;
	text-align:center;
}
nav{
	border:1px solid black;
	height: 100px;
	/* 부모 지정시 반드시 크기(높이) 가 있어야 함 */
	position:relative;
}

ul{
	list-style:none;
	border:1px solid black;
	display:flex;
	border-bottom-color:blue;
	
	position:absolute;
	bottom:0px;
	right:0px;  /* left, right, top, bottom  */
}
ul li{
	/* border:1px solid black; */
	display:inline-block;
	padding-right:10px;
}
section{
	padding:20px;
}
footer{
	border:1px solid black;
	/* 부모에 display: flex; footer의 자식 div가 옆으로 나온다.*/
	display: flex;
}
footer > div {
	border:1px solid black;
	width:33%;
	padding:10px;
}
table{
	width:600px;
	border:1px solid black;
	border-collapse: collapse;
	margin:0 auto;
}
td{
	border:1px solid black;
	text-align:center;
}
a{
	text-decoration: none;
	color:black;
}

</style>
</head>
<body>

<header>
<h1>에이콘 학생관리 프로그램</h1>
</header>
<nav>
	<ul>
		<li><a href="index.html">home</a></li>
		<li>학생등록</li>
		<li>학생조회</li>
	</ul>
</nav>
<section>
	<table>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
			<td>수정/삭제</td>
		<tr>
		<!--  -->
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
			 
			String sql  ="select * from  acorntbl";
			PreparedStatement  pst =con.prepareStatement(sql);
				 
			
			//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
			ResultSet  rs =pst.executeQuery();	
			
			//
			while( rs.next()) {
		
		
		%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td>
			<a href="updateF.jsp?id=">수정</a>
			<a href="deleteAction.jsp?id=">삭제</a>
			</td>
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
</section>



<footer>
	<div class="footer_item">acorn</div>
	<div class="footer_item"></div>
	<div class="footer_item">서울시마포구</div>
</footer>

</body>
</html>