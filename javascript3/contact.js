function callHome(){

 document.getElementById("home").href="index.html";
	
}
function callContact(){

  document.getElementById("contactUs").href="contact.html";
	
}

function checkName(){
	var name= document.getElementById("userName");
	 
	var letters = /^[A-Za-z ]+$/;  
	if(name.value.match(letters) && (name.value.length>1 && name.value.length<=20) )  
	{  
		
		localStorage.setItem("name", name.value);
		return true;  
	}  
	else  
	{  
		name.select();
		alert('Username must have alphabet characters of maximum limit 20');  
		name.focus();  
		return false;  
	}	
}

function checkEmail(){
	
	var mail = document.getElementById("userEmail");
	var pattern=/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$/;
	if(mail.value.match(pattern))
	{	
		localStorage.setItem("mail", mail.value);
		return true;
	}
	else
	{
		mail.select();
		alert('Please enter the mail in the proper format');  
		mail.focus();  
		return false;  
	}
}



function checkOrganization(){
	var com = document.getElementById("userOrgName");
	var pattern=/^[A-Za-z]+$/; 
	if(com.value.match(pattern))
	{	
		localStorage.setItem("orgname", com.value);
		return true;
	}
	else
	{
		com.select();
		alert('caharacters are only allow in organization field');  
		com.focus();  
		return false;  
	}
	
}

function checkNumber(){

	var num = document.getElementById("userContactNo");
	var pattern=/^[0-9]{6,10}$/; 
	if(num.value.match(pattern))
	{
		localStorage.setItem("phone", num.value);
		return true;
	}
	else
	{
		num.select();
		alert('Please enter a 6 to 10 digit number');  
		num.focus();  
		return false;  
	}

}
function checkMessage(){
	var msg = document.getElementById("userMessage"); 
	if(msg.value.length>=1 && msg.value.length<=250)
	{
		localStorage.setItem("message", msg.value);
		return true;
	}
	else
	{
		msg.value=msg.value.substring(0,250);
		alert('Your message has been trimed to 250  characters ');   
		msg.focus();  
		return false;  
	}
}
function checkCity(){
	var x = document.getElementById("city"); 
	if(!x.value=="")
	{	
		localStorage.setItem("cityname", x.value);
		return true;
	}
	else
	{
		
		alert('Please select a city');  
		x.focus();  
		return false;  
	}
}

window.onload=function(){
	
		document.getElementById("userName").value = localStorage.getItem("name");
		document.getElementById("userEmail").value = localStorage.getItem("mail");
		document.getElementById("city").value = localStorage.getItem("cityname");
		document.getElementById("userMessage").value = localStorage.getItem("message");
		document.getElementById("userContactNo").value = localStorage.getItem("phone");
		document.getElementById("userOrgName").value = localStorage.getItem("orgname");
	
} 

function clearData(){
	localStorage.clear();
	
	
}

function validate(){
	if(checkName() && checkEmail() && checkCity() && checkOrganization() && checkNumber() && checkMessage() )
	{
		document.getElementById("userName").value = "";
		document.getElementById("userEmail").value = "";
		document.getElementById("city").value = "";
		document.getElementById("userMessage").value = "";
		document.getElementById("userContactNo").value = "";
		document.getElementById("userOrgName").value = "";
		document.getElementById("output").innerHTML="your form has been submitted";

	}
}
