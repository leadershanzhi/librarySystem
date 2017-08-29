package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class alterlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gbk");
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
      out.write("\t<title>KindEditor JSP</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"kindeditor/themes/default/default.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"kindeditor/plugins/code/prettify.css\" />\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"kindeditor/kindeditor.js\"></script>\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"kindeditor/lang/zh_CN.js\"></script>\r\n");
      out.write("\t<script charset=\"utf-8\" src=\"kindeditor/plugins/code/prettify.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tKindEditor.ready(function(K) {\r\n");
      out.write("\t\t\tvar editor1 = K.create('textarea[name=\"content1\"]', {\r\n");
      out.write("\t\t\t\tcssPath : 'kindeditor/plugins/code/prettify.css',\r\n");
      out.write("\t\t\t\tuploadJson : 'kindeditor/jsp/upload_json.jsp',\r\n");
      out.write("\t\t\t\tfileManagerJson : 'kindeditor/jsp/file_manager_json.jsp',\r\n");
      out.write("\t\t\t\tallowFileManager : true,\r\n");
      out.write("\t\t\t\tafterCreate : function() {\r\n");
      out.write("\t\t\t\t\tvar self = this;\r\n");
      out.write("\t\t\t\t\tK.ctrl(document, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tK.ctrl(self.edit.doc, 13, function() {\r\n");
      out.write("\t\t\t\t\t\tself.sync();\r\n");
      out.write("\t\t\t\t\t\tdocument.forms['example'].submit();\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tprettyPrint();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 32px;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tcolor: #CC00FF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-family: \"黑体\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"pictures/logebg1.jpg\" onload=\"framesize()\">\r\n");
      out.write("<form  method=\"post\" action=\"SerAddLog?tag=alter\">\r\n");
      out.write("<table width=\"70%\" height=\"70%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"136\" colspan=\"5\"><span class=\"STYLE1\">查改日志</span></td>\r\n");
      out.write("    <td width=\"1%\" rowspan=\"5\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

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
    
      out.write("   \t\r\n");
      out.write("   ");
 }
    

      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"10%\" height=\"38\"><span class=\"STYLE2\">主题：</span></td>\r\n");
      out.write("    <td width=\"34%\"><input type=\"text\" name=\"topic\" size=\"35px\" style=\"height:24px\" value=");
      out.print(a );
      out.write("></td>\r\n");
      out.write("    <td width=\"11%\" class=\"STYLE2\">&nbsp;优先权：</td>\r\n");
      out.write("    <td width=\"37%\"><select name=\"priority\">\r\n");
      out.write("    ");
  if(d=="公开"){
      out.write("\r\n");
      out.write("    \t   <option style=\"height:20px; width:45px\" selected>公开</option>\r\n");
      out.write("\t\t\t\t\t\t<option>私有</option>\r\n");
      out.write("       ");
}else{ 
      out.write(" \r\n");
      out.write("        \t<option style=\"height:20px; width:45px\" selected>私有</option>\r\n");
      out.write("\t\t\t\t\t\t<option>公开</option>\r\n");
      out.write("       ");
 }
      out.write(" \r\n");
      out.write("\t                   \r\n");
      out.write("\t\t\t\t   </select>\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\" colspan=\"4\"><span class=\"STYLE5\">发表时间：&nbsp;&nbsp;&nbsp;</span><font face=\" Arial\"  size=\"-1\">");
      out.print( c);
      out.write("</font>\r\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"STYLE5\">上一次更改时间：</span><font face=\" Arial\"  size=\"-1\">");
      out.print( e);
      out.write("</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\" colspan=\"4\"><hr width=\"71%\" size=\"1\" align=\"left\" color=\"#0033FF\"></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" valign=\"top\">\r\n");
      out.write("      <textarea name=\"content1\" cols=\"100\" rows=\"10\" style=\"width:700px;height:500px;visibility:hidden;\">");
      out.print(b);
      out.write("</textarea>\r\n");
      out.write("      <input type=\"hidden\" name=\"logidd\" value=");
      out.print(f);
      out.write(">\r\n");
      out.write("      <input type=\"submit\"  value=\"确认修改\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write(" </form>\r\n");
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
