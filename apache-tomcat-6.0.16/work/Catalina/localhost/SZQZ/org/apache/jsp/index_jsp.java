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
      out.write("\r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction changeImage(){\r\n");
      out.write("\t\t\tvar date = new Date();\r\n");
      out.write("\t\t\tdocument.getElementById(\"authimg\").src='AuthImage?id='+date.getTime();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>登录页面</title>\r\n");
      out.write("<style>\r\n");
      out.write(".lod{border:none;background:url(pictures/loadbutton.jpg);  left top no-repeat;width:94px; height:31px; }\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE10 {\tfont-size: 40px;\r\n");
      out.write("\tfont-family: \"华文行楷\";\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(pictures/sygb.jpg);\r\n");
      out.write("}\r\n");
      out.write(".STYLE17 {font-size: 16px}\r\n");
      out.write(".STYLE18 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE20 {font-family: \"幼圆\"; font-size: 16px; font-weight: bold; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width=\"85%\" height=\"93%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"8%\" height=\"34\">&nbsp;</td>\r\n");
      out.write("    <td width=\"51%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"41%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"146\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>\r\n");
      out.write("    <td>&nbsp;&nbsp; <img src=\"pictures/star.png\" width=\"97\" height=\"88\" /><span class=\"STYLE10\">淘出自我，淘出精彩</span></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td> &nbsp;\r\n");
      out.write("    &nbsp;&nbsp;\r\n");
      out.write("    <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"575\" height=\"277\">\r\n");
      out.write("      <param name=\"movie\" value=\"pictures/first.swf\" />\r\n");
      out.write("      <param name=\"quality\" value=\"high\" />\r\n");
      out.write("      <param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("      <embed src=\"pictures/first.swf\" width=\"575\" height=\"277\" quality=\"high\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" type=\"application/x-shockwave-flash\" wmode=\"transparent\"></embed>\r\n");
      out.write("    </object></td>\r\n");
      out.write("    <td><form action=\"SerLogin\" method=\"post\">\r\n");
      out.write("\t    \r\n");
      out.write("      <table width=\"88%\" height=\"47%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" > \r\n");
      out.write("      ");
 if("no".equals(request.getParameter("tag"))){
	    	out.println("&nbsp;&nbsp;&nbsp;&nbsp;<font size=-1 color=red face=黑体>用户名或密码错误,您可以注册或找回密码</font><br/>");
	    }else if("yzno".equalsIgnoreCase(request.getParameter("tag"))){
	    	out.println("&nbsp;&nbsp;&nbsp;&nbsp;<font size=-1 color=red face=黑体>验证码输入错误</font><br/>");
	    }
	    
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t  <tr>\r\n");
      out.write("        <td height=\"10\" colspan=\"2\" height=\"30\"><hr size=\"0\" color=\"#CCCCCC\"  width=\"320\" align=\"left\" /></td> \r\n");
      out.write("      </tr>  \r\n");
      out.write("       <tr>  \r\n");
      out.write("\t     \r\n");
      out.write("         <td width=\"23%\" height=\"44\"> &nbsp;<span class=\"STYLE20\">账号：</span></td>\r\n");
      out.write("         <td width=\"73%\"><input name=\"account\" type=\"text\" style=\"height:30px\" size=\"30\"/></td>\r\n");
      out.write("         <td width=\"4%\" height=\"85\" rowspan=\"3\">&nbsp; </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td height=\"48\">&nbsp;<span class=\"STYLE20\">密码：</span></td>\r\n");
      out.write("         <td><input name=\"pw\" type=\"password\" style=\"height:30px\" size=\"30\"/></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td height=\"47\"><span class=\"STYLE17\"><span class=\"STYLE18\"> &nbsp;验证码：</span></span></td>\r\n");
      out.write("         <td><input name=\"yz\" type=\"text\" style=\"height:30px\" size=\"10\"/>&nbsp;&nbsp; <img src=\"AuthImage\" id=\"authimg\" /></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("\t  \r\n");
      out.write("      <tr>\r\n");
      out.write("\t \r\n");
      out.write("        <td height=\"22\" colspan=\"2\"><p>&nbsp;<input type=\"submit\" class=\"lod\" value=\"\"\"> &nbsp;&nbsp;<a href=\"findpw.jsp\"><font size=\"-1\">找回密码</font></a>&nbsp;|&nbsp;<a href=\"register.jsp\"><font size=\"-1\">我要注册</font></a>&nbsp;|&nbsp;<a href=\"javascript:void(0)\" onclick=\"changeImage()\"><font size=\"-1\">看不清</font></a></p>\r\n");
      out.write("\t\t   <hr size=\"0\" color=\"#CCCCCC\"  width=\"320\" align=\"left\" />\r\n");
      out.write("\t\t   <p>&nbsp;</p>\r\n");
      out.write("          <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015 四海兴唐单智版权所有  吉 ICP备11011334号-1 </font></h5>\r\n");
      out.write("<h5 align=\"center\"><font color=\"#C0C0C0\">联系我：421170702@qq.com|18744033060</font></h5>\r\n");
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
