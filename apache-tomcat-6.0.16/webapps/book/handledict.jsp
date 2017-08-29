<%@ page language="java"
	import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*,com.shxt.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<head>
	<link rel="stylesheet" href="css/jquery.loadmask.css" type="text/css"></link>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<script type="text/javascript" src="js/jquery-1.8.0.js">
</script>
	<script type="text/javascript" src="js/jquery.form.js">
</script>
	<script type="text/javascript" src="js/jquery-1.8.0.js">
</script>
	<script type="text/javascript" src="js/jquery.validate.js">
</script>
	<script type="text/javascript" src="js/jquery.loadmask.min.js">
</script>
	<title>通知栏</title>

	<script type="text/javascript">

</script>
	<style type="text/css">
<!--
.hf {
	border: none;
	background: url(images/lyqd.jpg); left top no-repeat;
	width: 48px;
	height: 19px;
}

.text3 {
	border: 2px solid #00ffff;
	height: 18px;
}

.text4 {
	border: 2px solid #00ffff;
	height: 20px;
}

body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px
}

.STYLE3 {
	font-size: 14px;
	font-weight: bold;
}

.STYLE4 {
	color: #03515d;
	font-size: 12px;
	font-weight: bold;
}

a {
	text-decoration: none
}

a:hover {
	text-decoration: underline;
	color: #666666
}
-->
</style>

	<body bgcolor="00ffff">
	
		<%
			IBookService ibs = new BookServiceImpl();
			Set<Dict> pubset = ibs.getAllPub();
			Set<Dict> typeset = ibs.getAllType();
		%>
        
		<form action="deltypeDictAction.action" method="post">
		<hr width="50%" size="2" color="blue" align="left" />
			<br />
			
			<div align="left">
				<span class="STYLE3">类别操作：</span>
			</div>
			<br />
			
        
			<span class="style4">删除类别：</span>
			<SELECT style="width: 150px" name="ss">
			    
				<%
					for (Dict pub : typeset) {
				%>
				<OPTION value=<%=pub.getDicname()%>><%=pub.getDicname()%></OPTION>
				<%
					}
				%>
			</SELECT>
			<input type="submit" class="hf" value="" />


		</form>
		
		<form action="addtypeDictAction.action" method="post">
			<span class="style4">添加类别：</span><input type="text" style="height:18px" name="ss"/>
			<input type="submit" class="hf" value="" />
		</form>
		
		
		

		<hr width="50%" size="2" color="blue" align="left" />

        
		<br />
		<div align="left">
			<span class="STYLE3">出版社操作：</span>
		</div>
		<br />

        <form action="delpubDictAction.action" method="post">
        <span class="style4">删除出版社：</span>
		<SELECT style="width: 150px" name="ss">
            
			<%
				for (Dict type : pubset) {
			%>
			<OPTION value=<%=type.getDicname()%>><%=type.getDicname()%></OPTION>
			<%
				}
			%>
		</SELECT><input type="submit" class="hf" value="" />
        </form>
        <form action="addpubDictAction.action" method="post">
			<span class="style4">添加出版社：</span><input type="text" style="height:18px" name="ss"/>
			<input type="submit" class="hf" value="" />
		</form>
		<hr width="50%" size="2" color="blue" align="left" />
		
	</body>