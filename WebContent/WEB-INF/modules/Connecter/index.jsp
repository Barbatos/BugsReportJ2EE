<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
	<div class="moduleTitle">
		<span class="mod-icon">S</span>Compte
	</div>
	<div class="subTitle">Connexion, inscription</div>
	<div id="mainConnecter"></div>
</section>
<%= KoHttp.kajaxIncludes(request) %>