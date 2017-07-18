

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortCheck {

	//for increasing order
	@Test
	public void test() 
	{
		SortCheck sc=new SortCheck();
		int n[]={1,2,3,4};
		int result= sc.check(n);
		assertEquals(1, result);
	}
	
	//for decreasing order
	@Test
	public void test1() 
	{
		SortCheck sc=new SortCheck();
		int n[]={4,3,2,1};
		int result= sc.check(n);
		assertEquals(2, result);
	}
	
	
	//for unsorted array
	@Test
	public void test2() 
	{
		SortCheck sc=new SortCheck();
		int n[]={5,2,6,4};
		int result= sc.check(n);
		assertEquals(0, result);
	}

}
