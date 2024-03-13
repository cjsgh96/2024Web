<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %> 
 
 <%
   
 //request 넘어온 값이 한글인경우 
 //
 request.setCharacterEncoding("utf-8"); 
 String id =request.getParameter("id");
 String ticket_type =request.getParameter("type");
 String ticket_date = request.getParameter("date");
 String ticket_time = request.getParameter("time");
 String ticket_age = request.getParameter("age");
 String ticket_cnt = request.getParameter("cnt");
 
 out.print(id);
 out.print(ticket_type);
 out.print(ticket_date);
 out.print(ticket_time);
 out.print(ticket_age);
 out.print(ticket_cnt);
 
 
 	Connection con=null;
 	PreparedStatement pst = null; 
	try{ 
		//데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		 
		Class.forName(driver); 		 
		con= DriverManager.getConnection(url, user, password);		 
		if( con == null) {  System.out.println(" 연결실패");} 
		 
		String sql ="insert into buy_history values(?,?,?,?,?,?)";  
		pst = con.prepareStatement(sql);
		
		pst.setString(1, id);
		pst.setString(2, ticket_type);
		pst.setString(3, ticket_date);
		pst.setString(4, ticket_time);
		pst.setString(5, ticket_age);
		pst.setString(6, ticket_cnt);
		
		int cnt  =pst.executeUpdate();
		System.out.println( cnt + "회 구매하였습니다.");
		 
		 
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납		 
		if( pst != null) pst.close();
		if( con != null) con.close();
	}
   
    out.println( "구매완료");
    
     response.sendRedirect("buyHistory.jsp");
 %>