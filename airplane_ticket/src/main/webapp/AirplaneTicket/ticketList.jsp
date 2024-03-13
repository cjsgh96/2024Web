<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.container {
    width: 600px; /* 또는 필요한 너비로 조정 */
    margin: 20px auto; /* 위아래 여백은 필요한 만큼 조정 */
}
header{
 width:600px;
 border:1px solid black;
 padding :20px;
 background-image:url(https://media.istockphoto.com/id/155380716/ko/%EC%82%AC%EC%A7%84/%EC%83%81%EC%9A%A9-%EC%A0%9C%ED%8A%B8%EA%B8%B0-%EB%B9%84%ED%96%89-%ED%81%B4%EB%9D%BC%EC%9A%B0%EB%93%9C.jpg?s=612x612&w=0&k=20&c=JXXQPEFmn5en10oEUeCZyqVRN595lxSsdD4Ycy6YP98=);
 background-position:center;
 background-size:cover;
}
nav{
	width:600px;
	 border:1px solid black;
	 padding :10px;
}

a{
	text-decoration:none;
	color:black;
}
nav span{
   padding-right: 5px;
}


section {
 
 padding:10px; 
 }
footer{
  width:600px;
  border:1px solid black;
  display: flex;
  padding:10px;
  text-align:center;
}

footer > div.1 {	 
	 width:120px;
}



footer > div.2 {	 
	 width:360px;
}



footer > div.3 {
	 
	 width:120px;
}

table{
	 width:500px;
	 border:1px solid black;
	 margin:0 auto;
	 border-collapse: collapse;
}

td{
 border:1px solid black;
 text-align: center;
}

</style>
</head>
<body>
<div class="container">
<header>
<h2>항공 티켓 매표소</h2>
</header>

<nav>
	<span> <a href="ticketBuy.jsp">  구매하기</a></span>
	<span> <a href="buyHistory	.jsp">  구매내역</a></span>
</nav>

<section>
  
  <table>
  <caption>  티켓 리스트 </caption>
  <!--  제목줄 -->
  	<tr>
  	  <td>번호</td>
  	  <td>등급</td>
 	  <td>시간</td>
 	  <td>나이</td>
 	  <td>가격</td> 	     	  
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
		
		//3. 문장얻어오기 
		  
		String sql  ="select * from  airplane_ticket_tbl";
		PreparedStatement  pst =con.prepareStatement(sql);
	 
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {		
  %>	

  	<tr>
  	  <td> <%= rs.getString(1) %> </td>
  	  <td> <%= rs.getString(2) %></td>
 	  <td> <%= rs.getString(3) %></td>
 	  <td> <%= rs.getString(4) %></td>
 	  <td> <%= rs.getString(5) %></td>  
 	  
 	      	  	     	  
  	</tr> 
  	
  	<%
		} 			
		
	} catch (ClassNotFoundException e) {
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
	<div class="1">ACORN <br>AIR</div>
	<div class="2">회사소개인재채용제휴제안이용약관개인정보처리방침<br>청소년보호정책네이버 정책고객센터ⓒ NAVER Corp.</div>
	<div class="3">기업<br>사이트</div>
</footer>
</div>
</body>
</html>


 


