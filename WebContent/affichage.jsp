<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pack.Utilisateur"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="fr">
<head>
<meta charset="utf-8">
<title>affichage</title>


</head>
<body>
	
	<h1> Informations utilisateur avec JSTL/EL:</h1>
	<ul>
		<li>Login avec JSTL : <c:out value="${utilisateur.login}"/>
	</ul>

</body>
</html>
