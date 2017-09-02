/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.assignment1.DesignationFactory;
import main.java.com.metacube.assignment1.HeapSort;
import main.java.com.metacube.assignment1.Jobs;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class JobsTest {

	
	@Test
	public void testJobprinter(){
		Jobs jobQueue[] = new Jobs[3];
			
			Jobs job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(2));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from2");
			jobQueue[0] = job;
			
			job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(1));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from1");
			jobQueue[1] = job;
			
			job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(4));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from4");
			jobQueue[2] = job;
			
			HeapSort heap =new HeapSort();
			heap.sort(jobQueue);
			String actual="";
			for (int index = 0; index < jobQueue.length; index++) {
				actual += jobQueue[index].getMessage().toString();
			}
			String expected="from1from2from4";
			
			assertEquals(expected,actual);
			
			
		
		
	}
	
	@Test
	public void testJobprinterA(){
		Jobs jobQueue[] = new Jobs[3];
			
			Jobs job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(4));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from4");
			jobQueue[0] = job;
			
			job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(2));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from2");
			jobQueue[1] = job;
			
			job=new Jobs();
			job.setDesignation(DesignationFactory.getDesignation(1));
			job.setPriority(DesignationFactory.getPriority(job.getDesignation().charAt(0)));
			job.setMessage("from1");
			jobQueue[2] = job;
			
			HeapSort heap =new HeapSort();
			heap.sort(jobQueue);
			String actual="";
			for (int index = 0; index < jobQueue.length; index++) {
				actual += jobQueue[index].getMessage().toString();
			}
			String expected="from1from2from4";
			
			assertEquals(expected,actual);
			
			
		
		
	}
	
}
