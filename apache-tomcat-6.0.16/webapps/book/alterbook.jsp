<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style type="text/css">
<!--
.STYLE2 {
	font-family: "宋体";
	font-size: 14px;
}
.sty{
    
}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link rel="stylesheet" href="css/jquery.loadmask.css" type="text/css"></link>
    
<title>修改图书</title>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.loadmask.min.js"></script>
<script type="text/javascript" src="js/imagePreview.js"></script>

<script type="text/javascript">
    

    function preview(file,preview,imghead){
		if($.browser.msie){
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(true,file,preview,imghead,90,120);
	}else{
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(false,file,preview,imghead,90,120);
		}
	}
	$(function(){
		
		$("#alterBookForm").validate({
			submitHandler : function(form) {
				$(form).mask("正在传输数据，请稍候。。。");// loading
				var options = {
					success : showResponse,
					error : showError,
					dataType : "xml"
				};
				$(form).ajaxSubmit(options);
			},
			
			errorElement : "em",
			validClass : "success",
			success : function(label) {
				label.text("").addClass("success");
			},
			rules : {
				"book.isbn" : {
					required : true, 
					number : true,
					minlength:4,
					maxlength:8
				},
			    "book.ncount":{
					required : true, 
					number : true
			    },
			    "book.name":{
					required : true
			    }
			},
			messages : {
				"book.isbn" : {
					required : "<font color='red' size='-1'>不可为空</font>", 
					number : "<font color='red' size='-1'>仅能为数字</font>",
					minlength:jQuery.format("<font color='red' size='-1'>不少于 4位 </font>"),
					maxlength:jQuery.format("<font color='red' size='-1'>不多于8位</font>")
				},
				"book.ncount" :{
					required : "<font color='red' size='-1'>不可为空</font>", 
					number : "<font color='red' size='-1'>仅能是数字</font>"
			    },
			    "book.name" :{
					required : "<font color='red' size='-1'>不可为空</font>"
			    }
			}
		});
		
	});
	
	function showResponse(responseXML, statusText, xhr, form) {
		$(form).unmask();//
		alert("修改成功！");
	}

	function showError(responseXML, statusText, xhr, form) {

		$(form).unmask();// 闅愯棌loading
		alert("修改失败！");
	}
	
	
</script>
<style type="text/css">
	em.error {
		background: url("images/e.png") no-repeat 0px 0px;
		padding-left: 16px;
	}
	em.success {
		background: url("images/r.png") no-repeat 0px 0px;
		padding-left: 16px;
	}
</style>

</head>

<body bgcolor="00ffff">
<%
    IBookService ibs=new BookServiceImpl();
    Set<Dict> pubset=ibs.getAllPub();
    Set<Dict> typeset=ibs.getAllType();
    Books book=(Books)request.getAttribute("alterbook");
%>
<form action="alterrBookAction.action" method="post" enctype="multipart/form-data" id="alterBookForm">
<div align="center"><font face="幼圆" color="blue" size="+1"><b>图 书 修 改</b></font></span></div>
<hr size="5" width="70%" align="center"/>
<table width="70%" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF">
  <tr>
    <td width="16%" height="40">&nbsp;</td>
    <td width="34%" >&nbsp;</td>
    <td width="9%" >&nbsp;</td>
    <td width="14%" >&nbsp;</td>
    <td width="27%" >&nbsp;</td>
  </tr>
  <tr>
    
    <td class="STYLE2" valign="top">原图：</td>
    <td colspan="2"><img src="<s:property value="alterbook.bpic"/>" width="90px" height="120px"/></td>
    <td class="STYLE2" valign="top">改图：</td>
    <td ><div id="preview"><img id="imghead" width=90 height=120 border=0  /></div></td>
  </tr>
  <tr>
    <td height="30" class="STYLE2">ISBN:</td>
    <td><input type="text" style="height:18px" name="book.isbn" size="20" value="<s:property value="alterbook.isbn"/>" />
    <input type="hidden"  name="book.bid"  value="<s:property value="alterbook.bid"/>"/></td>
    <td>&nbsp;</td>
    <td class="STYLE2">书名：</td>
    <td><input type="text" style="height:18px" name="book.name" value="<s:property value="alterbook.name"/>"/></td>
  </tr>
  <tr>
    <td height="30" class="STYLE2">购进数量：</td>
    <td><input type="text" style="height:18px" name="book.ncount" value="<s:property value="alterbook.ncount"/>"/></td>
    <td>&nbsp;</td>
    <td class="STYLE2">购进时间：</td>
    <td><input type="textfield"  size="20" name="book.btime" style="height:18px"  id="time" onClick="WdatePicker()" value="<s:property value="alterbook.btime"/>"/></td>
  </tr>
  <tr>
    <td height="30" class="STYLE2">出版社：</td>
    <td>
	    <SELECT style="width:150px" name="book.pub"> 
                   <OPTION value=0 selected>请选择</OPTION> 
                   <%  for(Dict type:pubset){ 
                	   if(!type.getDicname().equals(book.getPub())){
                   %>
                       <OPTION value=<%=type.getDicname() %>><%=type.getDicname() %></OPTION> 
                       <%}else{%>
                        <OPTION value=<%=type.getDicname() %> selected><%=type.getDicname() %></OPTION> 
                   <%} %>
                   <%} %>
                    </SELECT>
	</td>
    <td>&nbsp;</td>
    <td class="STYLE2">类别：</td>
    <td>
        <SELECT id="type" style="width:150px" name="book.type"> 
                   <OPTION value=0 selected>请选择</OPTION> 
                   <%for(Dict pub:typeset){ 
                      if(!pub.getDicname().equals(book.getType())){
                   %>
                       
                       <OPTION value=<%=pub.getDicname() %>><%=pub.getDicname() %></OPTION> 
                     <%}else{%>
                       <OPTION value=<%=pub.getDicname() %> selected><%=pub.getDicname() %></OPTION> 
                       <%} %>
            <%} %>
        </SELECT>  
	</td>
  </tr>
  <tr>
    <td height="30" class="STYLE2">作者：</td>
    <td><input type="text" style="height:18px" name="book.author" value="<s:property value="alterbook.author"/>"/></td>
    <td>&nbsp;</td>
    <td class="STYLE2">封面：</td>
    <td>
		<input name="file"  type="file" onChange="preview(this,'preview','imghead')" />
    </td>
  </tr>
  <br/>
  
  
  <tr>
    <td height="50" colspan="5" align="left">
    <input type="submit" value="修改"/>&nbsp;&nbsp;
    <input type="reset" value="重置"/></td>
  </tr>
</table>
</form>
</body>
</html>

