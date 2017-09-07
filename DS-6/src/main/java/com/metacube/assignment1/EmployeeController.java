/**
 * 
 */
package main.java.com.metacube.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 * @author gourav gandhi
 *
 */
public class EmployeeController {

	static Set<Employee> empList = Employee.getEmployeeList();
	/**
	 * @param name name of the employee
	 * @param id id of the employee
	 * @param address address of the employee
	 * @return true/false
	 */
	public static boolean createEmployee(String name, int id, String address) {
		
		
			Employee currEmployee = new Employee(name, id, address);
			
			if(empList.add(currEmployee)){
				return true;
			}
			
	
			
		return false;
	}


	/**
	 * sort the employees on the basis of the id or natural employee
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Employee> sortEmployee() {
		ArrayList<Employee> emplist = new ArrayList<Employee>(empList);
		Collections.sort(emplist);
		return emplist;
	}

	/**
	 * function to sort according to the name
	 * @return the list of the employee
	 */
	public static ArrayList<Employee> sortEmployeeByName() {
		ArrayList<Employee> emplistName = new ArrayList<Employee>(empList);
		Collections.sort(emplistName,  Employee.nameComparator);
		
		return  emplistName;
	}
	
	
	
}
