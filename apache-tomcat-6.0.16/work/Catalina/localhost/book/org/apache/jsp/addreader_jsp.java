package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.service.impl.*;
import com.shxt.service.*;

public final class addreader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.release();
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }\r\n");
      out.write(".STYLE2 {\r\n");
      out.write("\tfont-family: \"宋体\";\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".sty{\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.loadmask.css\" type=\"text/css\"></link>\r\n");
      out.write("    \r\n");
      out.write("<title>读者注册</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.loadmask.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/imagePreview.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\t$(\"#addReaderForm\").validate({\r\n");
      out.write("\t\t\tsubmitHandler : function(form) {\r\n");
      out.write("\t\t\t\t$(form).mask(\"正在传输数据，请稍候。。。\");// loading\r\n");
      out.write("\t\t\t\t$(\"#lname1\").val($(\"#lname2\").val());\r\n");
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
      out.write("\t\t\t\t\"lname\" : {\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tremote : {\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"checklnameReaderAction.action\",\r\n");
      out.write("\t\t\t\t\t\terror : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"re.name\" : {\r\n");
      out.write("\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"re.mail\" : {\r\n");
      out.write("\t\t\t\t\temail : true\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"pw\":{\r\n");
      out.write("\t\t\t\t\trequired : true, \r\n");
      out.write("\t\t\t\t\tminlength:4,\r\n");
      out.write("\t\t\t\t\tmaxlength:8\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"re.phone\" : {\r\n");
      out.write("\t\t\t    \tnumber : true,\r\n");
      out.write("\t\t\t\t\tminlength:7,\r\n");
      out.write("\t\t\t\t\tmaxlength:11\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    \"re.rpw\":{\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tequalTo : \"#pw\"\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\"lname\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>*必填项</font>\",\r\n");
      out.write("\t\t\t\t\tremote : \"<font color='red' size='-1'>*已被占用</font>\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"re.name\" : {\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>*必填项</font>\"\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"re.mail\" : {\r\n");
      out.write("\t\t\t\t\temail : \"<font color='red' size='-1'>*格式有误</font>\"\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"re.phone\" :{\r\n");
      out.write("\t\t\t\t\tnumber : \"<font color='red' size='-1'>*仅能为数字</font>\",\r\n");
      out.write("\t\t\t\t\tminlength:jQuery.format(\"<font color='red' size='-1'>*号码不少于 8位 </font>\"),\r\n");
      out.write("\t\t\t\t\tmaxlength:jQuery.format(\"<font color='red' size='-1'>*号码不多于11位</font>\")\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"pw\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>*必填项</font>\", \r\n");
      out.write("\t\t\t\t\tminlength:jQuery.format(\"<font color='red' size='-1'>*密码不少于 4位 </font>\"),\r\n");
      out.write("\t\t\t\t\tmaxlength:jQuery.format(\"<font color='red' size='-1'>*密码不多于8位</font>\")\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t    \"re.rpw\" :{\r\n");
      out.write("\t\t\t\t\trequired : \"<font color='red' size='-1'>*必填项</font>\",\r\n");
      out.write("\t\t\t\t\tequalTo :  \"<font color='red' size='-1'>*前后密码不一致</font>\"\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
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
      out.write("\t\t$(form).unmask();// 闅愯棌loading\r\n");
      out.write("\t\talert(\"添加失败！\");\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

    IReaderService irs=new ReaderServiceImpl();
    Set<Dict> sdept=irs.getAllSdept();

      out.write("\r\n");
      out.write("<body bgcolor=\"00ffff\">\r\n");
      out.write("<br/>\r\n");
      out.write("<form action=\"addReaderAction.action\" method=\"post\" enctype=\"multipart/form-data\" id=\"addReaderForm\">\r\n");
      out.write("    <table width=\"52%\" border=\"1\" bordercolor=\"white\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"2%\">&nbsp;</td>\r\n");
      out.write("    <td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td rowspan=\"4\">&nbsp;</td>\r\n");
      out.write("    <td width=\"28%\" height=\"50\"><div id=\"preview\"><img id=\"imghead\" width=80 height=100 border=1 src=\"images/lytp.jpg\" /></div></td>\r\n");
      out.write("    <td rowspan=\"2\">\r\n");
      out.write("\t<table width=\"94%\" height=\"105\" border=\"0\" cellpadding=\"0\" cellspacing=\"2\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"32%\" height=\"17\">&nbsp;</td>\r\n");
      out.write("        <td width=\"61%\">&nbsp;</td>\r\n");
      out.write("        <td width=\"7%\" rowspan=\"4\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">登   录   名：</td>\r\n");
      out.write("        <td><input type=\"hidden\" style=\"height:18px\" name=\"re.lname\" id=\"lname1\" size=\"15\" />\r\n");
      out.write("            <input type=\"text\" style=\"height:18px\" name=\"lname\" id=\"lname2\" size=\"15\" />\r\n");
      out.write("        \r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">姓        名：</td>\r\n");
      out.write("        <td><input type=\"text\" style=\"height:18px\" name=\"re.name\" size=\"15\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">密 　  码：</td>\r\n");
      out.write("        <td><input type=\"password\" style=\"height:18px\" name=\"pw\" id=\"pw\" size=\"16\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\" class=\"STYLE2\" align=\"center\">确认密码：</td>\r\n");
      out.write("        <td><input type=\"password\" style=\"height:18px\" name=\"re.rpw\" size=\"16\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"17\"><input name=\"file\" type=\"file\" size=\"10\" onChange=\"preview(this,'preview','imghead')\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"92\" colspan=\"2\"><table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td width=\"7%\" rowspan=\"4\">&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">性别：</td>\r\n");
      out.write("        <td><select style=\"width:135px\" name=\"re.sex\">\r\n");
      out.write("\t\t        <option>男</option>\r\n");
      out.write("\t\t        <option>女</option>\r\n");
      out.write("\t\t    </select></td>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">身份:</td>\r\n");
      out.write("        <td><select  style=\"width:155px\" name=\"re.identity\">\r\n");
      out.write("\t\t        <option>本科生</option>\r\n");
      out.write("\t\t        <option>研究生</option>\r\n");
      out.write("\t\t\t\t<option>教职工</option>\r\n");
      out.write("\t\t    </select></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"13%\" height=\"30\" align=\"center\" class=\"STYLE2\">电话：</td>\r\n");
      out.write("        <td width=\"45%\"><input type=\"text\" style=\"height:18px\" name=\"re.phone\" size=\"17\" /></td>\r\n");
      out.write("        <td width=\"13%\" class=\"STYLE2\" align=\"center\">生日：</td>\r\n");
      out.write("        <td width=\"20%\" >");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\" >邮箱：</td>\r\n");
      out.write("        <td><input type=\"text\" style=\"height:18px\" name=\"re.mail\" size=\"17\"/></td>\r\n");
      out.write("        <td class=\"STYLE2\" align=\"center\">系别：</td>\r\n");
      out.write("        <td>\r\n");
      out.write("             <select  style=\"width:155px\" name=\"re.sdept\">\r\n");
      out.write("\t\t\r\n");
      out.write("                   ");
  for(Dict s:sdept){ 
      out.write("\r\n");
      out.write("                       <OPTION value=");
      out.print(s.getDicname() );
      out.write('>');
      out.print(s.getDicname() );
      out.write("</OPTION> \r\n");
      out.write("                   ");
} 
      out.write("\r\n");
      out.write("\t\t    </select>\r\n");
      out.write("        \r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"21\">&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td ><input type=\"submit\" class=\"hf\" value=\"\"/></td>\r\n");
      out.write("    <td >&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>  \r\n");
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

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /addreader.jsp(214,25) name = size type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setSize("20");
    // /addreader.jsp(214,25) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("re.birth");
    // /addreader.jsp(214,25) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "style", new String("height:18px"));
    // /addreader.jsp(214,25) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setId("time");
    // /addreader.jsp(214,25) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "onClick", new String("WdatePicker()"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_005fstyle_005fsize_005fonClick_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }
}
