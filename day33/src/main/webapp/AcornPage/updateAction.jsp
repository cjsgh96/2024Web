<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@  page import="java.sql.*" %>    
<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:testdb";
String user = "scott";
String password = "tiger";	

		
try {
	//1. ����̹� �ε� (��ü����)
	Class.forName(driver);			
	//2. �����ͺ��̽� ����
	Connection  con = DriverManager.getConnection(url, user, password);
	
	//3. ��������� 
	
	String sql  ="update acorntbl set pw=? where id=?";
	PreparedStatement  pst =con.prepareStatement(sql);
	pst.setString(1, pw);
	pst.setString(2, id);
	
	
	int cnt = pst.executeUpdate();
	System.out.println( cnt+"���� ���� �Ǿ���");

	
	
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
response.sendRedirect("AcronList2.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	����Ϸ� !!
</body>
</html>