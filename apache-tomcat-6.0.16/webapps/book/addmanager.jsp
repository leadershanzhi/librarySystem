<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style type="text/css">
<!--
.hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }
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
    
<title>读者注册</title>

<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.loadmask.min.js"></script>
<script type="text/javascript" src="js/imagePreview.js"></script>

</script>
<script type="text/javascript">
	function preview(file,preview,imghead){
		if($.browser.msie){
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(true,file,preview,imghead,80,100);
	}else{
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(false,file,preview,imghead,80,100);
		}
	}
	

	$(function(){
		
		$("#addReaderForm").validate({
			submitHandler : function(form) {
				$(form).mask("正在传输数据，请稍候。。。");// loading
				$("#lname1").val($("#lname2").val());
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
				"lname" : {
					required : true,
					remote : {
						type : "POST",
						url : "checklnameReaderAction.action",
						error : function() {
							
						}
					}
				
				},
				"re.name" : {
					required : true
				
				},
				"re.mail" : {
					email : true
				
				},
			    "pw":{
					required : true, 
					minlength:4,
					maxlength:8
			    },
			    "re.phone" : {
			    	number : true,
					minlength:7,
					maxlength:11
				
				},
			    "re.rpw":{
					required : true,
					equalTo : "#pw"
			    }
			},
			
			messages : {
				"lname" : {
					required : "<font color='red' size='-1'>*必填项</font>",
					remote : "<font color='red' size='-1'>*已被占用</font>"
				},
				"re.name" : {
					required : "<font color='red' size='-1'>*必填项</font>"			
				},
				"re.mail" : {
					email : "<font color='red' size='-1'>*格式有误</font>"		
				},
				"re.phone" :{
					number : "<font color='red' size='-1'>*仅能为数字</font>",
					minlength:jQuery.format("<font color='red' size='-1'>*号码不少于 8位 </font>"),
					maxlength:jQuery.format("<font color='red' size='-1'>*号码不多于11位</font>")
			    },
			    "pw" :{
					required : "<font color='red' size='-1'>*必填项</font>", 
					minlength:jQuery.format("<font color='red' size='-1'>*密码不少于 4位 </font>"),
					maxlength:jQuery.format("<font color='red' size='-1'>*密码不多于8位</font>")
			    },
			    "re.rpw" :{
					required : "<font color='red' size='-1'>*必填项</font>",
					equalTo :  "<font color='red' size='-1'>*前后密码不一致</font>"
			    }
			}
		});
		
	});
	
	function showResponse(responseXML, statusText, xhr, form) {
		$(form).unmask();//
		alert("添加成功！");
	}

	function showError(responseXML, statusText, xhr, form) {

		$(form).unmask();// 闅愯棌loading
		alert("添加失败！");
	}
	</script>

</head>
<%
    IReaderService irs=new ReaderServiceImpl();
    Set<Dict> sdept=irs.getAllSdept();
%>
<body bgcolor="00ffff">
<br/>
<form action="addReaderAction.action" method="post" enctype="multipart/form-data" id="addReaderForm">
    <table width="52%" border="1" bordercolor="white" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="2%">&nbsp;</td>
    <td colspan="2">&nbsp;</td>
    </tr>
  <tr>
    <td rowspan="4">&nbsp;</td>
    <td width="28%" height="50"><div id="preview"><img id="imghead" width=80 height=100 border=1 src="images/lytp.jpg" /></div></td>
    <td rowspan="2">
	<table width="94%" height="105" border="0" cellpadding="0" cellspacing="2">
      <tr>
        <td width="32%" height="17">&nbsp;</td>
        <td width="61%">&nbsp;</td>
        <td width="7%" rowspan="4">&nbsp;</td>
      </tr>
      <tr>
        <td class="STYLE2" align="center">登   录   名：</td>
        <td><input type="hidden" style="height:18px" name="re.lname" id="lname1" size="15" />
            <input type="text" style="height:18px" name="lname" id="lname2" size="15" />
        
        </td>
        </tr>
      <tr>
        <td class="STYLE2" align="center">姓        名：</td>
        <td><input type="text" style="height:18px" name="re.name" size="15" /></td>
        </tr>
      <tr>
        <td class="STYLE2" align="center">密 　  码：</td>
        <td><input type="password" style="height:18px" name="pw" id="pw" size="16"/></td>
        </tr>
      <tr>
        <td height="24" class="STYLE2" align="center">确认密码：</td>
        <td><input type="password" style="height:18px" name="re.rpw" size="16" /></td>
        </tr>
    </table></td>
    </tr>
  
  <tr>
    <td height="17"><input name="file" type="file" size="10" onChange="preview(this,'preview','imghead')" /></td>
    </tr>
  <tr>
    <td height="92" colspan="2"><table width="100%" border="0" cellspacing="2" cellpadding="1">
	<tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td width="7%" rowspan="4">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
	  <tr>
        <td class="STYLE2" align="center">性别：</td>
        <td><select style="width:135px" name="re.sex">
		        <option>男</option>
		        <option>女</option>
		    </select></td>
        <td class="STYLE2" align="center">&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td width="13%" height="30" align="center" class="STYLE2">电话：</td>
        <td width="45%"><input type="text" style="height:18px" name="re.phone" size="17" /></td>
        <td width="13%" class="STYLE2" align="center">&nbsp;</td>
        <td width="20%">&nbsp; </td>
      </tr>
      <tr>
        <td class="STYLE2" align="center" >生日：</td>
        <td><s:textfield  size="18" name="re.birth"  style="height:18px"  id="time" onClick="WdatePicker()"/></td>
        <td class="STYLE2" align="center">&nbsp;</td>
        <td>
             &nbsp;
        </td>
      </tr>
      <tr>
        <td height="21">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
    </tr>
  
  <tr>
    <td ><input type="submit" class="hf" value=""/></td>
    <td >&nbsp;</td>
    </tr>
</table>
</form>
  
    
</body>

</html>



