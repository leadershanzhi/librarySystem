package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.shxt.bo.*;
import com.shxt.util.*;

public final class Face_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ForumUtil fu=new ForumUtil();
    
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <title>My JSP 'Face.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script>\r\n");
      out.write("function nc1(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function nc2(i){\r\n");
      out.write("    var x=document.getElementById(i);\r\n");
      out.write("    x.style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function show(q){\r\n");
      out.write("    var x=document.getElementById(q);\r\n");
      out.write("    x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("function hide(q){\r\n");
      out.write("    var x=document.getElementById(q);\r\n");
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
      out.write("    function have2(j){\r\n");
      out.write("     var x=document.getElementById(j);\r\n");
      out.write("     x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function have22(j){\r\n");
      out.write("     var x=document.getElementById(j);\r\n");
      out.write("     x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function change3(k,g){\r\n");
      out.write("  var x=document.getElementById(g);\r\n");
      out.write("  x.rows=\"2\";\r\n");
      out.write("  var x=document.getElementById(k);\r\n");
      out.write("  x.style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  function change4(k,g){\r\n");
      out.write("     var s=document.getElementById(g);\r\n");
      out.write("\t s.rows=\"1\";\r\n");
      out.write("\t var x=document.getElementById(k);\r\n");
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
      out.write("  function showalter(i){\r\n");
      out.write("\t  var x=document.getElementById(i);\r\n");
      out.write("\t  x.style.display=\"block\";\r\n");
      out.write("  }\r\n");
      out.write("  function hidealter(i){\r\n");
      out.write("\t  var x=document.getElementById(i);\r\n");
      out.write("\t  x.style.display=\"none\";\r\n");
      out.write("  }\r\n");
      out.write("  function delMess(i){\r\n");
      out.write("\t  var x=confirm(\"are you sure to delete the message\");\r\n");
      out.write("\t  if(x==true){\r\n");
      out.write("\t\t window.location.href=(\"MainHandle?tag=delMess&mid=\"+i);\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("  function delComm(i){\r\n");
      out.write("\t  var x=confirm(\"are you sure to delete this comment\");\r\n");
      out.write("\t  if(x==true){\r\n");
      out.write("\t\t window.location.href=(\"MainHandle?tag=delComm&cid=\"+i);\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("  function delRess(i){\r\n");
      out.write("\t  var x=confirm(\"are you sure to delete this response\");\r\n");
      out.write("\t  if(x==true){\r\n");
      out.write("\t\t window.location.href=(\"MainHandle?tag=delRess&rid=\"+i);\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("  function fanhui(){\r\n");
      out.write("      window.location.href=(\"MainHandle?tag=fh\");\r\n");
      out.write("  }\r\n");
      out.write("  function fabiao(i){\r\n");
      out.write("      window.location.href=(\"MainHandle?tag=fb&uid=\"+i);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".hf{border:none;background:url(pictures/liuyan1.jpg);  left top no-repeat;width:70px; height:25px; }\r\n");
      out.write(".hf1{border:none;background:url(pictures/lyqd.jpg);  left top no-repeat;width:49px; height:21px; }\r\n");
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
      out.write("<body style=\"background:url(pictures/logebg1.jpg) repeat-x #fff;\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"75%\" height=\"220\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td valign=\"top\" background=\"pictures/photo1.jpg\"><table width=\"100%\" height=\"175\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("             <tr>\r\n");
      out.write("               <td width=\"78%\" height=\"173\" valign=\"top\"><table width=\"100%\" height=\"66\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td><form action=\"MainHandle?tag=addMess\" method=\"post\">\r\n");
      out.write("                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                         ");

                            String hostname="unknown";
                            Users u=(Users)request.getSession().getAttribute("host");
                            if(u!=null){
                            	hostname=u.getUname();
                            }
                         
      out.write("\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td height=\"28\">&nbsp;&nbsp;&nbsp;<font  face=\"幼圆\" color=\"black\"><b>welcome:&nbsp;");
      out.print(hostname );
      out.write("</b></font></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td align=\"center\">\r\n");
      out.write("\t\t\t\t\t         <textarea name=\"content\" id=\"ly\" class=\"areastyle\" cols=\"102\" rows=\"2\" onfocus=\"change1()\"></textarea></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("\t\t\t\t\t\t       \r\n");
      out.write("                             <td>\r\n");
      out.write("\t\t\t\t\t\t\t <div id=\"lyd\" style=\"display:none\">&nbsp;&nbsp;\r\n");
      out.write("                               <input name=\"submit\" type=\"submit\" class=\"hf\" value=\"\" />\r\n");
      out.write("                               &nbsp;&nbsp; <a href=\"javascript:void(0)\" onclick=\"change2()\" class=\"STYLE3\">取消</a></div></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                         </table>\r\n");
      out.write("                     </form></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"29\"><hr width=\"95%\" size=\"2\" color=\"#0000FF\" align=\"center\"/></td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                     <td height=\"29\"><!--333333333333333333333333333333333333333333333333333333333333333333333-->\r\n");
      out.write("                     ");

                         List<Messages> list=null;
                         String uid=request.getParameter("uid");
                         String mid=request.getParameter("mid");
                         if(uid!=null){
                        	 int id=Integer.parseInt(uid);
                        	 request.getSession().setAttribute("uid",id);
                        	 list=fu.getOnePersonMessages(id);
                         }else if(mid!=null){
                        	 int id=Integer.parseInt(mid);
                        	 request.getSession().setAttribute("mid",id);
                        	 list=fu.getOneMessages(id);
                    
                         }else{
                        	 list=fu.getAllMessages();
                         }
                             int x=list.size();
                             
                         for(int i=0;i<x;i++){
                        	 
                        	 Messages m=(Messages)list.get(i);
                        	 String messuname=m.getUser().getUname();
                     
      out.write("\r\n");
      out.write("                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                           <tr>\r\n");
      out.write("                             <td width=\"13%\" height=\"79\" valign=\"top\" align=\"center\"><img src=\"pictures/p.jpg\" width=\"71\" height=\"71\" />\r\n");
      out.write("                             <br/><font  face=\"幼圆\" size=\"-1\"  ><b>第");
      out.print(x-i );
      out.write("楼</b></font></td>\r\n");
      out.write("                             <td width=\"87%\"><!--正文-->\r\n");
      out.write("                                 <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" background=\"pictures/bgmain.jpg\">\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                         <tr onmouseover=\"have1(");
      out.print(i-1000 );
      out.write(")\" onmouseout=\"have11(");
      out.print(i-1000 );
      out.write(")\">\r\n");
      out.write("                                           <td width=\"17%\" height=\"22\"><span class=\"STYLE4\">");
      out.print(messuname );
      out.write("</span></td>\r\n");
      out.write("                                           <td width=\"60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t         <span class=\"STYLE5\">");
      out.print(m.getMtime() );
      out.write("</span>\t\t\t\t\t\t\t\t\t\t                                            </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <td width=\"23%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <div id=\"");
      out.print(i-1000 );
      out.write("\" style=\"display:none\"><a href=\"javascript:void(0)\" class=\"STYLE3\" onfocus=\"change3(");
      out.print(i-2000 );
      out.write(',');
      out.print(i-2100 );
      out.write(")\">回复</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");

								      	      if(messuname.equals(hostname)){
								      	   
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <a href=\"javascript:void(0)\" onclick=\"delMess(");
      out.print(m.getMid() );
      out.write(")\" class=\"STYLE3\">删除</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"showalter(");
      out.print(i+2000 );
      out.write(")\">修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t   </div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t      \t    </td>\r\n");
      out.write("                                         </tr>\r\n");
      out.write("                                     </table></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td height=\"30\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"45%\" ><span class=\"STYLE3\">");
      out.print(m.getContent() );
      out.write("</span></td>\r\n");
      out.write("    <td width=\"55%\"  id=\"");
      out.print(i+2000 );
      out.write("\" style=\"display:none\" align=\"left\" ><form  method=\"post\" action=\"MainHandle?tag=alterMess&mid=");
      out.print(m.getMid() );
      out.write("\">\r\n");
      out.write("         <input name=\"content\" type=\"text\" size=\"32\" value=\"");
      out.print(m.getContent() );
      out.write("\" />\r\n");
      out.write("         <input type=\"submit\" value=\"确认修改\"/><a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"hidealter(");
      out.print(i+2000 );
      out.write(")\">取消</a>\r\n");
      out.write("      </form>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("                                     \r\n");
      out.write("                                     </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><hr width=\"98%\" color=\"#666666\" size=\"2\" align=\"left\" /></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t   <!--hufu222222222222222222222222222222222222222222222222-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t     ");

									        List<Comments> clist=fu.getAllComment(m.getMid());
									           for(int j=0;j<clist.size();j++){
									        	   Comments c=clist.get(j);
									        	   String cuname=fu.getCommentUName(c.getCid());
									     
      out.write("\r\n");
      out.write("                                         <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                            <tr onmouseover=\"have2(");
      out.print(i*100-j );
      out.write(")\" onmouseout=\"have22(");
      out.print(i*100-j );
      out.write(")\">\r\n");
      out.write("                                             <td width=\"13%\" rowspan=\"2\" align=\"center\"><img src=\"pictures/p.jpg\" width=\"55\" height=\"55\" /></td>\r\n");
      out.write("                                             <td width=\"64%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <span class=\"STYLE4\">");
      out.print(cuname );
      out.write("</span>&nbsp;<span class=\"STYLE5\"> ");
      out.print(c.getCtime() );
      out.write("\t</span>&nbsp;&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\t\t\t\t     </td>\r\n");
      out.write("\t\t\t\t\t\t\t                  <td width=\"23%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div id=\"");
      out.print(i*100-j );
      out.write("\" style=\"display:none\"><a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"show(");
      out.print((i+2)*200+j*11 );
      out.write(")\">回复</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      ");

											         if(cuname.equals(hostname)){
											      
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   <a href=\"javascript:void(0)\" onclick=\"delComm(");
      out.print(c.getCid() );
      out.write(")\" class=\"STYLE3\">删除</a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   <a href=\"javascript:void(0)\" class=\"STYLE3\">修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   </div> </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      <td><br/> <span class=\"STYLE3\">");
      out.print(c.getContent() );
      out.write("</span></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td>&nbsp;</td>\r\n");
      out.write("                                             <td colspan=\"2\"><!---变化的代码->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t     <table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><!--第二层1111111111111111111111111111111111111111111-->\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\r\n");
      out.write("\t");

	   List<Responses> rlist=fu.getAllResponse(c.getCid());
	   for(int k=0;k<rlist.size();k++){
		   Responses r=(Responses)rlist.get(k);
		   String runame=fu.getResponseUName(r.getRid());
	
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\"><hr width=\"70%\" size=\"1\" align=\"left\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr onmouseover=\"nc1(");
      out.print((i+1)*300+(j+1)*200+k );
      out.write(")\" onmouseout=\"nc2(");
      out.print((i+1)*300+(j+1)*200+k );
      out.write(")\">\r\n");
      out.write("    <td width=\"14%\" rowspan=\"2\" align=\"center\" class=\"STYLE4\"><img src=\"pictures/p.jpg\" width=\"40\" height=\"40\" /></td>\r\n");
      out.write("    <td width=\"42%\"><span class=\"STYLE4\">");
      out.print(runame );
      out.write(" </span>&nbsp;&nbsp; <span class=\"STYLE5\">");
      out.print(r.getRtime());
      out.write(" </span> </td>\r\n");
      out.write("    <td width=\"44%\"><div id=\"");
      out.print((i+1)*300+(j+1)*200+k );
      out.write("\" style=\"display:none\">\r\n");
      out.write("    ");

       if(runame.equals(hostname)){
    
      out.write("\r\n");
      out.write("    <a href=\"javascript:void(0)\" onclick=\"delRess(");
      out.print(r.getRid() );
      out.write(")\" class=\"STYLE3\">删除</a>&nbsp;&nbsp;\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"STYLE3\">举报</a>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"2\" class=\"STYLE3\">");
      out.print(r.getContent());
      out.write(" </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("\t<!--内层文本框-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t  <form  method=\"post\" action=\"MainHandle?tag=addRess&cid=");
      out.print(c.getCid() );
      out.write("\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"display:none\" id=\"");
      out.print((i+2)*200+j*11 );
      out.write("\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"4%\" height=\"20\">&nbsp;</td>\r\n");
      out.write("    <td width=\"96%\">\r\n");
      out.write("      <textarea name=\"content\" cols=\"60\" rows=\"1\" class=\"areastyle1\"></textarea>\r\n");
      out.write("        </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input name=\"submit\" type=\"submit\" class=\"hf1\" value=\"\" />&nbsp;\r\n");
      out.write("      <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"hide(");
      out.print((i+2)*200+j*11 );
      out.write(")\">取消</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("   <!--内层文本框-->\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t<!--第二层1111111111111111111111111111111111111111111-->\t\t\t\t\t\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <!---变化的代码->\t\t\t\t\t\t\t\t\t\t\t </td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                           <tr>\r\n");
      out.write("                                             <td colspan=\"2\"><hr width=\"73%\" align=\"center\" size=\"1\"/></td>\r\n");
      out.write("                                           </tr>\r\n");
      out.write("                                         </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <br/>\r\n");
      out.write("                                       <!--hufu22222222222222222222222222222222222222222222222222222--> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t     ");
} 
      out.write("                                </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <form action=\"MainHandle?tag=addComm&mid=");
      out.print(m.getMid() );
      out.write("\" method=\"post\">\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td>\r\n");
      out.write("                                         <textarea name=\"content\" id=\"");
      out.print(i-2100 );
      out.write("\" cols=\"70\" rows=\"1\" class=\"areastyle1\" onfocus=\"change3(");
      out.print(i-2000 );
      out.write(',');
      out.print(i-2100 );
      out.write(")\"></textarea>       </td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                     <td><div id=\"");
      out.print(i-2000 );
      out.write("\" style=\"display:none\">\r\n");
      out.write("                                       <input  type=\"submit\" class=\"hf1\" value=\"\"/>\r\n");
      out.write("                                     <a href=\"javascript:void(0)\" class=\"STYLE3\" onclick=\"change4(");
      out.print(i-2000 );
      out.write(',');
      out.print(i-2100 );
      out.write(")\">取消</a></div></td>\r\n");
      out.write("                                   </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t    </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t   <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t     <td bgcolor=\"#FFFFFF\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </tr>\r\n");
      out.write("                                 </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                             <!--正文-->\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t </td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                         </table>\r\n");
      out.write("                       <!--333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333--> \r\n");
      out.write("\t\t\t\t\t    ");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t                      </td>\r\n");
      out.write("                   </tr>\r\n");
      out.write("               </table></td>\r\n");
      out.write("               <td width=\"22%\" background=\"pictures/logepaper.jpg\" valign=\"top\" >\r\n");
      out.write("                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td align=\"center\"><a href=\"javascript:void(0)\" onclick=\"fanhui()\" class=\"STYLE3\">注销登录</a></td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td align=\"center\"><a href=\"javascript:void(0)\" onclick=\"fabiao(");
      out.print(u.getUid() );
      out.write(")\" class=\"STYLE3\">我的发表</a></td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td align=\"center\"><a href=\"pages.jsp\" class=\"STYLE3\">查看列表</a></td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td>&nbsp;</td></tr>\r\n");
      out.write("                       <tr><td align=\"center\"><a href=\"MainHandle?tag=searchAll\" class=\"STYLE3\">查看全部</a></td></tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("               </td>\r\n");
      out.write("             </tr>\r\n");
      out.write("         </table></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <!--整体表格-->\r\n");
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
