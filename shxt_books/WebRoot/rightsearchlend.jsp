<%@ page language="java" import="java.util.*,com.shxt.bo.*,com.shxt.service.impl.*,com.shxt.service.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<HTML xmlns="http://www.w3.org/1999/xhtml">

<HEAD id=Head1>
<title>借阅查询页面</title>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="css/Style.css" type=text/css rel=stylesheet>
<LINK href="css/Manage.css" type=text/css rel=stylesheet>




<META content="MSHTML 6.00.2900.3492" name=GENERATOR>

  <script type="text/javascript">

	function searchSubForm(type,pageNow,totalPages){
		//当前页
		var pageNowData =  parseInt(pageNow);
	
		var totalPages =  parseInt(totalPages);
		var pageNow = document.getElementById("pageNow");
		switch(type){
			case '0':
				pageNow.value= 0;
				break;
			case '1':
				if(pageNowData>1){
					pageNow.value =pageNowData-1;
					break;
				}else{
					alert("抱歉已经是首页了，无法查询了");
					return false;
				}
			case '2':
				if(pageNowData<totalPages){
					pageNow.value = pageNowData+1;
					break;
				}else{
					alert("抱歉已经是尾页页了，无法查询了");
					return false;
				}
			case '3':
				pageNow.value = totalPages;
				break;	
		}

		searchform.submit();
		
	}
	
	function searchReset(){
		var pageNow = document.getElementById("pageNow");
		pageNow.value="1";
		
		document.getElementById("rid").value="";
		document.getElementById("bid").value="";
		
		
		searchform.submit();
	}
	
	function sub(){
		var pageNow = document.getElementById("pageNow");
		pageNow.value="1";
		searchform.submit();
		
	}

</script>



</HEAD>


<body>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
  
  <TR>
    <TD width=15><IMG src="images/new_019.jpg" border=0></TD>
    <TD width="100%" background=images/new_020.jpg height=20></TD>
    <TD width=15><IMG src="images/new_021.jpg" border=0></TD>
  </TR>
  
</TABLE>
<%
    ILendService ils=new LendServiceImpl();
%>
<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
 
  <TR>
    <TD width=15 background=images/new_022.jpg><IMG 
      src="images/new_022.jpg" border=0> </TD>
    <TD vAlign=top width="100%" bgColor=#ffffff>
      <TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
        <TR>
          <TD class=manageHead>当前位置：图书管理&gt; 借阅查询 &gt; 多种方式查询</TD></TR>
        <TR>
          <TD height=2></TD></TR></TABLE>
          <s:if test="#session.role=='admin'">	
          
            <form action="searchLendAction.action" method="post"
				name="searchform" target="frame2">
				
			
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TR>  
                <TD>读者编号</TD>
                <TD><INPUT class=textbox id=rid style="WIDTH: 70px" 
                  name="query.rid"></TD>
                <TD>图书编号</TD>
                <TD><INPUT class=textbox id=bid style="WIDTH: 70px" 
                  name="query.bid"></TD>
                <TD>
                
                <INPUT class=button type=button value=" 查询 " onclick="sub()"></TD>
                <TD>
                
                <INPUT class=button type=button value=" 重置 " onclick="searchReset()"></TD>
                <input type="hidden" name="pageBean.pageNow" id="pageNow" value="1"/>
			</TR>
		  </TABLE>
		  
         </form>
         </s:if>
    
    <hr color="white"/>
    <div>
	<iframe name="frame2" frameborder="0" height="350" scrolling="no" width="100%" src="searchLendAction.action">
	</div>
</body>

</html>

