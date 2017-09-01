/**
 * 
 */
package com.metacube.question2.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.metacube.question2.entity.Student;
import com.metacube.question2.structure.MyQueue;



/**
 * @author gourav gandhi
 *
 */
public class StudentDao {


	static Map<String,Student> studentMap = new HashMap<String, Student>();
	static MyQueue studentQueue =new MyQueue();
	/**
	 * @param allStudent
	 */
	public static void setStudent(String allStudent) {
		
		
		Student StudentObj;
		String input[] = null;
		String content[]=null;
		try {
			content= allStudent.split("\n");	
			/**
			 * Splitting the content and saving them 
			 * to different field of the objects.
			 * 
			 */
			for(int count=0;count<content.length;count++){
				input=content[count].split(",");
				StudentObj = new Student();	
				StudentObj.setRank(input[0]);
				StudentObj.setName(input[1]);
				studentMap.put(input[0], StudentObj);
			}
		
			studentMap = new TreeMap<String,Student>(studentMap);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	/**
	 * @return the studentMap
	 */
	public static Map<String, Student> getStudentMap() {
		return studentMap;
	}
	
	/**
	 * @param studentMap the studentMap to set
	 */
	public static void setStudentMap(HashMap<String, Student> studentMap) {
		StudentDao.studentMap = studentMap;
	}
	
	public static MyQueue getStudentQueue(){
		return studentQueue;
	}
	/**
	 * 
	 */
	public static void setIntoQueue() {
		
		for(String student : studentMap.keySet()){
			
			studentQueue.enque(studentMap.get(student));
		}
		
	}

}
