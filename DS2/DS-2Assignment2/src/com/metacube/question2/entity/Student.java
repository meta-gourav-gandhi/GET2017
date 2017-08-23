/**
 * 
 */
package com.metacube.question2.entity;

import java.util.List;

/**
 * @author gourav gandhi
 *
 */
public class Student {
	String rank,name,collegeName;
	/**
	 * @return the collegeRank
	 */
	public String getCollegeName() {
		return collegeName;
	}
	/**
	 * @param collegeRank the collegeRank to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	List<Integer> options;
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return 
	 * @return the options
	 */
	public  List<Integer> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(List<Integer> choices) {
		
		this.options=choices;	

	}
}
	
	

