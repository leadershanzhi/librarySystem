package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class showloge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'showloge.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write("\r\n");
      out.write("#side {\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\twidth: 19%;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tmargin-right: 13%;\r\n");
      out.write("\tbackground-color: #FFFFCC;\r\n");
      out.write("}\r\n");
      out.write("#main {\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\twidth: 55%;\r\n");
      out.write("\tmargin-left: 13%;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("#Layer1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:203px;\r\n");
      out.write("\ttop:573px;\r\n");
      out.write("\twidth:493px;\r\n");
      out.write("\theight:27px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tcolor:#FF0000;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE6 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("               var XMLHttpReq = false;\r\n");
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
      out.write("        \t    \tmessage.innerHTML=\"<font color=red size='-1' face='幼圆'>删除成功</font>\";\r\n");
      out.write("        \t    }else if(\"2\"==text){\r\n");
      out.write("        \t    \tmessage.innerHTML=\"<font color=red size='-1' face='幼圆'>删除失败</font>\";\r\n");
      out.write("        \t    }else if(\"3\"==text){\r\n");
      out.write("        \t    \tmessage.innerHTML=\"<font color=red size='-1' face='幼圆'>请选择要删除的项目</font>\";\r\n");
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
      out.write("       function Del(){\r\n");
      out.write("    \t   var tb=document.getElementById(\"ta\");\r\n");
      out.write("    \t   var inputs=document.getElementsByTagName(\"input\");\r\n");
      out.write("    \t   var ids=\"\";\r\n");
      out.write("    \t   var a=confirm(\"您确定要删除吗？\");\r\n");
      out.write("    \t   if(a==true){\r\n");
      out.write("    \t\t  for(var i=inputs.length-1;i>=0;i--){\r\n");
      out.write("    \t\t   if(inputs[i].checked){\r\n");
      out.write("    \t\t\t   ids=ids+inputs[i].value+\",\";\r\n");
      out.write("    \t\t\t   tb.deleteRow(i-3);\r\n");
      out.write("    \t\t   }\r\n");
      out.write("    \t   }\r\n");
      out.write("    \t     sendRequest(\"SerDeleteLog?ids=\"+ids);\r\n");
      out.write("    \t   }\r\n");
      out.write("    \t   \r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("           function qx(){\r\n");
      out.write("            \tvar a=document.getElementById(\"c1\");\r\n");
      out.write("            \ta.checked=false;\r\n");
      out.write("\t\t\t\tvar x=document.getElementsByName(\"cb\");\r\n");
      out.write("\t\t\t\tfor(var i=0;i<x.length;i++){\r\n");
      out.write("\t\t\t\t\tx[i].checked=true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction fx(){\r\n");
      out.write("\t\t\t    var b=document.getElementById(\"c2\");\r\n");
      out.write("\t\t\t    b.checked=false;\r\n");
      out.write("\t\t\t\tvar x=document.getElementsByName(\"cb\");\r\n");
      out.write("\t\t\t\tfor(var i=0;i<x.length;i++){\r\n");
      out.write("\t\t\t\t\tif(x[i].checked){\r\n");
      out.write("\t\t\t\t\t\tx[i].checked=false;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tx[i].checked=true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction ys(){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tvar url=\"SerShowLoge?tag=tt&p=\"+x;\r\n");
      out.write("\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"pictures/logebg.jpg\" onload=\"framesize()\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"side\">\r\n");
      out.write("  <table width=\"100%\" height=\"35\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"27\" background=\"pictures/logelogo.jpg\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("  <table width=\"100%\" height=\"35\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td background=\"pictures/logelogo.jpg\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("      ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("      <a href=\"addlog.jsp\"><img src=\"pictures/writeloge.jpg\" width=\"99\" height=\"24\" /></a>\r\n");
      out.write("      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("      \r\n");
      out.write("      <a href=\"SerShowLoge?tag=pri\"><font size=\"+1\" face=\"隶书\">私有日志</font></a>&nbsp;&nbsp;&nbsp;");
} 
      out.write("<a href=\"SerShowLoge?tag=pub\"><font size=\"+1\" face=\"隶书\">公有日志</font></a>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td heigh=\"5px\"><hr width=\"100%\" color=\"#3399FF\" size=2 /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr >\r\n");
      out.write("      <td heigh=\"15px\"><table width=\"100%\" height=\"20\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"6%\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"c2\" align=\"center\" onclick=\"qx()\" />\r\n");
      out.write("                  </td>\r\n");
      out.write("            <td width=\"6%\" class=\"STYLE6\">全选</td>\r\n");
      out.write("            <td width=\"5%\">\r\n");
      out.write("              <input type=\"checkbox\" id=\"c1\" align=\"center\" onclick=\"fx()\"/>\r\n");
      out.write("               </td>\r\n");
      out.write("            <td width=\"10%\" class=\"STYLE6\">反选</td>\r\n");
      out.write("            <td ><input type=\"hidden\" value=\"dd\" onclick=\"Del()\"/></td>\r\n");
      out.write("            <td width=\"33%\" ><a href=\"javascript:void(0)\" class=\"STYLE6\" onclick=\"Del()\">删除选中</a></td>\r\n");
      out.write("            <td width=\"40%\"><div id=\"message\"></div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("    </tr>");
} 
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td heigh=\"5px\"><hr width=\"100%\" color=\"#3399FF\" size=2 /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t   <td height=auto>\r\n");
      out.write("\t   \r\n");
      out.write("\t       <table width=\"100%  border=\"0\" id=\"ta\" cellpadding=\"0\" cellspacing=\"0\" >\r\n");
      out.write("\t\t    ");

		    PageBean p=(PageBean)request.getAttribute("page");
     List<Map<String, Object>> list=(List<Map<String, Object>>)p.getResult();
            if(list.size()==0){	
            	
            	if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
            		out.print("<br/><div align='center'><font face='幼圆'>您还没写过日志,<a href='addlog.jsp'>赶快抒写第一篇日志吧!</a></font></div>");
            	}else{
            		out.print("<br/><div align='center'><font face='幼圆'>好友还没有公有日志</font></div>");
            	}
            }
			for(int i=0;i<list.size();i++){
				Map<String, Object> map=list.get(i);
				if(i%2==0){
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr bgcolor=\"#00FFFF\">\r\n");
      out.write("\t\t\t\t");
 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("          <td width=\"33\" height=\"27\">\r\n");
      out.write("             <input type=\"checkbox\" name=\"cb\" align=\"right\" value=");
      out.print(map.get("LOGID") );
      out.write(">\r\n");
      out.write("           </td>\r\n");
      out.write("        <td width=\"42\"><span class=\"STYLE1\">");
      out.print(map.get("LOGID") );
      out.write("</span></td>\r\n");
      out.write("        \r\n");
      out.write("        <td width=\"290\"><span class=\"STYLE1\">\r\n");
      out.write("        ");
if(map.get("TYPE").toString().equals("1")) {
      out.write("[转]\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("        <a href=\"SerHandleLog?tag=plfirst&logid=");
      out.print(map.get("LOGID") );
      out.write('"');
      out.write('>');
      out.print(map.get("LOGTOPIC") );
      out.write("</a></span>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"35\"><span class=\"STYLE4\">");
      out.print(map.get("PRIORITY") );
      out.write("</span></td>\r\n");
      out.write("        <td width=\"128\"><div align=\"center\"><span class=\"STYLE3\">");
      out.print(map.get("LOGTIME") );
      out.write("</span></div></td>\r\n");
      out.write("        <td width=\"56\"><span class=\"STYLE5\">\r\n");
      out.write("        ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                       <a href=\"SerHandleLog?logid=");
      out.print(map.get("LOGID") );
      out.write("\">编辑</a>\r\n");
      out.write("                ");
}else{ 
      out.write("\r\n");
      out.write("                       <a href=\"SerHandleLog?tag=pl&logid=");
      out.print(map.get("LOGID") );
      out.write("\">查看</a>\r\n");
      out.write("                \r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("\t\t ");
} 
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\t     \r\n");
      out.write("\t   \r\n");
      out.write("      </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t   <td height=\"60\">&nbsp;</td>\r\n");
      out.write("\t  \r\n");
      out.write("\t</tr>\r\n");
      out.write("\t <tr>\r\n");
      out.write("      <td heigh=\"5px\"><hr width=\"100%\" color=\"#3399FF\" size=2 /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t   <td height=\"30\"><table width=\"100%\" height=\"20\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"48\">&nbsp;</td>\r\n");
      out.write("           <td width=\"52\" class=\"STYLE6\">共&nbsp;");
      out.print(p.getPages() );
      out.write(" 页  </td>\r\n");
      out.write("           <td width=\"72\" class=\"STYLE6\">当前第&nbsp;");
      out.print(p.getPagenow() );
      out.write("&nbsp;页</td>\r\n");
      out.write("           <td width=\"123\">&nbsp;</td>\r\n");
      out.write("           <td width=\"40\"><span class=\"STYLE6\"><a href=\"SerShowLoge?p=before\">上一页</a></span></td>\r\n");
      out.write("           <td width=\"46\" class=\"STYLE6\"><a href=\"SerShowLoge?p=last\">下一页</a></td>\r\n");
      out.write("           <td width=\"24\" class=\"STYLE6\">转到</td>\r\n");
      out.write("           <td width=\"14\">\r\n");
      out.write("             <input  type=\"text\" id=\"djy\" style=\"height:16px\" size=\"2\"/>\r\n");
      out.write("                 </td>\r\n");
      out.write("           <td width=\"36\" class=\"STYLE6\">&nbsp;页</td>\r\n");
      out.write("           <td width=\"44\"><img src=\"pictures/logsure.jpg\" width=\"44\" height=\"20\" onclick=\"ys()\"/></td>\r\n");
      out.write("           <td width=\"87\">&nbsp;</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table></td>\r\n");
      out.write("\t  \r\n");
      out.write("\t</tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015 四海兴唐单智版权所有  吉 ICP备11011334号-1 </font></h5>\r\n");
      out.write("   <h5 align=\"center\"><font color=\"#C0C0C0\">联系我：421170702@qq.com|18744033060</font></h5>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
