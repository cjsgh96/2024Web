<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@  page import="java.sql.*" %>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	out.println(id);
	
	
	
	
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
		
		String sql  ="select * from  acorntbl where name  =?";
		PreparedStatement  pst =con.prepareStatement(sql);
		pst.setString(1, name);	 //왼쪽 물음표부터 	 
		
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		if( rs.next()) {
			
			id = rs.getString(1);
			pw = rs.getString(2);
			name = rs.getString(3);
		} 			
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
 div{
 
  border:1px solid black;
 }
 
 .wrap{
 width:500px;
 }
 
 .line{
   display: flex;
 }
 
 .col1{
  width:30%;
 }
 
 .col2{
  width:70%;
 }
 
 
 .line1, .line5{
 text-align: center;
 }
 
 
 .col1, .col2{
 padding:5px;
 }
  
</style>
</head>
<body>


<div  class="wrap">
	 <div class="line1">
		   <h2> 수강신청 </h2>
	</div>

	<div class="line">
		<div class="col1">아이디</div>
		<div class="col2"><input type="text"></div>	
	</div>
	

	<div class="line">
		<div class="col1">비번</div>
		<div class="col2"><input type="text"></div>	
	</div>
	
    <div class="line">
		<div class="col1">이름</div>
		<div class="col2"><input type="text"></div>	
	</div>	
	
	<div class="line5">
	 <button>등록</button>
	</div>

</div>

</body>
</html>

<script>
let frm = document.frm;
frm.id.value="<%=id%>";
</script>