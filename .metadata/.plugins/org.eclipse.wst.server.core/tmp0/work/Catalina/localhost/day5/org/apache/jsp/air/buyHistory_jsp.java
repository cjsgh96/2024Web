/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-11 07:59:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.air;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class buyHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(".container {\r\n");
      out.write("    width: 600px; /* 또는 필요한 너비로 조정 */\r\n");
      out.write("    margin: 20px auto; /* 위아래 여백은 필요한 만큼 조정 */\r\n");
      out.write("}\r\n");
      out.write("header{\r\n");
      out.write(" width:600px;\r\n");
      out.write(" border:1px solid black;\r\n");
      out.write(" padding :20px;\r\n");
      out.write(" background-image:url(https://media.istockphoto.com/id/155380716/ko/%EC%82%AC%EC%A7%84/%EC%83%81%EC%9A%A9-%EC%A0%9C%ED%8A%B8%EA%B8%B0-%EB%B9%84%ED%96%89-%ED%81%B4%EB%9D%BC%EC%9A%B0%EB%93%9C.jpg?s=612x612&w=0&k=20&c=JXXQPEFmn5en10oEUeCZyqVRN595lxSsdD4Ycy6YP98=);\r\n");
      out.write(" background-position:center;\r\n");
      out.write(" background-size:cover;\r\n");
      out.write("}\r\n");
      out.write("nav{\r\n");
      out.write("	width:600px;\r\n");
      out.write("	 border:1px solid black;\r\n");
      out.write("	 padding :10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("	text-decoration:none;\r\n");
      out.write("	color:black;\r\n");
      out.write("}\r\n");
      out.write("nav span{\r\n");
      out.write("   padding-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write(" \r\n");
      out.write(" padding:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer{\r\n");
      out.write("  width:600px;\r\n");
      out.write("  border:1px solid black;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  padding:10px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer > div.1 {	 \r\n");
      out.write("	 width:120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer > div.2 {	 \r\n");
      out.write("	 width:360px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("footer > div.3 {\r\n");
      out.write("	 \r\n");
      out.write("	 width:120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("	 width:500px;\r\n");
      out.write("	 border:1px solid black;\r\n");
      out.write("	 margin:0 auto;\r\n");
      out.write("	 border-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td{\r\n");
      out.write(" border:1px solid black;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<header>\r\n");
      out.write("<h2>구매내역</h2>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("	<span> <a href=\"ticketBuy.jsp\">구매하기</a></span>\r\n");
      out.write("	<span> <a href=\"ticketList.jsp\">홈으로</a></span>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("  \r\n");
      out.write("  <table>\r\n");
      out.write("  <caption>  구매내역 </caption>\r\n");
      out.write("  <!--  제목줄 -->\r\n");
      out.write("  	<tr>\r\n");
      out.write("  	  <td>등급</td>\r\n");
      out.write(" 	  <td>날짜</td>\r\n");
      out.write(" 	  <td>시간</td>\r\n");
      out.write(" 	  <td>나이</td> \r\n");
      out.write(" 	  <td>개수</td>  \r\n");
      out.write(" 	  <td>변경 / 환불</td>	     	  \r\n");
      out.write("  	</tr>  \r\n");
      out.write("  \r\n");
      out.write("  ");

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
		  
		String sql  ="select * from  buy_history";
		PreparedStatement  pst =con.prepareStatement(sql);
	 
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {		
  
      out.write("	\r\n");
      out.write("\r\n");
      out.write("  	<tr>\r\n");
      out.write("  	  <td> ");
      out.print( rs.getString(2) );
      out.write("</td>\r\n");
      out.write(" 	  <td> ");
      out.print( rs.getString(3) );
      out.write("</td>\r\n");
      out.write(" 	  <td> ");
      out.print( rs.getString(4) );
      out.write("</td>\r\n");
      out.write(" 	  <td> ");
      out.print( rs.getString(5) );
      out.write("</td> \r\n");
      out.write(" 	  <td> ");
      out.print( rs.getString(6) );
      out.write("</td>  \r\n");
      out.write(" 	   <td>\r\n");
      out.write(" 	    <a href=\"updateForm.jsp?id=");
      out.print( rs.getString(1) );
      out.write("\">변경</a>\r\n");
      out.write(" 	   /\r\n");
      out.write(" 	    <a href=\"deleteAction.jsp?id=");
      out.print( rs.getString(1));
      out.write("\">취소</a></td>  	  	     	  \r\n");
      out.write("  	</tr> \r\n");
      out.write("  	\r\n");
      out.write("  	");

		} 			
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  	
  	
  	
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write(" \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("	<div class=\"1\">ACORN<br>AIR</div>\r\n");
      out.write("	<div class=\"2\">회사소개인재채용제휴제안이용약관개인정보처리방침<br>청소년보호정책네이버 정책고객센터ⓒ NAVER Corp.</div>\r\n");
      out.write("	<div class=\"3\">기업<br>사이트</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
