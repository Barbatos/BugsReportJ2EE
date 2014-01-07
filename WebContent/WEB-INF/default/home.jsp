<%@page import="net.ko.framework.KoHttp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div class="container">
    	<div id="menu" class="content">
               <ul class="ca-menu">
               		<li id="mConnecter" title="Se connecter, s'incrire">
                        <a>
                            <span class="ca-icon-bug">S</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Connecter</h2>
                                <h3 class="ca-sub">Se connecter, s'inscrire</h3>
                            </div>
                        </a>
                    </li>
                    <li id="mSignaler" title="Signaler, remonter un bug">
                        <a>
                            <span class="ca-icon-bug">a</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Signaler</h2>
                                <h3 class="ca-sub">Remonter un bug</h3>
                            </div>
                        </a>
                    </li>
                    <li id="mEchanger" title="Échanges sur les remontées de bugs existantes">
                        <a>
                            <span class="ca-icon">@</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Échanger</h2>
                                <h3 class="ca-sub">Échanges sur les remontées de bugs existantes</h3>
                            </div>
                        </a>
                    </li>
                    <li id="mConsulter" title="Rechercher, consulter les reports">
                        <a>
                            <span class="ca-icon">L</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Consulter</h2>
                                <h3 class="ca-sub">Rechercher, consulter les reports</h3>
                            </div>
                        </a>
                    </li>
                    <li id="mGerer" title="Gestion des applications & cas d'utilisation, répartition des développeurs">
                        <a>
                            <span class="ca-icon">S</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Gérer</h2>
                                <h3 class="ca-sub">Gestion des applications & cas d'utilisation, répartition des développeurs</h3>
                            </div>
                        </a>
                    </li>
                    <li id="mAdministrer" title="Gestion des utilisateurs et des groupes">
                        <a>
                            <span class="ca-icon">U</span>
                            <div class="ca-content">
                                <h2 class="ca-main">Administrer</h2>
                                <h3 class="ca-sub">Gestion des utilisateurs et des groupes</h3>
                            </div>
                        </a>
                    </li>
                </ul>
           </div>
		</div>
<%=KoHttp.kajaxIncludes(request)%>