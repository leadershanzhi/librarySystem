package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.service.*;
import com.shxt.bo.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


       IStudentService iss=new StudentServiceImpl();
    
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("       function handleselect(){\r\n");
      out.write("    \t   var str=\"\";\r\n");
      out.write("    \t   var x=document.getElementsByName(\"kc\");\r\n");
      out.write("\t\t   for(var i=x.length-1;i>=0;i--){\r\n");
      out.write("\t\t\t  if(x[i].checked==true){\t  \r\n");
      out.write("\t\t\t\tstr=str+x[i].value+\",\";\r\n");
      out.write("\t\t\t  }      \r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   document.getElementById(\"couids\").value=str;\r\n");
      out.write("\t\t   myselect.submit();\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       function handlealter(){\r\n");
      out.write("    \t   var str=\"\";\r\n");
      out.write("    \t   var x=document.getElementsByName(\"tx\");\r\n");
      out.write("\t\t   for(var i=x.length-1;i>=0;i--){\r\n");
      out.write("\t\t\t  if(x[i].checked==true){\t  \r\n");
      out.write("\t\t\t\tstr=str+x[i].value+\",\";\r\n");
      out.write("\t\t\t  }      \r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   document.getElementById(\"alterids\").value=str;\r\n");
      out.write("\t\t   myalter.submit();\r\n");
      out.write("       }\r\n");
      out.write("       fu\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session.user_session.stuname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("  欢迎你 \r\n");
      out.write("    <br/>\r\n");
      out.write("    - - - - - - - - - - - - - - - - - - - - \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("    <br>\r\n");
      out.write("          您已选的课程有：\r\n");
      out.write("      <form action=\"alterAction.action\" method=\"post\" name=\"myalter\">\r\n");
      out.write("      <table cellpadding=\"2\" cellspacing=\"2\" bordercolor=\"#999999\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("      <tr><th>课程编号</th><th>课程名称</th><th>课程状态</th><th>是否退选</th></tr>\r\n");
      out.write("     ");

       Students stu=(Students)request.getSession().getAttribute("user_session");
       int a=stu.getStuid();
       Set<Courses> set=new StudentServiceImpl().getSelCourse(a);
       for(Courses c:set){
      out.write("\r\n");
      out.write("\t\t  <tr><td>");
      out.print(c.getCouid() );
      out.write("</td><td>");
      out.print(c.getCouame() );
      out.write("</td><td>已选</td><td>&nbsp;<input type=\"checkbox\" name=\"tx\" value=\"");
      out.print(c.getCouid() );
      out.write("\"></td></tr>\r\n");
      out.write("\t ");
} 
      out.write("\r\n");
      out.write("\t </table>\r\n");
      out.write("\t <input type=\"hidden\" name=\"alterids\" value=\"\" id=\"alterids\"/>\r\n");
      out.write("\t <br/>\r\n");
      out.write("\t <tr><td colspan=4><input type=\"button\" value=\"更改\" onclick=\"handlealter()\"></td></tr>\r\n");
      out.write("\t </form>\r\n");
      out.write("\t<br/>\r\n");
      out.write("    - - - - - - - - - - - - - - - - - - - - \r\n");
      out.write("    <br/>\r\n");
      out.write("    <a href=\"courseAction.action?&pageBean.buttonType=0\">查看分页数据</a>\r\n");
      out.write("    <br/>\r\n");
      out.write("    - - - - - - - - - - - - - - - - - - - - \r\n");
      out.write("    <br/>\r\n");
      out.write("\t 您可选的课程有：\r\n");
      out.write("\t <form action=\"selectAction.action\" method=\"post\" name=\"myselect\">\r\n");
      out.write("      <table cellpadding=\"2\" cellspacing=\"2\" bordercolor=\"#999999\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("      <tr><th>课程编号</th><th>课程名称</th><th>课程状态</th></tr>\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\t  ");

	   List<Object> list=new CourseServiceImpl().getAllCourse();
	   for(int i=0;i<list.size();i++){
		   Courses c=(Courses)list.get(i);
		   int couid=c.getCouid();
		   
      out.write("\r\n");
      out.write("\t\t   <tr><td>");
      out.print(c.getCouid() );
      out.write("</td><td>");
      out.print(c.getCouame() );
      out.write("</td><td>&nbsp;\r\n");
      out.write("\t\t   ");
if(iss.isSelected(stu,couid)==0){ 
      out.write("\r\n");
      out.write("\t\t   <input type=\"checkbox\" name=\"kc\" value=\"");
      out.print(couid );
      out.write("\">\r\n");
      out.write("\t\t   ");
}else{ 
      out.write("\r\n");
      out.write("\t\t     已选\r\n");
      out.write("\t\t   ");
} 
      out.write("\r\n");
      out.write("\t\t   </td></tr>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br/>\r\n");
      out.write("    - - - - - - - - - - - - - - - - - - - - \r\n");
      out.write("    <br/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"couids\" value=\"\" id=\"couids\"/>\r\n");
      out.write("\t<tr><td colspan=3><input type=\"button\" value=\"选课\" onclick=\"handleselect()\"></td></tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  </body>\r\n");
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
