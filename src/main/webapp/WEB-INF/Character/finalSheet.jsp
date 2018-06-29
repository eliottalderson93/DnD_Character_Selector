<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${character.getRace()} ${character.getDndClass()}</title>
<link rel="stylesheet" type="text/css" href="css/bulma.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<section class = "hero is-black">
		<div class = "hero-body">
			<div class = "level">
				<div class = "level-left">
					<figure class = "image is-128x128">
						<img src = "/img/default/d20.png" alt = "/img/default/logo.jpg">
					</figure>
				</div>	
					<div class = "container">
						<h1 class = "title is-1">Attributes for ${character.getRace()} ${character.getDndClass()}!</h1>
						<!--  <p class = "subtitle">Roll 4d6 for each of your attributes.</p>
						<p class = "subtitle is-6">You can rank your attributes in any order below and the rolls will be assigned to each attribute in the order specified.</p>
						<p class = "subtitle is-6">Your other attributes will be added automatically based on your rolls.</p> -->
					</div>
			</div>
		</div>
	</section>
	<section class = "section">
		<div class = "container">
			<div class = "tile">
				<p>Strength</p>
				<p>${character.getStr()}</p>
			</div>
			<div class = "tile">
				<p>Dexterity</p>
				<p>${character.getDex()}</p>
			</div>
			<div class = "tile">
				<p>Constitution</p>
				<p>${character.getCon()}</p>
			</div>
			<div class = "tile">
				<p>Intelligence</p>
				<p>${character.getInt()}</p>
			</div>
			<div class = "tile">
				<p>Wisdom</p>
				<p>${character.getWis()}</p>
			</div>
			<div class = "tile">
				<p>Charisma</p>
				<p>${character.getCha()}</p>
			</div>
		</div>
		<a href = "/logout">Back to beginning</a>
	</section>
	
</body>
</html>