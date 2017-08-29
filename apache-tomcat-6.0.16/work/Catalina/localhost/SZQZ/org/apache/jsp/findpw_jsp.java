package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class findpw_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'findpw.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("    <script>\r\n");
      out.write("    var XMLHttpReq = false;\r\n");
      out.write("    var checkacc=false;\r\n");
      out.write("    function createXMLHttpRequest() {\r\n");
      out.write("\t\tif(window.XMLHttpRequest) { //Mozilla 浏览器\r\n");
      out.write("\t\t\tXMLHttpReq = new XMLHttpRequest();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if (window.ActiveXObject) { // IE浏览器\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\tXMLHttpReq = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\tXMLHttpReq = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t\t} catch (e) {}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction sendRequest(url) {\r\n");
      out.write("\t\tcreateXMLHttpRequest();\r\n");
      out.write("\t\tXMLHttpReq.open(\"GET\", url, true);\r\n");
      out.write("\t\tXMLHttpReq.onreadystatechange = ResponseAccount;//指定响应函数\r\n");
      out.write("\t\tXMLHttpReq.send(null);  // 发送请求\r\n");
      out.write("\t}\r\n");
      out.write("\t// 处理返回信息函数\r\n");
      out.write("    function ResponseAccount() {\r\n");
      out.write("    \tif (XMLHttpReq.readyState == 4) { // 判断对象状态\r\n");
      out.write("        \tif (XMLHttpReq.status == 200) { // 信息已经成功返回，开始处理信息\r\n");
      out.write("        \t\tvar m=document.getElementById(\"checkacc\");\r\n");
      out.write("        \t    var acc=document.getElementById(\"accp\").value;\r\n");
      out.write("            \tvar text=XMLHttpReq.responseText.toString();\r\n");
      out.write("        \t    if(text==\"yes\"){ \r\n");
      out.write("        \t    \tm.innerHTML=\"\";\r\n");
      out.write("\t\t            m.innerHTML=\"<font color=red size='-1'>账号不存在,请仔细核对</font>\";\r\n");
      out.write("\t\t            checkacc= false;\r\n");
      out.write("        \t    }else{\r\n");
      out.write("        \t    \tm.innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("        \t    \tcheckacc= true;\r\n");
      out.write("        \t    \tvar s=text.split(\",\");\r\n");
      out.write("        \t    \tdocument.getElementById(\"wt1\").innerHTML=s[0];\r\n");
      out.write("        \t        document.getElementById(\"wt2\").innerHTML=s[1]\r\n");
      out.write("        \t    }  \r\n");
      out.write("            } \r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t     var check1=checkAccount();\r\n");
      out.write("\t     var check2=checkans1();\r\n");
      out.write("\t     var check3=checkans2();\r\n");
      out.write("\t     if(check1==false || check2==false || check3==false ){\r\n");
      out.write("\t    \t return false;\r\n");
      out.write("\t     }else{\r\n");
      out.write("\t    \t return true;\r\n");
      out.write("\t     }\r\n");
      out.write("\t   }\r\n");
      out.write("\tfunction checkAccount(){\r\n");
      out.write("\t\t  var name=document.getElementById(\"accp\").value;\r\n");
      out.write("\t\t  if(name.length==0){\r\n");
      out.write("\t\t\t  document.getElementById(\"checkacc\").innerHTML=\"<font color=red size='-1'>账号信息不可为空</font>\";\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t  sendRequest(\"SerCheckUser?tag=pw&userid=\"+name);\r\n");
      out.write("\t\t  }\t\r\n");
      out.write("\t\t  return checkacc;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkans1(){\r\n");
      out.write("\t\t   var a1=document.getElementById(\"an1\").value;\r\n");
      out.write("\t\t   if(a1.length==0){\r\n");
      out.write("\t\t\t document.getElementById(\"checkan\").innerHTML=\"<font color=red size='-1'>密保问题不可为空,请仔细填写</font>\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkans2(){\r\n");
      out.write("\t\t   var a2=document.getElementById(\"an2\").value;\r\n");
      out.write("\t\t   if(a2.length==0){\r\n");
      out.write("\t\t\t document.getElementById(\"checkan\").innerHTML=\"<font color=red size='-1'>密保问题不可为空,请仔细填写</font>\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t}\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body { margin: 0px; }\r\n");
      out.write("#Layer1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:148px;\r\n");
      out.write("\ttop:29px;\r\n");
      out.write("\twidth:901px;\r\n");
      out.write("\theight:371px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("}\r\n");
      out.write("#layout {\r\n");
      out.write("\tbackground-color: #99FFCC;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("#header {\r\n");
      out.write("\tmargin:5px auto;\r\n");
      out.write("\twidth:70%;\r\n");
      out.write("\theight:80px;\r\n");
      out.write("\tbackground-color: #CCFFFF;\r\n");
      out.write("}\r\n");
      out.write("#main {\r\n");
      out.write("\tmargin:5px auto;\r\n");
      out.write("\twidth:70%;\r\n");
      out.write("\theight:500px;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("#footer {\r\n");
      out.write("\tmargin:5px auto;\r\n");
      out.write("\twidth:70%;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tbackground-color: #99FFFF;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2{\r\n");
      out.write("    height:30px;\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("}\r\n");
      out.write(".photo1{border:none;background:url(pictures/pwss.jpg);  left top no-repeat;width:75px; height:28px; }\r\n");
      out.write(".photo2{border:none;background:url(pictures/pwtj.jpg);  left top no-repeat;width:75px; height:28px; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<!--<div id=\"layout\">此处显示  id \"layout\" 的内容</div>\r\n");
      out.write("     document.getElementById(\"npww\").innerHTML=\"<font color=red size='-1'>密码不可为空</font>\";\r\n");
      out.write("\t document.getElementById(\"npww\").innerHTML=\"<image src='pictures/right.jpg'></image>\";-->\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("  <table width=\"100%\" height=\"77\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"25\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td><img src=\"pictures/pwlogo.jpg\" width=\"944\" height=\"35\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("   <br/>\r\n");
      out.write("   <form action=\"SerFindPw\" method=\"post\">\r\n");
      out.write("  <table width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td height=\"34\" colspan=\"6\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"9%\" height=\"31\">&nbsp;</td>\r\n");
      out.write("      <td width=\"11%\"><span class=\"STYLE1\">您的账号：</span></td>\r\n");
      out.write("      <td width=\"30%\">\r\n");
      out.write("      <input type=\"text\" name=\"accp\" id=\"accp\" class=\"STYLE2\" onblur=\"checkAccount()\"/>        </td>\r\n");
      out.write("      <td width=\"16%\"><input type=\"button\" class=\"photo1\" value=\"\" \"></td>\r\n");
      out.write("      <td width=\"4%\">&nbsp;</td>\r\n");
      out.write("      <td width=\"30%\" rowspan=\"11\"> &nbsp;\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;  <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"211\" height=\"353\">\r\n");
      out.write("        <param name=\"movie\" value=\"pictures/pwflash.swf\" />\r\n");
      out.write("        <param name=\"quality\" value=\"high\" />\r\n");
      out.write("        <embed src=\"pictures/pwflash.swf\"  type=\"application/x-shockwave-flash\" width=\"211\" height=\"353\"></embed>\r\n");
      out.write("      </object></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"20\"></td>\r\n");
      out.write("      <td height=\"20\">&nbsp;</td>\r\n");
      out.write("      <td height=\"20\" colspan=\"3\"><span id=\"checkacc\"></span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"13\" colspan=\"5\"><hr width=\"74%\" align=\"center\" size=\"2\" color=\"#66CCFF\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">密保问题一： </td>\r\n");
      out.write("      <td><span id=\"wt1\"></span></td>\r\n");
      out.write("      <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">您的回答：</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"an1\" id=\"an1\" class=\"STYLE2\" onblur=\"checkans1()\"/></td>\r\n");
      out.write("      <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">密保问题二：</td>\r\n");
      out.write("      <td><span id=\"wt2\"></span></td>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">您的回答:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"an2\" id=\"an2\" class=\"STYLE2\" onblur=\"checkans2()\"/></td>\r\n");
      out.write("      <td><input type=\"submit\" class=\"photo2\" value=\"\"  onclick=\"return check() \"/></td>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"20\"></td>\r\n");
      out.write("      <td height=\"20\">&nbsp;</td>\r\n");
      out.write("      <td height=\"20\" colspan=\"3\"><span id=\"checkan\"></span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"13\" colspan=\"5\"><hr width=\"74%\" align=\"center\" size=\"2\" color=\"#66CCFF\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">您的密码：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("         ");

               String pw=request.getParameter("pw");
               if(pw!=null){
            	   out.print("<font color=blue face=幼圆>"+pw+"</font>");
               }else if(pw==null && "pwnull".equals(request.getParameter("tag"))){
            	   out.print("<font color=red size='-1'>您的回答不正确,请仔细核对</font>");
               }
                          
         
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      </td>\r\n");
      out.write("      <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("      <td height=\"13\" colspan=\"5\"><hr width=\"74%\" align=\"center\" size=\"2\" color=\"#66CCFF\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"45\">&nbsp;</td>\r\n");
      out.write("      <td class=\"STYLE1\">电子邮件:</td>\r\n");
      out.write("      <td><input type=\"text\"  class=\"STYLE2\" /></td>\r\n");
      out.write("      <td><input type=\"submit\" class=\"photo2\" value=\"\"  \"/></td>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("  <h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015  Tencent All Rights Reserved  \r\n");
      out.write("  四海兴唐单智版权所有 </font></h5>\r\n");
      out.write("</div>\r\n");
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
