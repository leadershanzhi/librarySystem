<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
<head>

 <style type="text/css">
<!--
.STYLE1 {
	font-family: "幼圆";
	font-size: 18px;
	color: #FF0000;
}
.STYLE3 {font-family: "华文琥珀"; font-size: 24px; color: #FF0000; }
-->
</style>      
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>异常页面</title>

<script>
   
  
  	function check(){
  		var total = document.getElementById("n").innerHTML;
    	document.getElementById("n").innerHTML=(parseInt(total)-1);
    	if(total<=1){
  			window.location.href="rightsearch.jsp";
  		}
    	setTimeout(check, 1000);
  	}
  
</script>




</head>
<body bgcolor="00ffff" onload="check()">
    <br/> <br/> <br/>
    <div align="center"><span class="STYLE3">添加成功！</span></div>
	<div><hr  width="40%" align="center"/></div>
	<div align="center"><span class="STYLE1">该页面会在<span id="n">2</span>秒后跳转到首页面</span></div>
</body>
    
</html>