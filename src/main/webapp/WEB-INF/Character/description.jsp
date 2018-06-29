<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose Equipment and Write Description</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<h2>Choose Equipment</h2>
	<form:form action = "/equipment" method = "post" modelAttribute = "equipment">
		<form:select path = "weapon">
			<form:option value = "sword">Sword</form:option>
			<form:option value = "staff">Staff</form:option>
			<form:option value = "bow">Bow</form:option>
		</form:select>
	</form:form>
	<h2>Write Description</h2>
	<form:form action = "/roleplay" method = "post" modelAttribute = "Character">
		<form:textarea path = "backstory"/>
	</form:form>
</body>
</html>