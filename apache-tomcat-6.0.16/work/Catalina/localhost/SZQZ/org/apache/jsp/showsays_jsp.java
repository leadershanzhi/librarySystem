package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;
import com.shxt.szqz.beans.*;

public final class showsays_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'showsays.jsp' starting page</title>\r\n");
      out.write("    \r\n");
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
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function nc1(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function nc2(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function show(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function hide(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function change1(){\r\n");
      out.write("  var x=document.getElementById(\"ly\");\r\n");
      out.write("  x.rows=\"3\";\r\n");
      out.write("  var x=document.getElementById(\"lyd\");\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change2(){\r\n");
      out.write("     var s=document.getElementById(\"ly\");\r\n");
      out.write("\t s.rows=\"2\";\r\n");
      out.write("\t var x=document.getElementById(\"lyd\");\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function have1(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("     x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function have11(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("     x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("    function have2(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("     x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function have22(i){\r\n");
      out.write("     var x=document.getElementById(i);\r\n");
      out.write("     x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function change3(i,j){\r\n");
      out.write("  var x=document.getElementById(i);\r\n");
      out.write("  x.rows=\"2\";\r\n");
      out.write("  var x=document.getElementById(j);\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change4(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function change5(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"2\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function change6(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  var XMLHttpReq = false;\r\n");
      out.write("   \r\n");
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
      out.write("\t\tXMLHttpReq.onreadystatechange = back;//指定响应函数\r\n");
      out.write("\t\tXMLHttpReq.send(null);  // 发送请求\r\n");
      out.write("\t}\r\n");
      out.write("\t// 处理返回信息函数\r\n");
      out.write("    function back() {\r\n");
      out.write("    \tif (XMLHttpReq.readyState == 4) { // 判断对象状态\r\n");
      out.write("        \tif (XMLHttpReq.status == 200) { // 信息已经成功返回，开始处理信息\r\n");
      out.write("            \tvar text=XMLHttpReq.responseText;\r\n");
      out.write("        \t    var message=document.getElementById(\"message\");\r\n");
      out.write("        \t    if(\"1\"==text){\r\n");
      out.write("        \t    \tmessage.innerHTML=\"<font color=red size='-1' face='幼圆'>&nbsp;&nbsp;&nbsp;删除成功</font>\";\r\n");
      out.write("        \t    }\r\n");
      out.write("                setTimeout(c1,2000);\r\n");
      out.write("            } \r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t  function c1(){\r\n");
      out.write("\t\t  var message=document.getElementById(\"message\");\r\n");
      out.write("\t\t  message.innerHTML=\"\";\r\n");
      out.write("\t  }\r\n");
      out.write("       function del1(i,j){\r\n");
      out.write("    \tvar x=confirm(\"您确定要删除此信息？\");\r\n");
      out.write("    \tif(x==true){\r\n");
      out.write("    \t  var objDiv = document.getElementById(i);\r\n");
      out.write("\t      var vtables = objDiv.childNodes; \r\n");
      out.write("\t      if (vtables.length > 0)\r\n");
      out.write("\t        objDiv.removeChild(vtables[vtables.length - 1]);  \r\n");
      out.write("\t       sendRequest(\"SerHandleSay?tag=del&sayid=\"+j);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("   function del2(i,j){\r\n");
      out.write("    \tvar x=confirm(\"您确定要删除此信息？\");\r\n");
      out.write("    \tif(x==true){\r\n");
      out.write("    \t  var objDiv = document.getElementById(i);\r\n");
      out.write("\t      var vtables = objDiv.childNodes; \r\n");
      out.write("\t      if (vtables.length > 0)\r\n");
      out.write("\t        objDiv.removeChild(vtables[vtables.length - 1]);  \r\n");
      out.write("\t       sendRequest(\"SerHandleSay?tag=rdel&sayresid=\"+j);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("   function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("\t    \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf{border:none;background:url(pictures/liuyan1.jpg);  left top no-repeat;width:70px; height:25px; }\r\n");
      out.write(".hf1{border:none;background:url(pictures/sayfb.jpg);  left top no-repeat;width:54px; height:21px; }\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".areastyle \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".areastyle1\r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff  right bottom no-repeat;color:#03C;font-size:14px}\r\n");
      out.write(".STYLE3 {font-size: 12px}\r\n");
      out.write(".STYLE4 {color: #0033FF ;font-size: 12px}\r\n");
      out.write(".STYLE5 {font-size: 10px}\r\n");
      out.write(".STYLE6 {\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tcolor: #CC6600;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\" onload=\"framesize()\">\r\n");
      out.write("   <!--整体表格-->\r\n");
      out.write("   <table width=\"70%\" height=\"220\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\" \">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td valign=\"top\"><img src=\"pictures/saylogo.jpg\" width=\"1015\" height=\"24\" />\r\n");
      out.write("         <table width=\"100%\" height=\"175\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("               <td width=\"75%\" height=\"173\" valign=\"top\"><table width=\"100%\" height=\"66\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     ");

                     String benren="";
                     benren=request.getSession().getAttribute("userid").toString();
                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                     <td><form method=\"post\" action=\"SerHandleSay?tag=add\">\r\n");
      out.write("                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td>&nbsp;&nbsp;&nbsp;**************</td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td align=\"center\">\r\n");
      out.write("\t\t\t\t\t         <textarea name=\"lyarea\" id=\"ly\" class=\"areastyle\" cols=\"98\" rows=\"2\" onfocus=\"change1()\"></textarea></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("\t\t\t\t\t\t       \r\n");
      out.write("                             <td>\r\n");
      out.write("\t\t\t\t\t\t\t <div id=\"lyd\" style=\"display:none\">&nbsp;&nbsp;\r\n");
      out.write("                               <input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("                               &nbsp;&nbsp; <a href=\"javascript:void(0)\" onclick=\"change2()\" class=\"STYLE3\">取消</a></div></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                         </table>\r\n");
      out.write("                     </form></td>");
} 
      out.write("\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"25\"><div id=\"message\"></div></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"10\"><hr width=\"95%\" size=\"2\" color=\"#0000FF\" align=\"center\"/></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"29\"><!--333333333333-->\r\n");
      out.write("                    ");

                    DBUtil db=new DBUtil();
                    List<Map<String, Object>> list=(List<Map<String, Object>>)request.getAttribute("list");
                    String a="",b="",bb="",c="",cc="",d="",e="";
                    UserBean u=null;
                    for(int i=0;i<list.size();i++){
            			Map<String, Object> map=list.get(i);
            			a=map.get("SAYID").toString();
            			b=map.get("HOST").toString();
            			bb=db.getUsername(b);
            			c=map.get("SAYPERSON").toString();
            			cc=db.getUsername(c);
            			d=map.get("SAYCONTENT").toString();
            			e=map.get("SAYTIME").toString();	
            			u=new InitUser().getUser(b);
                    
      out.write(" \r\n");
      out.write("                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
      out.print(i-3012 );
      out.write("\">\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td width=\"15%\" height=\"79\" valign=\"top\" align=\"center\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"66\" height=\"66\" /></td>\r\n");
      out.write("                             <td width=\"85%\"><!--正文-->\r\n");
      out.write("                                 <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/bgmain.jpg\">\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                         <tr onmouseover=\"have1(");
      out.print(i+1000 );
      out.write(")\" onmouseout=\"have11(");
      out.print(i+1000 );
      out.write(")\">\r\n");
      out.write("                                           <td width=\"17%\" height=\"22\"><span class=\"STYLE4\">");
      out.print(bb );
      out.write("</span></td>\r\n");
      out.write("                                           <td width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <span class=\"STYLE5\">");
      out.print(e );
      out.write("</span>\t\t\t\t\t\t\t\t\t\t                                            </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <td width=\"23%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <div id=\"");
      out.print(i+1000 );
      out.write("\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"change3(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\">回复</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <input type=\"hidden\" value=\"");
      out.print(a );
      out.write("\" id=\"is\">\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");

                                         if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
                                              if(benren.equals(b)){
                                         
                                         
      out.write("\r\n");
      out.write("                                              \r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   &nbsp;&nbsp;<a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"del1(");
      out.print(i-3012 );
      out.write(',');
      out.print(a );
      out.write(")\">删除</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   \r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   \r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   &nbsp;&nbsp;<a href=\"SerAddLetter?tag=jb&from=");
      out.print(benren );
      out.write("&to=");
      out.print(b );
      out.write("\" class=\"STYLE3\">举报</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   </div>\t\t\t\t\t\t\t\t           </td>\r\n");
      out.write("                                         </tr>\r\n");
      out.write("                                     </table></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td ><span class=\"STYLE3\"><br/>\r\n");
      out.write("                                     ");
      out.print(d );
      out.write("</span></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><hr width=\"98%\" color=\"#666666\" size=\"2\" align=\"left\" /></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><!--hufu-->\r\n");
      out.write("                                     ");
 
									    String sql1="select * from qz.sayres where sayid=? order by restime asc";
										Object obj1[]={a};
										List<Map<String, Object>> list1=db.queryToList(sql1, obj1);
										String r1="",r2="",r3="",r33="",r4="",r5="";
										for(int j=0;j<list1.size();j++){
											Map<String, Object> map1=list1.get(j);
											r1=map1.get("SAYRESID").toString();
											r2=map1.get("SAYID").toString();
											r3=map1.get("RESPERSON").toString();
											r33=db.getUsername(r3);
											r4=map1.get("RESTIME").toString();
											r5=map1.get("RESCONTENT").toString();
											u=new InitUser().getUser(r3);
								     
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
      out.print(i-4444 );
      out.write("\">\r\n");
      out.write("                                            \r\n");
      out.write("                                            <tr onmouseover=\"have2(");
      out.print((i+2)*10+j );
      out.write(")\" onmouseout=\"have22(");
      out.print((i+2)*10+j );
      out.write(")\">\r\n");
      out.write("                                             <td width=\"16%\" rowspan=\"2\" align=\"center\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"55\" height=\"55\" /></td>\r\n");
      out.write("                                             <td width=\"63%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <span class=\"STYLE4\">");
      out.print(r33 );
      out.write("</span>&nbsp;<span class=\"STYLE5\"> ");
      out.print(r4 );
      out.write("\t</span>&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\t\t\t\t     </td>\r\n");
      out.write("\t\t\t\t\t\t\t                  <td width=\"21%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div id=\"");
      out.print((i+2)*10+j );
      out.write("\" style=\"display:none\"><a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"show(");
      out.print((i+1)*101+j*10 );
      out.write(")\">回复</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");

												    if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
												       if(benren.equals(r3)){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t         <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"del2(");
      out.print(i-4444 );
      out.write(',');
      out.print(r1 );
      out.write(")\">删除</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t        ");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t            ");
 if(benren.equals(b)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t               <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"del2(");
      out.print(i-4444 );
      out.write(',');
      out.print(r1 );
      out.write(")\">删除</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t            ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t     ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   <a href=\"SerAddLetter?tag=jb&from=");
      out.print(benren );
      out.write("&to=");
      out.print(r3 );
      out.write("\" class=\"STYLE3\">举报</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                              <td> <span class=\"STYLE3\">");
      out.print(r5 );
      out.write("</span></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td>&nbsp;</td>\r\n");
      out.write("                                             <td colspan=\"2\">\r\n");
      out.write("                                             \r\n");
      out.write("                                             <!---变化的代码->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t     <table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--第二层-->\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t");
 
	String sql5="select * from qz.sayress where resid=? and sayid=? order by resstime asc";
		Object obj5[]={r1,r2};
		List<Map<String, Object>> list5=db.queryToList(sql5, obj5);
		String d1="",d2="",d22="",d3="",d4="",d5="",d6="";
		for(int z=0;z<list5.size();z++){
			Map<String, Object> map5 = list5.get(z);
			d1=map5.get("RESSID").toString();
			d2=map5.get("RESSPERSON").toString();
			d22=db.getUsername(d2);
			d3=map5.get("RESID").toString();
			d4=map5.get("SAYID").toString();
			d5=map5.get("RESSTIME").toString();
			d6=map5.get("RESSCONTENT").toString();
			u=new InitUser().getUser(d2);
		
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\"><hr width=\"70%\" size=\"1\" align=\"left\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr onmouseover=\"nc1(");
      out.print(i*2000+j*110+z*10 );
      out.write(")\" onmouseout=\"nc2(");
      out.print(i*2000+j*110+z*10 );
      out.write(")\">\r\n");
      out.write("    <td width=\"16%\" rowspan=\"2\" align=\"center\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"50\" height=\"50\" /></td>\r\n");
      out.write("    <td width=\"34%\" height=\"18\"><span class=\"STYLE4\">");
      out.print(d22 );
      out.write("</span>&nbsp;&nbsp;<span class=\"STYLE5\">");
      out.print(d5 );
      out.write("</span></td>\r\n");
      out.write("    <td width=\"50%\"><div id=\"");
      out.print(i*2000+j*110+z*10 );
      out.write("\" style=\"display:none\">\r\n");
      out.write("    ");

    if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
        if(benren.equals(d2)){
    
      out.write("\r\n");
      out.write("        <a href=\"SerHandleSay?tag=ressdel&ressid=");
      out.print(d1 );
      out.write("\" class=\"STYLE3\">删除</a>&nbsp;&nbsp;\r\n");
      out.write("      ");
}else{
      out.write(" \r\n");
      out.write("           ");
if(benren.equals(r3)){ 
      out.write("\r\n");
      out.write("               <a href=\"SerHandleSay?tag=ressdel&ressid=");
      out.print(d1 );
      out.write("\" class=\"STYLE3\">删除</a>&nbsp;&nbsp;\r\n");
      out.write("           ");
} 
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       ");
} 
      out.write("\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"SerAddLetter?tag=jb&from=");
      out.print(benren );
      out.write("&to=");
      out.print(d2 );
      out.write("\" class=\"STYLE3\">举报</a>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\" class=\"STYLE3\">");
      out.print(d6 );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("\t<!--内层文本框-->\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<form  method=\"post\" action=\"SerHandleSay?tag=ressadd\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"display:none\" id=\"");
      out.print((i+1)*101+j*10 );
      out.write("\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"2%\" height=\"20\">&nbsp;</td>\r\n");
      out.write("    <td width=\"98%\">\r\n");
      out.write("      <textarea name=\"ressarea\" cols=\"60\" rows=\"1\" class=\"areastyle1\"></textarea>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"submit\" type=\"submit\" class=\"hf1\" value=\"\" />&nbsp;\r\n");
      out.write("        <input name=\"sayid\" type=\"hidden\" value=\"");
      out.print(r2 );
      out.write("\"/>\r\n");
      out.write("        <input name=\"resid\" type=\"hidden\" value=\"");
      out.print(r1 );
      out.write("\"/>\r\n");
      out.write("      <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"hide(");
      out.print((i+1)*101+j*10 );
      out.write(")\">取消</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form> \r\n");
      out.write("   <!--内层文本框-->\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--第二层-->\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!---变化的代码->                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                               \r\n");
      out.write("                                            </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td colspan=\"2\"><hr width=\"73%\" align=\"center\" size=\"1\"/></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                         </table>\r\n");
      out.write("                                       <!--hufu--> ");
 }
      out.write("                                    </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <form action=\"SerHandleSay\" method=\"post\">\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("                                         <textarea name=\"hfarea\" id=\"");
      out.print(i );
      out.write("\" cols=\"70\" rows=\"1\" class=\"areastyle1\" onfocus=\"change3(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\"></textarea>                                     </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><div id=\"");
      out.print(i-100 );
      out.write("\" style=\"display:none\">\r\n");
      out.write("                                       <input type=\"hidden\" name=\"sayid\" value=\"");
      out.print(a );
      out.write("\"/>\r\n");
      out.write("                                       <input type=\"hidden\" name=\"tag\" value=\"radd\"/>\r\n");
      out.write("                                       <input  type=\"submit\" class=\"hf1\" value=\"\"/>\r\n");
      out.write("                                     <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"change4(");
      out.print(i );
      out.write(',');
      out.print(i-100 );
      out.write(")\">取消</a></div></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td bgcolor=\"#FFFFFF\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("                                 </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("                             <!--正文--></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                         </table>\r\n");
      out.write("                       <!--33333333333-->  \r\n");
      out.write("                       ");
} 
      out.write("                   </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("               </table></td>\r\n");
      out.write("               <td width=\"25%\"><img src=\"pictures/sayborder.jpg\" width=\"254\" height=\"100%\" /></td>\r\n");
      out.write("             </tr>\r\n");
      out.write("         </table></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <!--整体表格-->\r\n");
      out.write("   <h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015 四海兴唐单智版权所有  吉 ICP备11011334号-1 </font></h5>\r\n");
      out.write("   <h5 align=\"center\"><font color=\"#C0C0C0\">联系我：421170702@qq.com|18744033060</font></h5>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
