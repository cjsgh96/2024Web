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
<h2>HY���б� ������û ���α׷�</h2>
</header>
<nav>
	<span> <a href="list.jsp"> ������ ��ȸ</a></sapn>
	<span> <a href="#"> ������ ��ȸ</a></sapn>
	<span> <a href="#"> ������ ��ȸ</a></sapn>
	<span> <a href="#"> ������ ��ȸ</a></sapn>
</nav>
<section>
	<h2> ������ ��ȸ </h2>
	<table>
	<!-- ������ -->
	<tr>
		<td>�����ȣ</td>
		<td>�����̸�</td>
		<td>����</td>
		<td>�����о�</td>
	</tr>
	
	
	
	<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		//�����ͺ��̽� ��������
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		 //1. ����Ŭ����̹� �ε�
		Class.forName(driver); 
		 //2. �����ͺ��̽� ����
		con= DriverManager.getConnection(url, user, password);
		 
		 if( con == null){ System.out.println("�������");}
		 //3. statement ������
		st = con.createStatement();
		 //4. �ʿ��� sql �ۼ�
		String sql ="select * from tbl_lecturer_300"; //5. ���������� ����
		rs = st.executeQuery( sql) ;
		 //6. ������ ���� ����� ȭ�鿡 ����ϱ�
		while( rs.next() ) {
			 
	%>
	<!-- db ������ ������ ó�� -->
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
	finally{ //�ڿ��� �ݳ�
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
	%>
	</table>
</section>

</body>
</html>












