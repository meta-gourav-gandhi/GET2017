/*
 * Junit for testing.
 */

import org.junit.Assert;
import org.junit.Test;


public class TestCombineArrays {

	//test with both decreasing array
	@Test
	public void testA() 
	{
		CombineArrays a6= new CombineArrays();
		int p[]={8,7,6,5};
		int q[]={4,3,2};
		int check[]= a6.join(p,p.length,q,q.length);
		int expected[]={2,3,4,5,6,7,8};
		Assert.assertArrayEquals(expected, check);
	}
	
	//test with both increasing array
		@Test
		public void testB() 
		{
			CombineArrays a6= new CombineArrays();
			int p[]={1,5,8,9};
			int q[]={2,3,6};
			int check[]= a6.join(p,p.length,q,q.length);
			int expected[]={1,2,3,5,6,8,9};
			Assert.assertArrayEquals(expected, check);
		}
		
		//test with both differently sorted array
		@Test
		public void testC() 
		{
			CombineArrays a6= new CombineArrays();
			int p[]={8,7,6,3};
			int q[]={4,12,16};
			int check[]= a6.join(p,p.length,q,q.length);
			int expected[]={3,4,6,7,8,12,16};
			Assert.assertArrayEquals(expected, check);
		}

}
