package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class rightsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<HTML xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<HEAD id=Head1>\r\n");
      out.write("<title>图书查询页面</title>\r\n");
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
      out.write("\t\tdocument.getElementById(\"tname\").value=\"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"author\").value=\"\";\r\n");
      out.write("\t\tdocument.getElementById(\"type\").value=\"0\";\r\n");
      out.write("\t\tdocument.getElementById(\"pub\").value=\"0\";\r\n");
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

    IBookService ibs=new BookServiceImpl();
    Set<Dict> pubset=ibs.getAllPub();
    Set<Dict> typeset=ibs.getAllType();

      out.write("\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"98%\" border=0>\r\n");
      out.write(" \r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD width=15 background=images/new_022.jpg><IMG \r\n");
      out.write("      src=\"images/new_022.jpg\" border=0> </TD>\r\n");
      out.write("    <TD vAlign=top width=\"100%\" bgColor=#ffffff>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD class=manageHead>当前位置：图书管理&gt; 图书查询 &gt; 多种方式查询</TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=2></TD></TR></TABLE>\r\n");
      out.write("            <form action=\"searchBookAction.action\" method=\"post\"\r\n");
      out.write("\t\t\t\tname=\"searchform\" target=\"frame1\">\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=2 border=0>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD>图书类别：</TD>\r\n");
      out.write("                \r\n");
      out.write("                <TD><SELECT name=\"query.btype\" id=\"type\"> \r\n");
      out.write("                   <OPTION value=0 selected>全部状态</OPTION> \r\n");
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
      out.write("                </TD>\r\n");
      out.write("\r\n");
      out.write("                <TD>出版社：</TD>\r\n");
      out.write("                <TD><SELECT name=\"query.pub\" id=\"pub\"> \r\n");
      out.write("                   <OPTION value=0 selected>全部状态</OPTION> \r\n");
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
      out.write("                 </TD>\r\n");
      out.write("                  \r\n");
      out.write("                <TD>图书名称</TD>\r\n");
      out.write("                <TD><INPUT class=textbox id=tname style=\"WIDTH: 70px\" \r\n");
      out.write("                  name=\"query.bname\"></TD>\r\n");
      out.write("                <TD>作者</TD>\r\n");
      out.write("                <TD><INPUT class=textbox id=author style=\"WIDTH: 70px\" \r\n");
      out.write("                  name=\"query.author\"></TD>\r\n");
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
      out.write("    \r\n");
      out.write("    <hr color=\"white\"/>\r\n");
      out.write("    <div>\r\n");
      out.write("\t<iframe name=\"frame1\" frameborder=\"0\" height=\"350\" scrolling=\"no\" width=\"100%\" src=\"searchBookAction.action\">\r\n");
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
}
