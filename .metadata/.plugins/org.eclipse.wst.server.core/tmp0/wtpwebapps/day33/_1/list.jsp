<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
header{
	border:1px solid black;
	padding:20px;
}
nav{
	border:1px solid black;
	
}
a{
	text-decoration:none;
	color:black;
}
nav span{
	padding-right: 5px;
}
section{
	height:500px;
	padding:10px;
}
footer{
	border:1px solid black;
	display: flex;
	padding: 10%;
}
footer > div{
	
}
footer > div:nth-child(1){
	background-color: red;
	width:20%;
}
footer > div:nth-child(2){
	background-color: red;
	width:60%;
}
footer > div:nth-child(3){
	background-color: red;
	width:20%;
}
table{
	width:400px;
	border:1px solid black;
	margin:0 auto;
}
td{
	border:1px solid black;
	text-align: center;
}

</style>
</head>
<body>

<header>
<h2>HY대학교 수강신청 프로그램</h2>
</header>
<nav>
	<span> <a href="list.jsp"> 참가자 조회</a></sapn>
	<span> <a href="#"> 참가자 조회</a></sapn>
	<span> <a href="#"> 참가자 조회</a></sapn>
	<span> <a href="#"> 참가자 조회</a></sapn>
</nav>
<section>
	<h2> 참가자 조회 </h2>
	<table>
	<!-- 제목줄 -->
	<tr>
		<td>강사번호</td>
		<td>강사이름</td>
		<td>전공</td>
		<td>연구분야</td>
	</tr>
	
	
	
	<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		//데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password);
		 
		 if( con == null){ System.out.println("연결실패");}
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql ="select * from tbl_lecturer_300"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
			 
	%>
	<!-- db 가져온 데이터 처리 -->
	<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
	</tr>
	<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
	%>
	</table>
</section>

</body>
</html>













