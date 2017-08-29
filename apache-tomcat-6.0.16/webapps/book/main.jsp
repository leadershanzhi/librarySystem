<%@ page language="java" import="java.util.*,com.shxt.service.*,com.shxt.bo.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<frameset rows="12%,88%" border="1">
    <frame src="header.jsp"></frame>
	
	<frameset cols="15%,85%" style="background-color:#CCCCCC">
	    <frame src="menu.jsp"></frame>
	 <s:if test="#session.role=='admin'">
	     <frame src="rightsearch.jsp" name="content"></frame>
	 </s:if>
	 <s:else>
	    <frame src="listMessageAction.action" name=content></frame> 
	 </s:else>
	 
	</frameset>
	
</frameset><noframes></noframes>

