var mystack=new MyStack();
var entry;

function node(){
	entry=document.getElementById("content");
	this.data=entry.value;
	this.pre=null;
	
		
}

function MyStack(){
	
	this.pre=null;
	this.top=null;
	this.data=null;
	var temp;
	
	this.addData=function(){
	
		
		var entity=new node();
		if(entity.data!=""){
			if(this.top==null){
			this.top=entity;
			
			}
			else{
					entity.pre=this.top;
					this.top=entity;
			}
			
			document.getElementById("result").innerHTML= document.getElementById("content").value + " has been added to the list";
		}
		else
		{
			document.getElementById("result").innerHTML="Please enter any value."
		}
		
		entry.value="";
	entry.focus();
	
}
	this.printData=function(){
	
		if(this.top!=null){
			this.temp=this.top;
			var text="";
			while(this.temp.pre!=null){
				text += this.temp.data+ " <br> ";
				this.temp=this.temp.pre;
			}
			text+=this.temp.data;
			document.getElementById("result").innerHTML ="The elements are :- <br> " + text;

			}
			else{
				document.getElementById("result").innerHTML="there are no values in the stack";
			}
}
	
	
	this.removeData=function(){
		
		if(this.top.pre != null){
			document.getElementById("result").innerHTML=this.top.data + " has been deleted from the stack";
			this.top=this.top.pre;
			
			
		}
		else if(this.top.pre==null){
			document.getElementById("result").innerHTML=this.top.data + " has been deleted from the stack";
			this.top=null;
		}
		else{
			
			document.getElementById("result").innerHTML="Stack is empty";
			
		}
		
		
		
		document.getElementById("content").value="";
		document.getElementById("content").focus();
	}
	
	
	
	

	
};


function pushData(){
	mystack.addData();
}
function printStack(){
	
	mystack.printData();
}
function popData(){
	mystack.removeData();
}
