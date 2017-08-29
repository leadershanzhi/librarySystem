package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;
import com.shxt.szqz.beans.*;

public final class album4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'album4.jsp' starting page</title>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {font-size: 12px}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".ch{border:none;background:url(pictures/photo3fb.jpg);  left top no-repeat;width:58px; height:21px; }\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid #00ffff; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".STYLE4 {font-size: 12px; color: #999999; }\r\n");
      out.write(".STYLE6 {font-size: 12px; color: #000099; }\r\n");
      out.write(".STYLE8 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("   function showfb(i,j){\r\n");
      out.write("      var y=document.getElementById(i);\r\n");
      out.write("      y.rows=\"2\";\r\n");
      out.write("\t  y.value=\"\";\r\n");
      out.write("      var x=document.getElementById(j);\r\n");
      out.write("\t  x.style.display=\"block\";\r\n");
      out.write("\t  \r\n");
      out.write("   }\r\n");
      out.write("   function disshowfb(i,j){\r\n");
      out.write("      var y=document.getElementById(i);\r\n");
      out.write("      y.rows=\"1\";\r\n");
      out.write("\t  y.value=\"我也说一句\";\r\n");
      out.write("      var x=document.getElementById(j);\r\n");
      out.write("\t  x.style.display=\"none\";\r\n");
      out.write("   }\r\n");
      out.write("   function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\" onload=\"framesize()\">\r\n");
      out.write("   <table width=\"70%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#CCCCCC\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("   ");

	   DBUtil db=new DBUtil();
	   String alid="";
	   alid=request.getParameter("albumid");
	   String sqla="select * from qz.albums where albumid='"+alid+"'";
	   List<Map<String, Object>> lista=db.queryToList(sqla);
	   String alname="",btime="",atime="",sum="";
	   for(int k=0;k<lista.size();k++){
		   Map<String, Object> mapa=lista.get(k);
		   alname=mapa.get("ALBUMNAME").toString();
		   btime=mapa.get("BTIME").toString();
		   atime=mapa.get("ATIME").toString();
		   sum=db.getPicSum(alid);
	   }
	   
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"27\" background=\"pictures/photo1.jpg\">\r\n");
      out.write("\t   <!--相册图信息-->\r\n");
      out.write("\t     <table width=\"100%\" border=\"0\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"22%\"><span class=\"STYLE8\">我的相册>");
      out.print(alname );
      out.write("</span></td>\r\n");
      out.write("    <td width=\"42%\" align=\"right\" class=\"STYLE8\">查看方式：</td>\r\n");
      out.write("    <td width=\"22%\">&nbsp;<a href=\"album4.jsp?albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">照片墙</a>&nbsp; \r\n");
      out.write("       <a href=\"album3.jsp?picid=");
      out.print(db.getFirstPicId(alid));
      out.write("\" class=\"STYLE2\">卡片</a>&nbsp; <a href=\"SerChaPic?albumid=");
      out.print(alid );
      out.write("\" class=\"STYLE2\">普通</a>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"14%\"><a href=\"album1.jsp\" class=\"STYLE2\">返回相册首页</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t   <!--相册图信息-->\r\n");
      out.write("\t   \r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"22\">\r\n");
      out.write("\t   <!--相册描述-->\r\n");
      out.write("\t      <table width=\"100%\" height=\"155%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr valign=\"middle\" align=\"right\">\r\n");
      out.write("    <td width=\"13%\" height=\"44\" align=\"left\"><a href=\"SerHandleSC\"><img src=\"pictures/photosc.jpg\" width=\"116\" height=\"28\" /></a></td>\r\n");
      out.write("    <td width=\"19%\" align=\"right\"><span class=\"STYLE2\">共&nbsp;</span><span class=\"STYLE6\"><strong>");
      out.print(sum );
      out.write("</strong></span><span class=\"STYLE2\">&nbsp;张照片</span> </td>\r\n");
      out.write("    <td width=\"17%\" class=\"STYLE2\">上传时间：</td>\r\n");
      out.write("    <td width=\"17%\" class=\"STYLE4\" align=\"center\">");
      out.print(btime );
      out.write("</td>\r\n");
      out.write("    <td width=\"16%\" class=\"STYLE2\">最后上传：</td>\r\n");
      out.write("    <td width=\"18%\" class=\"STYLE4\" align=\"center\">");
      out.print(atime );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t   <!--相册描述-->\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--编写的代码-->\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"60\" cellpadding=\"0\">\r\n");
      out.write("\t   \r\n");
      out.write("\t   ");

	    
        String picid2="";
        String id="";
		String sql="select * from qz.pic where albumid='"+alid+"'";
        List<Map<String,Object>> list=db.queryToList(sql);
        for(int i=0;i<list.size();i++){
        	Map<String,Object> map=list.get(i);
        	id=map.get("PICID").toString();
        	String time=map.get("PICTIME").toString();
        	String picname=map.get("PICNAME").toString();
        	String picsm=map.get("PICSM").toString();
        	if(i==0){
        		picid2=id;
        	}
        	String picn=map.get("PICSOURSE").toString();
       
      out.write("\r\n");
      out.write("  <!--一个图片的循环2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=\"album3.jsp?picid=");
      out.print(id );
      out.write("\"><img src=\"");
      out.print(picn );
      out.write("\" width=\"750\" height=\"550\" /></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"9%\"><span class=\"STYLE1\">照片名：</span></td>\r\n");
      out.write("        <td width=\"16%\"><span class=\"STYLE2\">");
      out.print(picname );
      out.write("</span></td>\r\n");
      out.write("        <td width=\"7%\" class=\"STYLE1\">描述：</td>\r\n");
      out.write("        <td width=\"35%\" class=\"STYLE2\">");
      out.print(picsm );
      out.write("</td>\r\n");
      out.write("        <td width=\"9%\" class=\"STYLE1\">上传时间：</td>\r\n");
      out.write("        <td width=\"24%\" class=\"STYLE4\">");
      out.print(time );
      out.write(" </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><hr width=\"100%\" size=\"1\" color=\"#CCCCCC\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--单个循环的第三部分1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-->\r\n");
      out.write("\t  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--回复的循环4444444444444444444444444444444444444444444444444-->\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><!--需要循环-->\r\n");
      out.write("\t   \r\n");
      out.write("\t   ");

	   String sql3="select * from qz.picres where picid='"+id+"' order by time desc";
	   List<Map<String,Object>> list3=db.queryToList(sql3);
	   for(int j=0;j<list3.size();j++){
		   Map<String,Object> map3=list3.get(j);
		   String a=map3.get("RESPERSON").toString();
		   String b=map3.get("RESCONTENT").toString();
		   String c=map3.get("TIME").toString();
		   String d=map3.get("PICRESID").toString();
		   UserBean u=new InitUser().getUser(a);
	
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"7%\" rowspan=\"2\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"47\" height=\"43\" /></td>\r\n");
      out.write("    <td width=\"13%\" height=\"23\"><span class=\"STYLE6\">");
      out.print(u.getUsername() );
      out.write("：</span></td>\r\n");
      out.write("    <td width=\"80%\"><span class=\"STYLE2\">");
      out.print(b );
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\"><span class=\"STYLE4\">");
      out.print(c );
      out.write(" </span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td><font color=\"#CCCCCC\">——————————————</font></td></tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <!--需要循环-->\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t   \r\n");
      out.write("\t<!--回复的循环4444444444444444444444444444444444444444444444444-->\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--评论组件5555555555555555555555555555555555555555555555555555555555-->\r\n");
      out.write("     <form method=\"post\" action=\"SerHandlePicRes?tag=album4\">\r\n");
      out.write("\t    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30px\">\r\n");
      out.write("       <input type=\"hidden\" name=\"albumid\" value=\"");
      out.print(alid );
      out.write("\"/>\r\n");
      out.write("\t   <textarea id=\"");
      out.print(i+1000 );
      out.write("\" name=\"content\" cols=\"100%\" rows=\"1\" class=\"area\" onfocus=\"showfb(");
      out.print(i+1000 );
      out.write(',');
      out.print(i+2000 );
      out.write(")\" style=\"height:18px\">我也说一句</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("    <input type=\"hidden\" name=\"picid\" value=\"");
      out.print(id );
      out.write("\"/>\r\n");
      out.write("    <div id=\"");
      out.print(i+2000 );
      out.write("\" style=\"display:none\"><input type=\"submit\" value=\"\" class=\"ch\" />&nbsp;<a href=\"javascript:void(0)\" class=\"STYLE2\" onclick=\"disshowfb(");
      out.print(i+1000 );
      out.write(',');
      out.print(i+2000 );
      out.write(")\">取消</a></div>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t<!--评论组件5555555555555555555555555555555555555555555555555555555555-->\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!--单个循环的第三部分1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-->\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\r\n");
      out.write("  </tr><!--一个图片的循环222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222-->\r\n");
      out.write("  \r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\t<!--编写的代码-->\r\n");
      out.write("\t</td>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
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
