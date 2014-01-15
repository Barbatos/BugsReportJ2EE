<%@page import="net.ko.debug.KDebugClient"%>
<%@page import="net.ko.framework.KoHttp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="footer">
	<div id="bottomFooter">
		<div id="info">KObject framework - Déc. 2013</div>
		<div id="message"></div>
	</div>
</div>
<div id="main-ajax-loader" style="display: none"><span>Chargement...</span></div>
<%
if(KDebugClient.isActive()){
	out.print(KDebugClient.getMenu(request));
}
%>
<%=KoHttp.kajaxIncludes(request)%>
</body>
</html>