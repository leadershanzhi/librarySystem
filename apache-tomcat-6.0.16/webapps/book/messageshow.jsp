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
<title>演示消息</title>

  
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
    
    <hr size="5" width="70%" align="center"/>
    <table width="60%" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF">
  <tr>
    <td height="43" align="center"><span class="STYLE3" >${m.topic}</span></td>
  </tr>
  <tr>
    <td height="120">${m.content}</td>
  </tr>
  <tr>
    <td height="31" align="right"><span class="STYLE4">${m.people} </span></td>
  </tr>
  <tr>
    <td height="23" align="right"><span class="STYLE4">${m.time}</span></td>
  </tr>
</table>

    <hr size="5" width="70%" align="center"/>
    
</body>

