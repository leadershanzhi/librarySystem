package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.release();
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sty{\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("    \r\n");
      out.write("<title>增加图书</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/imagePreview.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    function preview(file,preview,imghead){\r\n");
      out.write("\t\tif($.browser.msie){\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(true,file,preview,imghead,90,120);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(false,file,preview,imghead,90,120);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#addBookForm\").validate({\r\n");
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
      out.write("\t\t\t\t\"book.isbn\" : {\r\n");
      out.write("\t\t\t\t\trequired : true, \r\n");
      out.write("\t\t\t\t\tnumber : true,\r\n");
      out.write("\t\t\t\t\tminlength:4,\r\n");
      out.write("\t\t\t\t\tmaxlength:8\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"book.ncount\":{\r\n");
      out.write("\t\t\t\t\trequired : true, \r\n");
      out.write("\t\t\t\t\tnumber : true\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"book.name\":{\r\n");
      out.write("\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\"book.isbn\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>不可为空</font>\", \r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='red' size='-1'>仅能为数字</font>\",\r\n");
      out.write("\t\t\t\t\tminlength:jQuery.format(\"<font color='red' size='-1'>不少于 4位 </font>\"),\r\n");
      out.write("\t\t\t\t\tmaxlength:jQuery.format(\"<font color='red' size='-1'>不多于8位</font>\")\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"book.ncount\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>不可为空</font>\", \r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='red' size='-1'>仅能是数字</font>\"\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"book.name\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>不可为空</font>\"\r\n");
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
      out.write("<body bgcolor=\"00ffff\">\r\n");

    IBookService ibs=new BookServiceImpl();
    Set<Dict> pubset=ibs.getAllPub();
    Set<Dict> typeset=ibs.getAllType();

      out.write("\r\n");
      out.write("<form action=\"addBookAction.action\" method=\"post\" enctype=\"multipart/form-data\" id=\"addBookForm\">\r\n");
      out.write("<br/><br/>\r\n");
      out.write("<div align=\"center\"><font face=\"幼圆\" color=\"blue\" size=\"+1\"><b>图 书 添 加</b></font></span></div>\r\n");
      out.write("<hr size=\"5\" width=\"70%\" align=\"center\"/>\r\n");
      out.write("<table width=\"70%\" border=\"1\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"STYLE2\">封面：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\t\t<input name=\"file\" type=\"file\" onChange=\"preview(this,'preview','imghead')\" />\r\n");
      out.write("    </td>\r\n");
      out.write("     <td width=\"9%\" >&nbsp;</td>\r\n");
      out.write("    <td width=\"16%\" height=\"40\">图片：</td>\r\n");
      out.write("    <td width=\"34%\" ><div id=\"preview\"><img id=\"imghead\" width=90 height=120 border=1  />    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">ISBN:</td>\r\n");
      out.write("    <td><input type=\"text\" style=\"height:18px\" name=\"book.isbn\" size=\"20\"/></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">书名：</td>\r\n");
      out.write("    <td><input type=\"text\" style=\"height:18px\" name=\"book.name\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">购进数量：</td>\r\n");
      out.write("    <td><input type=\"text\" style=\"height:18px\" name=\"book.ncount\"/></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">购进时间：</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">出版社：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t    <SELECT style=\"width:150px\" name=\"book.pub\"> \r\n");
      out.write("                   <OPTION value=0 selected>请选择</OPTION> \r\n");
      out.write("                   ");
  for(Dict type:pubset){ 
      out.write("\r\n");
      out.write("                       <OPTION value=");
      out.print(type.getDicname() );
      out.write('>');
      out.print(type.getDicname() );
      out.write("</OPTION> \r\n");
      out.write("                   ");
} 
      out.write("\r\n");
      out.write("                    </SELECT>\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">类别：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <SELECT  id=\"type\" style=\"width:150px\" name=\"book.type\"> \r\n");
      out.write("                   <OPTION value=0 selected>请选择</OPTION> \r\n");
      out.write("                   ");
  for(Dict pub:typeset){ 
      out.write("\r\n");
      out.write("                       <OPTION value=");
      out.print(pub.getDicname() );
      out.write('>');
      out.print(pub.getDicname() );
      out.write("</OPTION> \r\n");
      out.write("                   ");
} 
      out.write("\r\n");
      out.write("                    </SELECT>\r\n");
      out.write("\t  \r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" class=\"STYLE2\">作者：</td>\r\n");
      out.write("    <td><input type=\"text\" style=\"height:18px\" name=\"book.author\"/></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"STYLE2\">关键字：</td>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\t\t<input type=\"text\" style=\"height:18px\" name=\"\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"50\" colspan=\"5\" align=\"left\">\r\n");
      out.write("    <input type=\"submit\" value=\"添加\"/>&nbsp;&nbsp;\r\n");
      out.write("    <input type=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /addbook.jsp(149,8) name = size type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setSize("20");
    // /addbook.jsp(149,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("book.btime");
    // /addbook.jsp(149,8) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "style", new String("height:18px"));
    // /addbook.jsp(149,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("time");
    // /addbook.jsp(149,8) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "onClick", new String("WdatePicker()"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }
}
