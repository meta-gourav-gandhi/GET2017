package com.metacube.assignment2;

/**
 * @author gourav gandhi
 *
 */
public class Guest {
	 private String name;
	private int age;
	     
	    public Guest(String guest, int pr){
	        this.name = guest;
	        this.age = pr;
	    }
	    /**
	     * @return the hashcode for the age
	     */
	    @Override
	    public int hashCode(){
	    	
	        int hashcode = 0;
	        hashcode = (this.age*97)%RoomController.getRoomNum();
	    
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	    
	        if (obj instanceof Guest) {
	            Guest guestaArg = (Guest) obj;
	            return (guestaArg.name.equals(this.name) && guestaArg.age == this.age);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	     
	  
}
