package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.model.*;
import com.ccu.util.*;
import com.ccu.bean.*;

public final class friend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Factory f=new Factory();
List<User> listu=f.getListUser();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=content-type content=\"text/html; charset=gb2312\">\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write(" border:0px;\r\n");
      out.write(" margin:0px;\r\n");
      out.write(" overflow:hidden;\r\n");
      out.write(" background-image: url(\"pictures/goodbg.jpg\");\r\n");
      out.write(" font-family:宋体;\r\n");
      out.write("}\r\n");
      out.write(".page{\r\n");
      out.write(" position:absolute;\r\n");
      out.write(" width:650px;\r\n");
      out.write(" border:2px solid  #C0C0C0;\r\n");
      out.write(" background-color:#FFFFFF;\r\n");
      out.write(" left:425px;\r\n");
      out.write(" margin-left:-350px;\r\n");
      out.write(" cursor:default;\r\n");
      out.write(" z-index:0;\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write(" height:350px;\r\n");
      out.write(" list-style:none;\r\n");
      out.write(" margin:40px 50px 0px;\r\n");
      out.write(" padding:0px;\r\n");
      out.write("}\r\n");
      out.write("li{\r\n");
      out.write(" width:100%;\r\n");
      out.write(" height:40px;\r\n");
      out.write(" line-height:40px;\r\n");
      out.write(" font-size:14px;\r\n");
      out.write(" text-align:left;\r\n");
      out.write(" border-bottom:1px dashed  #99FFCC;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write(" text-decoration:none;\r\n");
      out.write(" color:#666666;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write(" font-weight:bold;\r\n");
      out.write("}\r\n");
      out.write("li span{\r\n");
      out.write(" float:right;\r\n");
      out.write(" color:#999;\r\n");
      out.write("}\r\n");
      out.write(".tip{\r\n");
      out.write(" display:block;\r\n");
      out.write(" width:100%;\r\n");
      out.write(" font-size:12px;\r\n");
      out.write(" color:#999;\r\n");
      out.write(" text-align:center;\r\n");
      out.write(" margin:10px 0px 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onselectstart=\"return false;\">\r\n");
      out.write("<script>\r\n");
      out.write("function id(obj){\r\n");
      out.write(" return document.getElementById(obj);\r\n");
      out.write("}\r\n");
      out.write("var page;\r\n");
      out.write("var lm,mx;\r\n");
      out.write("var md=false;\r\n");
      out.write("var sh=0;\r\n");
      out.write("var en=false;\r\n");
      out.write("window.onload=function(){\r\n");
      out.write(" page=document.getElementsByTagName(\"div\");\r\n");
      out.write(" if(page.length>0){\r\n");
      out.write("  page[0].style.zIndex=2;\r\n");
      out.write(" }\r\n");
      out.write(" for(i=0;i<page.length;i++){\r\n");
      out.write("  page[i].className=\"page\";\r\n");
      out.write("  page[i].innerHTML+=\"<span class=tip>第 \"+(i+1)+\"/\"+page.length+\" 页 提示：左右拖拽翻页</span>\";\r\n");
      out.write("  page[i].id=\"page\"+i;\r\n");
      out.write("  page[i].i=i;\r\n");
      out.write("  page[i].onmousedown=function(e){\r\n");
      out.write("   if(!en){\r\n");
      out.write("    if(!e){e=e||window.event;}\r\n");
      out.write("    lm=this.offsetLeft;\r\n");
      out.write("    mx=(e.pageX)?e.pageX:e.x;\r\n");
      out.write("    this.style.cursor=\"w-resize\";\r\n");
      out.write("    md=true;\r\n");
      out.write("    if(document.all){\r\n");
      out.write("     this.setCapture();\r\n");
      out.write("    }else{\r\n");
      out.write("     window.captureEvents(Event.MOUSEMOVE|Event.MOUSEUP);\r\n");
      out.write("    }\r\n");
      out.write("   }\r\n");
      out.write("  }\r\n");
      out.write("  page[i].onmousemove=function(e){\r\n");
      out.write("   if(md){\r\n");
      out.write("    en=true;\r\n");
      out.write("    if(!e){e=e||window.event;}\r\n");
      out.write("    var ex=(e.pageX)?e.pageX:e.x;\r\n");
      out.write("    this.style.left=ex-(mx-lm)+350;\r\n");
      out.write("    if(this.offsetLeft<75){\r\n");
      out.write("     var cu=(this.i==0)?page.length-1:this.i-1;\r\n");
      out.write("     page[sh].style.zIndex=0;\r\n");
      out.write("     page[cu].style.zIndex=1;\r\n");
      out.write("     this.style.zIndex=2;\r\n");
      out.write("     sh=cu;\r\n");
      out.write("    }\r\n");
      out.write("    if(this.offsetLeft>75){\r\n");
      out.write("     var cu=(this.i==page.length-1)?0:this.i+1;\r\n");
      out.write("     page[sh].style.zIndex=0;\r\n");
      out.write("     page[cu].style.zIndex=1;\r\n");
      out.write("     this.style.zIndex=2;\r\n");
      out.write("     sh=cu;\r\n");
      out.write("    }  \r\n");
      out.write("   }\r\n");
      out.write("  }\r\n");
      out.write("  page[i].onmouseup=function(){\r\n");
      out.write("   this.style.cursor=\"default\";\r\n");
      out.write("   md=false;\r\n");
      out.write("   if(document.all){\r\n");
      out.write("    this.releaseCapture();\r\n");
      out.write("   }else{\r\n");
      out.write("    window.releaseEvents(Event.MOUSEMOVE|Event.MOUSEUP);\r\n");
      out.write("   }\r\n");
      out.write("   flyout(this);\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function flyout(obj){\r\n");
      out.write(" if(obj.offsetLeft<75){\r\n");
      out.write("  if(  (obj.offsetLeft + 350 - 20) > -275 ){\r\n");
      out.write("   obj.style.left=obj.offsetLeft + 350 - 20;\r\n");
      out.write("   window.setTimeout(\"flyout(id('\"+obj.id+\"'));\",0);\r\n");
      out.write("  }else{\r\n");
      out.write("   obj.style.left=-275;\r\n");
      out.write("   obj.style.zIndex=0;\r\n");
      out.write("   flyin(id(obj.id));\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write(" if(obj.offsetLeft>75){\r\n");
      out.write("  if(  (obj.offsetLeft + 350 + 20) < 1125 ){\r\n");
      out.write("   obj.style.left=obj.offsetLeft + 350 + 20;\r\n");
      out.write("   window.setTimeout(\"flyout(id('\"+obj.id+\"'));\",0);\r\n");
      out.write("  }else{\r\n");
      out.write("   obj.style.left=1125;\r\n");
      out.write("   obj.style.zIndex=0;\r\n");
      out.write("   flyin(id(obj.id));\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function flyin(obj){\r\n");
      out.write(" if(obj.offsetLeft<75){\r\n");
      out.write("  if(  (obj.offsetLeft + 350 + 20) < 425  ){\r\n");
      out.write("   obj.style.left=obj.offsetLeft + 350 + 20;\r\n");
      out.write("   window.setTimeout(\"flyin(id('\"+obj.id+\"'));\",0);\r\n");
      out.write("  }else{\r\n");
      out.write("   obj.style.left=425;\r\n");
      out.write("   en=false;\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write(" if(obj.offsetLeft>75){\r\n");
      out.write("  if(  (obj.offsetLeft + 350 - 20) > 425  ){\r\n");
      out.write("   obj.style.left=obj.offsetLeft + 350 - 20;\r\n");
      out.write("   window.setTimeout(\"flyin(id('\"+obj.id+\"'));\",0);\r\n");
      out.write("  }else{\r\n");
      out.write("   obj.style.left=425;\r\n");
      out.write("   en=false;\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function send(i){\r\n");
      out.write("\tvar x=confirm(\"您确定要发送请求加此人为好友吗?\");\r\n");
      out.write("\tif(x==true){\r\n");
      out.write("\t\tvar url=\"SerHandleFriend?tag=add&frid=\"+i;\r\n");
      out.write("\t    window.location.href=url;\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function openDialog(url){\t\r\n");
      out.write("\t\t\tvar firstDiag = window.showModalDialog(url,\"_self\",\"center:yes;dialogWidth:600px;dialogHeight:400px\");  \r\n");
      out.write("\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write(" ");

    for(int i=0;i<listu.size();i++){
    	User u=listu.get(i);
        if(i%5==0){

      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("   <br>\r\n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0099CC\" size=\"+1\" face=\"隶书\">查看列表-----<a href=\"SerHandleMain\">返回</a></font>\r\n");
      out.write(" <ul>\r\n");
      out.write("   ");
} 
      out.write("\r\n");
      out.write("  <li><span>&nbsp;&nbsp;<a href=\"javascript:void(0)\" onclick=\"send(");
      out.print(u.getUid() );
      out.write(")\"><img src=\"pictures/addf.jpg\"/></a></span>\r\n");
      out.write("  <span><a href=\"javascript:void(0)\" onclick=openDialog(\"cha.jsp?frid=");
      out.print(u.getUid() );
      out.write("\")> <font size=\"-1\">查看</font></a></span>\r\n");
      out.write("  <a href=\"javacript:void(0)\">");
      out.print(u.getUname() );
      out.write("</a></li>\r\n");
      out.write("   ");
 if((i+1)%5==0){
      out.write(" \r\n");
      out.write(" </ul>\r\n");
      out.write("</div>\r\n");
} 
      out.write('\r');
      out.write('\n');
      out.write(' ');
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
