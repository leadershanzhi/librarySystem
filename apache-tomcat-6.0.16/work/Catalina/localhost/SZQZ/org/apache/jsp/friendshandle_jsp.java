package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class friendshandle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'friendshandle.jsp' starting page</title>\r\n");
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
      out.write("\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".cx{border:none;background:url(pictures/friendbutton.jpg);  left top no-repeat;width:94px; height:32px; }\r\n");
      out.write(".qd{border:none;background:url(pictures/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }\r\n");
      out.write(".STYLE2 {color: #999999;font-size: 12px;}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tcolor: #3366FF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE6 {font-size: 14px;font-weight: bold;}\r\n");
      out.write(".STYLE16 {font-size: 12px;}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("   function ys(){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tvar url=\"SerHandleFriends?tag=tt&p=\"+x;\r\n");
      out.write("\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");

        DBUtil db=new DBUtil();
        String benren=request.getParameter("ben");
        PageBean p=(PageBean)request.getAttribute("page");
        int sum=p.getRows();
        int pages=p.getPages();
        int now=p.getPagenow();
        
      out.write("\r\n");
      out.write("   <table width=\"70%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"75\"><table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"pictures/friendhead.jpg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"15\" colspan=\"3\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<form  method=\"post\" action=\"SerHandleFriends?tag=acc\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"66\" align=\"right\"><span class=\"STYLE1\">账号：</span></td>\r\n");
      out.write("        <td width=\"44%\">\r\n");
      out.write("          <input name=\"account\" type=\"text\" size=\"50\" style=\"height:28px\"/>\r\n");
      out.write("       \r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"36%\"><input type=\"submit\" value=\"\" class=\"cx\" /><span class=\"STYLE6\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;<a href=\"SerHandleFriends?tag=my\">我的好友</a>\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;<a href=\"SerHandleFriends?tag=intro\">推荐好友</a></span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t   </form>\r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("\t   <form  method=\"post\" action=\"SerHandleFriends?tag=name\">\r\n");
      out.write("\t   \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"52\" align=\"right\" class=\"STYLE1\">昵称：</td>\r\n");
      out.write("        <td><input name=\"name\" type=\"text\" size=\"50\" style=\"height:28px\"/></td>\r\n");
      out.write("        <td><input type=\"submit\" value=\"\" class=\"cx\" /><span class=\"STYLE6\">\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;<a href=\"SerHandleFriends?tag=auto\">动态好友</a>\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;<a href=\"SerHandleFriends?tag=add\">陌生好友</a></span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  </form>\r\n");
      out.write("\t   <tr>\r\n");
      out.write("        <td height=\"20\" colspan=\"3\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"15\" valign=\"top\"><hr width=\"100%\" color=\"#0000FF\" size=\"3\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--好友表格-->\r\n");
      out.write("    ");

	  List<Map<String, Object>> list=(List<Map<String, Object>>)p.getResult();
	    String u1="",u2="",u3="",u4="",u5="",u6="";
	    for(int i=0;i<list.size();i++){
	    	Map<String, Object> map=list.get(i);
	    	u1=map.get("USERID").toString();
		  	u2=map.get("USERNAME").toString();
		  	u3=map.get("HOME").toString();
		  	u4=map.get("BIRTH").toString();
		  	u5=map.get("USERNOTE").toString();
		  	u6=map.get("UPICNAME").toString();
	  
      out.write("\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"18%\" height=\"38\" align=\"right\"> <img src=\"");
      out.print(u6 );
      out.write("\" width=\"65\" height=\"60\" /></td>\r\n");
      out.write("    <td width=\"82%\">\r\n");
      out.write("\t   <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"60%\"><span class=\"STYLE3\">&nbsp;");
      out.print(u2 );
      out.write('（');
      out.print(u1 );
      out.write("） </span> </td>\r\n");
      out.write("    <td width=\"10%\"><a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=fx\"><img src=\"pictures/receive1.jpg\"/></a></td>\r\n");
      out.write("    ");

       String state=db.getState(benren,u1);
          if("1".equals(state)){
      out.write("\r\n");
      out.write("          \r\n");
      out.write("    \t   <td width=\"30%\"><span class=\"STYLE16\"><a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=changeqz\" target=\"_top\">进入好友空间</a>&nbsp;&nbsp;&nbsp;<a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=delfri\">解除关系</a></span></td>\r\n");
      out.write("    \t   \r\n");
      out.write("      ");
  }else if("3".equals(state)){
      out.write("\r\n");
      out.write("      \r\n");
      out.write("           <td width=\"30%\"><span class=\"STYLE16\"><a href=\"javascript:void(0)\">我的空间</a></span></td>\r\n");
      out.write("           \r\n");
      out.write("      ");
  }else if("22".equals(state)){
      out.write("\r\n");
      out.write("      \r\n");
      out.write("           <td width=\"30%\"><span class=\"STYLE16\"><a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=rece\">接受对方好友请求</a>&nbsp;&nbsp;&nbsp;<a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=deny\">忽略</a></span></td>\r\n");
      out.write("           \r\n");
      out.write("      ");
 }else if("2".equals(state)){
      out.write("\r\n");
      out.write("      \r\n");
      out.write("           <td width=\"30%\"><span class=\"STYLE16\"><a href=\"javascript:void(0)\">等待好友接受请求</a>&nbsp;&nbsp;&nbsp;<a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=cancle\">取消</a></span></td>\r\n");
      out.write("           \r\n");
      out.write("      ");
 }else{
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    \t   <td width=\"30%\"><span class=\"STYLE16\"><a href=\"SerMakeFriends?fri2=");
      out.print(u1 );
      out.write("&tag=add\">添加好友</a></span></td>\r\n");
      out.write("    \t   \r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"17\" colspan=\"3\"><span class=\"STYLE5\">&nbsp;&nbsp;");
      out.print(u3 );
      out.write(" &nbsp;&nbsp; ");
      out.print(u4 );
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\"><img src=\"pictures/star.jpg\" width=\"21\" height=\"17\" /><span class=\"STYLE2\">");
      out.print(u5 );
      out.write(" </span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("     <td colspan=\"2\" align=\"center\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--好友表格-->\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td height=\"10\" ><hr width=\"100%\" color=\"#0000FF\" size=\"3\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"34%\" align=\"right\" class=\"STYLE4\">共（");
      out.print(sum );
      out.write("）记录&nbsp;/共（");
      out.print(pages );
      out.write("）页&nbsp;/ 当前第（");
      out.print(now );
      out.write("）页</td>\r\n");
      out.write("    <td width=\"24%\" align=\"center\"><a href=\"SerHandleFriends?p=before\" class=\"STYLE4\">上一页</a></td>\r\n");
      out.write("    <td width=\"16%\" align=\"center\"><a href=\"SerHandleFriends?p=last\" class=\"STYLE4\">下一页</a></td>\r\n");
      out.write("    <td width=\"14%\"><span class=\"STYLE4\">转到</span>\r\n");
      out.write("        <input id=\"djy\" type=\"text\" size=\"2\" />\r\n");
      out.write("      \r\n");
      out.write("        <span class=\"STYLE4\">页</span></td>\r\n");
      out.write("\t<td width=\"12%\"><input type=\"submit\" value=\"\" class=\"qd\" onclick=\"ys()\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"10\" ><hr width=\"100%\" color=\"#0000FF\" size=\"3\" /></td>\r\n");
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
