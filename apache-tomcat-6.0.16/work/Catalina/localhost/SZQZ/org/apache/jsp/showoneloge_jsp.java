package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;
import com.shxt.szqz.beans.*;

public final class showoneloge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'showoneloge.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  a { text-decoration: none}\r\n");
      out.write("  a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"黑体\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {font-size: 12px; color: #0033FF; }\r\n");
      out.write(".STYLE6 {font-size: 12px; font-weight: bold; }\r\n");
      out.write(".STYLE8 {font-size: 12px; color: #0000FF; }\r\n");
      out.write(".STYLE10 {font-size: 12px; color: #999999; }\r\n");
      out.write(".ch{border:none;background:url(pictures/liuyan1.jpg);  left top no-repeat;width:70px; height:28px; }\r\n");
      out.write(".hf{border:none;background:url(pictures/logsure.jpg);  left top no-repeat;width:46px; height:20px; }\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid #0099FF; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  function change1(){\r\n");
      out.write("     var s=document.getElementById(\"area\");\r\n");
      out.write("\t s.rows=\"3\";\r\n");
      out.write("\t s.value=\"\";\r\n");
      out.write("\t var x=document.getElementById(\"tj\");\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function change2(){\r\n");
      out.write("     var s=document.getElementById(\"area\");\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t s.value=\"我也说一句\";\r\n");
      out.write("\t var x=document.getElementById(\"tj\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function change3(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"2\";\r\n");
      out.write("\t s.value=\"\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function change4(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t s.value=\"我也说一句\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\" onload=\"framesize()\">\r\n");
      out.write("   <table width=\"70%\" border=\"1\" cellspacing=\"0\" align=\"center\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"85%\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/logonew.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"86%\" height=\"29\">&nbsp;</td>\r\n");
      out.write("    <td width=\"14%\"><a href=\"SerShowLoge\" target=\"frame1\" class=\"STYLE1\">返回日志列表</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("   ");

    request.setCharacterEncoding("gbk");
    String a="",b="",c="",d="",e="",f="";
    String id=request.getParameter("id");
    List<Map<String, Object>> list=(List<Map<String, Object>>)request.getAttribute("list");
    for(int i=0;i<list.size();i++){
    	Map<String, Object> map= list.get(i);
    	a=map.get("LOGTOPIC").toString();
    	b=map.get("LOGCONTENT").toString();
    	c=map.get("LOGTIME").toString();
    	d=map.get("PRIORITY").toString();
    	e=map.get("LOGALTERTIME").toString();
    	f=map.get("LOGID").toString();
    }

      out.write("\r\n");
      out.write("    <td height=\"44\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"28%\" height=\"37\" valign=\"bottom\"><span class=\"STYLE2\">");
      out.print(a );
      out.write("</span></td>\r\n");
      out.write("        <td width=\"26%\" valign=\"bottom\"><span class=\"STYLE4\">");
      out.print(c );
      out.write(' ');
      out.write('(');
      out.print(d );
      out.write(")</span> </td>\r\n");
      out.write("        ");

                 if(request.getSession().getAttribute("userid")!=request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("        <td width=\"46%\" align=\"left\" valign=\"bottom\"><a href=\"SerAddLog?tag=zhuan&logid=");
      out.print(f );
      out.write("\" class=\"STYLE1\">转载</a></td>\r\n");
      out.write("        ");
}else{ 
      out.write("\r\n");
      out.write("              <td width=\"46%\" align=\"left\" valign=\"bottom\">&nbsp;</td>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr><td colspan=\"3\"><hr width=\"58%\" color=\"#00ffff\" align=\"left\"/></td></tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"99\"><table width=\"100%\" height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"15\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"70\">\r\n");
      out.write("\t\t <!--放内容的-->\r\n");
      out.write("\t\t <table width=\"100%\" height=\"60\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#99CCFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"58\">");
      out.print(b );
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\t\t<!--放内容的--></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td height=\"4\"><hr width=\"100%\" size=\"2\" color=\"#00ffff\" /></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"122\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\"><span class=\"STYLE6\">本文最近访客</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr><td height=\"4\"><hr width=\"7%\" size=\"2\" color=\"#00ffff\" align=\"left\"/></td></tr>\r\n");
      out.write("      <tr><td height=\"4\">&nbsp;</td></tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("          \r\n");
      out.write("          ");

                        int listfkk=0;
                        String userid=request.getSession().getAttribute("userid").toString();
                        UserBean uu=new InitUser().getUser(userid);
				        List<Map<String, Object>> listfk=uu.getLogFK(f);
				        listfkk=listfk.size();
				        for(int fk=0;fk<listfkk;fk++){
				        	Map<String, Object> mapfk=listfk.get(fk);
				        	String guest=mapfk.get("GUEST").toString();
				        	UserBean ufk=new InitUser().getUser(guest);
				        	String time=mapfk.get("TIME").toString().substring(5,16);
				        
      out.write("\r\n");
      out.write("\t\t\t\t        <td>\r\n");
      out.write("\t\t   <table width=\"80\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"49\" align=\"left\" valign=\"middle\"><img src=\"");
      out.print(ufk.getUpicname() );
      out.write("\" width=\"64\" height=\"58\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><span class=\"STYLE8\">");
      out.print(ufk.getUsername() );
      out.write("</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"STYLE8\">");
      out.print(time );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("\t\t  ");
} 
      out.write("\r\n");
      out.write("\t\t  ");

		    for(int fk=0;fk<5-listfkk;fk++){
      out.write("\r\n");
      out.write("\t        \r\n");
      out.write("\t        <td>\r\n");
      out.write("\t          <table width=\"80\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr><td rowspan=\"3\">&nbsp;</td></tr>\r\n");
      out.write("             </table>\r\n");
      out.write("\t           </td>\r\n");
      out.write("\t\t     ");
} 
      out.write("\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td height=\"4\"><hr width=\"100%\" size=\"2\" color=\"#00ffff\" /></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"27\" class=\"STYLE6\">评论列表</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td><hr width=\"7%\" color=\"#00ffff\" align=\"left\"/></td></tr>\r\n");
      out.write("  <tr><td>&nbsp;</td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"67\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

           DBUtil db=new DBUtil();
    request.setCharacterEncoding("gbk");
    String a1="",a11="",b1="",c1="",d1="",e1="";
    String id1=request.getParameter("id");
    List<Map<String, Object>> comlist=(List<Map<String, Object>>)request.getAttribute("comlist");
    int size=comlist.size();
    for(int i=0;i<size;i++){
    	Map<String, Object> map= comlist.get(i);
    	a1=map.get("COMPERSON").toString();
    	UserBean u1=new InitUser().getUser(a1);
    	b1=map.get("COMCONTENT").toString();
    	c1=map.get("COMTIME").toString();
    	d1=map.get("COMID").toString();
    	e1=map.get("LOGID").toString(); 
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("    <!--一条回复的循环-->\r\n");
      out.write("\t  <table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"15%\" height=\"122\" valign=\"top\" align=\"center\" ><img src=\"");
      out.print(u1.getUpicname() );
      out.write("\" width=\"81\" height=\"76\" /><p align=\"center\" class=\"STYLE1\">");
      out.print(size-i );
      out.write("楼</p></td>\r\n");
      out.write("        <td width=\"85%\"><table width=\"100%\" height=\"150\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"31\"><table width=\"100%\" height=\"27\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"13%\" height=\"25\" class=\"STYLE1\"><strong>评论好友：</strong></td>\r\n");
      out.write("                <td width=\"25%\" class=\"STYLE10\">");
      out.print(u1.getUsername() );
      out.write("</td>\r\n");
      out.write("                <td width=\"46%\" class=\"STYLE4\">");
      out.print(c1 );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td width=\"16%\"><a href=\"javascript:void(0)\" onfocus=\"change3(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\" class=\"STYLE1\">回复</a>\r\n");
      out.write("\t\t\t\t      &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t      ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("\t\t\t\t      <a href=\"SerHandleCom?tag=del&logid=");
      out.print(e1 );
      out.write("&comid=");
      out.print(d1 );
      out.write("\" class=\"STYLE1\">删除</a>");
} 
      out.write("\r\n");
      out.write("\t\t\t\t      </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><table width=\"100%\" height=\"23\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"13%\" class=\"STYLE6\">评论内容：</td>\r\n");
      out.write("                <td width=\"87%\" class=\"STYLE10\">");
      out.print(b1 );
      out.write("</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><td>&nbsp;</td></tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"43\">\r\n");
      out.write("            ");

	                                       
							    String r1="",r2="",r3="",r4="",r5="",r55="";
							    String sql1="select * from qz.responses where comid=?";
							   
							    Object obj1[]={d1};
							    List<Map<String, Object>> reslist=db.queryToList(sql1,obj1);
							    for(int j=0;j<reslist.size();j++){
							    	Map<String, Object> rmap= reslist.get(j);
							    	r1=rmap.get("RESID").toString();
							    	r3=rmap.get("RESTIME").toString();
							    	r4=rmap.get("RESCONTENT").toString();
							    	r5=rmap.get("RESPERSON").toString();
							    	UserBean u2=new InitUser().getUser(r5);
							    	
							 
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("            <!--回复的循环-->\r\n");
      out.write("\t\t\t   <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"23\"><table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"13%\" height=\"26\" valign=\"middle\" align=\"center\"><img src=\"");
      out.print(u2.getUpicname() );
      out.write("\" width=\"61\" height=\"53\" /></td>\r\n");
      out.write("        <td width=\"87%\"><table width=\"100%\" height=\"21%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"17%\" height=\"22\" class=\"STYLE6\">");
      out.print(u2.getUsername() );
      out.write("</td>\r\n");
      out.write("            <td width=\"73%\" class=\"STYLE10\">");
      out.print(r4 );
      out.write(" </td>\r\n");
      out.write("            <td width=\"10%\" class=\"STYLE1\">\r\n");
      out.write("              ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("              <a href=\"SerHandleRes?logid=");
      out.print(f );
      out.write("&resid=");
      out.print(r1 );
      out.write("&tag=del\">删除</a>");
} 
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"28\" class=\"STYLE6\">回复时间：</td>\r\n");
      out.write("            <td class=\"STYLE4\" >");
      out.print(r3 );
      out.write("</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"4\"><font color=\"#00ffff\">—— —— —— —— —— —— —— ——</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t<!--回复的循环-->\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"42\"><!--回复组件-->\r\n");
      out.write("\t\t\t   <form action=\"SerHandleRes?comid=");
      out.print(d1 );
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"27\">\r\n");
      out.write("\t   <textarea name=\"area2\" class=\"area\" cols=\"40\" rows=\"1\" id=\"");
      out.print(i );
      out.write("\" onfocus=\"change3(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\">我也说一句</textarea>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t  <div id=\"");
      out.print(i-100 );
      out.write("\" align=\"left\" style=\"display:none\" >\r\n");
      out.write("                                                    <input type=\"hidden\" name=\"logid\" value=\"");
      out.print(f );
      out.write("\">\r\n");
      out.write("                                                    <input  type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("                                                   &nbsp;&nbsp; <a href=\"javascript:void(0)\" class=\"STYLE1\" onclick=\"change4(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\">取消</a> </div>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--回复组件-->\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t<p><font color=\"#cccccc\">—— —— —— —— —— ——</font></p>\r\n");
      out.write("\t<!--一条回复的循环-->\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td height=\"4\"><hr width=\"100%\" size=\"2\" color=\"#00ffff\" /></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t<form action=\"SerHandleCom\" method=\"post\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"STYLE6\">发表评论</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr><td><hr width=\"7%\" color=\"#00ffff\" align=\"left\"/></td></tr>\r\n");
      out.write("      <tr><td>&nbsp;</td></tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"29\">\r\n");
      out.write("\t\t   <textarea name=\"comarea\" class=\"area\" cols=\"65\" rows=\"1\" id=\"area\" onfocus=\"change1()\" >我也说一句</textarea>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("\t\t  <input type=\"hidden\" name=\"logid\" value=\"");
      out.print(f );
      out.write("\">\r\n");
      out.write("\t\t\t    <div id=\"tj\" align=\"left\" style=\"display:none\">\r\n");
      out.write("                   <input name=\"submit\" type=\"submit\" class=\"ch\" value=\"\" />&nbsp;&nbsp;<a href=\"javascript:void(0)\" class=\"STYLE1\" onclick=\"change2()\">取消</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\t</form></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write(" <td width=\"15%\" background=\"pictures/newnew.jpg\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
