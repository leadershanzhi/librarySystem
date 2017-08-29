package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.util.*;

public final class addgood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".sty{\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("    \r\n");
      out.write("<title>增加商品</title>\r\n");
      out.write("    \r\n");
      out.write("<title>增加商品</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/imagePreview.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/shengshi.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("  function preview(file,preview,imghead){\r\n");
      out.write("\tif($.browser.msie){\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(true,file,preview,imghead,120,150);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(false,file,preview,imghead,120,150);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#addGoodForm\").validate({\r\n");
      out.write("\t\t\tsubmitHandler : function(form) {\r\n");
      out.write("\t\t\t\t$(form).mask(\"正在传输数据，请稍候。。。\");// loading\r\n");
      out.write("\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\tsuccess : showResponse,\r\n");
      out.write("\t\t\t\t\terror : showError,\r\n");
      out.write("\t\t\t\t\tdataType : \"xml\"\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t$(form).ajaxSubmit(options);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\terrorElement : \"em\",\r\n");
      out.write("\t\t\tvalidClass : \"success\",\r\n");
      out.write("\t\t\tsuccess : function(label) {\r\n");
      out.write("\t\t\t\tlabel.text(\"\").addClass(\"success\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\trules : {\r\n");
      out.write("\t\t\t\t\"gname\" : {\r\n");
      out.write("\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"price\":{\r\n");
      out.write("\t\t\t\t\trequired : true, \r\n");
      out.write("\t\t\t\t\tnumber : true\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"left\":{\r\n");
      out.write("\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\"gname\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='white' size='-1'>不可为空</font>\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"price\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='white' size='-1'>不可为空</font>\", \r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='white' size='-1'>仅能是数字</font>\"\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"left\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='white' size='-1'>不可为空</font>\"\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showResponse(responseXML, statusText, xhr, form) {\r\n");
      out.write("\t\t$(form).unmask();//\r\n");
      out.write("\t\talert(\"添加成功！\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction showError(responseXML, statusText, xhr, form) {\r\n");
      out.write("\r\n");
      out.write("\t\t$(form).unmask();// 闅愯棌loading\r\n");
      out.write("\t\talert(\"添加失败！\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tem.error {\r\n");
      out.write("\t\tbackground: url(\"images/e.png\") no-repeat 0px 0px;\r\n");
      out.write("\t\tpadding-left: 16px;\r\n");
      out.write("\t}\r\n");
      out.write("\tem.success {\r\n");
      out.write("\t\tbackground: url(\"images/r.png\") no-repeat 0px 0px;\r\n");
      out.write("\t\tpadding-left: 16px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"pictures/goodbg.jpg\" onLoad=\"setup()\">\r\n");
      out.write("<br/><br/>\r\n");
      out.write("<div align=\"center\"><font face=\"隶书\" color=\"blue\" size=\"+3\"><b>货 物 添 加</b></font>-------<font color=\"#0099CC\" size=\"+1\" face=\"隶书\"><a href=\"SerHandleMain\">返回</a></font></span></div>\r\n");
      out.write("<hr size=\"5\" width=\"70%\" align=\"center\"/>\r\n");
      out.write("<table width=\"70%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" >\r\n");
      out.write("<form action=\"SerGoodsImg\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"STYLE2\">路径：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\t\t<input type=\"file\" id=\"file\" name=\"images\" onChange=\"preview(this,'preview','imghead')\"/> \r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"上传\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("     <td width=\"9%\" >&nbsp;</td>\r\n");
      out.write("    <td width=\"16%\" height=\"40\">\r\n");
      out.write("       <div id=\"preview\">\r\n");
      out.write("          <img id=\"imghead\" width=120 height=150 border=1 src='");
      out.print(request.getAttribute("pic") );
      out.write("'  />  \r\n");
      out.write("       </div>\r\n");
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"34%\" >&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </form>\r\n");
      out.write("</table>\r\n");
      out.write("<form action=\"SerHandleGood\" method=\"post\" id=\"addGoodForm\">\r\n");
      out.write("<table width=\"70%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"10%\" height=\"30\" class=\"STYLE2\">商品名:</td>\r\n");
      out.write("    <td width=\"27%\"><input type=\"text\" style=\"height:18px\" name=\"gname\" size=\"20\"/></td>\r\n");
      out.write("    <input type=\"hidden\" name=\"gid\" value='");
      out.print(request.getAttribute("gid") );
      out.write("'/>\r\n");
      out.write("    <td width=\"11%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"7%\" class=\"STYLE2\">产地：</td>\r\n");
      out.write("    <td width=\"45%\"><table width=\"235px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home1\" id=\"s1\" style=\"width:65px\">\r\n");
      out.write("                    <option>省份</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home2\" id=\"s2\" style=\"width:65px\">\r\n");
      out.write("                    <option>城市</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"100px\"><select name=\"home3\" id=\"s3\" style=\"width:80px\">\r\n");
      out.write("                    <option>市县</option>\r\n");
      out.write("                  </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">价格：</td>\r\n");
      out.write("    <td><input type=\"text\" style=\"height:18px\" name=\"price\"/></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">时间：</td>\r\n");
      out.write("    <td><textarea size=\"20\" name=\"time\" style=\"height:22px\"  id=\"time\" onClick=\"WdatePicker()\"></textarea>\r\n");
      out.write("   </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">库存量：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t    <input type=\"text\" style=\"height:18px\" name=\"left\"/>\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">折扣：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("       <input type=\"text\" style=\"height:18px\" name=\"discount\"/>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td colspan=\"5\"><hr/></td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">产品描述：</td>\r\n");
      out.write("    <td colspan=\"4\"><textarea name=\"desc\" cols=\"80\" rows=\"2\"  ></textarea> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"50\" colspan=\"5\" align=\"left\">\r\n");
      out.write("    <input type=\"submit\" value=\"添加\"/>&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
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
