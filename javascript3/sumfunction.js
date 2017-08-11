
var pattern=/^[0-9]{1,}$/; 

function getResult1(){
	
	var a= document.getElementById("content1");
	if(!a.value.match(pattern)){
		a.select();
		alert("Enter numeric value");
		return false;
	}
	
	var b= document.getElementById("content2");
	if(!b.value.match(pattern)){
		b.select();
		alert("Enter numeric value");
		return false;
	}
	
	sumData(a.value,b.value);
	a.value="";
	b.value="";
}
function getResult2(){
	
	var c= document.getElementById("content3");
	if(!c.value.match(pattern)){
		c.select();
		alert("Enter numeric value");
		return false;
	}
	
	var d= document.getElementById("content4");
	if(!d.value.match(pattern)){
		d.select();
		alert("Enter numeric value");
		return false;
	}
	
	sumData(c.value)(d.value);
	c.value="";
	d.value="";
}

var sumData=function(a){
if(arguments.length == 2){
document.getElementById("result").innerHTML = "Sum is :- " + (parseInt(arguments[0]) + parseInt(arguments[1]));
}
else if(arguments.length ==1)
{return function(b){
document.getElementById("result").innerHTML = "Sum is :-" + (parseInt(a)+parseInt(b));
}
}
}
