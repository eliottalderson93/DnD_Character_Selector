/**
 * 
 */
var strRankOld=1;
var strRankNew = 1;
var dexRank=2;
var conRank=3;
var intRank=4;
var wisRank=5;
var chaRank=6;
var attributeArr = [];
//var order = [[1,"1st"],[2,"2nd"],[3,"3rd"],[4,"4th"],[5,"5th"],[6,"6th"]];
var orderMap = {};
orderMap[1] = "1st";
orderMap[2] = "2nd";
orderMap[3] = "3rd";
orderMap[4] = "4th";
orderMap[5] = "5th";
orderMap[6] = "6th";
var temp;
var swapTo;
var swapFrom;
function checkRank(checked,arr){
	if (checked == null){
		return;
	}
	for(var i = 0; i < arr.length; i++){
		if(arr[i] == null){
			
		}
		else if(arr[i] == checked){
			
		}
	}
}
$(document).ready(function() {
	//console.log("doc ready");
	$('#strSel').change(function (){
		console.log("swap From")
		strRankOld = strRankNew;
		console.log(getOrder(strRankOld));
		console.log("to");
		strRankNew = jQuery("#strSel option:selected").val();
		console.log(getOrder(strRank));
		$('#strDefOpt').attr('value',strRank);
		$('#strDefOpt').text(getOrder(strRank));
		swapTo = ("#" + strRank)+"Pos";
		swapFrom = $(swapTo).children().attr('id'); //strength, constitution, etc
		temp = $(swapFrom).clone();
		strDiv = $('#strength').clone();
		$(swapFrom).replaceWith(strDiv);
		$(swapTo).replaceWith(temp);
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(race);
	})
	$('#dexSel').change(function (){
		dexRank = jQuery("#dexSel option:selected").val();
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(subrace);
	})
	$('#conSel').change(function (){
		conRank = jQuery("#dexSel option:selected").val();
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(role);
	})
	$('#intSel').change(function (){
		intRank = jQuery("#intSel option:selected").val();
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(subclass);
	})
	$('#wisSel').change(function (){
		wisRank = jQuery("#wisSel option:selected").val();
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(subclass);
	})
	$('#chaSel').change(function (){
		chaRank = jQuery("#chaSel option:selected").val();
		//attributeArr = [first,second,third,fourth,fifth,sixth];
		//alert(subclass);
	})
	function getOrder(num) { //1 into 1st, 2 into 2nd
    return orderMap[num];
	}
})