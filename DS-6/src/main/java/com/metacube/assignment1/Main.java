/**
 * 
 */
package main.java.com.metacube.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gourav gandhi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Employee> emplist;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		do {

			System.out.println();
			System.out.println("1) Add Employee");
			System.out.println("2) Print in natural sorted order");
			System.out.println("3) Print in sorted form of name");

			System.out.println("Enter your choice");
			int input = 0;
			try {
				input = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("Enter numbers only");
			}
			switch (input) {
			case 1:
				System.out.println("Enter id");
				int id = 0;
				try {
					id = Integer.parseInt(scan.nextLine());

					System.out.println("Enter Name");
					String name = scan.nextLine();
					System.out.println("Enter Address");
					String address = scan.nextLine();

					if (EmployeeController.createEmployee(name, id, address)) {
						System.out.println("\nEmployee added");
					} else {
						System.out.println("\nEmployee with this id already present");
					}
				} catch (Exception e) {
					System.out.println("Enter number only");
				}

				break;
			case 2:
				emplist = EmployeeController.sortEmployee();
				for (Employee emp : emplist) {
					System.out.println(emp.getId() + "\t " + emp.getName()
							+ "\t " + emp.getAddress());
				}
				break;
			case 3:
				emplist = EmployeeController.sortEmployeeByName();
				for (Employee emp : emplist) {
					System.out.println(emp.getId() + "\t " + emp.getName()
							+ "\t " + emp.getAddress());
				}
				break;

			}

		} while (true);

	}

}
