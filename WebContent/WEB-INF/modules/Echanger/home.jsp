<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="container">
	<div id="menu" class="content">
		<ul class="ca-menu">
			<li id="lEchanger/message" title="Echanger des messages">
			    <a>
					<span class="ca-icon">S</span>
			        <div class="ca-content">
			            <h2 class="ca-main">Echanges</h2>
			            <h3 class="ca-sub">Echanger des messages</h3>
			        </div>
			    </a>
			</li>
		</ul>
	</div>
</div>
<%= KoHttp.kajaxIncludes(request) %>