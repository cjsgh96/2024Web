<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<%
String ticket_id = request.getParameter("ticket_id");


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
		 
		String sql  ="delete from  buylist_tbl where ticket_id =? ";
		PreparedStatement  pst =con.prepareStatement(sql);
	
		pst.setString(1, ticket_id);
		int cnt = pst.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// 재요청
		response.sendRedirect("check.jsp");
		
		
 %>