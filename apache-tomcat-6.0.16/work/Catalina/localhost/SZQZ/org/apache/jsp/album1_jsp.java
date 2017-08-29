package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class album1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'album1.jsp' starting page</title>\r\n");
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
      out.write(".qd{border:none;background:url(pictures/logsure.jpg);  left top no-repeat;width:45px; height:19px; }\r\n");
      out.write(".te { border:1px solid #3399ff; height:20px;right 3px no-repeat;}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE22 {font-size: 12px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  function show(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function showxg(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function disshowxg(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function disshow(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function showcc(){\r\n");
      out.write("     var x=document.getElementById(\"cc\");\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("    function denycc(){\r\n");
      out.write("     var x=document.getElementById(\"cc\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write(" function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write(" function del(i){ \r\n");
      out.write("\t var x=confirm(\"您确定要删除此相册的信息?删掉后不可恢复\");\r\n");
      out.write("\t if(x==true){\r\n");
      out.write("\t\t var url=\"SerHandleAlbum?tag=del&albumid=\"+i;\r\n");
      out.write("\t     window.location.href=url;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write(" }\r\n");
      out.write(" function handlePW(i){\r\n");
      out.write("\t var x=prompt(\"密保问题:我的姓名是?\");\r\n");
      out.write("\t if(x==\"shanzhi\"){\r\n");
      out.write("\t\t window.location.href=\"SerChaPic?albumid=\"+i;\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t alert(\"回答错误,您无法查看此相册!\");\r\n");
      out.write("\t }\r\n");
      out.write(" }\r\n");
      out.write(" function nopic(){\r\n");
      out.write("\t alert(\"好友未上传图片至此相册\");\r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\" onload=\"framesize()\">\r\n");
      out.write("<table width=\"70%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"32\" background=\"pictures/photo1.jpg\">&nbsp;&nbsp;<span class=\"STYLE2\">相册</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("    <td width=\"14%\" height=\"51\" valign=\"middle\" align=\"right\"><a href=\"SerHandleSC\"><img src=\"pictures/photosc.jpg\" width=\"116\" height=\"28\" /></a></td>\r\n");
      out.write("    <td width=\"14%\" valign=\"middle\">\r\n");
      out.write("    \r\n");
      out.write("    &nbsp;<img src=\"pictures/photoadd.jpg\" width=\"14\" height=\"15\" /><span class=\"STYLE1\"><a href=\"javascript:void(0)\" onclick=\"showcc()\">创建相册</a></span>");
} 
      out.write("</td>\r\n");
      out.write("    \r\n");
      out.write("       <!-- 新加代码 -->\r\n");
      out.write("          <form method=\"post\" action=\"SerHandleSC\">\r\n");
      out.write("\t\t\t\t\t<td width=\"72%\">\r\n");
      out.write("\t\t\t\t\t <div id=\"cc\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t     <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t <td width=\"14%\" class=\"STYLE22\" align=\"right\" height=\"40\">相册名：</td>\r\n");
      out.write("\t\t\t\t\t <td width=\"40%\"><input type=\"text\" size=\"20\" maxlength=\"10\" style=\"height:20\" name=\"name\"/>\r\n");
      out.write("\t\t\t\t\t   &nbsp;<select name=\"pubpri\">\r\n");
      out.write("\t\t\t\t\t      <option>公开</option>\r\n");
      out.write("\t\t\t\t\t      <option>保密</option>\r\n");
      out.write("\t\t\t\t\t   </select>\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t </td>\r\n");
      out.write("\t\t\t\t\t <td width=\"46%\" valign=\"middle\"><input type=\"submit\" value=\"\" class=\"qd\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t <input type=\"hidden\" name=\"tag\" value=\"addxcc\">\r\n");
      out.write("\t\t\t\t\t <span class=\"STYLE22\"><a href=\"javascript:void(0)\" onclick=\"denycc()\">取消</a></span></td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t</table>\t\t \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("       <!-- 新加代码 -->\r\n");
      out.write("   \r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"100\"><table width=\"100%\" height=\"182\" border=\"1\" cellpadding=\"4\" cellspacing=\"20\" bordercolor=\"#9966FF\">\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("        ");

        String used=request.getSession().getAttribute("userid").toString();
        DBUtil db=new DBUtil();
        String sql="select * from qz.albums where userid='"+used+"'";
        List<Map<String,Object>> list=db.queryToList(sql);
        if(list.size()==0){
        	if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
        		out.print("<br/><br/><p align=center><font face=幼圆 >您当前没有图片信息,<a href='javascript:void(0)' onclick='showcc()'>去创建第一个相册</a></font></p><br/><br/>");
        	}else{
        		out.print("<br/><br/><p align=center><font face=幼圆 >好友未创建相册信息</font></p><br/><br/>");
        	}
        	
        }
        for(int i=0;i<list.size();i++){
        	Map<String,Object> map=list.get(i);
        	String a=map.get("ALBUMID").toString();
        	String b=map.get("USERID").toString();
        	String c=map.get("ALBUMNAME").toString();
        	String d=map.get("PICNAME").toString();
        	String e=map.get("BTIME").toString();
        	String f=map.get("ATIME").toString(); 
        	String g=map.get("PRIORITY").toString();
        	String sum=db.getPicSum(a);
        	int summ=Integer.parseInt(sum);
        	if(summ!=0 && d.length()==0){
        		String id=db.getFirstPicId(a);
        		String sourse=db.getPicSourse(id);
        		String sql3="update qz.albums set picname='"+sourse+"' where albumid='"+a+"'";
	    		db.update(sql3);
        	}
        	if(i%4==0){
      out.write("\r\n");
      out.write("        \t<tr>\r\n");
      out.write("      ");
 }
      out.write("  \t  \r\n");
      out.write("\t\t</td>\r\n");
      out.write("        \r\n");
      out.write("        <td><table width=\"80%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"115\" align=\"center\" bordercolor=\"#0000FF\">\r\n");
      out.write("               ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                        <a href=\"SerChaPic?albumid=");
      out.print(a );
      out.write("\">\r\n");
      out.write("                  ");
 if(summ!=0){
      out.write("\r\n");
      out.write("            \t     <img src=\"");
      out.print(d );
      out.write("\" width=\"130\" height=\"140\"/>  \r\n");
      out.write("            \t  \r\n");
      out.write("            \t   ");
}else{ 
      out.write("   \r\n");
      out.write("                     \r\n");
      out.write("            \t       <img src=\"pictures/nopicture.jpg\" width=\"130\" height=\"140\"/> \r\n");
      out.write("            \t   ");
} 
      out.write("  \r\n");
      out.write("            \t        \r\n");
      out.write("                       </a>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 ");
}else{
      out.write("\r\n");
      out.write("                      ");
if(g.equals("0")){ 
      out.write("\r\n");
      out.write("                        <a href=\"javascript:void(0)\" onclick=\"handlePW(");
      out.print(a );
      out.write(")\">\r\n");
      out.write("            \t         <img src=\"pictures/pwpw.jpg\" width=\"130\" height=\"140\"/>   \r\n");
      out.write("            \t        </a>\r\n");
      out.write("            \t      ");
}else{ 
      out.write("   \r\n");
      out.write("                            \r\n");
      out.write("                            ");
 if(summ!=0){
      out.write("\r\n");
      out.write("                               <a href=\"SerChaPic?albumid=");
      out.print(a );
      out.write("\">\r\n");
      out.write("            \t               <img src=\"");
      out.print(d );
      out.write("\" width=\"130\" height=\"140\"/>  \r\n");
      out.write("            \t               </a>\r\n");
      out.write("            \t            ");
}else{ 
      out.write("   \r\n");
      out.write("                                <a href=\"javascript:void(0)\" onclick=\"nopic()\">\r\n");
      out.write("            \t                <img src=\"pictures/nopicture.jpg\" width=\"130\" height=\"140\"/> \r\n");
      out.write("            \t                </a>\r\n");
      out.write("            \t            ");
} 
      out.write(" \r\n");
      out.write("                            \r\n");
      out.write("                       \r\n");
      out.write("                       \r\n");
      out.write("                         \r\n");
      out.write("            \t      ");
} 
      out.write("\r\n");
      out.write("                 ");
} 
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"25\" class=\"STYLE1\" align=\"center\">&nbsp;<strong>");
      out.print(c );
      out.write('(');
      out.print(sum );
      out.write(")</strong></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("\t\t\t<td onmouseover=\"show(");
      out.print(i );
      out.write(")\" onmouseout=\"disshow(");
      out.print(i );
      out.write(")\" height=\"20\" align=\"center\"><div id=\"");
      out.print(i );
      out.write("\" style=\"display:none\">&nbsp;<a href=\"javascript:void(0)\" class=\"STYLE1\" onclick=\"showxg(");
      out.print(i+100);
      out.write(")\">编辑</a>&nbsp;<a href=\"javascript:void(0)\" class=\"STYLE1\" onclick=\"del(");
      out.print(a );
      out.write(")\">删除</a></div></td>\r\n");
      out.write("\t\t    ");
} 
      out.write("\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <form action=\"SerHandleAlbum?tag=alter&albumid=");
      out.print(a );
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t  <tr id=\"");
      out.print(i+100);
      out.write("\" style=\"display:none\">\r\n");
      out.write("\t\t\t<td align=\"center\">&nbsp;<input type=\"text\" name=\"aname\" size=\"10\" value=\"");
      out.print(c );
      out.write("\" style=\"height:20px\"/>\r\n");
      out.write("\t\t\t<select name=\"pubpri\">\r\n");
      out.write("\t\t\t\t\t      <option>公开</option>\r\n");
      out.write("\t\t\t\t\t      <option>保密</option>\r\n");
      out.write("\t\t\t\t\t   </select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"\" class=\"qd\" class=\"te\"/>\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"STYLE1\" onclick=\"disshowxg(");
      out.print(i+100);
      out.write(")\">取消</a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  </form>\r\n");
      out.write("        </table>\t  </td>\r\n");
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
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  \r\n");
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
