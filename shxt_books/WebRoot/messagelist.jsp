<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*,com.shxt.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<head>
<link rel="stylesheet" href="css/jquery.loadmask.css" type="text/css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.loadmask.min.js"></script>
<title>通知栏</title>

<script type="text/javascript">
   function openDialog(url){	
			var firstDiag = window.showModalDialog(url,"_self","center:yes;dialogWidth:600px;dialogHeight:400px");  
		}
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function check(){
   parent.aa();
}
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
<style type="text/css">
<!--
.hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }
.text3 { border:2px solid #00ffff; height:18px; }
.text4 { border:2px solid #00ffff; height:20px; }
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 14px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
	font-weight: bold;
}
a { text-decoration: none}
a:hover { text-decoration:underline;color:#666666}
-->
</style>

<body bgcolor="00ffff">
    <br/><br/>
    <div align="left"><span class="STYLE3">图书馆通知：</span></div>
  
    <hr size="5" width="70%" align="left"/>
    <table width="60%" border="0" cellspacing="0" cellpadding="0" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
       <tr>
          <td  height="28" width="5%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">序号</span></div></td>
          <td  height="28" width="25%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">通知题目</span></div></td>
          <td  height="28" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">通知人</span></div></td>
          <td  height="28" width="25%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">通知时间</span></div></td>
          <td  height="28" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">点击量</span></div></td>
          <td  height="28" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">操作</span></div></td>
       </tr>
        <s:iterator value="mlist" var="mess" status="i">
       <tr>
            <td height="25" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#i.index+1"/></span></div></td>
            <td height="25" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#mess.topic"/></span></div></td>
            <td bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#mess.people"/></span></div></td>
            <td height="25" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#mess.time"/></span></div></td>
            <td height="25" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#mess.point"/></span></div></td>
            <td height="25" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
               <a href="javascript:void(0)" onclick=openDialog("showMessageAction.action?mid=<s:property value='#mess.mid'/>")> 查看</a>
            </span></div></td>
            
           
       </tr>
       </s:iterator>
       
       
    </table>
    
    <br/>
    <hr size="5" width="70%" align="left"/>
    
</body>

