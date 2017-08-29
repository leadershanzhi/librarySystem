package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.beans.*;

public final class grdalter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>个人信息修改</title>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.3.2.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-calendar.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/shengshi.js\"></script> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"js/jquery-calendar.css\" /> \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {font-family: \"幼圆\"}\r\n");
      out.write(".STYLE5 {font-size: 16px; font-weight: bold; font-family: \"幼圆\"; }\r\n");
      out.write(".hf{border:none;background:url(pictures/grdbutton.jpg);  left top no-repeat; width:83px; height:24px; }\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".STYLE6 {font-size: 12}\r\n");
      out.write(".te { border:1px solid #3399ff; height:20px;right 3px no-repeat;}\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write("-->\r\n");
      out.write(".se\r\n");
      out.write("{\r\n");
      out.write("height: 25px;\r\n");
      out.write("color:#000000\r\n");
      out.write("line-height: 220%;\r\n");
      out.write("border:1px solid #3399ff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  \t   function check(){\r\n");
      out.write("  \t\t var ymm=document.getElementById(\"ymm\").value;\r\n");
      out.write("  \t\t var xmm=document.getElementById(\"xmm\").value;\r\n");
      out.write("  \t\t var qrmm=document.getElementById(\"qrmm\").value;\r\n");
      out.write("  \t\t var name=document.getElementById(\"uname\").value;\r\n");
      out.write("\t     if(ymm.length==0&&xmm.length==0&&qrmm.length==0&&name.length!=0){\r\n");
      out.write("\t    \t    return true;\r\n");
      out.write("\t     }else{\r\n");
      out.write("\t    \t var c1=checkPW();\r\n");
      out.write("\t    \t var c2=checkXMM();\r\n");
      out.write("\t    \t var c3=checkQRMM();\r\n");
      out.write("\t         if(c1==true && c2==true && c3==true && name.length!=0){\r\n");
      out.write("\t    \t     return true;\r\n");
      out.write("\t         }else{\r\n");
      out.write("\t    \t     return false;\r\n");
      out.write("\t         }\r\n");
      out.write("\t     }  \r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkPW(){\r\n");
      out.write("\t\t  var pw=document.getElementById(\"ymm\").value;\r\n");
      out.write("\t\t  var ypw=document.getElementsByName(\"ypw\"); \r\n");
      out.write("\t\t  if(ypw[0].value==pw){\r\n");
      out.write("\t\t\t document.getElementById(\"ymm1\").innerHTML=\"<image src='pictures/right.jpg'></image>\"; \r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t document.getElementById(\"ymm1\").innerHTML=\"<font color=red size='-1'>与原密码不一致</font>\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("      function checkUname(){\r\n");
      out.write("\t      var name=document.getElementById(\"uname\").value;\r\n");
      out.write("\t\t  if(name.length==0 || name==null){\r\n");
      out.write("\t\t\t document.getElementById(\"username\").innerHTML=\"<font color=red size='-1'>昵称不可为空</font>\";\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t\t document.getElementById(\"username\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t\t return true;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   function checkXMM(){\r\n");
      out.write("\t\t  var pw=document.getElementById(\"xmm\").value;\r\n");
      out.write("\t\t  var re=/[0-9a-z]*/i\r\n");
      out.write("\t\t  if(re.test(pw) && pw.length>4 && pw.length<10){\r\n");
      out.write("\t\t    document.getElementById(\"xmm1\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t    return true;\r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t    document.getElementById(\"xmm1\").innerHTML=\"<font color=red size='-1'>密码必须是4到10位的数字、字母</font>\";\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function checkQRMM(){\r\n");
      out.write("\t\t  var xmm=document.getElementById(\"xmm\").value;\r\n");
      out.write("\t\t  var qrmm=document.getElementById(\"qrmm\").value;\r\n");
      out.write("\t\t  if(qrmm==xmm){\r\n");
      out.write("\t\t    if(qrmm.length==0){\r\n");
      out.write("\t\t       document.getElementById(\"qrmm1\").innerHTML=\"<font color=red size='-1'>密码不可为空</font>\";\r\n");
      out.write("\t\t       return false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t       document.getElementById(\"qrmm1\").innerHTML=\"<image src='pictures/right.jpg'></image>\";\r\n");
      out.write("\t\t        return true;\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t  }else{\r\n");
      out.write("\t\t    document.getElementById(\"qrmm1\").innerHTML=\"<font color=red size='-1'>前后密码不一致</font>\";\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" onLoad=\"setup()\">\r\n");

    String userid=request.getSession().getAttribute("userid").toString();
    UserBean u=new InitUser().getUser(userid);
  
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"568\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"94%\"><table width=\"100%\" height=\"591\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"83\" valign=\"middle\"><span class=\"STYLE5\"><br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("          ");
      out.print(u.getUsername() );
      out.write('-');
      out.write('-');
      out.write('-');
      out.print(userid );
      out.write("</span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"1\"/></td>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"23\" valign=\"bottom\" class=\"STYLE2 STYLE4\">基本资料  &nbsp;&nbsp;&nbsp;<font size=\"-1\"  color=\"red\">*填写您需要修改的内容</font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"1\"/></td>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("\t\t    <!--表格主体-->\r\n");
      out.write("\t\t    <form  method=\"post\" action=\"SerGrdAlter\">\r\n");
      out.write("\t\t      <table width=\"89%\" height=\"450\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" height=\"29\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"41%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"12%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"32%\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td class=\"STYLE3\">昵称：</td>\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"username\" id=\"uname\" type=\"text\" value=\"");
      out.print(u.getUsername() );
      out.write("\" style=\"height:20px\" size=\"30\" class=\"te\" onblur=\"checkUname()\"/>\r\n");
      out.write("\t\t\t\t  &nbsp;&nbsp;<span id=\"username\"></span></td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"1\"/></td>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"38\"><span class=\"STYLE3\">原密码：</span></td>\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"ypw\" type=\"hidden\" value=\"");
      out.print(u.getPw() );
      out.write("\">\r\n");
      out.write("                  <input name=\"ymm\"  id=\"ymm\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\" onchange=\"checkPW()\"/>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  &nbsp;&nbsp;<span id=\"ymm1\"></span>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td height=\"40\"><span class=\"STYLE3\">新密码：</span></td>\r\n");
      out.write("                  <td colspan=\"3\"> <input name=\"xmm\"  id=\"xmm\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\" onblur=\"checkXMM()\"/>\r\n");
      out.write("\t\t\t\t  &nbsp;&nbsp;<span id=\"xmm1\"></span>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                </tr><tr>\r\n");
      out.write("                  <td height=\"40\"><span class=\"STYLE3\">确认密码：</span></td>\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"qrmm\" id=\"qrmm\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\" onblur=\"checkQRMM()\"/>\r\n");
      out.write("\t\t\t\t  &nbsp;&nbsp;<span id=\"qrmm1\"></span>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"42\" class=\"STYLE3\">密保一：</td>\r\n");
      out.write("                  <td><select name=\"q1\" style=\"height:20px;\" class=\"se\" >\r\n");
      out.write("                      <option width=35px>请选择密保问题</option>\r\n");
      out.write("                      <option >您母亲的姓名是？</option>\r\n");
      out.write("                      <option >您配偶的生日是？</option>\r\n");
      out.write("                      <option >您母亲的生日是？</option>\r\n");
      out.write("                      <option >您高中班主任的名字是？</option>\r\n");
      out.write("                      <option >您父亲的姓名是？</option>\r\n");
      out.write("                      <option >您小学班主任的名字是？</option>\r\n");
      out.write("                      <option >您父亲的生日是？</option>\r\n");
      out.write("                      <option >您配偶的姓名是？</option>\r\n");
      out.write("                      <option >您初中班主任的名字是？</option>\r\n");
      out.write("                      <option >您最熟悉的童年好友名字是？</option>\r\n");
      out.write("                      <option >您最熟悉的学校宿舍室友名字是？</option>\r\n");
      out.write("                      <option >对您影响最大的人名字是？</option>\r\n");
      out.write("                    </select>                  </td>\r\n");
      out.write("                  <td class=\"STYLE3\">答案一：</td>\r\n");
      out.write("                  <td><input name=\"a1\" type=\"text\" style=\"height:20px\" size=\"30\" class=\"te\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td class=\"STYLE3\">密保二：</td>\r\n");
      out.write("                  <td><select name=\"q2\"  style=\"height:20px;\" class=\"se\">\r\n");
      out.write("                      <option width=40px>请选择密保问题</option>\r\n");
      out.write("                      <option >您母亲的姓名是？</option>\r\n");
      out.write("                      <option >您配偶的生日是？</option>\r\n");
      out.write("                      <option >您母亲的生日是？</option>\r\n");
      out.write("                      <option >您高中班主任的名字是？</option>\r\n");
      out.write("                      <option >您父亲的姓名是？</option>\r\n");
      out.write("                      <option >您小学班主任的名字是？</option>\r\n");
      out.write("                      <option >您父亲的生日是？</option>\r\n");
      out.write("                      <option >您配偶的姓名是？</option>\r\n");
      out.write("                      <option >您初中班主任的名字是？</option>\r\n");
      out.write("                      <option >您最熟悉的童年好友名字是？</option>\r\n");
      out.write("                      <option >您最熟悉的学校宿舍室友名字是？</option>\r\n");
      out.write("                      <option >对您影响最大的人名字是？</option>\r\n");
      out.write("                    </select>                  </td>\r\n");
      out.write("                  <td class=\"STYLE3\">答案一：</td>\r\n");
      out.write("                  <td><input name=\"a2\" type=\"text\" style=\"height:20px\" size=\"30\" class=\"te\"/></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"1\"/></td>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"39\" class=\"STYLE3\">生日：</td>\r\n");
      out.write("                  <td><input name=\"birth\" type=\"text\" style=\"height:20px\" value=\"");
      out.print(u.getBirth() );
      out.write("\"class=\"te\" maxlength=\"10\"  size=\"30\"\" onfocus=\"$(this).calendar()\" readonly/></td>\r\n");
      out.write("                  <td class=\"STYLE3\">星座：</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("\t\t\t\t     <select name=\"xz\"  style=\"height:20px;\" class=\"se\">\r\n");
      out.write("                      <option width=\"40\">--------请选择您的星座-------</option>\r\n");
      out.write("                      <option selected=\"selected\">水瓶座</option>\r\n");
      out.write("                      <option >摩羯座</option>\r\n");
      out.write("                      <option >射手座</option>\r\n");
      out.write("                      <option >处女座</option>\r\n");
      out.write("                      <option >巨蟹座</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"62\" class=\"STYLE3\">家乡：</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("\t\t\t\t      <table width=\"232\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"h1\" id=\"s1\" style=\"width:65px\" class=\"se\">\r\n");
      out.write("                    <option>省份</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"h2\" id=\"s2\" style=\"width:65px\" class=\"se\">\r\n");
      out.write("                    <option>城市</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"100px\"><select name=\"h3\" id=\"s3\" style=\"width:80px\" class=\"se\">\r\n");
      out.write("                    <option>市县</option>\r\n");
      out.write("                  </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                 <td colspan=\"2\">\r\n");
      out.write("                    <input type=\"text\" value=\"");
      out.print(u.getHome() );
      out.write("\" style=\"height:20px\" size=\"30\" class=\"te\" readonly=\"true\"/>\r\n");
      out.write("                 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td class=\"STYLE3\" valign=\"top\">个性签名：</td>\r\n");
      out.write("                  <td valign=\"top\" colspan=\"2\"><textarea name=\"pnote\" cols=\"40\" rows=\"2\" class=\"area\">");
      out.print(u.getUsernote() );
      out.write("</textarea>                  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td colspan=\"4\"><input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\" onclick=\"return check()\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\t\t    </form>\r\n");
      out.write("\t\t<!--表格主体-->\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
