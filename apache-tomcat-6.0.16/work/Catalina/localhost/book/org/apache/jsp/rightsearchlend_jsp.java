package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class rightsearchlend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_005ftest.release();
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<HEAD id=Head1>\r\n");
      out.write("<title>借阅查询页面</title>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("<LINK href=\"css/Style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<LINK href=\"css/Manage.css\" type=text/css rel=stylesheet>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.3492\" name=GENERATOR>\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction searchSubForm(type,pageNow,totalPages){\r\n");
      out.write("\t\t//当前页\r\n");
      out.write("\t\tvar pageNowData =  parseInt(pageNow);\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar totalPages =  parseInt(totalPages);\r\n");
      out.write("\t\tvar pageNow = document.getElementById(\"pageNow\");\r\n");
      out.write("\t\tswitch(type){\r\n");
      out.write("\t\t\tcase '0':\r\n");
      out.write("\t\t\t\tpageNow.value= 0;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase '1':\r\n");
      out.write("\t\t\t\tif(pageNowData>1){\r\n");
      out.write("\t\t\t\t\tpageNow.value =pageNowData-1;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"抱歉已经是首页了，无法查询了\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tcase '2':\r\n");
      out.write("\t\t\t\tif(pageNowData<totalPages){\r\n");
      out.write("\t\t\t\t\tpageNow.value = pageNowData+1;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"抱歉已经是尾页页了，无法查询了\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tcase '3':\r\n");
      out.write("\t\t\t\tpageNow.value = totalPages;\r\n");
      out.write("\t\t\t\tbreak;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tsearchform.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction searchReset(){\r\n");
      out.write("\t\tvar pageNow = document.getElementById(\"pageNow\");\r\n");
      out.write("\t\tpageNow.value=\"1\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"rid\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"bid\").value=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsearchform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction sub(){\r\n");
      out.write("\t\tvar pageNow = document.getElementById(\"pageNow\");\r\n");
      out.write("\t\tpageNow.value=\"1\";\r\n");
      out.write("\t\tsearchform.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write("  \r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=15><IMG src=\"images/new_019.jpg\" border=0></TD>\r\n");
      out.write("    <TD width=\"100%\" background=images/new_020.jpg height=20></TD>\r\n");
      out.write("    <TD width=15><IMG src=\"images/new_021.jpg\" border=0></TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  \r\n");
      out.write("</TABLE>\r\n");

    ILendService ils=new LendServiceImpl();

      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write(" \r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=15 background=images/new_022.jpg><IMG \r\n");
      out.write("      src=\"images/new_022.jpg\" border=0> </TD>\r\n");
      out.write("    <TD vAlign=top width=\"100%\" bgColor=#ffffff>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=manageHead>当前位置：图书管理&gt; 借阅查询 &gt; 多种方式查询</TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=2></TD></TR></TABLE>\r\n");
      out.write("          ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <hr color=\"white\"/>\r\n");
      out.write("    <div>\r\n");
      out.write("\t<iframe name=\"frame2\" frameborder=\"0\" height=\"350\" scrolling=\"no\" width=\"100%\" src=\"searchLendAction.action\">\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /rightsearchlend.jsp(106,10) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#session.role=='admin'");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\t\r\n");
        out.write("          \r\n");
        out.write("            <form action=\"searchLendAction.action\" method=\"post\"\r\n");
        out.write("\t\t\t\tname=\"searchform\" target=\"frame2\">\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("            <TABLE cellSpacing=0 cellPadding=2 border=0>\r\n");
        out.write("              <TR>  \r\n");
        out.write("                <TD>读者编号</TD>\r\n");
        out.write("                <TD><INPUT class=textbox id=rid style=\"WIDTH: 70px\" \r\n");
        out.write("                  name=\"query.rid\"></TD>\r\n");
        out.write("                <TD>图书编号</TD>\r\n");
        out.write("                <TD><INPUT class=textbox id=bid style=\"WIDTH: 70px\" \r\n");
        out.write("                  name=\"query.bid\"></TD>\r\n");
        out.write("                <TD>\r\n");
        out.write("                \r\n");
        out.write("                <INPUT class=button type=button value=\" 查询 \" onclick=\"sub()\"></TD>\r\n");
        out.write("                <TD>\r\n");
        out.write("                \r\n");
        out.write("                <INPUT class=button type=button value=\" 重置 \" onclick=\"searchReset()\"></TD>\r\n");
        out.write("                <input type=\"hidden\" name=\"pageBean.pageNow\" id=\"pageNow\" value=\"1\"/>\r\n");
        out.write("\t\t\t</TR>\r\n");
        out.write("\t\t  </TABLE>\r\n");
        out.write("\t\t  \r\n");
        out.write("         </form>\r\n");
        out.write("         ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }
}
