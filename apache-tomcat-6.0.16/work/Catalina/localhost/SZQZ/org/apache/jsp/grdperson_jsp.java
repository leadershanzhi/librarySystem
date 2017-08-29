package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.beans.*;

public final class grdperson_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gbk");
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
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'grdperson.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE3 {font-size: 13px}\r\n");
      out.write(".STYLE4 {font-family: \"幼圆\"}\r\n");
      out.write(".STYLE5 {font-size: 16px; font-weight: bold; font-family: \"幼圆\"; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  ");

    String userid=request.getSession().getAttribute("userid").toString();
    UserBean u=new InitUser().getUser(userid);
  
      out.write("\r\n");
      out.write("  <table width=\"100%\" border=\"0\" height=\"535\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"4%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"92%\"><table width=\"100%\" height=\"478\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"83\" valign=\"middle\"><span class=\"STYLE5\"><br/>\r\n");
      out.write("          <br/>\r\n");
      out.write("          ");
      out.print(u.getUsername() );
      out.write('-');
      out.write('-');
      out.write('-');
      out.print(userid );
      out.write("</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("        <td height=\"10\" ><hr width=\"100%\" size=\"2\" color=\"#6699FF\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"23\" valign=\"bottom\" class=\"STYLE2 STYLE4\">基本资料</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("        <td height=\"2\" ><hr width=\"100%\" size=\"2\" color=\"#6699FF\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"360\" valign=\"top\"><!--内容-->\r\n");
      out.write("            <table width=\"100%\" height=\"322\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td width=\"19%\" height=\"73\" ><span class=\"STYLE3\">用户名：</span></td>\r\n");
      out.write("                <td width=\"81%\" class=\"STYLE3\">");
      out.print(userid );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">昵称：</td>\r\n");
      out.write("                <td class=\"STYLE3\">");
      out.print(u.getUsername() );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">年龄：</td>\r\n");
      out.write("                <td class=\"STYLE3\">");
      out.print(u.getAge() );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">生日：</td>\r\n");
      out.write("                <td class=\"STYLE3\">");
      out.print(u.getBirth() );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t  <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">星座：</td>\r\n");
      out.write("                <td class=\"STYLE3\">摩羯座</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">家乡：</td>\r\n");
      out.write("                <td class=\"STYLE3\">");
      out.print(u.getHome() );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr valign=\"bottom\">\r\n");
      out.write("                <td class=\"STYLE3\">签名：</td>\r\n");
      out.write("                <td class=\"STYLE3\">");
      out.print(u.getUsernote() );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          <!--内容--></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("\t<td width=\"4%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
