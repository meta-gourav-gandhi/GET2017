
function callHome(){

 document.getElementById("home").href="home.html";
	
}
function callContact(){

  document.getElementById("contactUs").href="contact.html";
	
}

function checkName(){
	var name= document.getElementById("userName");
	 
	var letters = /^[A-Za-z ]+$/;  
	if(name.value.match(letters) && (name.value.length>1 && name.value.length<=20) )  
	{  
		
		return true;  
	}  
	else  
	{  
		name.value="";
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
		return true;
	}
	else
	{
		mail.value="";
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
		return true;
	}
	else
	{
		com.value="";
		alert('Please enter characters only');  
		com.focus();  
		return false;  
	}
	
}

function checkNumber(){

	var num = document.getElementById("userContactNo");
	var pattern=/^[0-9]{10}$/; 
	if(num.value.match(pattern))
	{
		return true;
	}
	else
	{
		num.value="";
		alert('Please enter a 10 digit number');  
		num.focus();  
		return false;  
	}

}
function checkMessage(){
	var msg = document.getElementById("userMessage"); 
	if(msg.value.length>=1 && msg.value.length<=250)
	{
		return true;
	}
	else
	{
		msg.value="";
		alert('Please enter charactrs upto 250 only');  
		msg.focus();  
		return false;  
	}
}
function checkCity(){
	var x = document.getElementById("city"); 
	if(!x.value=="")
	{	
		document.getElementById("set").style.display='block';
		document.getElementById("set").value ="selected city is " + x.value;
		return true;
	}
	else
	{
		
		alert('Please select a city');  
		x.focus();  
		return false;  
	}
}

 function checkform(){
        var f = document.forms["theform"].elements;
        var cansubmit = true;
		document.getElementById("submitbutton").disabled = true;
        for (var i = 0; i < f.length; i++) {
            if (f[i].value.length == 0) cansubmit = false;
        }

        if (cansubmit) {
            document.getElementById('submitbutton').disabled = false;
        }

}
