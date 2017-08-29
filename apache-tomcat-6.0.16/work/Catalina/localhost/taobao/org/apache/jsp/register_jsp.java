package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>淘宝注册</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.3.2.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-calendar.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/shengshi.js\"></script> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"js/jquery-calendar.css\" /> \r\n");
      out.write("\t\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>注册淘宝账户</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".text3 { border:2px solid #00ffff; height:20px; background:url(pictures/sygb.jpg) ;}\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(pictures/regisbackg.jpg);\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {font-family: \"幼圆\"; font-size: 16px; font-weight: bold; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write(".bottom{border:none;background:url(pictures/registerbutton.jpg);  left top no-repeat;width:100px; height:29px; }\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("input{\r\n");
      out.write("border-color: #00ffff\r\n");
      out.write("border-size:2px\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" <script>\r\n");
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
      out.write("        \t\tvar m=document.getElementById(\"acc\");\r\n");
      out.write("            \tvar text=XMLHttpReq.responseText.toString();\r\n");
      out.write("        \t    if(text==\"yes\"){\r\n");
      out.write("        \t    \tvar name=document.getElementById(\"account\").value;\r\n");
      out.write("        \t    \tvar re=/^[0-9a-z][\\w-.]*[0-9a-z]$/i\r\n");
      out.write("\t\t            if(name.length>5 && name.length<15 && re.test(name)){\r\n");
      out.write("\t\t               m.innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t               checkacc=true;\r\n");
      out.write("\t\t            }else{\r\n");
      out.write("\t\t               m.innerHTML=\"<font color=red size='-1'>用户名必须是5到15位的数字、字母</font>\";\r\n");
      out.write("\t\t               checkacc= false;\r\n");
      out.write("\t\t            }\r\n");
      out.write("        \t    }else{\r\n");
      out.write("        \t    \tm.innerHTML=text;\r\n");
      out.write("        \t    \tcheckacc= false;\r\n");
      out.write("        \t    }  \r\n");
      out.write("            } \r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t   function check(){\r\n");
      out.write("\t     var check1=checkAccount();\r\n");
      out.write("\t     var check2=checkPW();\r\n");
      out.write("\t     var check3=checkNPW();\r\n");
      out.write("\t     var check4=checkRname();\r\n");
      out.write("\t     var check9=isEmail();\r\n");
      out.write("\t     if(check1==false || check2==false || check3==false ||check4==false ||check9==false){\r\n");
      out.write("\t    \t return false;\r\n");
      out.write("\t     }else{\r\n");
      out.write("\t    \t return true;\r\n");
      out.write("\t     }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkAccount(){\r\n");
      out.write("\t\t  var name=document.getElementById(\"account\").value;\r\n");
      out.write("\t\t  sendRequest(\"SerCheckUser?uname=\"+name);\r\n");
      out.write("\t\t  return checkacc;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkPW(){\r\n");
      out.write("\t\t  var pw=document.getElementById(\"pw\").value;\r\n");
      out.write("\t\t  var re=/[0-9a-z]*/i\r\n");
      out.write("\t\t  if(re.test(pw) && pw.length>5 && pw.length<10){\r\n");
      out.write("\t\t    document.getElementById(\"pww\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t    return true;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t    document.getElementById(\"pww\").innerHTML=\"<font color=red size='-1'>密码必须是5到10位的数字、字母</font>\";\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkNPW(){\r\n");
      out.write("\t\t  var npw=document.getElementById(\"npw\").value;\r\n");
      out.write("\t\t  var pw=document.getElementById(\"pw\").value;\r\n");
      out.write("\t\t   var re=/[0-9a-z]*/i\r\n");
      out.write("\t\t  if(re.test(npw) && pw.length>5 && pw.length<10){\r\n");
      out.write("\t\t\t  if(npw==pw){\r\n");
      out.write("\t\t    if(npw.length==0){\r\n");
      out.write("\t\t       document.getElementById(\"npww\").innerHTML=\"<font color=red size='-1'>密码不可为空</font>\";\r\n");
      out.write("\t\t       return false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t       document.getElementById(\"npww\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t       return true;\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t    document.getElementById(\"npww\").innerHTML=\"<font color=red size='-1'>前后密码不一致</font>\";\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t  document.getElementById(\"npww\").innerHTML=\"<font color=red size='-1'>确认密码不符合要求</font>\";\r\n");
      out.write("\t\t\t  return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  \r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkRname(){\r\n");
      out.write("\t      var name=document.getElementById(\"rname\").value;\r\n");
      out.write("\t\t  if(name.length==0 || name==\"\"){\r\n");
      out.write("\t\t\t document.getElementById(\"rnamee\").innerHTML=\"<font color=red size='-1'>手机号不可为空</font>\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t document.getElementById(\"rnamee\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   \r\n");
      out.write("\t   function isEmail(strEmail) {\r\n");
      out.write("\t\t   var emm=document.getElementById(\"email\").value;\r\n");
      out.write("          if (emm.search(/^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$/) != -1){\r\n");
      out.write("        \t  document.getElementById(\"em\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("               return true;\r\n");
      out.write("          }else{\r\n");
      out.write("        \t  document.getElementById(\"em\").innerHTML=\"<font color=red size='-1'>E-mail不可为空或格式错误！请仔细核对</font>\";\r\n");
      out.write("        \t  return false;\r\n");
      out.write("          }\r\n");
      out.write("               \r\n");
      out.write("        }\r\n");
      out.write(" </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"setup()\">\r\n");
      out.write("  <form action=\"SerHandleUser\" method=\"post\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"112\" rowspan=\"3\">&nbsp;</td>\r\n");
      out.write("      <td height=\"39\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"46\"><img src=\"pictures/registerf.jpg\" width=\"837\" height=\"46\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"36\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"17%\" height=\"445\"><object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0\" width=\"173\" height=\"508\">\r\n");
      out.write("        <param name=\"movie\" value=\"pictures/flower.swf\" />\r\n");
      out.write("        <param name=\"quality\" value=\"high\" />\r\n");
      out.write("        <embed src=\"pictures/flower.swf\"  type=\"application/x-shockwave-flash\" width=\"173\" height=\"508\"></embed>\r\n");
      out.write("      </object></td>\r\n");
      out.write("      <td width=\"83%\"><table width=\"85%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"11%\" height=\"38\"><span class=\"STYLE4\">&nbsp;账号：</span></td>\r\n");
      out.write("          <td width=\"29%\"><input id=\"account\" name=\"uname\" type=\"text\" class=\"text3\" style=\"height:25px\" size=\"30\" onBlur=\"checkAccount()\" />                 </td>\r\n");
      out.write("          <td colspan=\"2\"><span id=\"acc\"></span></td>\r\n");
      out.write("          <td width=\"21%\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"38\" class=\"STYLE4\">&nbsp;密码：</td>\r\n");
      out.write("          <td><input id=\"pw\" type=\"password\" style=\"height:25px\" size=\"30\" onblur=\"checkPW()\"/></td>\r\n");
      out.write("          <td colspan=\"2\"><span id=\"pww\"></span></td>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"38\"><span class=\"STYLE4\">&nbsp;确认密码：</span></td>\r\n");
      out.write("          <td><input id=\"npw\" type=\"password\" name=\"pw\" style=\"height:25px\" size=\"30\" onblur=\"checkNPW()\" /></td>\r\n");
      out.write("          <td colspan=\"2\"><span id=\"npww\"></span></td>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td  height=\"38\"class=\"STYLE4\">&nbsp;手机：</td>\r\n");
      out.write("          <td><input id=\"rname\" type=\"text\" name=\"phone\" style=\"height:25px\" size=\"30\"  onblur=\"checkRname()\"/></td>\r\n");
      out.write("          <td colspan=\"2\"><span id=\"rnamee\"></span></td>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"38\" class=\"STYLE4\">&nbsp;电子邮件：</td>\r\n");
      out.write("          <td><input type=\"text\" id=\"email\" name=\"email\" style=\"height:25px\" size=\"30\" onblur=\"isEmail()\" /></td>\r\n");
      out.write("          \r\n");
      out.write("          <td colspan=\"2\"><span id=\"em\"></span></td>\r\n");
      out.write("          <td>&nbsp;</td></tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"38\"><span class=\"STYLE4\">&nbsp;您的生日:</span><strong></strong></td>\r\n");
      out.write("          <td>\r\n");
      out.write("\t\t      <input type=\"text\" id=\"calendar2\" name=\"birth\" maxlength=\"10\" style=\"height:25px\" size=\"30\"\" onfocus=\"$(this).calendar()\" readonly/>  \r\n");
      out.write("\t\t  </td>\r\n");
      out.write("          <td colspan=\"3\" rowspan=\"4\" background=\"pictures/regisbj.jpg\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("          <td height=\"50\" class=\"STYLE4\">&nbsp;您的家乡：</td>\r\n");
      out.write("            <td><table width=\"235px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home1\" id=\"s1\" style=\"width:65px\">\r\n");
      out.write("                    <option>省份</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home2\" id=\"s2\" style=\"width:65px\">\r\n");
      out.write("                    <option>城市</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"100px\"><select name=\"home3\" id=\"s3\" style=\"width:80px\">\r\n");
      out.write("                    <option>市县</option>\r\n");
      out.write("                  </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"56\" class=\"STYLE4\">&nbsp;个性签名：</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <textarea name=\"note\" cols=\"24\" rows=\"2\"  ></textarea>                </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("          <td rowspan=\"2\">&nbsp;</td>\r\n");
      out.write("          <td height=\"29\">\r\n");
      out.write("              <input type=\"checkbox\" name=\"checkbox\" value=\"checkbox\" />\r\n");
      out.write("            <font size=\"-1\">我已阅读并接受《淘宝管理协议》</font>          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"57\"><input type=\"submit\" class=\"bottom\" value=\"\" onclick=\"return check()\"></td>\r\n");
      out.write("          <td width=\"14%\">&nbsp;</td>\r\n");
      out.write("          <td width=\"25%\">&nbsp;</td>\r\n");
      out.write("          <td>&nbsp;</td>   \r\n");
      out.write("        </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>\r\n");
      out.write("   <h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015  Tencent All Rights Reserved </font></h5>\r\n");
      out.write("     <h5 align=\"center\"><font color=\"#C0C0C0\">长春大学软件学院单智版权所有 </font></h5>\r\n");
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
