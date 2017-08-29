package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.beans.*;

public final class grd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <title>My JSP 'grd.jsp' starting page</title>\r\n");
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
      out.write(".se\r\n");
      out.write("{\r\n");
      out.write("height: 20px;\r\n");
      out.write("width: 20px;\r\n");
      out.write("color:#000000\r\n");
      out.write("line-height: 220%;\r\n");
      out.write("border:1px solid #3399ff;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"Courier New\", Courier, monospace;\r\n");
      out.write("\tcolor: #0033CC;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function showalter(){\r\n");
      out.write("       var x=document.getElementById(\"h\");\r\n");
      out.write("       x.style.display=\"block\";\r\n");
      out.write("    }\r\n");
      out.write("    function denyalter(){\r\n");
      out.write("       var x=document.getElementById(\"h\");\r\n");
      out.write("       x.style.display=\"none\";\r\n");
      out.write("    }\r\n");
      out.write("    function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"pictures/logebg.jpg\" onload=\"framesize()\">\r\n");
  String userid=request.getSession().getAttribute("userid").toString();
   UserBean u=new InitUser().getUser(userid);

      out.write("\r\n");
      out.write("   <table width=\"70%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><img src=\"pictures/grdlogo.jpg\" width=\"960\" height=\"33\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"93\"><table width=\"100%\" height=\"93\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"18%\" height=\"91\" background=\"pictures/grdzuo.jpg\" valign=\"top\"><table width=\"90%\" height=\"309\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"26\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"104\" height=\"105\" /></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"30\" valign=\"bottom\" align=\"center\"><a href=\"javascript:void(0)\" class=\"STYLE4\" onclick=\"showalter()\">修改图像</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("          <tr ><td >\r\n");
      out.write("             <span id=\"h\" style=\"display:none\">\r\n");
      out.write("             <form action=\"AdminUpload\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("    \t\t   <input type=\"file\" name=\"images\" class=\"se\" size=\"8\"/><br/><input type=\"submit\" value=\"上传\"/>\r\n");
      out.write("    \t\t   <a href=\"javascript:void(0)\"><font size=\"-1\" onclick=\"denyalter()\">取消上传</font></a>\r\n");
      out.write("      \t     </form>\r\n");
      out.write("      \t     </span>\r\n");
      out.write("          </td></tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"49\" valign=\"bottom\"><table width=\"90%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\" align=\"center\"><span class=\"STYLE3\"><a href=\"SerShowLoge\" target=\"frame\">");
      out.print(u.getLog() );
      out.write("</a></span></td>\r\n");
      out.write("                <td align=\"center\" class=\"STYLE3\"><a href=\"album1.jsp\">");
      out.print(u.getPhoto() );
      out.write("</a></td>\r\n");
      out.write("                <td align=\"center\" class=\"STYLE3\"><a href=\"SerShowSay\" target=\"frame\">");
      out.print(u.getSay() );
      out.write("</a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td><div align=\"center\" class=\"STYLE1\">日志</div></td>\r\n");
      out.write("                <td><div align=\"center\" class=\"STYLE1\">照片</div></td>\r\n");
      out.write("                <td><div align=\"center\" class=\"STYLE1\">说说</div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t   <tr>\r\n");
      out.write("            <td height=\"47\" valign=\"bottom\" align=\"center\"><a href=\"grdperson.jsp\" class=\"STYLE4\" target=\"grd\">查看信息</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"39\" valign=\"bottom\" align=\"center\"><a href=\"grdalter.jsp\" class=\"STYLE4\" target=\"grd\">进行修改</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"82%\">\r\n");
      out.write("\t\t   <iframe name=\"grd\" align=middle marginwidth=0 marginheight=0  frameborder=no scrolling=no  width=\"100%\"  height=600 src=\"grdperson.jsp\"></iframe>\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
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
