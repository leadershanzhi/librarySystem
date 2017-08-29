package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class album2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'album2.jsp' starting page</title>\r\n");
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
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {font-size: 12px}\r\n");
      out.write(".STYLE3 {font-size: 12px}\r\n");
      out.write(".STYLE5 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  function ys(i){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tvar url=\"SerChaPic?tag=tt&p=\"+x+\"&albumid=\"+i;\r\n");
      out.write("\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"pictures/logebg1.jpg\">\r\n");

        String alid="";
        List<Map<String,Object>> list=null;
        DBUtil db=new DBUtil();
        PageBean p=(PageBean)request.getAttribute("page");
        int sum=p.getRows();
        int pages=p.getPages();
        int now=p.getPagenow();
        alid=request.getAttribute("albumid").toString();
        list=(List<Map<String, Object>>)p.getResult();
        
      out.write("\r\n");
      out.write("   <table width=\"70%\" height=\"419\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"27\" background=\"pictures/photo1.jpg\">\r\n");
      out.write("\t    <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"18%\" height=\"16\" align=\"center\"><span class=\"STYLE1\">我的相册&gt; ");
      out.print(db.getPicName(alid) );
      out.write(" </span></td>\r\n");
      out.write("    ");

        if(list.size()!=0){
      out.write("\r\n");
      out.write("           <td width=\"42%\" align=\"right\" class=\"STYLE1\">查看方式：</td>\r\n");
      out.write("           <td width=\"22%\">&nbsp;<a href=\"album4.jsp?albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">照片墙</a>&nbsp; \r\n");
      out.write("                <a href=\"album3.jsp?picid=");
      out.print(db.getFirstPicId(alid));
      out.write("\" class=\"STYLE2\">卡片</a>&nbsp; <a href=\"SerChaPic?albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">普通</a>\r\n");
      out.write("           </td>\t\r\n");
      out.write("      ");
}else{ 
      out.write("\r\n");
      out.write("           <td width=\"42%\" >&nbsp;</td>\r\n");
      out.write("           <td width=\"22%\">&nbsp; </td>\t\r\n");
      out.write("      ");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <td width=\"20%\"><a href=\"album1.jsp\" class=\"STYLE2\">返回相册首页</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"45\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"16%\" height=\"41\" align=\"right\">\r\n");
      out.write("        ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("        <a href=\"SerHandleSC\"><img src=\"pictures/photosc.jpg\" width=\"116\" height=\"28\" /></a>");
} 
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"29%\">&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("        <td width=\"25%\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td><hr width=\"100%\" size=\"2\" color=\"#CCCCCC\" /></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td ><!--照片遍历-->\r\n");
      out.write("    \r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"15\" cellpadding=\"0\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

        if(list.size()==0){
        	if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
        	   out.print("<div align='center'><font face='幼圆'>相册内还没有照片,<a href='SerHandleSC'>马上去上传照片</a></font></div>");
        	}else{
        	   out.print("<div align='center'><font face='幼圆'>好友未上传图片至此相册</font></div>");
        	}
        }
        for(int i=0;i<list.size();i++){
        	Map<String,Object> map=list.get(i);
        	String picid=map.get("PICID").toString();
        	String pic=map.get("PICSOURSE").toString();
        	String picname=map.get("PICNAME").toString();
            if(i%4==0){
      out.write("\r\n");
      out.write("            \t<tr>\r\n");
      out.write("          ");
 }
      out.write("  \r\n");
      out.write("          <td height=\"120\" valign=\"top\">\r\n");
      out.write("\t\t     <!--单个图片-->\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t    <table width=\"100%\" height=\"101\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t    <td height=\"110\" align=\"center\"><a href=\"album3.jsp?picid=");
      out.print(picid );
      out.write("\" target=\"frame1\"><img src=\"");
      out.print(pic );
      out.write("\" width=\"160\" height=\"150\"/></a></td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t    <td height=\"10\" align=\"center\"><span class=\"STYLE3\">");
      out.print(picname );
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("           \r\n");
      out.write("         <!--单个图片-->\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t   ");
 if((i+1)%4==0){
      out.write("\r\n");
      out.write("\t\t       </tr>\r\n");
      out.write("\t\t       ");
} 
      out.write("\r\n");
      out.write("\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("</table>\r\n");
      out.write("<tr><td><hr width=\"100%\" color=\"#CCCCCC\" size=\"2\" /></td></tr>\r\n");
      out.write("  <tr><td>\r\n");
      out.write("     <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td width=\"38%\"><span class=\"STYLE5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本相册共(");
      out.print(sum );
      out.write(")张&nbsp;/共(");
      out.print(pages );
      out.write(")页&nbsp;/当前第(");
      out.print(now );
      out.write(")页</span></td>\r\n");
      out.write("\t\t    <td width=\"24%\"><a href=\"SerChaPic?p=before&albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">上一页</a>&nbsp;&nbsp;&nbsp;<a href=\"SerChaPic?p=last&albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">下一页</a></td>\r\n");
      out.write("\t\t    <td width=\"24%\" align=\"right\"><span class=\"STYLE5\">转到</span>&nbsp;\r\n");
      out.write("\t\t      <input type=\"text\" id=\"djy\" size=\"2\" style=\"height:18px\"/>&nbsp;\r\n");
      out.write("\t\t      <span class=\"STYLE5\">页</span></td>\r\n");
      out.write("\t\t    <td width=\"14%\" align=\"center\"><img src=\"pictures/lyqd.jpg\" width=\"48\" height=\"19\" onclick=\"ys(");
      out.print(alid );
      out.write(")\"/></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("  </td></tr>\r\n");
      out.write("<tr><td><hr width=\"100%\" color=\"#CCCCCC\" size=\"2\" /></td></tr>\r\n");
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
