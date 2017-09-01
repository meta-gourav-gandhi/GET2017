package com.metacube.services;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.metacube.main.MyStack;

@Path("/services")
public class InfixToPostfix {

	/**
	 * method to convert infix to postfix
	 * @param input string from the url 
	 * @return the post fix of the expression
	 */
	@GET
	@Path("/convert/{input}")
	@Produces(MediaType.TEXT_PLAIN)
	public String convertInfixToPostFix(@PathParam("input") String input){
		
		MyStack<Character> mystack =new MyStack<Character>();
		String output="";
		for (int index = 0; index < input.length(); index++) {
				char element=input.charAt(index);
				
				if(Character.isLetterOrDigit(element)){
					output += element;
				}
				else if(element=='('){
					mystack.myPush(element);
				}
				else if(element==')'){
					
					while( !mystack.isEmpty() && mystack.onTop()!='('  ){
						output += mystack.myPop();
					}
					
					if(mystack.onTop()=='('){
						mystack.myPop();
					}
					
				}
				else{				
					while(!mystack.isEmpty() && Precedence(element)<=Precedence(mystack.onTop())){
						output+= mystack.myPop();
					}
					
					mystack.myPush(element);
					
				}
			
		}
		
		while(!mystack.isEmpty() && mystack.onTop()!='('){
			output += mystack.myPop();
		}
		
		if(mystack.isEmpty()){
			return output;
		}else{
			return "Invalid expresion";
		}
	}
	
	 static int Precedence(Character ch)
	    {
	        switch (ch)
	        {
	        case '+':
	        case '-':
	            return 1;
	      
	        case '*':
	        case '/':
	            return 2;
	      
	        case '^':
	            return 3;
	        }
	        return -1;
	    }
	
}
