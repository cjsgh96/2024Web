<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
padding:0px;
margin:0px;
}

header{
	border:1px solid black;
	
}
h1{
	/* margin:0 auto; ����Ұ� : h2 ���±� */
	background-color:red;
	text-align:center;
}
nav{
	border:1px solid black;
	height: 100px;
	/* �θ� ������ �ݵ�� ũ��(����) �� �־�� �� */
	position:relative;
}

ul{
	list-style:none;
	border:1px solid black;
	display:flex;
	border-bottom-color:blue;
	
	position:absolute;
	bottom:0px;
	right:0px;  /* left, right, top, bottom  */
}
ul li{
	/* border:1px solid black; */
	display:inline-block;
	padding-right:10px;
}
section{
	padding:20px;
}
footer{
	border:1px solid black;
	/* �θ� display: flex; footer�� �ڽ� div�� ������ ���´�.*/
	display: flex;
}
footer > div {
	border:1px solid black;
	width:33%;
	padding:10px;
}
table{
	width:600px;
	border:1px solid black;
	border-collapse: collapse;
	margin:0 auto;
}
td{
	border:1px solid black;
	text-align:center;
}
a{
	text-decoration: none;
	color:black;
}

</style>
</head>
<body>

<header>
<h1>������ �л����� ���α׷�</h1>
</header>
<nav>
	<ul>
		<li><a href="index.html">home</a></li>
		<li>�л����</li>
		<li>�л���ȸ</li>
	</ul>
</nav>
<section>
	<table>
		<tr>
			<td>���̵�</td>
			<td>���</td>
			<td>�̸�</td>
			<td>����/����</td>
		<tr>
		<!--  -->
		<%
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";	
		
				
		try {
			//1. ����̹� �ε� (��ü����)
			Class.forName(driver);			
			//2. �����ͺ��̽� ����
			Connection  con = DriverManager.getConnection(url, user, password);
			
			//3. ���̺� ������
			 
			String sql  ="select * from  acorntbl";
			PreparedStatement  pst =con.prepareStatement(sql);
				 
			
			//5.���� ( executeQuery()-��ȸ,  executeUpdate()- ������ ���, ����, ����)
			ResultSet  rs =pst.executeQuery();	
			
			//
			while( rs.next()) {
		
		
		%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td>
			<a href="updateF.jsp?id=">����</a>
			<a href="deleteAction.jsp?id=">����</a>
			</td>
		</tr>
		<%
			}
		}
		 catch (ClassNotFoundException e) {
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
	<div class="footer_item">acorn</div>
	<div class="footer_item"></div>
	<div class="footer_item">����ø�����</div>
</footer>

</body>
</html>