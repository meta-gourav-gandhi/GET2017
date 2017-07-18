

import org.junit.Assert;
import org.junit.Test;

public class TestDuplicate {

	//array with duplicate
	@Test
	public void testA() {
		Duplicate s=new Duplicate();
		int input[]={1,2,3,1,1,4};
		int expected[]={1,2,3,4};
		int a[]=s.removeDuplicate(input);
		Assert.assertArrayEquals(expected,a);
	}

	//array without duplicate
	@Test
	public void testB() {
		Duplicate s=new Duplicate();
		int input[]={1,2,3,4};
		int expected[]={1,2,3,4};
		int a[]=s.removeDuplicate(input);
		Assert.assertArrayEquals(expected,a);
	}
}
