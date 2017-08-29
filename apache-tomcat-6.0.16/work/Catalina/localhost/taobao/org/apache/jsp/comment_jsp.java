package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.model.*;
import com.ccu.util.*;
import com.ccu.bean.*;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');

	Factory f=new Factory();
    User u=(User)request.getSession().getAttribute("user");
	Good one=(Good)request.getAttribute("one");
	List<Comment> list=(List<Comment>)request.getAttribute("listcom");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>单个查看</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".hf{border:none;background:url(pictures/liuyan1.jpg);  left top no-repeat;width:70px; height:25px; }\r\n");
      out.write(".areastyle \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write("body,div,ul,li{\r\n");
      out.write(" margin:200 auto;\r\n");
      out.write(" padding:0;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write(" font:15px \"宋体\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul{\r\n");
      out.write(" list-style:none;\r\n");
      out.write("}\r\n");
      out.write(".main{\r\n");
      out.write(" clear:both;\r\n");
      out.write(" padding:15px;\r\n");
      out.write(" text-align:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".souk { border:0px solid #00ffff; height:20px; background:url(pictures/soukuang.jpg) ;}\r\n");
      out.write(".ys{ background:#999999;}\r\n");
      out.write(".sou{border:none;background:url(pictures/soubutton.jpg);  left top no-repeat;width:131px; height:31px; }\r\n");
      out.write("*{margin:0;padding:0;border:0;}\r\n");
      out.write("body {\r\n");
      out.write(" font-family: arial, 宋体, serif;\r\n");
      out.write("        font-size:13px;\r\n");
      out.write("}\r\n");
      out.write("#nav {\r\n");
      out.write("  line-height: 30px; list-style-type: none; \r\n");
      out.write("}\r\n");
      out.write("#nav a {\r\n");
      out.write(" display: block; width: 100px; text-align:center;\r\n");
      out.write("}\r\n");
      out.write("#nav a:link {\r\n");
      out.write(" color:#999900; text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#nav a:visited {\r\n");
      out.write(" color:#000000;text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#nav a:hover {\r\n");
      out.write(" color:#FF0000;text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#nav li {\r\n");
      out.write(" float: left; width: 100px; background:#00FFFF;\r\n");
      out.write("}\r\n");
      out.write("#nav li a:hover{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#nav li a.on{ background:#FF6633;}\r\n");
      out.write("#nav li ul {\r\n");
      out.write(" line-height: 27px; list-style-type: none;text-align:left;\r\n");
      out.write(" left: -999em; width: 180px; position: absolute; \r\n");
      out.write("}\r\n");
      out.write("#nav li ul li{\r\n");
      out.write(" float: left; width: 180px;\r\n");
      out.write(" background:; \r\n");
      out.write("}\r\n");
      out.write("#nav li ul a{\r\n");
      out.write(" display: block; width: 180px;w\\idth: 156px;text-align:left;padding-left:24px;\r\n");
      out.write("}\r\n");
      out.write("#nav li ul a:link {\r\n");
      out.write(" color:#000000; text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#nav li ul a:visited {\r\n");
      out.write(" color:#666;text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#nav li ul a:hover {\r\n");
      out.write(" color:#F3F3F3;text-decoration:none;font-weight:normal;\r\n");
      out.write(" background:#FE1F41;\r\n");
      out.write("}\r\n");
      out.write("#nav li:hover ul {\r\n");
      out.write(" left: auto;\r\n");
      out.write("}\r\n");
      out.write("#nav li.sfhover ul {\r\n");
      out.write(" left: auto;\r\n");
      out.write("}\r\n");
      out.write("#content {\r\n");
      out.write(" clear: center; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".STYLE3 {font-size: 15px; font-weight: bold; }\r\n");
      out.write(".STYLE7 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #C0C0C0;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=text/javascript><!--//--><![CDATA[//><!--\r\n");
      out.write("function change1(){\r\n");
      out.write("  var x=document.getElementById(\"ly\");\r\n");
      out.write("  x.innerHTML=\"\";\r\n");
      out.write("  x.rows=\"2\";\r\n");
      out.write("  var x=document.getElementById(\"lyd\");\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change2(){\r\n");
      out.write("     var s=document.getElementById(\"ly\");\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t var x=document.getElementById(\"lyd\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("function setTab(m,n){\r\n");
      out.write(" var tli=document.getElementById(\"menu\"+m).getElementsByTagName(\"li\");\r\n");
      out.write(" var mli=document.getElementById(\"main\"+m).getElementsByTagName(\"ul\");\r\n");
      out.write(" for(i=0;i<tli.length;i++){\r\n");
      out.write("  tli[i].className=i==n?\"hover\":\"\";\r\n");
      out.write("  mli[i].style.display=i==n?\"block\":\"none\";\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("$(function(){\r\n");
      out.write("  $(\"#nav li\").hover(function(){\r\n");
      out.write("  $(this).children(\"a\").toggleClass(\"on\"); \r\n");
      out.write("  })\r\n");
      out.write("})\r\n");
      out.write("function menuFix() {\r\n");
      out.write(" var sfEls = document.getElementById(\"nav\").getElementsByTagName(\"li\");\r\n");
      out.write(" for (var i=0; i<sfEls.length; i++) {\r\n");
      out.write("  sfEls[i].onmouseover=function() {\r\n");
      out.write("  this.className+=(this.className.length>0? \" \": \"\") + \"sfhover\";\r\n");
      out.write("  }\r\n");
      out.write("  sfEls[i].onMouseDown=function() {\r\n");
      out.write("  this.className+=(this.className.length>0? \" \": \"\") + \"sfhover\";\r\n");
      out.write("  }\r\n");
      out.write("  sfEls[i].onMouseUp=function() {\r\n");
      out.write("  this.className+=(this.className.length>0? \" \": \"\") + \"sfhover\";\r\n");
      out.write("  }\r\n");
      out.write("  sfEls[i].onmouseout=function() {\r\n");
      out.write("  this.className=this.className.replace(new RegExp(\"( ?|^)sfhover\\\\b\"), \r\n");
      out.write("\"\");\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function openDialog(url){\t\r\n");
      out.write("\t\t\tvar firstDiag = window.showModalDialog(url,\"_self\",\"center:yes;dialogWidth:600px;dialogHeight:400px\");  \r\n");
      out.write("\t\t}\r\n");
      out.write("window.onload=menuFix;\r\n");
      out.write("//--><!]]></script>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   <table width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"16%\">&nbsp;</td>\r\n");
      out.write("    <td ><table width=\"70%\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"31\"><ul id=\"nav\">\r\n");
      out.write("\r\n");
      out.write(" <li><a href=\"#\">我的淘宝</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a href=\"SerHandleMain\">首页查看</a></li>\r\n");
      out.write("                  <li><a href=\"addgood.jsp\">添加货物</a></li>\r\n");
      out.write("                  \r\n");
      out.write("                  <li><a href=\"javascript:void(0)\" onclick=\"exist()\">退出</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<li><a href=\"#\">购物车</a>\r\n");
      out.write(" <ul>\r\n");
      out.write(" <li><a href=\"SerHandleCar\">我的购物车</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<li><a href=\"#\">好友管理</a>\r\n");
      out.write(" <ul>\r\n");
      out.write(" <li><a href=\"friend.jsp\">用户列表</a></li>\r\n");
      out.write("  <li><a href=\"autofriend.jsp\">动态请求</a></li>\r\n");
      out.write(" <li><a href=\"myfriend.jsp\">我的好友</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</li>\r\n");
      out.write("<li><a href=\"#\">消费历史</a>\r\n");
      out.write(" <ul>\r\n");
      out.write("<li><a href=\"SerHandleCar?tag=chabuy\">已买货物</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</li>\r\n");
      out.write("<li><a href=\"#\">我的信息</a>\r\n");
      out.write(" <ul>\r\n");
      out.write(" <li><a href=\"javascript:void(0)\" onclick=openDialog(\"cha.jsp?frid=");
      out.print(u.getUid() );
      out.write('"');
      out.write(')');
      out.write('>');
      out.print(u.getUname() );
      out.write("</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</li>\r\n");
      out.write("</ul></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"41\"><img src=\"pictures/onelogo.jpg\" width=\"866\" height=\"98\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"153\"><!--产品介绍-->\r\n");
      out.write("            <table width=\"100%\" height=\"424\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"20\"><span class=\"STYLE1\"><strong>");
      out.print(one.getGname() );
      out.write("</strong></span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"56\"><table width=\"100%\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"43%\" height=\"309\"><img src=\"");
      out.print(one.getPic() );
      out.write("\" width=\"313\" height=\"314\" /></td>\r\n");
      out.write("                      <td width=\"57%\"><!--产品文字介绍-->\r\n");
      out.write("                          <table width=\"100%\" height=\"253\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td width=\"19%\"><span class=\"STYLE3\">价格：</span></td>\r\n");
      out.write("                              <td colspan=\"2\"><font size=\"+1\" face=\"幼圆\" color=\"red\">￥&nbsp;");
      out.print(one.getPrice() );
      out.write("</font></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                              <td><span class=\"STYLE3\">物流：</span></td>\r\n");
      out.write("                              <td colspan=\"2\">");
      out.print(one.getGplace() );
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td><span class=\"STYLE3\">最近售出：</span></td>\r\n");
      out.write("                              <td colspan=\"2\">");
      out.print(one.getGsale() );
      out.write("&nbsp;件</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td><span class=\"STYLE3\">评价：</span></td>\r\n");
      out.write("                              <td colspan=\"2\">(");
      out.print(f.getComCount(one.getGid()) );
      out.write(")</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td height=\"48\"><span class=\"STYLE3\">购买数量：</span></td>\r\n");
      out.write("                              <td colspan=\"2\">1</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("                        <!--产品文字介绍-->                      </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"54\">\r\n");
      out.write("\t\t\t\t     <!--评论有关-->\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t <table width=\"100%\" bgcolor=\"#C0C0C0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("          <form action=\"SerHandleGood?tag=addcom&gid=");
      out.print(one.getGid() );
      out.write("\" method=\"post\">\r\n");
      out.write("\t      <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"54\">\r\n");
      out.write("\t      \r\n");
      out.write("                           <tr height=\"10\">\r\n");
      out.write("                             <td>**************</td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr height=\"20\">\r\n");
      out.write("                             <td align=\"left\">\r\n");
      out.write("\t\t\t\t\t         <textarea name=\"content\" id=\"ly\" class=\"areastyle\" cols=\"98\" rows=\"1\" onfocus=\"change1()\">say something!</textarea></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                           <tr height=\"20\">   \r\n");
      out.write("                             <td>\r\n");
      out.write("\t\t\t\t\t\t\t <div id=\"lyd\" style=\"display:none\">\r\n");
      out.write("                               <input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("                               &nbsp;&nbsp; <a href=\"javascript:void(0)\" onclick=\"change2()\">取消</a></div></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr height=\"1\">\r\n");
      out.write("                             <td height=\"2\">&nbsp;</td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("\t      </form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!--循环有关-->\r\n");
      out.write("  ");

     for(int i=0;i<list.size();i++){
         Comment c=list.get(i);
  
      out.write("\r\n");
      out.write("  <tr align=\"center\">\r\n");
      out.write("    <td>   \r\n");
      out.write("\t      <table width=\"99%\" bgcolor=\"#FFFFFF\">\t  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"60%\" height=\"25\">");
      out.print(c.getContent() );
      out.write("</td>\r\n");
      out.write("    <td width=\"28%\">颜色：灰&nbsp;&nbsp;&nbsp; 170A </td>\r\n");
      out.write("    <td width=\"12%\">");
      out.print(c.getUserid() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\"><span class=\"STYLE7\">");
      out.print(c.getTime() );
      out.write("</span></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>  \r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <!--循环有关--> \r\n");
      out.write("</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<!--评论有关-->\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("\t\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("    <!--产品介绍-->\r\n");
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
