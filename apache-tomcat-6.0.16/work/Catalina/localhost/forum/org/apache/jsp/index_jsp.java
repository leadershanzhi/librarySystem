package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 26px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #0066FF;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {font-size: 16px; font-family: \"幼圆\"; font-weight: bold; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFCCFF\">\r\n");
      out.write("   <br/><br/>\r\n");
      out.write("   <form method=\"post\" action=\"Load\">\r\n");
      out.write("   <fieldset>\r\n");
      out.write("   <legend><span class=\"STYLE1\" align=center>在线论坛</span></legend>\r\n");
      out.write("   <table width=\"40%\" border=\"1\" align=\"center\" cellpadding=\"5\" cellspacing=\"5\" bordercolor=\"#999999\" bgcolor=\"#CCCCCC\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"33%\"><span class=\"STYLE5\">用户名：</span></td>\r\n");
      out.write("    <td width=\"67%\">\r\n");
      out.write("      <input type=\"text\" name=\"uid\" style=\"height:25px\" size=\"30\" />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><span class=\"STYLE5\">口令：</span></td>\r\n");
      out.write("    <td><input type=\"password\" name=\"pw\" style=\"height:25px\" size=\"30\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" align=\"center\">\r\n");
      out.write("      <input type=\"submit\" name=\"Submit\"  value=\"登  录\" />\r\n");
      out.write("\t  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t  <input type=\"reset\" name=\"Submit\" value=\"重  置\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td colspan=\"2\" align=\"center\">\r\n");
      out.write("     \r\n");
      out.write("\t  ");

	     if("no".equals(request.getParameter("tag"))){
	    	 out.print("<font size=-1 color=red face=幼圆>用户名或密码错误</font>");
	     }
	  
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</fieldset>\r\n");
      out.write(" </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
