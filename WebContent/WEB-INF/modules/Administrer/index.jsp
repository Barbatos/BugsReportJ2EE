<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<section>
	<div class="moduleTitle">
		<span class="mod-icon">U</span>Administrer
	</div>
	<div class="subTitle">Groupes, Utilisateurs, Droits, Modules</div>
	<div id="mainAdministrer"></div>
</section>
<%= KoHttp.kajaxIncludes(request) %>
