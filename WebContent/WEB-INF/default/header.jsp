<%@ page session="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%String path=request.getServletContext().getContextPath(); %>
<!DOCTYPE HTML>
<html>
<head>
<script src="<%=path%>/js/forms.js"></script>
<script src="<%=path%>/js/userJS.js"></script>
<script src="<%=path%>/js/sizzle.js"></script>

<script type="text/javascript" src="messages.kjs"></script>
<link rel="stylesheet" href="<%=path%>/css/lightbox.kcss">
<link rel="stylesheet" href="<%=path%>/css/main.kcss">
<link rel="stylesheet" href="<%=path%>/css/list.kcss">
<link rel="stylesheet" href="<%=path%>/css/debug.kcss">
<link rel="stylesheet" href="<%=path%>/css/css3.kcss">
<link rel="stylesheet" href="<%=path%>/css/userStyle.kcss">
<link rel="stylesheet" href="<%=path%>/css/animated.kcss">
<meta charset="UTF-8" />
<title>KObject Framework</title>
</head>
<body id="body" class="fond">
<div id="header">
	<div id="headContent">
		<div id="logo">
		<a><img src="<%=path%>/images/index/logo.png" title="Retour à l'accueil" alt="logo"></a>
		</div>
	</div>
</div>
	<div id="topMenu">
		<div id="contentMenu">
			<div><a class="menuItem" id="homeConnected">Home</a></div>
			<div><a class="menuItem" id="utilisateurs">Utilisateurs</a></div>
			<div><a class="menuItem" id="lGerer/report">Reports</a></div>
			<div><a class="menuItem" id="mAdministrer">Admin</a></div>
			<div><a class="menuItem" id="compte">Compte</a></div>	
		</div>
	</div>