<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML "4".01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${chosenSubRace} ${chosenRace} ${chosenSubClass} ${chosenClass}</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="css/rank.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/bulma.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<script type="text/javascript" src="js/roll.js"></script>
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
						<h1 class = "title is-1">Roll Your ${chosenSubRace} ${chosenRace} ${chosenSubClass} ${chosenClass}!</h1>
						<p class = "subtitle">Roll 4d6 for each of your attributes.</p>
						<p class = "subtitle is-6">You can rank your attributes in any order below and the rolls will be assigned to each attribute in the order specified.</p>
						<p class = "subtitle is-6">Your other attributes will be added automatically based on your rolls.</p>
					</div>
			</div>
		</div>
	</section>
	<section class = "section">
		<div class = "container">
			<form:form action = "/roll" modelAttribute = "roll" method = "post" id = "roll">
				<form:select path = "rollMethod">
					<form:option value = "false">Default scores: 15, 14, 13, 12, 10, 8</form:option>
					<form:option value = "true">Roll random scores</form:option>
				</form:select>
				<p>Once rolled the highest roll will be assigned to first attribute, second highest roll to second highest attribute, etc</p>
		</div>
	</section>
	<section class = "section">
		<div class = "container">
			<div class = "level" id = "1Pos">
			<div class = "content" id = "strength">
				<form:select path = "strPriority" id = "strSel">
					<form:option value = "1" id = "strDefOpt">1st</form:option>
					<form:option value = "1">1st</form:option>
					<form:option value = "2">2nd</form:option>
					<form:option value = "3">3rd</form:option>
					<form:option value = "4">4th</form:option>
					<form:option value = "5">5th</form:option>
					<form:option value = "6">6th</form:option>
				</form:select>
				<h1 class = "title" id = "black">Strength</h1>
				<p>Tenna' tul're san' tangwa en' templa Ianterea quel du. Ndengina ta ho amin naa tualle Taur'quessir Yavannie. Mereth en draugrim diola lle kwentra lye i'narn Melamin. Kwentra lye i'narn rina istorlle sinome Yenearsira lissenen ar' maska'lalaith tenna' lye omentuva. Taur'amandil irma haeannon n'tess gothamin amin n'rangwa edanea.</p>
			</div>	
			</div>
			<div class = "level" id = "2Pos">
				<div class = "content" id = "dexterity">
					<form:select path = "dexPriority" id = "dexSel">
						<form:option value = "2" id = "dexDefOpt">2nd</form:option>
						<form:option value = "1">1st</form:option>
						<form:option value = "2">2nd</form:option>
						<form:option value = "3">3rd</form:option>
						<form:option value = "4">4th</form:option>
						<form:option value = "5">5th</form:option>
						<form:option value = "6">6th</form:option>
					</form:select>
					<h1 class = "title" id = "black">Dexterity</h1>
					<p>Mith'quessir auta miqula orqu Anthatal esta sinome. Kotyaerea 'Ksherea Tel'gothrim tanya farnuva. Rina istorlle sinome lova poldora n'tess uuvanimo Melloneamin. Cormamin lindua ele lle Yavannie Urime lye naa lle nai. Silmataurea vara tel' taurninin lle auta yeste' manke naa nae lle?</p>
				</div>
			</div>
			<div class = "level" id = "3Pos">
				<div class = "content" id = "constitution">
					<form:select path = "conPriority" id = "conSel">
						<form:option value = "3" id = "conDefOpt">3rd</form:option>
						<form:option value = "1">1st</form:option>
						<form:option value = "2">2nd</form:option>
						<form:option value = "3">3rd</form:option>
						<form:option value = "4">4th</form:option>
						<form:option value = "5">5th</form:option>
						<form:option value = "6">6th</form:option>
					</form:select>
					<p class = "title" id = "black">Constitution</p>
					<p>Amin sinta thaliolle e dagor manke naa nae lle Gayaerea. Isilya russe tuulo' moriloomir esta sinome manke naa lye omentien? Ta naa nae seasamin cuamin linduva yassen megrille manke naa nae lle Gorgaerea. Lye mela en' coiamin Waenen dagnir en taur'ohtar. Bragol alaa lova handasse ndengina ta ho Kheleksii.</p>
				</div>
			</div>
			<div class = "level" id = "4Pos">
				<div class = "content" id = "intelligence">
					<form:select path = "intPriority" id = "intSel">
						<form:option value = "4" id = "intDefOpt">4th</form:option>
						<form:option value = "1">1st</form:option>
						<form:option value = "2">2nd</form:option>
						<form:option value = "3">3rd</form:option>
						<form:option value = "4">4th</form:option>
						<form:option value = "5">5th</form:option>
						<form:option value = "6">6th</form:option>
					</form:select>
					<p class = "title" id = "black">Intelligence</p>
					<p>Malia ten' yulna Nandaror Cermie Mani? Faina templa mani naa ta lle anta yulna en alu utinu en lokirim. Poika tel' taurninin tula, hama neva i'naur Uialtum sana termara en' templa. Kwentra lye i'narn nurta i' fea manke naa lye lle autien Istar. Mani naa ta lye nuquernuva sen e dagor ta naa seasamin Rah'edan.</p>
				</div>
			</div>
			<div class = "level" id = "5Pos">
				<div class = "content" id = "wisdom">
					<form:select path = "wisPriority" id = "wisSel">
						<form:option value = "5" id = "wisDefOpt">5th</form:option>
						<form:option value = "1">1st</form:option>
						<form:option value = "2">2nd</form:option>
						<form:option value = "3">3rd</form:option>
						<form:option value = "4">4th</form:option>
						<form:option value = "5">5th</form:option>
						<form:option value = "6">6th</form:option>
					</form:select>
					<p class = "title" id = "black">Wisdom</p>
					<p>Yavieba lle vesta Kheleksii Tulien. Nadorhuanrim amin sinta lle manke naa nae lle llie lye tuulo' Dinaerea. Mereth en draugrim lissenen ar' maska'lalaith tenna' lye omentuva i'narr en gothrim glinuva nuin i'anor ram en' ondo. Ram en' 'kshapsa Tel'Sindavathar amin khiluva lle a' gurtha ar' thar lle wethrine amin. Telcoerea Sereg'wethrin Unguerea Megiltura.</p>
				</div>
			</div>
			<div class = "level" id = "6Pos">
				<div class = "content" id = "charisma">
					<form:select path = "chaPriority" id = "chaSel">
						<form:option value = "6" id = "chaDefOpt">6th</form:option>
						<form:option value = "1">1st</form:option>
						<form:option value = "2">2nd</form:option>
						<form:option value = "3">3rd</form:option>
						<form:option value = "4">4th</form:option>
						<form:option value = "5">5th</form:option>
						<form:option value = "6">6th</form:option>
					</form:select>
					<p class = "title" id = "black">Charisma</p>
					<p>Amin khiluva lle a' gurtha ar' thar irma haeannon naar cam Lotesse. Detholalle yala onna en' alu yala rauko Rhun. Val'istar gurth gothrim tel'quessir Amandil luhta kanta. Tenna' telwan san' ring wing lle anta yulna en alu ed' i'ear ar' elenea!. N'ndengina ta ho mae govannen lle merna aut farien Taur'quessir.</p>
				</div>
			</div>
			<input type = "submit" value = "Roll Character">
		</div>
</form:form>
</section>
</body>
</html>