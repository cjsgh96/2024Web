/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-11 07:32:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("header{\r\n");
      out.write("	border:1px solid black;\r\n");
      out.write("	height:100px;\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("	text-align:center;\r\n");
      out.write("}\r\n");
      out.write("nav{\r\n");
      out.write("	border:1px solid black;\r\n");
      out.write("	margin-bottom:20px;\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write("	display:flex;\r\n");
      out.write("}\r\n");
      out.write("ul li{\r\n");
      out.write("	list-style:none;\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("	padding:10px;\r\n");
      out.write("	text-align:center;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("	border:1px solid black;\r\n");
      out.write("	margin:0 auto;\r\n");
      out.write("	text-align:center;\r\n");
      out.write("	width:50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr{\r\n");
      out.write("	border:1px solid black;\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header><h2>항공권 조회 프로그램</h2></header>\r\n");
      out.write("<nav>\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li class=\"li1\"><a href=\"check.jsp\">구매조회</a></li>\r\n");
      out.write("		<li><a href=\"update.jsp\">변경</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>티켓번호</td>\r\n");
      out.write("		<td>좌석등급</td>\r\n");
      out.write("		<td>출발시간</td>\r\n");
      out.write("		<td>연령</td>\r\n");
      out.write("		<td>가격</td>\r\n");
      out.write("		<td>구매</td>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</tr>\r\n");
      out.write(" ");

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
		 
		String sql  ="select * from airplane_ticket_tbl ";
		PreparedStatement  pst =con.prepareStatement(sql);
			 //왼쪽 물음표부터 	 
		
		//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
		ResultSet  rs =pst.executeQuery();	
		
		//
		while( rs.next()) {
 
 
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<form name=\"frm\" action=\"buy.jsp\" method=\"post\">\r\n");
      out.write("		    <td>\r\n");
      out.write("	            <input type=\"hidden\" name=\"ticket_id\" value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1));
      out.write("\r\n");
      out.write("	        </td>\r\n");
      out.write("	        <td>\r\n");
      out.write("	            <input type=\"hidden\" name=\"ticket_type\" value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("\r\n");
      out.write("	        </td>\r\n");
      out.write("	        <td>\r\n");
      out.write("	            <input type=\"hidden\" name=\"ticket_time\" value=\"");
      out.print(rs.getString(3));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write("\r\n");
      out.write("	        </td>\r\n");
      out.write("	        <td>\r\n");
      out.write("	            <input type=\"hidden\" name=\"ticket_age\" value=\"");
      out.print(rs.getString(4));
      out.write('"');
      out.write('>');
      out.print(rs.getString(4));
      out.write("\r\n");
      out.write("	        </td>\r\n");
      out.write("	        <td>\r\n");
      out.write("	            <input type=\"hidden\" name=\"ticket_price\" value=\"");
      out.print(rs.getString(5));
      out.write('"');
      out.write('>');
      out.print(rs.getString(5));
      out.write("\r\n");
      out.write("	        </td>\r\n");
      out.write("	        <td>\r\n");
      out.write("	            <button type=\"submit\">구매</button>\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </form>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");

		}
	}
	 catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
  	
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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