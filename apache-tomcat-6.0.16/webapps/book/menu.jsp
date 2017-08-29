<%@ page language="java"
	import="java.util.*,com.shxt.service.*,com.shxt.bo.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<META http-equiv=Content-Type content="text/html; charset=gb2312">
		<LINK href="css/admin.css" type="text/css" rel="stylesheet">
		<SCRIPT language=javascript>
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
	</HEAD>
	<BODY>
		<TABLE height="100%" cellSpacing=0 cellPadding=0 width=196
			background=images/menu_bg.jpg border=0>

			<TR>
				<TD vAlign=top align=middle>
					<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>

						<TR>
							<TD height=10></TD>
						</TR>
					</TABLE>
					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(1) href="javascript:void(0);">图书管理</A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					
					<TABLE id=child1 style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>

						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="rightsearch.jsp" target="content">图书查询</A>
							</TD>
						</TR>

						<s:if test="#session.role=='admin'">
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="rightsearchlend.jsp" target=content>图书借阅</A>
								</TD>
							</TR>
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="revertmoney.jsp" target=content>图书还款</A>
								</TD>
							</TR>
						</s:if>
						<s:else>

							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild
										href='searchLendAction.action?cz=<s:property value='#session.user_session.lname'/>'
										target=content>图书借阅</A>
								</TD>
							</TR>
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href='revertmoneyReaderAction.action?lname=<s:property value='#session.user_session.lname'/>' target=content>图书还款</A>
								</TD>
							</TR>

						</s:else>


						<s:if test="#session.role=='admin'">


							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="addbook.jsp" target="content">图书添加</A>
								</TD>
							</TR>


							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="handledict.jsp" target=content>类别管理</A>
								</TD>
							</TR>
							
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href='searchLendAction.action?cz=40201' target=content>查看预定</A>
								</TD>
							</TR>
							

								
						</s:if>


                        <TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="library.jsp" target="content">简要介绍</A>
							</TD>
						</TR>
						<TR height=20>
						<TR height=4>
									<TD colSpan=2></TD>
								</TR>

					</TABLE>

					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(2) href="javascript:void(0);">通知快讯</A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					<TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>

						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="listMessageAction.action"
									target=content>查看通知</A>
							</TD>
						</TR>
                        
						<s:if test="#session.role=='admin'">

                            <TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="searchallLiuHuiAction.action" target=content>查看留言</A>
								</TD>
					        </TR>
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="addmessage.jsp" target=content>发表通知</A>
								</TD>
							</TR>
							
							<TR height=4>
								<TD colSpan=2></TD>
							</TR>
							
							</s:if>
							<s:else>
							    <TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="searchselfLiuHuiAction.action" target=content>发表留言</A>
								</TD>
					        </TR>
							
							
							</s:else>
					</TABLE>

					
                   <s:if test="#session.role=='admin'">
					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>


						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(3) href="javascript:void(0);">读者管理</A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					<TABLE id=child3 style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>
						<s:if test="#session.role=='admin'">
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="addreader.jsp" target="content">添加读者</A>
								</TD>
							</TR>
							
							
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="alterreader.jsp" target="content">
										修改信息</A>
								</TD>
							</TR>
							<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild href="addmanager.jsp" target="content">添加管理员</A>
								</TD>
							</TR>

						

						
							
						</s:if>

				
							
					

						<TR height=4>
							<TD colSpan=2></TD>
						</TR>
					</TABLE>
					</s:if>
					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(4) href="javascript:void(0);">统计排行</A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					<TABLE id=child4 style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>
						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="ranklendBookAction.action"
									target=content>图书排行</A>
							</TD>
						</TR>
						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="jfreechartPieAction.action"
									target=content>人员组成</A>
							</TD>
						</TR>
						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="jfreechartBarAction.action"
									target=content>借阅分析</A>
							</TD>
						</TR>
						<TR height=4>
							<TD colSpan=2></TD>
						</TR>
					</TABLE>


					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>

						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(0) href="javascript:void(0);">个人管理</A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					<TABLE id=child0 style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>
                         <s:if test="#session.role!='admin'"> 
						<TR height=20>
								<TD align=middle width=30>
									<IMG height=9 src="images/menu_icon.gif" width=9>
								</TD>
								<TD>
									<A class=menuChild
										href='searchReaderAction.action?lname=<s:property value='#session.user_session.lname'/>'
										target="content"> 修改信息</A>
								</TD>
							</TR>
						</s:if>
						<TR height=20>
							<TD align=middle width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild
									onclick="if (confirm('确定要退出吗？')) return true; else return false;"
									href="existReaderAction.action" target="_top">退出系统</A>
							</TD>
						</TR>
					</TABLE>
				</TD>
				<TD width=1 bgColor=#d1e6f7></TD>
			</TR>
		</TABLE>
	</BODY>
</HTML>

