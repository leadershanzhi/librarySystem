<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
	<title>发表通知</title>
	<link rel="stylesheet" href="kindeditor/themes/default/default.css" />
	<link rel="stylesheet" href="kindeditor/plugins/code/prettify.css" />
	<script charset="utf-8" src="kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="kindeditor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="kindeditor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content1"]', {
				cssPath : 'kindeditor/plugins/code/prettify.css',
				uploadJson : 'kindeditor/jsp/upload_json.jsp',
				fileManagerJson : 'kindeditor/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 32px;
	font-family: "幼圆";
	color: #CC00FF;
	font-weight: bold;
}
.hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }
.STYLE2 {
	font-family: "黑体";
	font-size: 15px;
}
-->
</style>
<script type="text/javascript">
  
function framesize(){
	  parent.document.getElementById("frame1").style.height= document.body.scrollHeight;
	  parent.document.getElementById("frame1").style.width = 1349.5; 
   }
</script>
</head>

<body background="images/logebg1.jpg" onload="framesize()">


<form  method="post" action="addMessageAction.action">

<table width="70%" height="70%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="80" colspan="5"><span class="STYLE1">发表通知</span></td>
  </tr>
  <tr>
    <td width="10%" height="38"><span class="STYLE2">主题：</span></td>
    <td width="34%"><input type="text" name="m.topic" size="35px" style="height:20px"/></td>
    <td colspan=2>
    <span class="STYLE2">类型：</span>
    <select name="m.type" style="width:60px">
	                    <option >通知</option>
						<option>放假</option>
						<option>调课</option>
				   </select>
		&nbsp;&nbsp;
    <span class="STYLE2">来源：</span>
    <select name="m.people" style="width:100px">
	                    <option >保卫处</option>
						<option>自习室</option>
						<option>图书馆</option>
				   </select>	
    </td>
  </tr>
  <tr>
    <td height="31" colspan="4"><hr width="90%" size="1" align="left" color="#0033FF"></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5" valign="top">
      <textarea name="content1" cols="100" rows="10" style="width:700px;height:300px;visibility:hidden;"></textarea>
      <hr width="90%" size="1" align="left" color="#0033FF">
      <input type="submit" class="hf" value=""/>
    </td>
    <td>&nbsp;</td>
  </tr> 
  
</table>

 </form>
</body>
</html>

