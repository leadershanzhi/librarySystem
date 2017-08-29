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
    
	function owe(){
	    var x=document.getElementById("sum").value;
	    if(x==""){
	    	alert("请查询后在确认缴费！");
	    }else{
	    	oweform.submit();
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
    <s:if test="#session.role=='admin'">

    <div align="left"><span class="STYLE3">超期图书还款操作：</span></div>
    <form action="revertmoneyReaderAction.action" method="post" name="myform" id="myform">
        <div align="left"><span class="STYLE4">请输入你的借阅证号：
        <input type="text" class="text3" name="lendid" id="lendid">
        <input type="hidden" class="text3" name="lname"  id="lid">
        </span></div> 
       
        <br/><input type="submit" class="hf" value=""/>
    </form>
    
    </s:if>
    <hr size="5" width="70%" align="left"/>
    <table width="70%" border="0" cellspacing="0" cellpadding="0">
       <tr>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">序号</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">借阅证号</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">用户名</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">图书编号</span></div></td>
          <td  height="25" width="15%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">书名</span></div></td>
          <td  height="25" width="18%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">借阅时间</span></div></td>
          <td  height="25" width="10%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">可借天数</span></div></td>
          <td  height="25" width="17%" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">拖欠金额(*0.1元)</span></div></td>
       </tr>
        <s:iterator value="revertlist" var="lend" status="i">
       <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#i.index+1"/></span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#lend.readers.lname"/></span></div></td>
            <td bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#lend.readers.name"/></span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#lend.books.bid"/></span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#lend.books.name"/></span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1"><s:property value="#lend.time1"/></span></div></td>
            
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
              <s:if test="#lend.readers.identity=='本科生'">
                     10
                 </s:if>
                 <s:else>
                     20
                 </s:else>
            
            </span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
               <s:property value="#lend.owemoney"/>
            </span></div></td>
       </tr>
       </s:iterator>
       
       <form action="handleoweReaderAction.action" method="post" name="oweform">
          <div align="left"><span class="STYLE4">总计欠款金额：
          <input type="text" id="sum" class="text4" size="3"  disabled value=<s:property value='sumowe'/> >元</span>
          <input type="hidden" name="lname"  value=<s:property value="lnamee"/>>
               &nbsp;&nbsp;<a href="javascript:void(0)" onclick="owe()"><span class="STYLE1">确认缴费</span></a>
          </div>
          
       </form>
    </table>
    
    <br/>
    <hr size="5" width="70%" align="left"/>
    
</body>

