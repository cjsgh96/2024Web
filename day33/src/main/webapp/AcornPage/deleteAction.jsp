<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@  page import="java.sql.*" %>
<%

String id = request.getParameter("id");
out.println(id);

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:testdb";
String user = "scott";
String password = "tiger";	

		
try {
	
	Class.forName(driver);			
	
	Connection  con = DriverManager.getConnection(url, user, password);
	
	
	
	String sql  ="delete from  acorntbl where id  =?";
	PreparedStatement  pst =con.prepareStatement(sql);
	pst.setString(1, id);	  	 
	
	
	int cnt =  pst.executeUpdate();	
	
	//
	
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

// ���û
	response.sendRedirect("AcronList2.jsp");
//�����ڵ�(���)�� ���õȴ�.



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>