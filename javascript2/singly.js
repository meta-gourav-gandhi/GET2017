var linkedList=new SinglyLinkedList();
var entry;

function node(){
	entry=document.getElementById("content");
	this.data=entry.value;
	this.next=null;
	
		
}

function SinglyLinkedList(){
	
	this.next=null;
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
			}
			
			document.getElementById("result").innerHTML= document.getElementById("content").value + " has been added to the list";
			 
		}
		else
		{
			document.getElementById("result").innerHTML="Please enter any value."
		}
	entry.value="";
	entry.focus();
	deleteTab();
}


	this.printData=function(){
		var counter=1;
		var table=document.getElementById("myTable");
				table.style.display="inline-block";
		if(this.start!=null){
			this.temp=this.start;
			var text="";
			document.getElementById("result").innerHTML ="The elements are :- <br> ";
			
			while(this.temp.next!=null){
				
				var row = table.insertRow();
				var cell1 = row.insertCell(0);
				var cell2 = row.insertCell(1);
				cell1.innerHTML = counter++;
				cell2.innerHTML = this.temp.data;
				this.temp=this.temp.next;
			}
				
				var row = table.insertRow();
				var cell1 = row.insertCell(0);
				var cell2 = row.insertCell(1);
				cell1.innerHTML = counter++;
				cell2.innerHTML = this.temp.data;
		
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
			var pre=this.temp;
			this.temp=this.temp.next;
			
			while(this.temp.next != null){
				
				if(this.temp.data == entry){
						pre.next=this.temp.next;
						flag=true;
						break;
				}
				else{
					pre=this.temp;
					this.temp=this.temp.next;
				}
			}
			if(this.temp.data==entry && this.temp.next==null){
				pre.next=null;
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
		deleteTab();
	}
	
	
	
	
	this.searchData=function(){
		
		
		entry=document.getElementById("content").value;
	
	if(entry!=""){
		var counter=1;
		this.temp=this.start;
		var flag=false;
			while(this.temp.next != null){
				
				if(this.temp.data == entry){
						flag=true;
						break;
				}
				else{
					counter++;
					this.temp=this.temp.next;
				}
			}
			
			if(this.temp.data==entry){
				flag=true;
			}
			
			
		
		
		if(flag){
			document.getElementById("result").innerHTML=entry + " has been found in the list at " + counter + " position"; 
		}
		else{
			document.getElementById("result").innerHTML=entry + " is not present in the list";
		}
		
		document.getElementById("content").value="";
		document.getElementById("content").focus();
	}else{
		document.getElementById("result").innerHTML="Enter some value to search."
	}
	
	deleteTab();
	
}
		
	function deleteTab(){
		
		var table = document.getElementById("myTable");
    table.innerHTML="";
		table.style.display="none";
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
function searchThisData(){
	linkedList.searchData();
}
