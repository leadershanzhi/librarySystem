package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class liuhui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>留言模块</title>\r\n");
      out.write("<script>\r\n");
      out.write("function nc1(){\r\n");
      out.write("    var x=document.getElementById(\"nc\");\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function nc2(){\r\n");
      out.write("    var x=document.getElementById(\"nc\");\r\n");
      out.write("    x.style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function show(){\r\n");
      out.write("    var x=document.getElementById(\"ta\");\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function hide(){\r\n");
      out.write("    var x=document.getElementById(\"ta\");\r\n");
      out.write("    x.style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function change1(){\r\n");
      out.write("  var x=document.getElementById(\"ly\");\r\n");
      out.write("  x.rows=\"3\";\r\n");
      out.write("  var x=document.getElementById(\"lyd\");\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change2(){\r\n");
      out.write("     var s=document.getElementById(\"ly\");\r\n");
      out.write("\t s.rows=\"2\";\r\n");
      out.write("\t var x=document.getElementById(\"lyd\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  function change3(i,j){\r\n");
      out.write("  var x=document.getElementById(i);\r\n");
      out.write("  x.rows=\"2\";\r\n");
      out.write("  var x=document.getElementById(j);\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change4(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

    List listall=(List)request.getAttribute("listall"); 

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf{border:none;background:url(images/liuyan1.jpg);  left top no-repeat;width:70px; height:25px; }\r\n");
      out.write(".hf1{border:none;background:url(images/sayfb.jpg);  left top no-repeat;width:54px; height:21px; }\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".areastyle \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(images/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".areastyle1\r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff  right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".STYLE3 {font-size: 12px}\r\n");
      out.write(".STYLE4 {color: #0033FF ;font-size: 12px}\r\n");
      out.write(".STYLE5 {font-size: 10px}\r\n");
      out.write(".STYLE6 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tcolor: #CC6600;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body  background=\"images/logebg1.jpg\">\r\n");
      out.write("   <!--整体表格-->\r\n");
      out.write("   <table width=\"75%\" height=\"220\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td valign=\"top\"><img src=\"images/saylogoo.jpg\" width=\"100%\" height=\"24\" />\r\n");
      out.write("         <table width=\"100%\" height=\"175\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("               <td width=\"75%\" height=\"173\" valign=\"top\"><table width=\"100%\" height=\"66\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td>\r\n");
      out.write("                     ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                         \r\n");
      out.write("                     ");
      if (_jspx_meth_s_005felse_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"29\"><hr width=\"95%\" size=\"2\" color=\"#0000FF\" align=\"center\"/></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"29\"><!--333333333333-->\r\n");
      out.write("                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                         \r\n");
      out.write("                         ");
  for(int i=0;i<listall.size();i++) {
                                LiuYan ly=(LiuYan)listall.get(i);
                         
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("                         <!--正文-->\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td width=\"15%\" height=\"79\" valign=\"top\" align=\"center\"><img src=\"");
      out.print(ly.getRe().getImg() );
      out.write("\" width=\"71\" height=\"71\" /></td>\r\n");
      out.write("                             <td width=\"85%\">\r\n");
      out.write("                                 <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"images/bgmain.jpg\">\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                         <tr >\r\n");
      out.write("                                           <td width=\"17%\" height=\"22\"><span class=\"STYLE4\">");
      out.print(ly.getRe().getName());
      out.write("</span></td>\r\n");
      out.write("                                           <td width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <span class=\"STYLE5\">");
      out.print(ly.getLytime());
      out.write("</span>\t\t\t\t\t\t\t\t\t\t                                            </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <td width=\"23%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   ");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f1.setParent(null);
      // /liuhui.jsp(154,13) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f1.setTest("#session.role=='admin'");
      int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fif_005f1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t      <a href='delLiuHuiAction.action?lyid=");
          out.print(ly.getLyid() );
          out.write("'><font size=\"-1\">删除</font></a>\r\n");
          out.write("                                            \r\n");
          out.write("                                          ");
          int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f1);
      out.write("\r\n");
      out.write("                                          ");
      //  s:else
      org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f1 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
      _jspx_th_s_005felse_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005felse_005f1.setParent(null);
      int _jspx_eval_s_005felse_005f1 = _jspx_th_s_005felse_005f1.doStartTag();
      if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005felse_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005felse_005f1.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                                              <a href='dellLiuHuiAction.action?lyid=");
          out.print(ly.getLyid() );
          out.write("'><font size=\"-1\">删除</font></a>\r\n");
          out.write("                                          ");
          int evalDoAfterBody = _jspx_th_s_005felse_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005felse_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005felse_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f1);
      out.write("\r\n");
      out.write("                                         \r\n");
      out.write("                                         </tr>\r\n");
      out.write("                                     </table></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td ><span class=\"STYLE3\"><br/>\r\n");
      out.write("                                       ");
      out.print(ly.getContent() );
      out.write("\r\n");
      out.write("                                    </span></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><hr width=\"98%\" color=\"#666666\" size=\"2\" align=\"left\" /></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <!--hufu-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t     ");
Set<HuiFu> set=ly.getHfSet();
									       for(HuiFu hf:set){
									     
      out.write("\r\n");
      out.write("                                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                            <tr onmouseover=\"have2()\" onmouseout=\"have22()\">\r\n");
      out.write("                                             <td width=\"16%\" rowspan=\"2\" align=\"center\"><img src=\"images/lytp.jpg\" width=\"65\" height=\"55\" /></td>\r\n");
      out.write("                                             <td width=\"63%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <span class=\"STYLE4\">管理员</span>&nbsp;<span class=\"STYLE5\"> ");
      out.print(hf.getHftime() );
      out.write("\t</span>&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\t\t\t\t     </td>\r\n");
      out.write("\t\t\t\t\t\t\t                  <td width=\"21%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <td><span class=\"STYLE3\">回复：");
      out.print(hf.getContent());
      out.write("</span></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td>&nbsp;</td>\r\n");
      out.write("                                             <td colspan=\"2\">&nbsp;\t\t\t\t\t\t\t\t </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td colspan=\"2\"><hr width=\"73%\" align=\"center\" size=\"1\"/></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                         </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("                                       <!--hufu-->       ");
} 
      out.write("                            </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   \r\n");
      out.write("                                   \r\n");
      out.write("                                     ");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f2.setParent(null);
      // /liuhui.jsp(210,37) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f2.setTest("#session.role=='admin'");
      int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fif_005f2.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t    <form action=\"addhfLiuHuiAction.action\" method=\"post\">\r\n");
          out.write("\t\t\t\t\t\t\t\t    \r\n");
          out.write("                                   <tr>\r\n");
          out.write("                                     <td>\r\n");
          out.write("                                       <textarea name=\"hf.content\" id=\"");
          out.print(i );
          out.write("\" cols=\"70\" rows=\"1\" class=\"areastyle1\" onfocus=\"change3(");
          out.print(i );
          out.write(',');
          out.print(i-1000 );
          out.write(")\"></textarea>\r\n");
          out.write("                                       <input type=\"hidden\" name=\"lyid\" value=\"");
          out.print(ly.getLyid() );
          out.write("\">\r\n");
          out.write("                                     </td>\r\n");
          out.write("                                   </tr>\r\n");
          out.write("                                   <tr>\r\n");
          out.write("                                     <td><div id=\"");
          out.print(i-1000 );
          out.write("\" style=\"display:none\">\r\n");
          out.write("                                       <input  type=\"submit\" class=\"hf1\" value=\"\"/>\r\n");
          out.write("                                     <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"change4(");
          out.print(i );
          out.write(',');
          out.print(i-1000 );
          out.write(")\">取消</a></div></td>\r\n");
          out.write("                                   </tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t    </form>\r\n");
          out.write("\t\t\t\t\t\t\t\t    ");
          int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fif_005ftest.reuse(_jspx_th_s_005fif_005f2);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td bgcolor=\"#FFFFFF\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("                                 </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t </td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <!--正文-->\r\n");
      out.write("                           ");
} 
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                         </table>\r\n");
      out.write("                       <!--33333333333-->  \r\n");
      out.write("                     </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("               </table></td>\r\n");
      out.write("               <td width=\"25%\" ><img src=\"images/sayborder.jpg\" width=\"100%\" height=\"100%\" /></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("         </table></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <!--整体表格-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
    // /liuhui.jsp(91,21) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#session.role!='admin'");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                     \r\n");
        out.write("\t                     <form  name=\"ly.content\" method=\"post\" action=\"addlyLiuHuiAction.action\" id=\"form1\">\r\n");
        out.write("\t                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("\t                           <tr>\r\n");
        out.write("\t                             <td>--------------------</td>\r\n");
        out.write("\t                           </tr>\r\n");
        out.write("\t                           <tr>\r\n");
        out.write("\t                             <td align=\"center\">\r\n");
        out.write("\t\t\t\t\t\t         <textarea name=\"ly.content\" id=\"ly\" class=\"areastyle\" cols=\"98\" rows=\"2\" onfocus=\"change1()\"></textarea></td>\r\n");
        out.write("\t                           </tr>\r\n");
        out.write("\t                           <tr>\r\n");
        out.write("\t\t\t\t\t\t\t       \r\n");
        out.write("\t                             <td>\r\n");
        out.write("\t\t\t\t\t\t\t\t <div id=\"lyd\" style=\"display:none\">&nbsp;&nbsp;\r\n");
        out.write("\t                               <input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\" />\r\n");
        out.write("\t                               &nbsp;&nbsp; <a href=\"javascript:void(0)\" onclick=\"change2()\" class=\"STYLE3\">取消</a></div></td>\r\n");
        out.write("\t                           </tr>\r\n");
        out.write("\t                         </table>\r\n");
        out.write("\t                     </form>\r\n");
        out.write("                     \r\n");
        out.write("                     ");
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

  private boolean _jspx_meth_s_005felse_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent(null);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("                           <tr>\r\n");
        out.write("                             <td>--------------------</td>\r\n");
        out.write("                           </tr>\r\n");
        out.write("                           <tr>\r\n");
        out.write("                             <td align=\"center\">\r\n");
        out.write("\t\t\t\t\t         <textarea name=\"ly.content\"  class=\"areastyle\" cols=\"98\" rows=\"2\"  disabled></textarea></td>\r\n");
        out.write("                           </tr>\r\n");
        out.write("                           \r\n");
        out.write("                         </table>\r\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
    return false;
  }
}
