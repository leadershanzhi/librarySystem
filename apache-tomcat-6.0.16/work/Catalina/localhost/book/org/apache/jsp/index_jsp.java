package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("       \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>图书管理系统登录页面</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a{ color:#008EE3}\r\n");
      out.write("a:link  { text-decoration: none;color:#008EE3}\r\n");
      out.write("A:visited {text-decoration: none;color:#666666}\r\n");
      out.write("A:active {text-decoration: underline}\r\n");
      out.write("A:hover {text-decoration: underline;color: #0066CC}\r\n");
      out.write("A.b:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tfont-family: \"Helvetica,微软雅黑,宋体\";\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("A.b:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tfont-family: \"Helvetica,微软雅黑,宋体\";\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("A.b:active {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("A.b:hover {text-decoration: underline; color: #ffffff}\r\n");
      out.write("\r\n");
      out.write(".table1 {\r\n");
      out.write("\tborder: 1px solid #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".font {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("\tline-height: 20px;\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".input {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #999999;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tborder: 0px none #999999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #007AB5;\r\n");
      out.write("}\r\n");
      out.write("form {\r\n");
      out.write("\tmargin: 1px;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("}\r\n");
      out.write("input {\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\theight: 26px;\r\n");
      out.write("\tcolor: #007AB5;\r\n");
      out.write("\r\n");
      out.write("\t.unnamed1 {\r\n");
      out.write("\tborder: thin none #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write(".unnamed1 {\r\n");
      out.write("\tborder: thin none #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("select {\r\n");
      out.write("\tborder: 1px solid #cccccc;\r\n");
      out.write("\theight: 18px;\r\n");
      out.write("\tcolor: #666666;\r\n");
      out.write("\r\n");
      out.write("\t.unnamed1 {\r\n");
      out.write("\tborder: thin none #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-color: #9CDCF9;\r\n");
      out.write("\tbackground-position: 0px 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".tablelinenotop {\r\n");
      out.write("\tborder-top: 0px solid #CCCCCC;\r\n");
      out.write("\tborder-right: 1px solid #CCCCCC;\r\n");
      out.write("\tborder-bottom: 0px solid #CCCCCC;\r\n");
      out.write("\tborder-left: 1px solid #CCCCCC;\r\n");
      out.write("}\r\n");
      out.write(".tablelinenotopdown {\r\n");
      out.write("\r\n");
      out.write("\tborder-top: 1px solid #eeeeee;\r\n");
      out.write("\tborder-right: 1px solid #eeeeee;\r\n");
      out.write("\tborder-bottom: 1px solid #eeeeee;\r\n");
      out.write("\tborder-left: 1px solid #eeeeee;\r\n");
      out.write("}\r\n");
      out.write(".style6 {FONT-SIZE: 9pt; color: #7b8ac3; }\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("           function change(){\r\n");
      out.write("        \t   var val=document.getElementById(\"request_locale\").value;\r\n");
      out.write("        \t   if(val!=\"\"){\r\n");
      out.write("        \t\t   myform.submit();\r\n");
      out.write("        \t   }\r\n");
      out.write("           }          \r\n");
      out.write("       </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"681\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top:120px\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"353\" height=\"259\" align=\"center\" valign=\"bottom\" background=\"images/login_1.jpg\"><table width=\"90%\" border=\"0\" cellspacing=\"3\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td align=\"right\" valign=\"bottom\"  style=\"color:#05B8E4\">添智图书管理系统  Copyright 2012</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    ");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     <font face=\"幼圆\" size=\"-1\" color=\"yellow\">");
      if (_jspx_meth_s_005ffielderror_005f0(_jspx_page_context))
        return;
      out.write("</font>\r\n");
      out.write("    \r\n");
      out.write("       <form action=\"loginAction!sel.action\" name=\"myform\" method=\"get\">\r\n");
      out.write("       <select name=\"request_locale\" id=\"request_locale\" onchange=\"change()\">\r\n");
      out.write("          <option value=\"\" selected=\"selected\">");
      if (_jspx_meth_s_005ftext_005f0(_jspx_page_context))
        return;
      out.write("</option>\r\n");
      out.write("          <option value=\"en_US\">English</option>\r\n");
      out.write("          <option value=\"zh_CN\">汉语</option>\r\n");
      out.write("       </select>\r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("    <td width=\"195\" background=\"images/login_2.gif\"><table width=\"190\" height=\"106\" border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("      <form method=\"post\" action=\"loginAction.action\" onSubmit=\"return chk(this);\" name=\"NETSJ_Login\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"30\" colspan=\"2\" align=\"left\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t\t \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"60\" height=\"30\" align=\"left\">");
      if (_jspx_meth_s_005ftext_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td><input name=\"role.username\" type=\"TEXT\" style=\"background:url(Images/login_6.gif) repeat-x; border:solid 1px #27B3FE; height:20px; background-color:#FFFFFF\" id=\"UserName\"size=\"15\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"30\" align=\"left\">");
      if (_jspx_meth_s_005ftext_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td><input name=\"role.password\" TYPE=\"PASSWORD\" style=\"background:url(Images/login_6.gif) repeat-x; border:solid 1px #27B3FE; height:20px; background-color:#FFFFFF\" id=\"Password\" size=\"16\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("           <tr>\r\n");
      out.write("              <td height=\"30\"> ");
      if (_jspx_meth_s_005ftext_005f3(_jspx_page_context))
        return;
      out.write(" </td>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t  <select name=\"roletype\" style=\"background:url(Images/login_6.gif) repeat-x; border:solid 1px #27B3FE; height:20px; background-color:#FFFFFF;width:120px\">\r\n");
      out.write("\t\t\t       <option>");
      if (_jspx_meth_s_005ftext_005f4(_jspx_page_context))
        return;
      out.write("</option>\r\n");
      out.write("\t\t\t       <option>");
      if (_jspx_meth_s_005ftext_005f5(_jspx_page_context))
        return;
      out.write("</option>\r\n");
      out.write("\t\t\t  </select>\r\n");
      out.write("\t\t      </td>\r\n");
      out.write("         \r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"40\" colspan=\"2\" align=\"center\"><img src=\"images/tip.gif\" width=\"16\" height=\"16\">\r\n");
      out.write("                  ");
 if(!"".equals(request.getParameter("id"))&& request.getParameter("id")!=null) {
      out.write("\r\n");
      out.write("                                                                              用户名或密码错误！\r\n");
      out.write("                  ");
} else{
      out.write("\r\n");
      out.write("                                                                             核对用户名,密码,身份信息\r\n");
      out.write("                  ");
} 
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"submit\" style=\"background:url(images/login_5.gif) no-repeat\" value=\" 登  陆 \"> \r\n");
      out.write("\t\t\t  <input type=\"reset\" name=\"Submit\" style=\"background:url(images/login_5.gif) no-repeat\" value=\" 取  消 \"></td>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"5\" colspan=\"2\"></td>\r\n");
      out.write("              \r\n");
      out.write("        </form>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td width=\"133\" background=\"images/login_3.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"161\" colspan=\"3\" background=\"images/login_4.gif\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_005factionerror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ffielderror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_005ffielderror_005f0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_005ffielderror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ffielderror_005f0.setParent(null);
    int _jspx_eval_s_005ffielderror_005f0 = _jspx_th_s_005ffielderror_005f0.doStartTag();
    if (_jspx_th_s_005ffielderror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ffielderror_005fnobody.reuse(_jspx_th_s_005ffielderror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent(null);
    // /index.jsp(134,47) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("select");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent(null);
    // /index.jsp(149,54) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("no");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent(null);
    // /index.jsp(154,43) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("pass");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f3 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f3.setParent(null);
    // /index.jsp(159,31) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f3.setName("sf");
    int _jspx_eval_s_005ftext_005f3 = _jspx_th_s_005ftext_005f3.doStartTag();
    if (_jspx_th_s_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f4 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f4.setParent(null);
    // /index.jsp(162,18) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f4.setName("admin");
    int _jspx_eval_s_005ftext_005f4 = _jspx_th_s_005ftext_005f4.doStartTag();
    if (_jspx_th_s_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f5 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f5.setParent(null);
    // /index.jsp(163,18) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f5.setName("reader");
    int _jspx_eval_s_005ftext_005f5 = _jspx_th_s_005ftext_005f5.doStartTag();
    if (_jspx_th_s_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
    return false;
  }
}
