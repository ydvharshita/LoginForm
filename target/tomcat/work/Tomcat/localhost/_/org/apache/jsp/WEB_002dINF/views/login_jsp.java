/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-05 05:17:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("        <title>** LOGIN PAGE **</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form method=\"post\" action=\"/login\">\r\n");
      out.write("            <center>\r\n");
      out.write("            <table border=\"1\" width=\"30%\" cellpadding=\"3\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"2\" style = \"color:red\">Login Here</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">User Id : </td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"userid\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">Password : </td>\r\n");
      out.write("                        <td><input type=\"password\" name=\"pwd\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">First-Name : </td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"str_fname\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">Last-Name : </td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"str_lname\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">Country : </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <select name=\"cntry\">\r\n");
      out.write("                        \t<option value=\"1\">INDIA</option>\r\n");
      out.write("                        \t<option value=\"2\">CHINA</option>\r\n");
      out.write("                        \t<option value=\"3\">JAPAN</option>\r\n");
      out.write("                        \t<option value=\"4\">RUSSIA</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t                        \r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">Gender : </td>\r\n");
      out.write("                        <td><input type=\"radio\" name=\"gender\" value=\"male\" >MALE<br>\r\n");
      out.write("                        \t<input type=\"radio\" name=\"gender\" value=\"female\">FEMALE\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td style = \"color:blue\">Education : </td>\r\n");
      out.write("                        <td><input type=\"checkbox\" name=\"edu\" value=\"Graduate\">GRADUATE<br>\r\n");
      out.write("                        \t<input type=\"checkbox\" name=\"edu\" value=\"Post-Graduate\">POST-GRADUATE\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                  \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><input type=\"submit\" value=\"SUBMIT\" style = \"color:red\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}