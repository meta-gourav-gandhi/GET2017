import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TowerOfHanoiTest {

	@Test
	public void testWithOne() {
	
		TowerOfHanoi toh=new TowerOfHanoi();
		
		ArrayList<String> actual=toh.towerOfHanoi("A", "B", "C", 1);
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("Move disk 1 from A to B");
		assertEquals(expected,actual);
		
		
	}
	
	@Test
	public void testWithTwo() {
	
		TowerOfHanoi toh=new TowerOfHanoi();
		
		ArrayList<String> actual=toh.towerOfHanoi("A", "B", "C", 2);
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("Move disk 1 from A to C");
		expected.add("Move disk 2 from A to B");
		expected.add("Move disk 1 from C to B");
		assertEquals(expected,actual);
		
		
	}

	@Test
	public void testWithThree() {
	
		TowerOfHanoi toh=new TowerOfHanoi();
		
		ArrayList<String> actual=toh.towerOfHanoi("A", "B", "C", 3);
		ArrayList<String> expected=new ArrayList<String>();
		expected.add("Move disk 1 from A to B");
		expected.add("Move disk 2 from A to C");
		expected.add("Move disk 1 from B to C");
		expected.add("Move disk 3 from A to B");
		expected.add("Move disk 1 from C to A");
		expected.add("Move disk 2 from C to B");
		expected.add("Move disk 1 from A to B");
		
		assertEquals(expected,actual);
		
		
	}

}
