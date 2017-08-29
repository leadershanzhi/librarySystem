package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.model.*;
import com.ccu.util.*;
import com.ccu.bean.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gbk");
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
   List<Good> list=(List<Good>)request.getAttribute("listgood");
   PageBean p=(PageBean)request.getAttribute("page");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBliC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>主页面</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
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
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=text/javascript><!--//--><![CDATA[//><!--\r\n");
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
      out.write("function ys(){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tif(x.length==0){\r\n");
      out.write("\t\t\t\t\talert(\"对不起，页码不可为空\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t    var url=\"SerHandleMain?tag=tt&p=\"+x;\r\n");
      out.write("\t\t\t\t    choosepage.action=url;\r\n");
      out.write("\t\t\t\t    choosepage.submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("function before(){\r\n");
      out.write("\tshang.submit();\t\t\t\t\r\n");
      out.write("}\r\n");
      out.write("function next(){\r\n");
      out.write("\txia.submit();\t\t\t\r\n");
      out.write("}\r\n");
      out.write("function exist(){\r\n");
      out.write("\tvar x=confirm(\"你确定要退出吗?\");\r\n");
      out.write("\tif(x==true){\r\n");
      out.write("\t\tvar url=\"SerLogin?tag=exit\";\r\n");
      out.write("\t    window.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function openDialog(url){\t\r\n");
      out.write("\t\t\tvar firstDiag = window.showModalDialog(url,\"_self\",\"center:yes;dialogWidth:600px;dialogHeight:400px\");  \r\n");
      out.write("\t\t}\r\n");
      out.write("window.onload=menuFix;\r\n");
      out.write("//--><!]]></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     <table width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"15%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"85%\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <table width=\"75%\"  align=\"center\">\r\n");
      out.write("  <tr bgcolor=\"#00ffff\">\r\n");
      out.write("    <td colspan=\"3\"><table width=\"90%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        \r\n");
      out.write("        <td width=\"80%\" bgcolor=\"#00ffff\">\r\n");
      out.write("\t\t    <ul id=\"nav\">\r\n");
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
      out.write(" <li><a href=\"alteruser.jsp\">修改信息</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\t\t</td>\r\n");
      out.write("        <td  bgcolor=\"#00ffff\" colspan=2>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td width=\"9%\" rowspan=\"3\">&nbsp;</td>\r\n");
      out.write("    <td width=\"87%\">\r\n");
      out.write("\t<form action=\"SerHandleMain\" method=\"post\">\r\n");
      out.write("\t<table width=\"80%\">\r\n");
      out.write("\t  <tr><td  colspan=\"3\" align=\"center\"><img src=\"pictures/pailogo.jpg\" width=\"860\" /></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"40%\" height=\"78\" align=\"center\"><img src=\"pictures/taobaologo.jpg\" width=\"338\" height=\"76\" /></td>\r\n");
      out.write("        <td width=\"41%\">\r\n");
      out.write("\t\t   <input id=\"c\" name=\"content\" type=\"text\" class=\"souk\" style=\"height:33px\" size=\"52\"  value='");
      out.print(request.getAttribute("factor") );
      out.write("'/></td>\r\n");
      out.write("           \r\n");
      out.write("        <td width=\"19%\"><input type=\"submit\" class=\"sou\" value=\"\" ></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td width=\"4%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"82%\" height=\"26\" background=\"pictures/bgtj.jpg\">\r\n");
      out.write("\t   <table width=\"90%\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"9%\" height=\"20\">&nbsp;<a href=\"SerHandleMain?down=price\">&nbsp;&nbsp;价格<img src=\"pictures/down.jpg\"/></a></td>\r\n");
      out.write("    <td width=\"11%\"><a href=\"SerHandleMain?down=sale\">销量<img src=\"pictures/down.jpg\"/></a></td>\r\n");
      out.write("    <td width=\"10%\"><a href=\"SerHandleMain?down=click\">点击量<img src=\"pictures/down.jpg\"/></a></td>\r\n");
      out.write("    <td width=\"9%\"><a href=\"SerHandleMain\">默认</a></td>\r\n");
      out.write("\t<td width=\"61%\">\r\n");
      out.write("\t    <table width=\"100%\" height=\"20\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"48\">&nbsp;</td>\r\n");
      out.write("           <td width=\"52\" class=\"STYLE6\">共");
      out.print(p.getPages() );
      out.write("页  </td>\r\n");
      out.write("           <td width=\"72\" class=\"STYLE6\">当前第");
      out.print(p.getPagenow() );
      out.write("页</td>\r\n");
      out.write("           <form action=\"SerHandleMain?p=before\" method=\"post\" name=\"shang\">\r\n");
      out.write("              <input name=\"content\" type=\"hidden\" value=\"");
      out.print(request.getAttribute("factor") );
      out.write("\"/>\r\n");
      out.write("           </form>\r\n");
      out.write("           <form action=\"SerHandleMain?p=last\" method=\"post\" name=\"xia\">\r\n");
      out.write("              <input name=\"content\" type=\"hidden\" value=\"");
      out.print(request.getAttribute("factor") );
      out.write("\"/>\r\n");
      out.write("           </form>\r\n");
      out.write("           <form action=\"\" method=\"post\" name=\"choosepage\">\r\n");
      out.write("              <input name=\"content\" type=\"hidden\" value=\"");
      out.print(request.getAttribute("factor") );
      out.write("\"/>\r\n");
      out.write("           </form>\r\n");
      out.write("           <td width=\"40\"><span class=\"STYLE6\"><a href=\"javascript:void(0)\" onclick=\"before()\">上一页</a></span></td>\r\n");
      out.write("           <td width=\"46\" class=\"STYLE6\"><a href=\"javascript:void(0)\" onclick=\"next()\">下一页</a></td>\r\n");
      out.write("           <td width=\"24\" class=\"STYLE6\">转到</td>\r\n");
      out.write("           <td width=\"14\">\r\n");
      out.write("             <input  type=\"text\" class=\"ys\" id=\"djy\" style=\"height:16px\" size=\"2\" />\r\n");
      out.write("                </td>\r\n");
      out.write("           <td width=\"36\" class=\"STYLE6\">&nbsp;页</td>\r\n");
      out.write("           <td width=\"44\"><img src=\"pictures/logsure.jpg\" width=\"44\" height=\"20\" onclick=\"ys()\"/></td>\r\n");
      out.write("       \r\n");
      out.write("         </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td >&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t<!--遍历货物的表格-->\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"100%\"  bordercolor=\"#999999\">\r\n");
      out.write("\t\r\n");
      out.write("\t");

       for(int i=0;i<list.size();i++){
    	  Good g=list.get(i);
          String comcount=f.getComCount(g.getGid());
	      if(i%4==0){
      out.write("\r\n");
      out.write("        \t<tr>\r\n");
      out.write("      ");
 }
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("        <td width=\"25%\" height=\"257\">\r\n");
      out.write("\t\t    <table width=\"80%\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"180\" bgcolor=\"#33CCFF\" align=\"center\">\r\n");
      out.write("    <a href=\"SerHandleGood?tag=cha&gid=");
      out.print(g.getGid() );
      out.write("\">\r\n");
      out.write("       <img src=\"");
      out.print(g.getPic() );
      out.write("\" width=\"172\" height=\"182\" />\r\n");
      out.write("    </a>\r\n");
      out.write("    \r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><a href=\"javascript:void(0)\"><a href=\"SerHandleGood?tag=cha&gid=");
      out.print(g.getGid() );
      out.write('"');
      out.write('>');
      out.print(g.getGname() );
      out.write("</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"18\">￥");
      out.print(g.getPrice() );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 点击量：");
      out.print(g.getGclick() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"18\">最近成交");
      out.print(g.getGsale() );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评论(");
      out.print(comcount );
      out.write(")</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t");
 if((i+1)%4==0){
      out.write("\r\n");
      out.write("\t\t       </tr>\r\n");
      out.write("\t\t       ");
} 
      out.write("\t\r\n");
      out.write("\t");
}
      out.write("\t\r\n");
      out.write("        \r\n");
      out.write("    </table>\r\n");
      out.write("\t<!--遍历货物的表格-->\r\n");
      out.write("\t</td>\r\n");
      out.write("    <td width=\"4%\" colspan=\"2\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td colspan=2 background=\"pictures/bgtj.jpg\">-</td></tr>\r\n");
      out.write("  <hr width=\"100%\" color=\"red\" size=\"2\"/>\r\n");
      out.write("  <tr><td colspan=\"3\" align=\"center\">produced by 长春大学软件学院单智</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td></tr></table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
