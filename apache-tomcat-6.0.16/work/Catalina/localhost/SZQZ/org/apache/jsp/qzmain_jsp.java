package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.beans.*;

public final class qzmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'qzmain.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body,div,ul,li,p{margin:0;padding:0;}\r\n");
      out.write("body{font:12px/1.5 Arial;}\r\n");
      out.write("ul{list-style-type:none;}\r\n");
      out.write("#nav,#nav ul,#nav ul li,#nav ul li a:hover,#nav .subnav,#nav .subnav p,#nav .subnav p span,#nav .subnav .arrow{background:url(pictures/logomain.jpg) no-repeat;}\r\n");
      out.write("#nav{position:relative;width:920px;margin:10px auto;}\r\n");
      out.write("#nav ul{height:32px;line-height:32px;}\r\n");
      out.write("#nav ul li{float:left;width:110px;margin-left:-2px;}\r\n");
      out.write("#nav ul li a{font-size:14px;color:#fff;width:105px;display:block;text-align:center;text-decoration:none;margin:0 2px 0 4px;}\r\n");
      out.write("#nav ul li a:hover{font-weight:800;background-position:-3px -144px;}\r\n");
      out.write("#nav .subnav .arrow{position:absolute;top:-4px;display:block;width:11px;height:5px;background-position:0 -261px;}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write(" function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"framesize()\">\r\n");
      out.write("<table width=\"100%\" height=\"auto\"border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr height=\"80\">\r\n");
      out.write("    <td ><table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/qqmain.jpg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"15%\" height=\"22\">&nbsp;</td>\r\n");
      out.write("        <td width=\"37%\">&nbsp;</td>\r\n");
      out.write("        <td width=\"48%\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("      ");
		
         String userid=(String)request.getSession().getAttribute("userid");
         UserBean u=new InitUser().getUser(userid);
      
      out.write("\r\n");
      out.write("        ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("        <td >&nbsp;<a href=\"SerLogin?tag=zhuxiao\"><font size=\"-1\" face=\"幼圆\" color=blue>注销</font></a></td>");
}else{ 
      out.write("\r\n");
      out.write("        <td >&nbsp;\r\n");
      out.write("        <a href=\"SerLogin?account=");
      out.print(request.getSession().getAttribute("conid") );
      out.write("&tag=returnqz\" target=\"_top\">\r\n");
      out.write("        <font size=\"-1\" face=\"幼圆\" color=blue>返回</font></a></td>");
} 
      out.write("\r\n");
      out.write("        <td><h1><font face=\"幼圆\">");
      out.print(u.getUsername() );
      out.write(" 个人主页</font></h1></td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td><h4>");
      out.print(u.getUsernote() );
      out.write("</h4></td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"22\">&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"50\" ><table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/logebg1.jpg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("\t    <td width=\"100%\" align=\"left\"><div id=\"nav\" align=\"left\">\r\n");
      out.write("\t\t\t  <ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"centmain.jsp\" target=\"frame1\"><font face=\"幼圆\">主 页</font></a></li>\r\n");
      out.write("\t\t\t\t<li> <a href=\"album1.jsp\" target=\"frame1\"><font face=\"幼圆\">相 册</font></a> </li>\r\n");
      out.write("\t\t\t\t<li> <a href=\"SerShowLoge\" target=\"frame1\"><font face=\"幼圆\">日  志</font></a> </li>\r\n");
      out.write("\t\t\t\t<li> <a href=\"SerHandleLy\" target=\"frame1\"><font face=\"幼圆\">留  言</font></a> </li>\r\n");
      out.write("\t\t\t\t<li> <a href=\"SerShowSay\" target=\"frame1\"><font face=\"幼圆\">说  说</font></a> </li>\r\n");
      out.write("\t\t\t\t");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("\t\t\t\t<li> <a href=\"znx.jsp\" target=\"frame1\"><font face=\"幼圆\">邮 件</font></a> </li>");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<li> <a href=\"grd.jsp\" target=\"frame1\"><font face=\"幼圆\">个 人</font></a> </li>\r\n");
      out.write("\t\t\t\t");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("\t\t\t\t<li> <a href=\"SerInitFriends\" target=\"frame1\"><font face=\"幼圆\">好 友</font></a> </li>\t");
} 
      out.write("\t\r\n");
      out.write("\t\t\t  </ul>\r\n");
      out.write("\t\t\t</div>\t\t</td>\r\n");
      out.write("        <td width=\"3%\" height=\"42\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("     <td>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"800\" ><iframe width=\"100%\" height=\"100%\" scrolling=\"no\" id=\"frame1\" name=\"frame1\" align=\"top\" frameborder=\"0\" src=\"centmain.jsp\"></td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("   \r\n");
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
