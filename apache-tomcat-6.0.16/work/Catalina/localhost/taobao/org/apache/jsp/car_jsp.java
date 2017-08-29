package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.model.*;
import com.ccu.util.*;
import com.ccu.bean.*;

public final class car_jsp extends org.apache.jasper.runtime.HttpJspBase
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
   List<Order> list=(List<Order>)request.getAttribute("listorder");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBliC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>购物车</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".ys{ background:#999999;}\r\n");
      out.write(".jsd{border:none;background:url(pictures/jsd.jpg);  left top no-repeat;width:125px; height:35px; }\r\n");
      out.write(".jsx{border:none;background:url(pictures/jsx.jpg);  left top no-repeat;width:56px; height:20px; }\r\n");
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
      out.write(".STYLE1 {\r\n");
      out.write("\tcolor: #3333CC;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {color: #999999}\r\n");
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
      out.write("function add(){\r\n");
      out.write("\t       var str=\"\";\r\n");
      out.write("\t\t   var x=document.getElementsByName(\"cbox\");\r\n");
      out.write("\t\t  for(var i=x.length-1;i>=0;i--){\r\n");
      out.write("\t\t\t if(x[i].checked==true){\t  \r\n");
      out.write("\t\t\t\tstr=str+x[i].value+\",\";\r\n");
      out.write("\t\t\t }      \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  if(str.length==0){\r\n");
      out.write("\t\t\t  alert(\"请点击复选框选择您要购买的货物\");\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t  var url=\"SerHandleCar?tag=buy&str=\"+str;\r\n");
      out.write("\t\t      window.location.href=url;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t\t   \r\n");
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
      out.write("    <td width=\"15%\" height=\"auto\">&nbsp;</td>\r\n");
      out.write("    <td width=\"85%\"><table width=\"100%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"30\">\r\n");
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
      out.write("</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"47\"><img src=\"pictures/carlogo.jpg\" width=\"959\" height=\"25\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  ");

	     float sum=0;
	     float summ=0;
	     for(int i=0;i<list.size();i++){
	    	 Order or=list.get(i);
	    	 sum+=Float.parseFloat(or.getPrice());
	     }
	  
      out.write("\r\n");
      out.write("\t  <tr>\r\n");
      out.write("        <td><table width=\"50%\" align=\"right\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"40%\" align=\"center\">原价总和：</td>\r\n");
      out.write("            <td width=\"13%\">￥");
      out.print(sum );
      out.write("</td>\r\n");
      out.write("            <td width=\"16%\"><input type=\"submit\" class=\"jsx\"  value=\"\"/></td>\r\n");
      out.write("            <td width=\"31%\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"83%\" background=\"pictures/carbg.jpg\">\r\n");
      out.write("          <tr height=\"60\">\r\n");
      out.write("\t\t    <td width=\"4%\" height=\"34\" align=\"center\">&nbsp;</td>\r\n");
      out.write("            <td width=\"8%\" height=\"34\" align=\"center\">序号</td>\r\n");
      out.write("            <td width=\"36%\" align=\"center\">店铺宝贝</td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\">单价</td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\">数量</td>\r\n");
      out.write("            <td width=\"11%\" align=\"center\">优惠</td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\">小计</td>\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("           <form action=\"\" method=\"post\">\r\n");
      out.write("\t\t  <!--循环主体-->\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  ");

		     for(int i=0;i<list.size();i++){
		    	 Order o=list.get(i);
		    	 float one=Float.parseFloat(o.getPrice())*Float.parseFloat(o.getDiscount());
		    	 summ+=one;
		  
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"23\" colspan=\"8\" bgcolor=\"#FFFFFF\">&nbsp;&nbsp;&nbsp;&nbsp;time：<span class=\"STYLE1\">");
      out.print(o.getTimecar() );
      out.write(" </span></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t     <td align=\"right\"><input type=\"checkbox\" name=\"cbox\" value=\"");
      out.print(o.getOrid() );
      out.write("\" /> </td>\r\n");
      out.write("            <td height=\"60\" align=\"center\">");
      out.print(i+1 );
      out.write("</td>\r\n");
      out.write("            <td><table width=\"96%\" height=\"61\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"25%\" rowspan=\"2\" valign=\"middle\" align=\"center\">\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"SerHandleGood?tag=cha&gid=");
      out.print(o.getGid() );
      out.write("\">\r\n");
      out.write("                   <img src=\"");
      out.print(o.getPic() );
      out.write("\" width=\"54\" height=\"52\" />\r\n");
      out.write("                </a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"75%\" height=\"35\" valign=\"top\" ><a href=\"SerHandleGood?tag=cha&gid=");
      out.print(o.getGid() );
      out.write('"');
      out.write('>');
      out.print(o.getGname() );
      out.write("</a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"18\"><span class=\"STYLE2\">颜色：白&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 尺码：175/97A</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td align=\"center\">");
      out.print(o.getPrice() );
      out.write("</td>\r\n");
      out.write("            <td align=\"center\">2</td>\r\n");
      out.write("            <td align=\"center\">");
      out.print(o.getDiscount() );
      out.write("</td>\r\n");
      out.write("            <td align=\"center\">");
      out.print(one );
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\"><a href=\"SerHandleCar?tag=delone&orid=");
      out.print(o.getOrid() );
      out.write("\">移除</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\r\n");
      out.write("        <!--循环主体-->\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("\t\t </form>\r\n");
      out.write("           <tr bgcolor=\"#00FFFF\"><td height=\"5\" colspan=\"8\">&nbsp;</td></tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"48\">\r\n");
      out.write("\t\t      <table width=\"50%\" height=\"55\" align=\"right\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"26%\" height=\"31\" align=\"center\">商品总价：</td>\r\n");
      out.write("            <td width=\"17%\"><font size=\"+3\" color=\"#FF0000\">￥");
      out.print(summ );
      out.write("</font></td>\r\n");
      out.write("            <td width=\"26%\"><input type=\"button\" class=\"jsd\"  value=\"\" onclick=\"add()\"/></td>\r\n");
      out.write("            <td width=\"31%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   \r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
