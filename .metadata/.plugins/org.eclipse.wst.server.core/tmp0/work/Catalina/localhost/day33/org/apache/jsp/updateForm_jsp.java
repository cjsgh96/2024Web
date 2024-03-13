/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-08 01:19:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");


String id = request.getParameter("id");

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:testdb";
String user = "scott";
String password = "tiger";


String pw ="";
String name ="";
		
try {
	//1. 드라이버 로드 (객체생성)
	Class.forName(driver);			
	//2. 데이터베이스 연결
	Connection  con = DriverManager.getConnection(url, user, password);
	
	//3. 문장얻어오기 
	 
	String sql  ="select * from  acorntbl where id  =?";
	PreparedStatement  pst =con.prepareStatement(sql);
	pst.setString(1, id);	 //왼쪽 물음표부터 	 
	
	//5.실행 ( executeQuery()-조회,  executeUpdate()- 나머지 등록, 변경, 삭제)
	ResultSet  rs =pst.executeQuery();	
	
	//
	if( rs.next()) {
		
		
		pw = rs.getString(2);
		name = rs.getString(3);
	} 			
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

out.println(id);
out.println(pw);
out.println(name);


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" div{ \r\n");
      out.write("  border:1px solid black;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .wrap{\r\n");
      out.write(" width:500px;\r\n");
      out.write(" margin:0  auto;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .line{\r\n");
      out.write("   display: flex;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .col1{\r\n");
      out.write("  width:30%;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .col2{\r\n");
      out.write("  width:70%;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" .line1, .line5{\r\n");
      out.write(" text-align: center;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" .col1, .col2{\r\n");
      out.write(" padding:5px;\r\n");
      out.write(" }\r\n");
      out.write("  \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=\"frm\" action=\"updateAction.jsp\"  method=\"post\">\r\n");
      out.write("	<div  class=\"wrap\">\r\n");
      out.write("		 <div class=\"line1\">\r\n");
      out.write("			   <h2> 학생정보 조회 </h2>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">아이디</div>\r\n");
      out.write("			<div class=\"col2\"><input type=\"text\"  name=\"id\" value=\"\" readonly=\"readonly\"></div>	<!-- input name=id -->\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">비번</div>\r\n");
      out.write("			<div class=\"col2\"><input type=\"text\" name=\"pw\" value=\"\"></div>	\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	    <div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">이름</div>\r\n");
      out.write("			<div class=\"col2\"><input type=\"text\" name=\"name\" value=\"\"></div>	\r\n");
      out.write("		</div>	\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"line5\">\r\n");
      out.write("		<!--  form 안에 있는 버튼은 submit 지정,(action에 지정된 페이지로 이동함) -->	\r\n");
      out.write("		 <button>변경</button>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	let frm = document.frm;\r\n");
      out.write("	alert(frm);\r\n");
      out.write("	\r\n");
      out.write("	frm.id.value=\"");
      out.print(id);
      out.write("\";\r\n");
      out.write("	frm.pw.value=\"");
      out.print(pw);
      out.write("\";\r\n");
      out.write("	frm.name.value=\"");
      out.print(name);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>");
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
