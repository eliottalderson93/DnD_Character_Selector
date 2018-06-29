<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DnD Character Selector</title>
<link rel="stylesheet" type="text/css" href="css/bulma.css">
<link rel = "stylesheet" type = "text/css" href = "css/styles.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="js/intro.js"></script>
<script type = "text/javascript">
</script>
</head>
<body>
	<section class = "hero is-black">
	<div class = "hero-body">
		<div class = "container">
			<h1 class = "title is-1" >Welcome to the Dungeons and Dragons 5e Character selector!</h1>
			<p>Build a character to play at your next session.</p>
		</div>
	</div>
	</section>
	<div class = "container">
	<form:form action = "/attributes" modelAttribute = "choices" method = "post" id = "choices" class = "box-background-color">
	<div class = "columns">
		<div class = "column is-one-quarter">
		<div class = "card">
		<div class = "card-header">
		<h3 class = "card-header-title">Choose your Race</h3>
		</div>
		<div class = "card-content">
		<div class = "field">
		<div class = "control">
		<form:select path = "raceChosen" id = "race">
			<form:option value = "Human">Select Race</form:option>
			<form:option value = "Human">Human</form:option>
			<form:option value = "Dwarf">Dwarf</form:option>
			<form:option value = "Elf">Elf</form:option>
		</form:select>
		</div>
		</div>
		</div> <!-- form card-content -->
		<div class = "card-content">
			<figure class = "image is-3by5">
				<img src = "/img/default/logo.jpg" alt = "/img/default/logo.jpg" id = "raceImg">
			</figure>
		</div>
		<div class = "card-content">
			<p id = "raceDesc"></p>
		</div>
		</div> 
		</div>
		<div class = "column is-one-quarter" id ="subRaceCol" style = "display:none;">
		<div class = "card">
		<div class = "card-header">
		<h3 class = "card-header-title">Choose your subRace</h3>
		</div>
		<div class = "card-content">
		<div class = "field">
		<div class = "control"> 
		<form:select path = "subRaceHuman" id = "subRaceHuman" style = "display:none;">
			<form:option value = "0">Human Subrace</form:option>
			<form:option value = "Normal">Normal</form:option>
			<form:option value = "Variant">Variant</form:option>
		</form:select>
		<form:select path = "subRaceDwarf" id = "subRaceDwarf" style = "display:none;">
			<form:option value = "0">Dwarf SubRace</form:option>
			<form:option value = "Mountain">Mountain</form:option>
			<form:option value = "Hill">Hill</form:option>
		</form:select>
		<form:select path = "subRaceElf" id = "subRaceElf" style = "display:none;">
			<form:option value = "0">Elf Subrace</form:option>
			<form:option value = "High">High</form:option>
			<form:option value = "Wood">Wood</form:option>
			<form:option value = "Dark">Dark</form:option>
		</form:select>
		</div>
		</div>
		</div>
		<div class = "card-content">
			<figure class = "image is-3by2">
				<img src = "/img/default/logo.jpg" alt = "/img/default/logo.jpg" id = "subRaceImg">
			</figure>
		</div>
		<div class = "card-content" >
			<p id = "subRaceDesc"></p>
		</div>
		</div> 
		</div>
		<div class = "column is-one-quarter">
		<div class = "card">
		<div class = "card-header">
		<h3 class = "card-header-title">Choose your Class</h3>
		</div>
		<div class = "card-content">
		<div class = "field">
		<div class = "control">
		<form:select path = "classChosen" id = "class">
			<form:option value = "Fighter">Select Class</form:option>
			<form:option value = "Fighter">Fighter</form:option>
			<form:option value = "Wizard">Wizard</form:option>
			<form:option value = "Barbarian">Barbarian</form:option>
		</form:select>
		</div>
		</div>
		</div>
		<div class = "card-content">
			<figure class = "image is-3by5">
				<img src = "/img/default/logo.jpg" alt = "/img/default/logo.jpg" id = "classImg">
			</figure>
		</div>
		<div class = "card-content">
			<p id = "classDesc"></p>
		</div>
		</div> 
		</div>
		<div class = "column is-one-quarter" id="subClassCol" style = "display:none;">
		<div class = "card">
		<div class = "card-header">
		<h3 class = "card-header-title">Choose your Class Specialization</h3>
		</div>
		<div class = "card-content">
		<div class = "field">
		<div class = "control">
		<form:select path = "subClassWizard" id = "subWizard" style = "display:none;">
			<form:option value = "0">Select Wizard Subclass</form:option>
			<form:option value = "divination">Divinator</form:option>
			<form:option value = "evocation">Evocator</form:option>
			<form:option value = "conjuror">Conjuror</form:option>
		</form:select>
		<form:select path = "subClassFighter" id = "subFighter" style = "display:none;">
			<form:option value = "0">Select Fighter Subclass</form:option>
			<form:option value = "champion">Champion</form:option>
			<form:option value = "battleMaster">Battle Master</form:option>
			<form:option value = "eldritchKnight">Eldritch Knight</form:option>
		</form:select>
		<form:select path = "subClassBarbarian" id = "subBarbarian" style = "display:none;">
			<form:option value = "0">Select Barbarian Subclass</form:option>
			<form:option value = "berserker">Berserker</form:option>
			<form:option value = "totemWarrior">Totem Warrior</form:option>
		</form:select>
		</div>
		</div>
		</div>
		<div class = "card-content">
			<figure class = "image is-3by5">
				<img src = "/img/default/logo.jpg" alt = "/img/default/logo.jpg" id = "subClassImg">
			</figure>
		</div>
		<div class = "card-content">
			<p id = "subClassDesc"></p>
		</div>
		</div> 
		</div>
		</div>
		<div class = "container">
		<div class = "control">
		<input type = "submit" value = "Create Character Race and Class" class = "button is-black">
		</div>
		</div>
	</form:form>
	</div>
</body>
</html>