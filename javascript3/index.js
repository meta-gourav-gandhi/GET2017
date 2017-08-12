function callWebWorker(){
	
	document.getElementById("includecontent").innerHTML='<object type="text/html" data="webworker.html" width="100%" height="500px" ></object>';
}
function callSum(){
	
	document.getElementById("includecontent").innerHTML='<object type="text/html" data="sumfunction.html" width="100%" height="500px" ></object>';
}
function callContact(){
	
	document.getElementById("includecontent").innerHTML='<object type="text/html" data="contact.html" width="100%" height="500px" ></object>';
}

window.onload=function(){
	callWebWorker();
}
