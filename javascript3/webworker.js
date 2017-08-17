
function startWorker(){
	debugger;
	var d=new Date();
	document.getElementById("result").innerHTML=d;
	
	var w=new Worker("webextra.js");
	
	w.onmessage=function(event){
		document.getElementById("result").innerHTML += " <br> " + event.data;
	}
	
}