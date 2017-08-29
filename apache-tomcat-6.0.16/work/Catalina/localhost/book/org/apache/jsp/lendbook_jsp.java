package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;
import com.shxt.util.*;

public final class lendbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function handle(){\r\n");
      out.write("    \tmyform.submit();\r\n");
      out.write("    \twindow.close();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function preview(file,preview,imghead){\r\n");
      out.write("\t\tif($.browser.msie){\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(true,file,preview,imghead,90,100);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(false,file,preview,imghead,90,100);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#myform\").validate({\r\n");
      out.write("\t\t\tsubmitHandler : function(form) {\r\n");
      out.write("\t\t\t\t$(form).mask(\"正在传输数据，请稍候。。。\");// loading\r\n");
      out.write("\t\t\t\t$(\"#lid\").val($(\"#lendid\").val());\r\n");
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
      out.write("\t\t\t    \"lendid\":{\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tnumber : true,\r\n");
      out.write("\t\t\t\t\tremote : {\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"checkridLendAction.action\",\r\n");
      out.write("\t\t\t\t\t\terror : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\"lendid\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>不可为空</font>\", \r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='red' size='-1'>仅能为数字</font>\",\r\n");
      out.write("\t\t\t\t\tremote : \"<font color='red' size='-1'>账户不存在</font>\"\r\n");
      out.write("\t\t\t\t}\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }\r\n");
      out.write(".text3 { border:2px solid #00ffff; height:18px; }\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE3 {font-size: 14px; font-weight: bold; }\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #03515d;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"00ffff\">\r\n");
      out.write("    <br/><br/>\r\n");
      out.write("    <div align=\"left\"><span class=\"STYLE3\">您将借阅该图书的信息</span></div>\r\n");
      out.write("    <hr size=\"5\" width=\"70%\" align=\"left\"/>\r\n");
      out.write("      <img  src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.bpic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" width=\"120\" height=\"150\">\r\n");
      out.write("    <hr size=\"5\" width=\"70%\" align=\"left\"/>\r\n");
      out.write("    <table width=\"70%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  height=\"25\" width=\"10%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">ISBN</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"15%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">名称</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"10%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">作者</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"15%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">类型</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"15%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">出版社</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"8%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">本数</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"10%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">借阅天数</span></div></td>\r\n");
      out.write("          <td  height=\"25\" width=\"17%\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">借阅时间</span></div></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.author}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.pub}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lendbook.ncount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">10</span></div></td>\r\n");
      out.write("            <td height=\"22\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\">");
      out.print(TimeHelper.getLTime());
      out.write("</span></div></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("    <br/>\r\n");
      out.write("    <hr size=\"5\" width=\"70%\" align=\"left\"/>\r\n");
      out.write("    <form action=\"lendLendAction.action\" method=\"post\" name=\"myform\" id=\"myform\">\r\n");
      out.write("        <div align=\"left\"><span class=\"STYLE4\">请输入你的借阅证号：\r\n");
      out.write("        <input type=\"text\" class=\"text3\" name=\"lendid\" id=\"lendid\">\r\n");
      out.write("        <input type=\"hidden\" class=\"text3\" name=\"il.rid\"  id=\"lid\">\r\n");
      out.write("        </span></div> \r\n");
      out.write("        <input type=\"hidden\" name=\"il.bid\" value=\"");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("        <br/><input type=\"submit\" class=\"hf\" value=\"\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /lendbook.jsp(142,50) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("lendbook.bid");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
