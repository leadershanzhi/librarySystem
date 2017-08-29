package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.ccu.model.*;
import com.ccu.util.*;
import com.ccu.bean.*;

public final class alteruser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("    \r\n");
      out.write("<title>读者修改</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/imagePreview.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-calendar.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/shengshi.js\"></script> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"js/jquery-calendar.css\" /> \r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction preview(file,preview,imghead){\r\n");
      out.write("\t\tif($.browser.msie){\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(true,file,preview,imghead,80,100);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\t\t\t//参数 是否是IE，div的id，img的id，高,宽 \r\n");
      out.write("\t\t\tpreviewImage(false,file,preview,imghead,80,100);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#alterUserForm\").validate({\r\n");
      out.write("\t\t\tsubmitHandler : function(form) {\r\n");
      out.write("\t\t\t\t$(form).mask(\"正在传输数据，请稍候。。。\");// loading\r\n");
      out.write("\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\tsuccess : showResponse,\r\n");
      out.write("\t\t\t\t\terror : showError,\r\n");
      out.write("\t\t\t\t\tdataType : \"xml\"\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t$(form).ajaxSubmit(options);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\terrorElement : \"em\",\r\n");
      out.write("\t\t\tvalidClass : \"success\",\r\n");
      out.write("\t\t\tsuccess : function(label) {\r\n");
      out.write("\t\t\t\tlabel.text(\"\").addClass(\"success\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\trules : {\r\n");
      out.write("\t\t\t\t\"oldpw\" : {\r\n");
      out.write("\t\t\t\t\tremote : {\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"SerHandleUser?tag=check\",\r\n");
      out.write("\t\t\t\t\t\terror : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"uname\" : {\r\n");
      out.write("\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"email\" : {\r\n");
      out.write("\t\t\t\t\temail : true\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"pw\":{\r\n");
      out.write("\t\t\t\t\tremote : {\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"SerHandleUser?tag=checkk\",\r\n");
      out.write("\t\t\t\t\t\terror : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tminlength:4,\r\n");
      out.write("\t\t\t\t\tmaxlength:8\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"phone\" : {\r\n");
      out.write("\t\t\t    \tnumber : true,\r\n");
      out.write("\t\t\t\t\tminlength:7,\r\n");
      out.write("\t\t\t\t\tmaxlength:11\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"pwnew\":{\r\n");
      out.write("\t\t\t\t\tequalTo : \"#pw\"\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\"oldpw\" : {\r\n");
      out.write("\t\t\t\t\tremote : \"<font color='white' size='-1' face='宋体'>&nbsp;<strong>与原密码不同</font>\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"uname\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='white' size='-1' face='宋体'>&nbsp;<strong>必填项</font>\"\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"email\" : {\r\n");
      out.write("\t\t\t\t\temail : \"<font color='white' size='-1' face='宋体'>&nbsp;<strong>格式有误</font>\"\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"phone\" :{\r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='white' size='-1' face='宋体'>&nbsp;<strong>仅能为数字</font>\",\r\n");
      out.write("\t\t\t\t\tminlength:jQuery.format(\"<font color='white' size='-1' face='宋体'>&nbsp;<strong>号码少于 8位 </font>\"),\r\n");
      out.write("\t\t\t\t\tmaxlength:jQuery.format(\"<font color='white' size='-1' face='宋体'>&nbsp;<strong>号码多于11位</font>\")\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t    \"pw\" :{\r\n");
      out.write("\t\t\t    \tremote : \"<font color='white' size='-1' face='宋体'>&nbsp;<strong>请输入原密码</font>\",\r\n");
      out.write("\t\t\t\t\tminlength:jQuery.format(\"<font color='white' size='-1' face='宋体'>&nbsp;<strong>密码少于4位 </font>\"),\r\n");
      out.write("\t\t\t\t\tmaxlength:jQuery.format(\"<font color='white' size='-1' face='宋体'>&nbsp;<strong>密码多于8位</font>\")\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"pwnew\" :{\r\n");
      out.write("\t\t\t\t\tequalTo:  \"<font color='white' size='-1' face='宋体'>&nbsp;&nbsp;&nbsp;<strong>前后密码不一致</font>\"\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showResponse(responseXML, statusText, xhr, form) {\r\n");
      out.write("\t\t$(form).unmask();//\r\n");
      out.write("\t\talert(\"添加成功！\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction showError(responseXML, statusText, xhr, form) {\r\n");
      out.write("\r\n");
      out.write("\t\t$(form).unmask();\r\n");
      out.write("\t\talert(\"添加失败！\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"pictures/goodbg.jpg\" onLoad=\"setup()\">\r\n");
      out.write("<table width=\"70%\"  border=\"0\"  align=\"center\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"3%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"94%\"><table width=\"100%\" height=\"591\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" >\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"83\" valign=\"middle\"><span class=\"STYLE5\"><br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("      id: ");
      out.print(u.getUid() );
      out.write("</span>-------<font color=\"#0099CC\" size=\"+1\" face=\"隶书\"><a href=\"SerHandleMain\">返回</a></font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <td colspan=\"4\" ><hr width=\"100%\" color=\"#CCCCCC\"  size=\"3\"/></td>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"23\" valign=\"bottom\" class=\"STYLE2 STYLE4\">基本资料  &nbsp;&nbsp;&nbsp;<font size=\"-1\"  color=\"white\">*填写您需要修改的内容</font></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"3\"/></td>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("\t\t    <!--表格主体-->\r\n");
      out.write("\t\t      <form action=\"SerHandleUser?tag=alter\" method=\"post\" id=\"alterUserForm\">\r\n");
      out.write("\t\t      <table width=\"89%\" height=\"450\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" >\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"15%\" height=\"29\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"41%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"12%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"32%\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td class=\"STYLE3\">昵称：</td>\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"uname\"  type=\"text\" value=\"");
      out.print(u.getUname() );
      out.write("\"  style=\"height:20px\" size=\"30\" class=\"te\"/>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"3\"/></td>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"38\"><span class=\"STYLE3\">原密码：</span></td>\r\n");
      out.write("                  <td colspan=\"2\">\r\n");
      out.write("                  <input name=\"oldpw\" id=\"ymm\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\" />\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td height=\"40\"><span class=\"STYLE3\">新密码：</span></td>\r\n");
      out.write("                  <td colspan=\"3\"> <input name=\"pw\" id=\"pw\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\"/>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                </tr><tr>\r\n");
      out.write("                  <td height=\"40\"><span class=\"STYLE3\">确认密码：</span></td>\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"pwnew\" type=\"password\" style=\"height:20px\" size=\"30\" class=\"te\"/>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t\t<td colspan=\"4\"><hr width=\"100%\" color=\"#CCCCCC\"  size=\"3\"/></td>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"39\" class=\"STYLE3\">生日：</td>\r\n");
      out.write("                  <td><input name=\"birth\" type=\"text\" style=\"height:20px\" value=\"");
      out.print(u.getUbirth() );
      out.write("\" class=\"te\" maxlength=\"20\"  size=\"30\" onfocus=\"$(this).calendar()\" readonly/></td>\r\n");
      out.write("                  <td colspan=2>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"39\" class=\"STYLE3\">手机：</td>\r\n");
      out.write("                  <td><input name=\"phone\" type=\"text\" style=\"height:20px\" value=\"");
      out.print(u.getUphone() );
      out.write("\" class=\"te\" maxlength=\"15\"  size=\"30\"/></td>\r\n");
      out.write("                  <td colspan=2>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"39\" class=\"STYLE3\">E-mail：</td>\r\n");
      out.write("                  <td><input name=\"email\" type=\"text\" style=\"height:20px\" value=\"");
      out.print(u.getUemail() );
      out.write("\" class=\"te\" maxlength=\"20\"  size=\"30\"/></td>\r\n");
      out.write("                  <td colspan=2>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"62\" class=\"STYLE3\">家乡：</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("\t\t\t\t      <table width=\"232\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home1\" id=\"s1\" style=\"width:65px\" class=\"se\">\r\n");
      out.write("                    <option>省份</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"80px\"><select name=\"home2\" id=\"s2\" style=\"width:65px\" class=\"se\">\r\n");
      out.write("                    <option>城市</option>\r\n");
      out.write("                  </select>                  </td>\r\n");
      out.write("                  <td width=\"100px\"><select name=\"home3\" id=\"s3\" style=\"width:80px\" class=\"se\">\r\n");
      out.write("                    <option>市县</option>\r\n");
      out.write("                  </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("                 <td colspan=\"2\" align=\"left\">\r\n");
      out.write("                    <input type=\"text\" value=\"");
      out.print(u.getUaddress() );
      out.write("\" style=\"height:20px\" size=\"30\" class=\"te\" readonly=\"true\"/>\r\n");
      out.write("                 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td class=\"STYLE3\" valign=\"top\">个性签名：</td>\r\n");
      out.write("                  <td valign=\"top\" colspan=\"2\"><textarea name=\"note\" cols=\"40\" rows=\"2\" class=\"area\">");
      out.print(u.getUnote() );
      out.write("</textarea>                  </td>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td colspan=\"4\"><input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\"/></td>\r\n");
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
