<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>	
 
    


<%


request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String ticket_type =  request.getParameter("type");
String ticket_date =  request.getParameter("date");
String ticket_time  = request.getParameter("time");
String ticket_age  = request.getParameter("age");
String ticket_cnt  = request.getParameter("cnt");

out.println( id);
out.println( ticket_type);
out.println( ticket_date);
out.println( ticket_time);
out.println( ticket_age);
out.println( ticket_cnt);


String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:testdb";
String user = "scott";
String password = "tiger";	

		
try {
	 
	Class.forName(driver);		 
	Connection  con = DriverManager.getConnection(url, user, password);	
	 
	 
	String sql  =" update buy_history set ticket_type=?, ticket_date=?, ticket_time=?, ticket_age=?, ticket_cnt=? where id=?";
	PreparedStatement  pst =con.prepareStatement(sql);
	pst.setString(1, ticket_type);
	pst.setString(2, ticket_date);
	pst.setString(3, ticket_time);
	pst.setString(4, ticket_age);
	pst.setString(5, ticket_cnt);
	pst.setString(6, id);
    int cnt  =pst.executeUpdate();  // 등록, 변경, 삭제	
    System.out.println( cnt +"개수 변경 되었음");
	 		
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


response.sendRedirect("buyHistory.jsp");
%>

    
    
    
    
    
    
                                         
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  변경완료 !!
</body>
</html>