/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-04-03 13:08:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write("form {\r\n");
      out.write("    border: 3px solid #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text], input[type=password] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    margin: 8px 0;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancelbtn {\r\n");
      out.write("    width: auto;\r\n");
      out.write("    padding: 10px 18px;\r\n");
      out.write("    background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 24px 0 12px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.avatar {\r\n");
      out.write("    width: 130px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.psw {\r\n");
      out.write("    float: right;\r\n");
      out.write("    padding-top: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("@media screen and (max-width: 300px) {\r\n");
      out.write("    span.psw {\r\n");
      out.write("       display: block;\r\n");
      out.write("       float: none;\r\n");
      out.write("    }\r\n");
      out.write("    .cancelbtn {\r\n");
      out.write("       width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>Login Form</h2>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/action_page.php\">\r\n");
      out.write("  <div class=\"imgcontainer\">\r\n");
      out.write("    <img src=\"images/img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <label><b>Username</b></label>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n");
      out.write("\r\n");
      out.write("    <label><b>Password</b></label>\r\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("        \r\n");
      out.write("    <button type=\"submit\">Login</button>\r\n");
      out.write("    <input type=\"checkbox\" checked=\"checked\"> Remember me\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\" style=\"background-color:#f1f1f1\">\r\n");
      out.write("    <button type=\"button\" class=\"cancelbtn\">Cancel</button>\r\n");
      out.write("    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
