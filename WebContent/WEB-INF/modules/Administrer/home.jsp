<%@ page import="net.ko.framework.KoHttp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="container">
   	<div id="menu" class="content">
              <ul class="ca-menu">
                   <li id="lAdministrer/utilisateur" title="Administrer les utilisateurs">
                       <a>
                           <span class="ca-icon">U</span>
                           <div class="ca-content">
                               <h2 class="ca-main">Utilisateurs</h2>
                               <h3 class="ca-sub">Gérer les utilisateurs</h3>
                           </div>
                       </a>
                   </li>
                   <li id="lAdministrer/groupe" title="Administrer les groupes">
                       <a>
                           <span class="ca-icon">S</span>
                           <div class="ca-content">
                               <h2 class="ca-main">Groupes</h2>
                               <h3 class="ca-sub">Gérer les groupes</h3>
                           </div>
                       </a>
                  </li>
                  <li id="mAdministrer/listeDroits" title="Administrer les droits">
                      <a>
                          <span class="ca-icon">S</span>
                          <div class="ca-content">
                              <h2 class="ca-main">Droits</h2>
                              <h3 class="ca-sub">Gérer les droits</h3>
                          </div>
                      </a>
                  </li>
                  <li id="mAdministrer/listeModules" title="Administrer les modules">
                      <a>
                          <span class="ca-icon">S</span>
                          <div class="ca-content">
                              <h2 class="ca-main">Modules</h2>
                              <h3 class="ca-sub">Gérer les modules</h3>
                          </div>
                      </a>
                  </li>
              </ul>
         </div>
</div>
<%= KoHttp.kajaxIncludes(request) %>