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
<title>无标题文档</title>
<script type="text/javascript">
    function handle(){
    	myform.submit();
    	window.close();
    }
    
    function preview(file,preview,imghead){
		if($.browser.msie){
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(true,file,preview,imghead,90,100);
	}else{
					//参数 是否是IE，div的id，img的id，高,宽 
			previewImage(false,file,preview,imghead,90,100);
		}
	}
	$(function(){
		
		$("#myform").validate({
			submitHandler : function(form) {
				$(form).mask("正在传输数据，请稍候。。。");// loading
				$("#lid").val($("#lendid").val());
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
			    "lendid":{
					required : true,
					number : true,
					remote : {
						type : "POST",
						url : "checkridLendAction.action",
						error : function() {
							
						}
					}
			    }
			},
			messages : {
				"lendid" : {
					required : "<font color='red' size='-1'>不可为空</font>", 
					number : "<font color='red' size='-1'>仅能为数字</font>",
					remote : "<font color='red' size='-1'>账户不存在</font>"
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
<style type="text/css">
<!--
.hf{border:none;background:url(images/lyqd.jpg);  left top no-repeat;width:48px; height:19px; }
.text3 { border:2px solid #00ffff; height:18px; }
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
    <div align="left"><span class="STYLE3">您将借阅该图书的信息</span></div>
    <hr size="5" width="70%" align="left"/>
      <img  src=${lendbook.bpic} width="120" height="150">
    <hr size="5" width="70%" align="left"/>
    <table width="70%" border="0" cellspacing="0" cellpadding="0">
       <tr>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">ISBN</span></div></td>
          <td  height="25" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">名称</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">作者</span></div></td>
          <td  height="25" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">类型</span></div></td>
          <td  height="25" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">出版社</span></div></td>
          <td  height="25" width="8%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">本数</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">借阅天数</span></div></td>
          <td  height="25" width="17%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">借阅时间</span></div></td>
       </tr>
       <tr>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.isbn}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.name}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.author}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.type}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.pub}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${lendbook.ncount}</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">10</span></div></td>
            <td height="22" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><%=TimeHelper.getLTime()%></span></div></td>
       </tr>
    
    </table>
    <br/>
    <hr size="5" width="70%" align="left"/>
    <form action="lendLendAction.action" method="post" name="myform" id="myform">
        <div align="left"><span class="STYLE4">请输入你的借阅证号：
        <input type="text" class="text3" name="lendid" id="lendid">
        <input type="hidden" class="text3" name="il.rid"  id="lid">
        </span></div> 
        <input type="hidden" name="il.bid" value="<s:property value="lendbook.bid"/>">
        <br/><input type="submit" class="hf" value=""/>
    </form>
</body>

