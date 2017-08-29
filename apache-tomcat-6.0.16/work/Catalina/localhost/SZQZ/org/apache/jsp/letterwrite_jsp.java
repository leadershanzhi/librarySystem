package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class letterwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'letterwrite.jsp' starting page</title>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid blue; overflow:auto; background:#00ffff right bottom no-repeat;color:#333333 font-size:14px}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".hf{border:none;background:url(pictures/pwtj.jpg);  left top no-repeat;width:72px; height:28px; }\r\n");
      out.write(".sel\r\n");
      out.write("{\r\n");
      out.write("height: 25px;\r\n");
      out.write("color: #000000;\r\n");
      out.write("line-height: 180%;\r\n");
      out.write("border: 1px solid #0000FF;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  function check(){\r\n");
      out.write("\t  var a1=document.getElementById(\"xuanze\").value;\r\n");
      out.write("\t  var a2=document.getElementById(\"zhuti\").value;\r\n");
      out.write("\t  var a3=document.getElementById(\"zhengwen\").value;\r\n");
      out.write("\t  if(a1==\"---------------------------------选择您要发送的用户-------------------------------\"||a2==\"\"||a3==\"\"){\r\n");
      out.write("\t\t  if(a1==\"---------------------------------选择您要发送的用户-------------------------------\"){\r\n");
      out.write("\t\t\t  alert(\"请选择你要发送的用户\");\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t  alert(\"信件主题和内容不可为空\");\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }else{\r\n");
      out.write("\t\t  return true;\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<body>\r\n");

   DBUtil db=new DBUtil();
   String userid=request.getSession().getAttribute("userid").toString();
   String name=db.getUsername(userid);
   String sql="select * from qz.users where userid!='"+userid+"'";
   List<Map<String,Object>> list=db.queryToList(sql); 
   System.out.println(list.size());

      out.write("\r\n");
      out.write("<form method=\"post\" action=\"SerAddLetter\">\r\n");
      out.write("<table width=\"75%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/receivelogo.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"18%\" height=\"89\">&nbsp;</td>\r\n");
      out.write("    <td width=\"82%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\" align=\"right\" valign=\"middle\"><font  color=\"#0077FF\" face=\"幼圆\"><strong>收件人：</strong></font></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <select name=\"letterto\" class=\"sel\" id=\"xuanze\">\r\n");
      out.write("      <option>---------------------------------选择您要发送的用户-------------------------------</option>\r\n");
      out.write("      ");

        String s1="";
        Object obj=request.getSession().getAttribute("fff");
        if(obj==null){
        	s1="";
        }else{
        	s1=obj.toString();
        }
        for(int i=0;i<list.size();i++){
        	Map<String,Object> map=list.get(i);
        	String id=map.get("USERID").toString();
        	String uname=map.get("USERNAME").toString();
        	if(s1.equals(id)){
      out.write("\r\n");
      out.write("        \t\t<option selected=\"selected\">(");
      out.print(uname );
      out.write(')');
      out.write(',');
      out.print(id );
      out.write("</option>\r\n");
      out.write("        ");
 	request.getSession().setAttribute("fff", "s");
           }else{
      out.write("\r\n");
      out.write("        \t\t<option>(");
      out.print(uname );
      out.write(')');
      out.write(',');
      out.print(id );
      out.write("</option>\r\n");
      out.write("        ");
 	}
      out.write("  \r\n");
      out.write("\t  ");
} 
      out.write("\r\n");
      out.write("     </select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"58\" align=\"right\"  valign=\"middle\"><font  color=\"#0077FF\" face=\"幼圆\"><strong>主题：</strong></font></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <input name=\"topic\" type=\"text\" size=\"83\"  class=\"area\" id=\"zhuti\" style=\"height:25px\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"100\" align=\"right\"  valign=\"top\"><font  color=\"#0077FF\" face=\"幼圆\"><strong>正文：</strong></font></td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <textarea name=\"content\" cols=\"70\" rows=\"9\" class=\"area\" id=\"zhengwen\"></textarea>\r\n");
      out.write("      <br/>\r\n");
      out.write("      <strong><br/>\r\n");
      out.write("\t  <font  color=\"#0077FF\" face=\"幼圆\">发件人：");
      out.print(name );
      out.write('（');
      out.print(userid );
      out.write("）</font></strong>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"80\">&nbsp;</td>\r\n");
      out.write("    <td valign=\"top\"><br/><input type=\"submit\" class=\"hf\" value=\"\" onclick=\"return check()\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"18%\" height=\"42\">&nbsp;</td>\r\n");
      out.write("    <td width=\"82%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
