/**
 * 
 */
package main.java.com.metacube.assignment1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author gourav gandhi
 *
 */
@SuppressWarnings("rawtypes")
public class Employee implements Comparable {

	String name;
	int id;
	String address;
	static Set<Employee> employeeList = new HashSet<Employee>();
	

	public Employee(String name,int id,String address){
		this.name=name;
		this.id=id;
		this.address=address;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Object empObj) {
		int result;
		
		if(this.id>((Employee)empObj).id){
			result=1;
		}else if(this.id<((Employee)empObj).id){
			result=-1;
		}else{
			result=0;
		}
		
		return result;
	}
	
	
	@Override
	public int hashCode() {
	
		return this.id;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	/**
	 * @return the employeeList
	 */
	public static Set<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * sort according to their name
	 *
	 */
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee arg0, Employee arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
		
	};
	
	@Override
	public String toString() {
		return "[ name= " + name + ", id = " + id + ", address = " + address
				+ "]";
	}
	
}
