package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class addmessage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("\t<title>发表通知</title>\r\n");
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
      out.write(".hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-family: \"黑体\";\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  \r\n");
      out.write("function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"images/logebg1.jpg\" onload=\"framesize()\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form  method=\"post\" action=\"addMessageAction.action\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"70%\" height=\"70%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"80\" colspan=\"5\"><span class=\"STYLE1\">发表通知</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"10%\" height=\"38\"><span class=\"STYLE2\">主题：</span></td>\r\n");
      out.write("    <td width=\"34%\"><input type=\"text\" name=\"m.topic\" size=\"35px\" style=\"height:20px\"/></td>\r\n");
      out.write("    <td colspan=2>\r\n");
      out.write("    <span class=\"STYLE2\">类型：</span>\r\n");
      out.write("    <select name=\"m.type\" style=\"width:60px\">\r\n");
      out.write("\t                    <option >通知</option>\r\n");
      out.write("\t\t\t\t\t\t<option>放假</option>\r\n");
      out.write("\t\t\t\t\t\t<option>调课</option>\r\n");
      out.write("\t\t\t\t   </select>\r\n");
      out.write("\t\t&nbsp;&nbsp;\r\n");
      out.write("    <span class=\"STYLE2\">来源：</span>\r\n");
      out.write("    <select name=\"m.people\" style=\"width:100px\">\r\n");
      out.write("\t                    <option >保卫处</option>\r\n");
      out.write("\t\t\t\t\t\t<option>自习室</option>\r\n");
      out.write("\t\t\t\t\t\t<option>图书馆</option>\r\n");
      out.write("\t\t\t\t   </select>\t\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"31\" colspan=\"4\"><hr width=\"90%\" size=\"1\" align=\"left\" color=\"#0033FF\"></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"5\" valign=\"top\">\r\n");
      out.write("      <textarea name=\"content1\" cols=\"100\" rows=\"10\" style=\"width:700px;height:300px;visibility:hidden;\"></textarea>\r\n");
      out.write("      <hr width=\"90%\" size=\"1\" align=\"left\" color=\"#0033FF\">\r\n");
      out.write("      <input type=\"submit\" class=\"hf\" value=\"\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr> \r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write(" </form>\r\n");
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
