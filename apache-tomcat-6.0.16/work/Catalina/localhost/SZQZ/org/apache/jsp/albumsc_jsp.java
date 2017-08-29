package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;

public final class albumsc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'albumsc.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write("  .STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("}\r\n");
      out.write(".se\r\n");
      out.write("{\r\n");
      out.write("height: 20px;\r\n");
      out.write("color:#000000\r\n");
      out.write("line-height: 1180%;\r\n");
      out.write("border:1px solid #3399ff;\r\n");
      out.write("}\r\n");
      out.write(".ch{border:none;background:url(pictures/photo3fb.jpg);  left top no-repeat;width:48px; height:21px; }\r\n");
      out.write(".qd{border:none;background:url(pictures/logsure.jpg);  left top no-repeat;width:46px; height:20px; }\r\n");
      out.write(".STYLE2 {font-size: 12px}\r\n");
      out.write(".area \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("\t<title>上传图片</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"codebase/GooUploader.css\"/>\r\n");
      out.write("\t<script  type=\"text/javascript\" src=\"codebase/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t<script  type=\"text/javascript\" src=\"codebase/GooUploader.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"codebase/swfupload/swfupload.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("var demo1,demo2;\r\n");
      out.write("var  post_params = {session_id:\"f1423rwe543t4wrtwerwe\"};\r\n");
      out.write("var property2={\r\n");
      out.write("\twidth:600,\r\n");
      out.write("\theight:600,\r\n");
      out.write("\tmultiple:true,\r\n");
      out.write("    //file_types:\"*.jpg;*.gif\",\r\n");
      out.write("    //file_types_description: \"Web Image Files\",\r\n");
      out.write("    post_params:post_params,\r\n");
      out.write("    btn_add_text:\"添加\",\r\n");
      out.write("    btn_up_text:\"上传\",\r\n");
      out.write("    btn_cancel_text:\"放弃\",\r\n");
      out.write("    btn_clean_text:\"清空\",\r\n");
      out.write("    op_del_text:\"单项删除\",\r\n");
      out.write("    op_up_text:\"单项上传\",\r\n");
      out.write("    op_fail_text:\"上传失败\",\r\n");
      out.write("    op_ok_text:\"上传成功\",\r\n");
      out.write("    op_no_text:\"取消上传\",\r\n");
      out.write("\tupload_url:\"UploadFileServlet\"\r\n");
      out.write("};\r\n");
      out.write("var property1={\r\n");
      out.write("\tmultiple:false,\r\n");
      out.write("    //file_types:\"*.jpg;*.gif\",\r\n");
      out.write("    //file_types_description: \"Web Image Files\",\r\n");
      out.write("    post_params:post_params,\r\n");
      out.write("    btn_add_text:\"添加\",\r\n");
      out.write("    op_del_text:\"单项删除\",\r\n");
      out.write("    op_up_text:\"单项上传\",\r\n");
      out.write("    op_fail_text:\"上传失败\",\r\n");
      out.write("    op_ok_text:\"上传成功\",\r\n");
      out.write("    op_no_text:\"取消上传\",\r\n");
      out.write("\tupload_url:\"UploadFileServlet\"\r\n");
      out.write("};\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  demo2=$.createGooUploader($(\"#demo2\"),property2)\r\n");
      out.write("  demo1=$.createGooUploader($(\"#demo1\"),property1);\r\n");
      out.write("  //demo1.$swfUpload.setPostParams(post_params);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("  function show1(){\r\n");
      out.write("\t  var y=document.getElementById(\"s\").value;\r\n");
      out.write("\t  demo2.$swfUpload.setPostParams({\"id\":y});\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("  function denyshow(){\r\n");
      out.write("\t  var x=document.getElementById(\"sc\");\r\n");
      out.write("\t  x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("    function showcc(){\r\n");
      out.write("     var x=document.getElementById(\"cc\");\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("    function denycc(){\r\n");
      out.write("     var x=document.getElementById(\"cc\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("    function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"pictures/logebg.jpg\" onload=\"framesize()\">\r\n");
      out.write("  <table width=\"70%\" height=\"189\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  \r\n");
      out.write("    <td height=\"40\" background=\"pictures/photo1.jpg\">\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td width=\"15%\" height=\"40\" class=\"STYLE1\">上传图片</td>\r\n");
      out.write("\t\t    <td width=\"15%\" valign=\"middle\">&nbsp;<img src=\"pictures/photoadd.jpg\" width=\"14\" height=\"15\" /><span class=\"STYLE2\"><a href=\"javascript:void(0)\" onclick=\"showcc()\">创建新相册</a></span></td>\r\n");
      out.write("\t\t\t\t\t<form method=\"post\" action=\"SerHandleSC\">\r\n");
      out.write("\t\t\t\t\t<td width=\"54%\">\r\n");
      out.write("\t\t\t\t\t <div id=\"cc\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t     <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t <td width=\"14%\" class=\"STYLE2\" align=\"right\" height=\"40\">相册名：</td>\r\n");
      out.write("\t\t\t\t\t <td width=\"50%\"><input type=\"text\" size=\"20\" maxlength=\"10\" style=\"height:20\" name=\"name\"/>\r\n");
      out.write("\t\t\t\t\t   &nbsp;<select name=\"pubpri\">\r\n");
      out.write("\t\t\t\t\t      <option>公开</option>\r\n");
      out.write("\t\t\t\t\t      <option>保密</option>\r\n");
      out.write("\t\t\t\t\t   </select>\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t\t <td width=\"36%\" valign=\"middle\"><input type=\"submit\" value=\"\" class=\"qd\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t <input type=\"hidden\" name=\"tag\" value=\"addxc\">\r\n");
      out.write("\t\t\t\t\t <span class=\"STYLE2\"><a href=\"javascript:void(0)\" onclick=\"denycc()\">取消</a></span></td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("            <td width=\"16%\"><a href=\"album1.jsp\" class=\"STYLE2\">返回相册首页</a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"41\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"18%\" height=\"24\" class=\"STYLE1\">请选择一个相册：</td>\r\n");
      out.write("        <td width=\"42%\"><select id=\"s\" class=\"se\" style=\"width:250px\">\r\n");
      out.write("            ");

              List<Map<String, Object>> list=(List<Map<String, Object>>)request.getAttribute("sc");
              for(int i=0;i<list.size();i++){
            	  Map<String,Object> map=list.get(i);
            	  String name=map.get("ALBUMNAME").toString();  
            	  String albumid=map.get("ALBUMID").toString(); 
            
      out.write("\r\n");
      out.write("            <option value=\"");
      out.print(albumid );
      out.write('"');
      out.write('>');
      out.print(name );
      out.write("</option>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          </select>        </td>\r\n");
      out.write("        <td width=\"40%\" class=\"STYLE2\"><a href=\"javascript:void(0)\" onclick=\"show1()\">点击启动上传功能</a>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <tr><td><hr width=\"100%\" size=\"2\" color=\"#0066FF\" /></td></tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"300\">\r\n");
      out.write("\t  \r\n");
      out.write("\t\t\t\t <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t   <tr>\r\n");
      out.write("\t\t\t    <td width=\"80%\" height=\"300\">\r\n");
      out.write("\t\t\t    <div id=\"sc\" ><!-- 上传得组件3333333333333333333333333333333333333333333333 -->\r\n");
      out.write("\t\t\t\t       <br/>\r\n");
      out.write("\t\t\t           <div id=\"demo2\"></div>\r\n");
      out.write("\t\t\t    <!-- 上传得组件333333333333333333333333333333333333333333333 -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t      \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 左侧空白 -->\r\n");
      out.write("\t\t\t    <td width=\"20%\">\r\n");
      out.write("\t\t\t    &nbsp;\r\n");
      out.write("\t\t\t    </td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t</table>\r\n");
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
