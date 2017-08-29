package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class letterjunk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'letterjunk.jsp' starting page</title>\r\n");
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
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE3 {font-size: 12px}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE5 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE7 {font-size: 14px; color: #999999; }\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("   var XMLHttpReq = false;\r\n");
      out.write("   \r\n");
      out.write("    function createXMLHttpRequest() {\r\n");
      out.write("\t\tif(window.XMLHttpRequest) { //Mozilla 浏览器\r\n");
      out.write("\t\t\tXMLHttpReq = new XMLHttpRequest();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if (window.ActiveXObject) { // IE浏览器\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\tXMLHttpReq = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\tXMLHttpReq = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t\t} catch (e) {}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction sendRequest(url) {\r\n");
      out.write("\t\tcreateXMLHttpRequest();\r\n");
      out.write("\t\tXMLHttpReq.open(\"GET\", url, true);\r\n");
      out.write("\t\tXMLHttpReq.onreadystatechange = back;//指定响应函数\r\n");
      out.write("\t\tXMLHttpReq.send(null);  // 发送请求\r\n");
      out.write("\t}\r\n");
      out.write("\t// 处理返回信息函数\r\n");
      out.write("    function back() {\r\n");
      out.write("    \tif (XMLHttpReq.readyState == 4) { // 判断对象状态\r\n");
      out.write("        \tif (XMLHttpReq.status == 200) { // 信息已经成功返回，开始处理信息\r\n");
      out.write("            \tvar text=XMLHttpReq.responseText;\r\n");
      out.write("        \t    var message=document.getElementById(\"message\");\r\n");
      out.write("        \t    if(\"1\"==text){\r\n");
      out.write("        \t    \tmessage.innerHTML=\"<font color=red size='-1' face='幼圆'>&nbsp;恢复成功</font>\";\r\n");
      out.write("        \t    }\r\n");
      out.write("                setTimeout(c1,2000);\r\n");
      out.write("            } \r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t  function c1(){\r\n");
      out.write("\t\t  var message=document.getElementById(\"message\");\r\n");
      out.write("\t\t  message.innerHTML=\"\";\r\n");
      out.write("\t  }\r\n");
      out.write("   function del(){\r\n");
      out.write("       var con=confirm(\"您确定要恢复这些信息吗？\");\r\n");
      out.write("\t   if(con==true){\r\n");
      out.write("\t       var str=\"\";\r\n");
      out.write("\t\t   var x=document.getElementsByName(\"cbox\");\r\n");
      out.write("\t\t   var a=0;\r\n");
      out.write("\t\t   var table=document.getElementById(\"t\");\r\n");
      out.write("\t\t   for(var i=x.length-1;i>=0;i--){\r\n");
      out.write("\t\t\t  if(x[i].checked==true){\t  \r\n");
      out.write("\t\t\t\tstr=str+x[i].value+\",\";\r\n");
      out.write("\t\t\t\ttable.deleteRow(i*2);\r\n");
      out.write("\t\t\t\ttable.deleteRow(i*2);\r\n");
      out.write("\t\t\t  }      \r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   sendRequest(\"SerShowJunk?tag=del&str=\"+str);\r\n");
      out.write("\t   }\r\n");
      out.write("       \r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function ys(){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tvar url=\"SerShowJunk?tag=tt&p=\"+x;\r\n");
      out.write("\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <table width=\"75%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("   ");

        DBUtil db=new DBUtil();
        PageBean p=(PageBean)request.getAttribute("page");
        int sum=p.getRows();
        int pages=p.getPages();
        int now=p.getPagenow();
        
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    \r\n");
      out.write("    <td height=\"61\"><span class=\"STYLE2\"><br/>\r\n");
      out.write("    回收站（共");
      out.print(sum );
      out.write("封）共（");
      out.print(pages );
      out.write("）篇 当前第（");
      out.print(now );
      out.write("）篇</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" background=\"pictures/receivelogo.jpg\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("\t    <td width=\"21%\"><div id=\"message\"></div></td>\r\n");
      out.write("        <td width=\"27%\" align=\"center\"><a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"del()\">点击恢复选中</a></td>\r\n");
      out.write("        <td width=\"12%\"><a href=\"SerShowJunk?p=before\" class=\"STYLE3\">上一页</a></td>\r\n");
      out.write("        <td width=\"9%\"><a href=\"SerShowJunk?p=last\" class=\"STYLE3\">下一页</a></td>\r\n");
      out.write("        <td width=\"13%\"><span class=\"STYLE3\">转到</span>\r\n");
      out.write("          <input type=\"text\" id=\"djy\" size=\"2\" style=\"height:18px\" />\r\n");
      out.write("          <span class=\"STYLE3\">页</span></td>\r\n");
      out.write("        <td width=\"18%\"><img src=\"pictures/logsure.jpg\" width=\"46\" height=\"20\" onclick=\"ys()\"/></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"22\" background=\"pictures/receivemenu.jpg\" bgcolor=\"#FFFFFF\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"3%\" height=\"22\"><input type=\"checkbox\"></td>\r\n");
      out.write("        <td width=\"2%\"><img src=\"pictures/receive1.jpg\" width=\"13\" height=\"10\" /></td>\r\n");
      out.write("        <td width=\"25%\"><span class=\"STYLE3\">发件人</span></td>\r\n");
      out.write("        <td width=\"53%\"><span class=\"STYLE3\">主题</span></td>\r\n");
      out.write("        <td width=\"17%\"><span class=\"STYLE3\">时间</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"51\">\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<!--邮件内容循环-->\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"   >\r\n");
      out.write("\t  <tbody id=\"t\"> \r\n");
      out.write("\t  ");

	  List<Map<String, Object>> list=(List<Map<String, Object>>)p.getResult();
	    String l1="",l2="",l22="",l3="",l33="",l4="",l5="",l6="",l7="";
	    for(int i=0;i<list.size();i++){
	    	Map<String, Object> map=list.get(i);
	    	l1=map.get("LETTERID").toString();
	    	l2=map.get("LETTERFROM").toString();
	    	l22=db.getUsername(l2);
	    	l3=map.get("LETTERTO").toString();
	    	l33=db.getUsername(l3);
	    	l4=map.get("LETTERTIME").toString().substring(5,19);
	    	l5=map.get("LETTERCONTENT").toString().substring(0,7);
	    	l6=map.get("ISREAD").toString();
	    	l7=map.get("LETTERTOPIC").toString();
	  
      out.write("\r\n");
      out.write("      <tr >\r\n");
      out.write("        <td width=\"3%\"><input name=\"cbox\" type=\"checkbox\" value=\"");
      out.print(l1 );
      out.write("\" /></td>\r\n");
      out.write("        ");

           if(l6.equals("0")){
      out.write("\r\n");
      out.write("        \t   <td width=\"2%\"><img src=\"pictures/receive1.jpg\" width=\"13\" height=\"10\" /></td>\r\n");
      out.write("         ");
 }else{
      out.write("  \r\n");
      out.write("        \t   <td width=\"2%\"><img src=\"pictures/receive2.jpg\" width=\"13\" height=\"10\" /></td>\r\n");
      out.write("          ");
 }
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        <td width=\"25%\"><span class=\"STYLE5\">");
      out.print(l22 );
      out.write('(');
      out.print(l2 );
      out.write("）</span></td>\r\n");
      out.write("        <td width=\"13%\" class=\"STYLE5\"><a href=\"lettercha.jsp?letterid=");
      out.print(l1 );
      out.write('"');
      out.write('>');
      out.print(l7 );
      out.write("</a> </td>\r\n");
      out.write("        <td width=\"40%\" align=\"center\" ><span class=\"STYLE7\">");
      out.print(l5 );
      out.write("......</span></td>\r\n");
      out.write("        <td width=\"17%\" class=\"STYLE5\">");
      out.print(l4 );
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td colspan=\"6\"><hr  width=\"100%\" size=\"1\" color=\"#000000\"/></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("\t  </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\t<!--邮件内容循环--></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><hr width=\"100%\" size=\"4\" color=\"#FFCCFF\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" background=\"pictures/receivelogo.jpg\"></td>\r\n");
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
