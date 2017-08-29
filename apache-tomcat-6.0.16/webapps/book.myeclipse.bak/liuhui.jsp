<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>留言模块</title>
<script>
function nc1(){
    var x=document.getElementById("nc");
    x.style.display="block";
}
function nc2(){
    var x=document.getElementById("nc");
    x.style.display="none";
}
function show(){
    var x=document.getElementById("ta");
    x.style.display="block";
}
function hide(){
    var x=document.getElementById("ta");
    x.style.display="none";
}
function change1(){
  var x=document.getElementById("ly");
  x.rows="3";
  var x=document.getElementById("lyd");
  x.style.display="block";
}

  function change2(){
     var s=document.getElementById("ly");
	 s.rows="2";
	 var x=document.getElementById("lyd");
	 x.style.display="none";
  }


  function change3(i,j){
  var x=document.getElementById(i);
  x.rows="2";
  var x=document.getElementById(j);
  x.style.display="block";
}

  function change4(i,j){
     var s=document.getElementById(i);
	 s.rows="1";
	 var x=document.getElementById(j);
	 x.style.display="none";
  }


</script>

<%
    List listall=(List)request.getAttribute("listall"); 
%>
<style type="text/css">
<!--
.hf{border:none;background:url(images/liuyan1.jpg);  left top no-repeat;width:70px; height:25px; }
.hf1{border:none;background:url(images/sayfb.jpg);  left top no-repeat;width:54px; height:21px; }
a { text-decoration: none}
a:hover { text-decoration:underline;color:#666666}
.areastyle 
{ border:1px solid #F90; overflow:auto; background:#fff url(images/sygb.jpg) right bottom no-repeat;color:#03C;font-size:14px}
.areastyle1
{ border:1px solid #F90; overflow:auto; background:#fff  right bottom no-repeat;color:#03C;font-size:14px}
.STYLE3 {font-size: 12px}
.STYLE4 {color: #0033FF ;font-size: 12px}
.STYLE5 {font-size: 10px}
.STYLE6 {
	font-family: "幼圆";
	color: #CC6600;
	font-size: 13px;
}
-->
</style>
</head>

<body  background="images/logebg1.jpg">
   <!--整体表格-->
   <table width="75%" height="220" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
     <tr>
       <td valign="top"><img src="images/saylogoo.jpg" width="100%" height="24" />
         <table width="100%" height="175"  border="0" cellpadding="0" cellspacing="0">
             <tr>
               <td width="75%" height="173" valign="top"><table width="100%" height="66" border="0" cellpadding="0" cellspacing="0">
                   <tr>
                     <td>
                     <s:if test="#session.role!='admin'">
                     
	                     <form  name="ly.content" method="post" action="addlyLiuHuiAction.action" id="form1">
	                         <table width="100%" border="0" cellspacing="0" cellpadding="0">
	                           <tr>
	                             <td>--------------------</td>
	                           </tr>
	                           <tr>
	                             <td align="center">
						         <textarea name="ly.content" id="ly" class="areastyle" cols="98" rows="2" onfocus="change1()"></textarea></td>
	                           </tr>
	                           <tr>
							       
	                             <td>
								 <div id="lyd" style="display:none">&nbsp;&nbsp;
	                               <input name="submit" type="submit" class="hf" value="" />
	                               &nbsp;&nbsp; <a href="javascript:void(0)" onclick="change2()" class="STYLE3">取消</a></div></td>
	                           </tr>
	                         </table>
	                     </form>
                     
                     </s:if>
                         
                     <s:else>
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                           <tr>
                             <td>--------------------</td>
                           </tr>
                           <tr>
                             <td align="center">
					         <textarea name="ly.content"  class="areastyle" cols="98" rows="2"  disabled></textarea></td>
                           </tr>
                           
                         </table>
                     </s:else>
                     </td>
                   </tr>
                   <tr>
                     <td height="29"><hr width="95%" size="2" color="#0000FF" align="center"/></td>
                   </tr>
                   <tr>
                     <td height="29"><!--333333333333-->
                         <table width="100%" border="0" cellspacing="0" cellpadding="0">
                         
                         <%  for(int i=0;i<listall.size();i++) {
                                LiuYan ly=(LiuYan)listall.get(i);
                         %>
                               
                         <!--正文-->
                           <tr>
                             <td width="15%" height="79" valign="top" align="center"><img src="<%=ly.getRe().getImg() %>" width="71" height="71" /></td>
                             <td width="85%">
                                 <table width="100%" border="0" cellspacing="0" cellpadding="0" background="images/bgmain.jpg">
                                   <tr>
                                     <td>
									 
									   <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                         <tr >
                                           <td width="17%" height="22"><span class="STYLE4"><%=ly.getRe().getName()%></span></td>
                                           <td width="60%">
										         <span class="STYLE5"><%=ly.getLytime()%></span>										                                            </td>
										   <td width="23%">
										   
										   <s:if test="#session.role=='admin'">
										      <a href='delLiuHuiAction.action?lyid=<%=ly.getLyid() %>'><font size="-1">删除</font></a>
                                            
                                          </s:if>
                                          <s:else>
                                              <a href='dellLiuHuiAction.action?lyid=<%=ly.getLyid() %>'><font size="-1">删除</font></a>
                                          </s:else>
                                         
                                         </tr>
                                     </table></td>
                                   </tr>
                                   <tr>
                                     <td ><span class="STYLE3"><br/>
                                       <%=ly.getContent() %>
                                    </span></td>
                                   </tr>
                                   <tr>
                                     <td><hr width="98%" color="#666666" size="2" align="left" /></td>
                                   </tr>
                                   <tr>
                                     <td>
									   
									   
									   <!--hufu-->
									  
									  
									     <%Set<HuiFu> set=ly.getHfSet();
									       for(HuiFu hf:set){
									     %>
                                         <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                            <tr onmouseover="have2()" onmouseout="have22()">
                                             <td width="16%" rowspan="2" align="center"><img src="images/lytp.jpg" width="65" height="55" /></td>
                                             <td width="63%">
											      <span class="STYLE4">管理员</span>&nbsp;<span class="STYLE5"> <%=hf.getHftime() %>	</span>&nbsp;&nbsp;&nbsp;&nbsp;										     </td>
							                  <td width="21%">
											      </td>
                                           </tr>
										   <tr>
										      <td><span class="STYLE3">回复：<%=hf.getContent()%></span></td>
                                           </tr>
                                           <tr>
                                             <td>&nbsp;</td>
                                             <td colspan="2">&nbsp;								 </td>
                                           </tr>
                                           <tr>
                                             <td colspan="2"><hr width="73%" align="center" size="1"/></td>
                                           </tr>
                                         </table>
										 
										 
										 
										 
                                       <!--hufu-->       <%} %>                            </td>
                                   </tr>
                                   
                                   
                                     <s:if test="#session.role=='admin'">
								    <form action="addhfLiuHuiAction.action" method="post">
								    
                                   <tr>
                                     <td>
                                       <textarea name="hf.content" id="<%=i %>" cols="70" rows="1" class="areastyle1" onfocus="change3(<%=i %>,<%=i-1000 %>)"></textarea>
                                       <input type="hidden" name="lyid" value="<%=ly.getLyid() %>">
                                     </td>
                                   </tr>
                                   <tr>
                                     <td><div id="<%=i-1000 %>" style="display:none">
                                       <input  type="submit" class="hf1" value=""/>
                                     <a href="javascript:void(0)" class="STYLE3" onclick="change4(<%=i %>,<%=i-1000 %>)">取消</a></div></td>
                                   </tr>
								    </form>
								    </s:if>
								    
								   <tr>
								     <td >&nbsp;</td>
								   </tr>
								   <tr>
								     <td bgcolor="#FFFFFF">&nbsp;</td>
								   </tr>
                                 </table>
								
                             
                             
							 
							 </td>
                           </tr>
                           <!--正文-->
                           <%} %>
                           
                         </table>
                       <!--33333333333-->  
                     </td>
                   </tr>
               </table></td>
               <td width="25%" ><img src="images/sayborder.jpg" width="100%" height="100%" /></td>
             </tr>
         </table></td>
     </tr>
   </table>
   <!--整体表格-->
</body>
</html>


