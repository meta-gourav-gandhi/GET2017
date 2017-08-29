/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import main.java.com.metacube.assignment1.Employee;
import main.java.com.metacube.assignment1.EmployeeController;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class EmployeeControllerTest {

	
	@Test
	public void testCreateEmployee() {
		boolean actual= EmployeeController.createEmployee("gourav", 1, "jaipur");
		boolean expected=true;
		assertEquals(expected, actual);
		Employee.getEmployeeList().clear();
	}
	
	@Test
	public void testCreateEmployeeDuplicateId() {
		EmployeeController.createEmployee("gourav", 1, "jaipur");
		boolean actual= EmployeeController.createEmployee("gourav", 1, "jaipur");
		boolean expected=false;
		assertEquals(expected, actual);
		Employee.getEmployeeList().clear();
	}

	
	@Test
	public void testSortEmployee() {
		EmployeeController.createEmployee("gourav", 2, "jaipur");
		EmployeeController.createEmployee("manan", 3, "kota");
		EmployeeController.createEmployee("raj", 1, "metacube");
		
		ArrayList<Employee> actual = EmployeeController.sortEmployee();
		String expected="[[ name= raj, id = 1, address = metacube], [ name= gourav, id = 2, address = jaipur], [ name= manan, id = 3, address = kota]]";
		assertEquals(expected, actual.toString());
		Employee.getEmployeeList().clear();
	}

	
	@Test
	public void testSortEmployeeByName() {
		EmployeeController.createEmployee("gourav", 2, "jaipur");
		EmployeeController.createEmployee("manan", 3, "kota");
		EmployeeController.createEmployee("raj", 1, "metacube");
		ArrayList<Employee> actual = EmployeeController.sortEmployeeByName();
		String expected="[[ name= gourav, id = 2, address = jaipur], [ name= manan, id = 3, address = kota], [ name= raj, id = 1, address = metacube]]";
		assertEquals(expected, actual.toString());
		Employee.getEmployeeList().clear();
	}

}
