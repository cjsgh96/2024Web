/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-11 07:58:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.air;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ticketBuy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
      out.write("<script>\r\n");
      out.write("function check() {	/*유효성체크*/\r\n");
      out.write("    var id = document.getElementById('id').value;\r\n");
      out.write("    var date = document.getElementById('date').value;\r\n");
      out.write("    var cnt = document.getElementById('cnt').value;\r\n");
      out.write("\r\n");
      out.write("    if (id == \"\") {	/*id체크*/\r\n");
      out.write("        alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    if (date == \"\") {	/*날짜체크*/\r\n");
      out.write("        alert(\"날짜를 입력해주세요.\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    if (cnt == \"\" || isNaN(cnt) || cnt <= 0) {/*개수체크*/\r\n");
      out.write("        alert(\"구매할 표 개수를 입력해주세요.\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("function cancel() {/*취소에도 유효성검사가 적용되서 따로만듬*/\r\n");
      out.write("	var confirmCancel = confirm(\"구매를 취소하시겠습니까?\");\r\n");
      out.write("    if (confirmCancel) {       \r\n");
      out.write("    	window.history.go(-1);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=\"tck\" action=\"buyAction.jsp\"  method=\"post\" onsubmit=\"return check()\">\r\n");
      out.write("	<div  class=\"wrap\">\r\n");
      out.write("		 <div class=\"line1\">\r\n");
      out.write("			   <h2> 티켓구매 </h2>\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">아이디</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<input type=\"text\" name=\"id\" id=\"id\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("			\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">등급</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<select name=\"type\" id=\"type\">\r\n");
      out.write("					<option value=\"이코노미\">이코노미</option>\r\n");
      out.write("					<option value=\"비즈니스\">비즈니스</option>\r\n");
      out.write("					<option value=\"퍼스트\">퍼스트</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">날짜</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<input type=\"text\" name=\"date\" id=\"date\">\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">출발시간</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<select name=\"time\" id=\"time\">\r\n");
      out.write("					<option value=\"9\">09:00</option>\r\n");
      out.write("					<option value=\"21\">21:00</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	    <div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">나이</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<select name=\"age\" id=\"age\">\r\n");
      out.write("					<option value=\"성인\">성인</option>\r\n");
      out.write("					<option value=\"청소년\">청소년</option>\r\n");
      out.write("					<option value=\"어린이\">어린이</option>\r\n");
      out.write("					<option value=\"소아\">소아</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>	\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"line\">\r\n");
      out.write("			<div class=\"col1\">개수</div>\r\n");
      out.write("			<div class=\"col2\">\r\n");
      out.write("				<input type=\"number\" name=\"cnt\" id=\"cnt\">\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"line5\">\r\n");
      out.write("		<!--  form 안에 있는 버튼은 submit 지정,(action에 지정된 페이지로 이동함) -->	\r\n");
      out.write("		 <button>구매</button>\r\n");
      out.write("		 <button type=\"button\" onclick=\"cancel()\">취소</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
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