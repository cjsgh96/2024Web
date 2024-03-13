<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>    
<%
request.setCharacterEncoding("utf-8");

String ticket_id =request.getParameter("ticket_id"); 
String ticket_type = request.getParameter("ticket_type");
String ticket_time = request.getParameter("ticket_time");
String ticket_age =request.getParameter("ticket_age"); 
String ticket_price =request.getParameter("ticket_price"); 

out.println(ticket_id);
out.println(ticket_type);
out.println(ticket_time);
out.println(ticket_age);
out.println(ticket_price);

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
	
	String sql  ="update airplane_ticket_tbl set TICKET_TYPE=? , TICKET_TIME=? , TICKET_AGE=? , TICKET_PRICE=?    where TICKET_ID=?";
	PreparedStatement  pst =con.prepareStatement(sql);
	
	pst.setString(1, ticket_type);
	pst.setString(2, ticket_time);
	pst.setString(3, ticket_age);
	pst.setString(4, ticket_price);
	pst.setString(5, ticket_id);
	
	
	
	int cnt = pst.executeUpdate();
	System.out.println( cnt+"개수 변경 되었음");

	
	response.sendRedirect("admain.jsp");
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

%>
