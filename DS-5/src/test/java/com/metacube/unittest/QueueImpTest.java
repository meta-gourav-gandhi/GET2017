/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;
import main.java.com.metacube.queuecollection.QueueImp;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class QueueImpTest {

	static QueueImp<Integer> queuetest ;
	@BeforeClass
	public static void initialize(){
		queuetest =new  QueueImp<Integer>();
		queuetest.enqueue(1);
		queuetest.enqueue(2);
		queuetest.enqueue(3);
		queuetest.enqueue(4);
		
	}
	@Test
	public void testEnqueue() {
		boolean actual=queuetest.enqueue(5);
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDequeue(){
		Integer actual=queuetest.dequeue();
		Integer expected=1;
		assertEquals(expected, actual);
	}
	@Test
	public void testDequeueA(){
		Integer actual=queuetest.dequeue();
		Integer expected=2;
		assertEquals(expected, actual);
	}

}
