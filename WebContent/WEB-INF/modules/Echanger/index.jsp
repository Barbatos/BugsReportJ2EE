<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
	<div class="moduleTitle">
		<span class="mod-icon">@</span>Échanger
	</div>
	<div class="subTitle">Échanger sur les remontées de bug existantes</div>
	<div id="mainEchanger"></div>
</section>
<%= KoHttp.kajaxIncludes(request) %>