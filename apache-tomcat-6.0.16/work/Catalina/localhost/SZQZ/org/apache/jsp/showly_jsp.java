package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.szqz.database.*;
import com.shxt.szqz.beans.*;

public final class showly_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'showly.jsp' starting page</title>\r\n");
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
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a { text-decoration: none}\r\n");
      out.write("a:hover { text-decoration:underline;color:#666666}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-family: \"幼圆\";\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE2 {font-size: 12px}\r\n");
      out.write(".STYLE3 {\r\n");
      out.write("\tcolor: #666666;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #0000FF;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".areastyle \r\n");
      out.write("{ border:1px solid #F90; overflow:auto; background:#fff url(pictures/sygb.jpg) right bottom no-repeat;color:#666666;font-size:14px}\r\n");
      out.write(".areastyle1\r\n");
      out.write("{ border:1px solid #0033ff; overflow:auto; background:#fff  right bottom no-repeat;color:#666666;font-size:14px}\r\n");
      out.write(".lys{border:none;background:url(pictures/sayfb.jpg);  left top no-repeat;width:54px; height:21px; }\r\n");
      out.write(".rlys{border:none;background:url(pictures/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("   function larger(i,j){\r\n");
      out.write("  var x=document.getElementById(i);\r\n");
      out.write("  x.rows=\"2\";\r\n");
      out.write("  x.innerHTML=\"\";\r\n");
      out.write("  var y=document.getElementById(j);\r\n");
      out.write("  y.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function smaller(i,j){\r\n");
      out.write("     var s=document.getElementById(i);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t  s.innerHTML=\"回复一下吧\";\r\n");
      out.write("\t var x=document.getElementById(j);\r\n");
      out.write("\t x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function focus1(){\r\n");
      out.write("     var s=document.getElementById(\"mainarea\");\r\n");
      out.write("\t s.innerHTML=\"\";\r\n");
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
      out.write("\t       sendRequest(\"SerHandleLy?tag=delly&lyid=\"+j);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("   function del2(i,j){\r\n");
      out.write("    \tvar x=confirm(\"您确定要删除此信息？\");\r\n");
      out.write("    \tif(x==true){\r\n");
      out.write("    \t  var objDiv = document.getElementById(i);\r\n");
      out.write("\t      var vtables = objDiv.childNodes; \r\n");
      out.write("\t      if (vtables.length > 0)\r\n");
      out.write("\t        objDiv.removeChild(vtables[vtables.length - 1]);  \r\n");
      out.write("\t       sendRequest(\"SerHandleLy?tag=delrly&rlyid=\"+j);\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("   function ys(){\r\n");
      out.write("\t\t\t\tvar x=document.getElementById(\"djy\").value;\r\n");
      out.write("\t\t\t\tvar url=\"SerHandleLy?tag=tt&p=\"+x;\r\n");
      out.write("\t\t\t\twindow.location.href=url;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    function framesize(){\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.height= document.body.scrollHeight;\r\n");
      out.write("\t  parent.document.getElementById(\"frame1\").style.width = 1349.5; \r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\" onload=\"framesize()\">\r\n");
      out.write("<table width=\"70%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><img src=\"pictures/lyb.jpg\" width=\"850\" height=\"24\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <!--主人寄语-->\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"10%\"><span class=\"STYLE1\"><br />\r\n");
      out.write("          主人寄语：</span></td>\r\n");
      out.write("        <td width=\"90%\"><br/>\r\n");
      out.write("          &nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <!--主人寄语-->\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"22\" colspan=\"5\"><!--留言首-->\r\n");
      out.write("              <form  method=\"post\" action=\"SerHandleLy?tag=addly\">\r\n");
      out.write("              <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"18\"><hr width=\"100%\" size=\"2\" color=\"#9999FF\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"20\" valign=\"top\"><span class=\"STYLE1\">发表您的留言：</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <textarea name=\"mainarea\" cols=\"100\" rows=\"2\" class=\"areastyle\" onfocus=\"focus1()\"  id=\"mainarea\">留下足迹，表示关心</textarea>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <input type=\"submit\" class=\"lys\" value=\"\"/>\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td height=\"24\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("              </form>\r\n");
      out.write("          <!--留言首-->\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("          ");

        DBUtil db=new DBUtil();
        PageBean p=(PageBean)request.getAttribute("page");
        int sum=p.getRows();
        int pages=p.getPages();
        int now=p.getPagenow();
        int loushu=sum-(now-1)*5;
        
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"45%\"><span class=\"STYLE1\">&nbsp;&nbsp;&nbsp; 留言（");
      out.print(sum );
      out.write("） 共（");
      out.print(pages );
      out.write("）页    当前页数（");
      out.print(now );
      out.write("）</span></td>\r\n");
      out.write("        <td width=\"10%\"><a href=\"SerHandleLy?p=before\" class=\"STYLE2\">上一页</a></td>\r\n");
      out.write("        <td width=\"15%\"><a href=\"SerHandleLy?p=last\" class=\"STYLE2\">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("        <td width=\"12%\" align=\"left\"><span class=\"STYLE2\">转到</span>\r\n");
      out.write("              <input id=\"djy\" type=\"text\" size=\"1\" style=\"height:18px\" />\r\n");
      out.write("              <span class=\"STYLE2\">页</span> </td>\r\n");
      out.write("        <td width=\"18%\"><img src=\"pictures/lyqd.jpg\" width=\"48\" height=\"19\" onclick=\"ys()\"/>&nbsp;<span id=\"message\"></span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    ");

    List<Map<String, Object>> list=(List<Map<String, Object>>)p.getResult();
    String m1="",m2="",m22="",m3="",m33="",m4="",m5="";
    for(int i=0;i<list.size();i++){
    	Map<String, Object> map=list.get(i);
    	m1=map.get("LYID").toString();
    	m2=map.get("LYFROM").toString();
    	UserBean ufrom=new InitUser().getUser(m2);
    	m22=db.getUsername(m2);
    	m3=map.get("LYTO").toString();
    	m33=db.getUsername(m3);
    	m4=map.get("LYTIME").toString();
    	m5=map.get("LYCONTENT").toString();
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!--循环主体-->\r\n");
      out.write("        <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" id=\"");
      out.print(i-500 );
      out.write("\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"3\"><hr width=\"100%\" color=\"#00CCFF\" size=\"5\" /></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"15%\" height=\"99\" align=\"center\" background=\"pictures/lybg.jpg\" valign=\"top\"><img src=\"");
      out.print(ufrom.getUpicname() );
      out.write("\" width=\"80\" height=\"80\" /></td>\r\n");
      out.write("            <td width=\"65%\" align=\"center\" valign=\"top\"><!--内容中间-->\r\n");
      out.write("                <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"18%\"><span class=\"STYLE3 STYLE2\">第");
      out.print(loushu-- );
      out.write("楼</span></td>\r\n");
      out.write("                    <td width=\"82%\"><span class=\"STYLE2\">");
      out.print(m4 );
      out.write(" 留言</span> </td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"29\"><span class=\"STYLE2\">");
      out.print(m22 );
      out.write("：</span></td>\r\n");
      out.write("                    <td><span class=\"STYLE2\">");
      out.print(m5 );
      out.write("</span></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"63\" colspan=\"2\" align=\"center\" valign=\"top\"><table width=\"90%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/bgmain.jpg\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td><!--回复内容-->\r\n");
      out.write("                          \r\n");
      out.write("                             ");

                             String rsql ="select * from qz.rlys where lyid=? order by rlyid asc";
                             Object robj[]={m1};
                             List<Map<String, Object>> rlist=db.queryToList(rsql,robj);
                             String r1="",r2="",r22="",r3="",r33="",r4="",r5="";
                             for(int j=0;j<rlist.size();j++){
                             	Map<String, Object> rmap=rlist.get(j);
                             	r1=rmap.get("RLYID").toString();
                             	r2=rmap.get("RLYFROM").toString();
                             	r22=db.getUsername(r2);
                             	r3=rmap.get("RLYTO").toString();
                             	r33=db.getUsername(r3);
                             	r4=rmap.get("RLYTIME").toString().substring(5);
                             	r5=rmap.get("RLYCONTENT").toString();
                           
                             
      out.write("\r\n");
      out.write("                             ");
  String userid=request.getSession().getAttribute("userid").toString();
   UserBean u=new InitUser().getUser(userid);

      out.write("\r\n");
      out.write("                              <table width=\"100%\" border=0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
      out.print((i+2)*100+j*20 );
      out.write("\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td width=\"12%\" rowspan=\"2\"><img src=\"");
      out.print(u.getUpicname() );
      out.write("\" width=\"52\" height=\"47\" /></td>\r\n");
      out.write("                                  <td width=\"88%\" height=\"26\"><span class=\"STYLE4\">主人：</span><span class=\"STYLE2\">");
      out.print(r5 );
      out.write("</span></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td height=\"26\"><span class=\"STYLE2\">");
      out.print(r4 );
      out.write("</span>&nbsp;\r\n");
      out.write("                                  ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                                  <a href=\"javascript:void(0)\" class=\"STYLE2\" onclick=\"del2(");
      out.print((i+2)*100+j*20 );
      out.write(',');
      out.print(r1 );
      out.write(")\">删除</a>");
} 
      out.write("\r\n");
      out.write("                                  </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                  <td colspan=\"2\"><hr width=\"100%\" size=\"4\" color=\"#FFFFFF\" /></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                              </table>\r\n");
      out.write("                            <!--回复内容-->\r\n");
      out.write("                        ");
} 
      out.write("\r\n");
      out.write("                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td colspan=\"2\"><!--文本区域-->\r\n");
      out.write("                             ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                              <form  method=\"post\" action=\"SerHandleLy?tag=addrly\">\r\n");
      out.write("                                <table width=\"100%\" border=0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td width=\"7%\">&nbsp;</td>\r\n");
      out.write("                                    <td width=\"93%\"><textarea name=\"rarea\" cols=\"50\" rows=\"1\" class=\"areastyle1\" onfocus=\"larger(");
      out.print(i );
      out.write(',');
      out.print(i+100 );
      out.write(")\" id=\"");
      out.print(i );
      out.write("\">回复一下吧</textarea>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <td>&nbsp;</td>\r\n");
      out.write("                                    <td align=\"left\"><div style=\"display:none\" id=\"");
      out.print(i+100 );
      out.write("\"><input type=\"hidden\" value=\"");
      out.print(m1 );
      out.write("\" name=\"lyid\"/>\r\n");
      out.write("                                                     <input type=\"submit\" value=\"\" class=\"rlys\"/> <a href=\"javascript:void(0)\" class=\"STYLE2\" onclick=\"smaller(");
      out.print(i );
      out.write(',');
      out.print(i+100 );
      out.write(")\">取消</a>\r\n");
      out.write("                                          <div></div>\r\n");
      out.write("                                    </div></td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                              </form>\r\n");
      out.write("                              ");
} 
      out.write("\r\n");
      out.write("                            <!--文本区域-->\r\n");
      out.write("                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("              <!--内容中间--></td>\r\n");
      out.write("            <td width=\"20%\" align=\"center\" valign=\"top\"> \r\n");
      out.write("            ");

                 if(request.getSession().getAttribute("userid")==request.getSession().getAttribute("conid")){
      out.write("\r\n");
      out.write("                 <a href=\"javascript:void(0)\" class=\"STYLE2\" onfocus=\"larger(");
      out.print(i );
      out.write(',');
      out.print(i+100 );
      out.write(")\">回复</a>\r\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"STYLE2\" onclick=\"del1(");
      out.print(i-500 );
      out.write(',');
      out.print(m1 );
      out.write(")\">删除</a>");
} 
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      <!--循环主体-->\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr><td><hr width=\"100%\" size=\"5\" color=\"#00ffff\"/></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<h5 align=\"center\"><font color=\"#C0C0C0\">Copyright&copy;2012-2015 四海兴唐单智版权所有  吉 ICP备11011334号-1 </font></h5>\r\n");
      out.write("   <h5 align=\"center\"><font color=\"#C0C0C0\">联系我：421170702@qq.com|18744033060</font></h5>\r\n");
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
