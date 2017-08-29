package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;
import com.shxt.util.*;

public final class handledict_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.form.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.validate.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<title>通知栏</title>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tbackground: url(images/lyqd.jpg); left top no-repeat;\r\n");
      out.write("\twidth: 48px;\r\n");
      out.write("\theight: 19px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text3 {\r\n");
      out.write("\tborder: 2px solid #00ffff;\r\n");
      out.write("\theight: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text4 {\r\n");
      out.write("\tborder: 2px solid #00ffff;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 12px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #03515d;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcolor: #666666\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t<body bgcolor=\"00ffff\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");

			IBookService ibs = new BookServiceImpl();
			Set<Dict> pubset = ibs.getAllPub();
			Set<Dict> typeset = ibs.getAllType();
		
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t<form action=\"deltypeDictAction.action\" method=\"post\">\r\n");
      out.write("\t\t<hr width=\"50%\" size=\"2\" color=\"blue\" align=\"left\" />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"left\">\r\n");
      out.write("\t\t\t\t<span class=\"STYLE3\">类别操作：</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t\r\n");
      out.write("        \r\n");
      out.write("\t\t\t<span class=\"style4\">删除类别：</span>\r\n");
      out.write("\t\t\t<SELECT style=\"width: 150px\" name=\"ss\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t");

					for (Dict pub : typeset) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<OPTION value=");
      out.print(pub.getDicname());
      out.write('>');
      out.print(pub.getDicname());
      out.write("</OPTION>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</SELECT>\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"addtypeDictAction.action\" method=\"post\">\r\n");
      out.write("\t\t\t<span class=\"style4\">添加类别：</span><input type=\"text\" style=\"height:18px\" name=\"ss\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<hr width=\"50%\" size=\"2\" color=\"blue\" align=\"left\" />\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div align=\"left\">\r\n");
      out.write("\t\t\t<span class=\"STYLE3\">出版社操作：</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\r\n");
      out.write("        <form action=\"delpubDictAction.action\" method=\"post\">\r\n");
      out.write("        <span class=\"style4\">删除出版社：</span>\r\n");
      out.write("\t\t<SELECT style=\"width: 150px\" name=\"ss\">\r\n");
      out.write("            \r\n");
      out.write("\t\t\t");

				for (Dict type : pubset) {
			
      out.write("\r\n");
      out.write("\t\t\t<OPTION value=");
      out.print(type.getDicname());
      out.write('>');
      out.print(type.getDicname());
      out.write("</OPTION>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</SELECT><input type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("        </form>\r\n");
      out.write("        <form action=\"addpubDictAction.action\" method=\"post\">\r\n");
      out.write("\t\t\t<span class=\"style4\">添加出版社：</span><input type=\"text\" style=\"height:18px\" name=\"ss\"/>\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<hr width=\"50%\" size=\"2\" color=\"blue\" align=\"left\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>");
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
