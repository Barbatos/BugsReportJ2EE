<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="container">
	<div id="menu" class="content">
		<ul class="ca-menu">
			<li id="lGerer/application" title="Gerer les applications">
			    <a>
					<span class="ca-icon">S</span>
			        <div class="ca-content">
			            <h2 class="ca-main">Applications</h2>
			            <h3 class="ca-sub">Gérer les applications</h3>
			        </div>
			    </a>
			</li>
			<li id="lGerer/usecase" title="Gerer les cas d'utilisation">
			    <a>
					<span class="ca-icon">S</span>
			        <div class="ca-content">
			            <h2 class="ca-main">Cas d'utilisation</h2>
			            <h3 class="ca-sub">Gérer les cas d'utilisation</h3>
			        </div>
			    </a>
			</li>
			<li id="lGerer/report" title="Gerer les reports de bug">
			    <a>
					<span class="ca-icon">S</span>
			        <div class="ca-content">
			            <h2 class="ca-main">Report</h2>
			            <h3 class="ca-sub">Gérer les reports de bug</h3>
			        </div>
			    </a>
			</li>
		</ul>
	</div>
</div>
<%= KoHttp.kajaxIncludes(request) %>