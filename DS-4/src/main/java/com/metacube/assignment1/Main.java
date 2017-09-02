package com.metacube.assignment1;

import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		showDesignation();
		System.out.println("Enter number of jobs to be done");
		int numJobs = Integer.parseInt(scan.nextLine());
		Jobs jobQueue[] = new Jobs[numJobs];
		for (int index = 0; index < numJobs; index++) {
			Jobs job = new Jobs();
			System.out.println("Enter Designation");

			int input = Integer.parseInt(scan.nextLine());
			while (!(input >= 1 && input <= 4)) {
				System.out.println("Invalid input . Enter Designation");
				input = Integer.parseInt(scan.nextLine());
			}
			String designation = DesignationFactory.getDesignation(input);

			System.out.println("Enter message");
			String message = scan.nextLine();
			job.setDesignation(designation);
			job.setMessage(message);
			job.setPriority(DesignationFactory.getPriority(designation.charAt(0)));
			jobQueue[index] = job;
		}

		HeapSort heap = new HeapSort();
		heap.sort(jobQueue);

		for (int index = 0; index < numJobs; index++) {
			System.out.println("\nDesignation : "
					+ jobQueue[index].getDesignation() + "\t\tMessage : "
					+ jobQueue[index].getMessage());
		}
		scan.close();
	}

	/**
	 * 
	 */
	private static void showDesignation() {

		System.out.println("1) Chair Person ");
		System.out.println("2) Professors");
		System.out.println("3) Graduate students");
		System.out.println("4) Undergraduates students");

	}


}
