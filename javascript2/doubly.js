var linkedList=new DoublyLinkedList();
var entry;

function node(){
	entry=document.getElementById("content");
	this.data=entry.value;
	this.next=null;
	this.previous=null;
	
		
}

function DoublyLinkedList(){
	
	this.next=null;
	this.previous=null;
	this.start=null;
	this.data=null;
	var temp;
	
	this.addData=function(){
	
		
		var entity=new node();
		if(entity.data!=""){
			if(this.start==null){
			this.start=entity;
			
			}
			else{
					this.temp=this.start;
					while(this.temp.next!= null){
						this.temp=this.temp.next;
					}
				this.temp.next=entity;
				entity.previous=this.temp;
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
		var counter=1;
	if(this.start!=null){
			this.temp=this.start;
			var text="";
			while(this.temp.next!=null){
				text += counter++ + "<span> -->  </span> " + this.temp.data+ " <br> ";
				this.temp=this.temp.next;
			}
			text+= counter++ + "<span> -->  </span> " + this.temp.data;
			document.getElementById("result").innerHTML ="The elements are :- <br> " + text;

			}
			else{
				document.getElementById("result").innerHTML="there are no values in list."
			}
}
	
	
	
	this.removeData=function(){
		
		entry=document.getElementById("content").value;
		
		this.temp=this.start;
		var flag=false;
		if(this.temp.data==entry){
			this.start=this.start.next;
			flag=true;
		}
		else{
			this.temp=this.temp.next;
			
			while(this.temp.next != null){
				
				if(this.temp.data == entry){
						
						this.temp.previous.next=this.temp.next;
						
						this.temp.next.previous=this.temp.previous;
						
						flag=true;
						break;
				}
				else{
					this.temp=this.temp.next;
				}
			}
			if(this.temp.data==entry && this.temp.next==null){
				this.temp.next=null;
				flag=true;
			}
			
			
		}
		
		if(flag){
			document.getElementById("result").innerHTML=entry + " has been deleted from the list"; 
		}
		else{
			document.getElementById("result").innerHTML="data is not present in the list";
		}
		
		document.getElementById("content").value="";
		document.getElementById("content").focus();
		
		
		
	}
		
	
};


function addToList(){
	linkedList.addData();
}
function printAllData(){
	
	linkedList.printData();
}
function deleteData(){
	linkedList.removeData();
}