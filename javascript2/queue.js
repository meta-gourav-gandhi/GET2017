var myqueue=[];
var left=0;
var right=-1;

function enquedata(){
	var data= document.getElementById("content");
	if(data.value!=""){
	myqueue[++right]=data.value;
	document.getElementById("result").innerHTML= document.getElementById("content").value + " has been added to the ";
	}
	else{
		document.getElementById("result").innerHTML="Please enter some value.";
	}
	
	document.getElementById("content").value="";
		document.getElementById("content").focus();
}
function removedata(){
	
	if(left<=right){
		var i=myqueue[left++];
		document.getElementById("result").innerHTML = i + " has been deleted";
	}else
	{
	 document.getElementById("result").innerHTML ="Queue is empty";
	}
	
	document.getElementById("content").value="";
		document.getElementById("content").focus();
}

function printdata(){
	if(left<=right){
		var text="";
		for(var i=left;i<=right;i++){
			text=text +  myqueue[i] + "<br>";
		}
		document.getElementById("result").innerHTML ="The elements are :- <br>" + text;
	}
	else{
		document.getElementById("result").innerHTML ="Queue is empty";
	}
}
