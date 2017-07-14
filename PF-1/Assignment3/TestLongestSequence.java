

import org.junit.Assert;
import org.junit.Test;

public class TestLongestSequence {

	
	@Test
	public void test() {
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int expected[]={1,2,4,5,6,7,8,9};
		LongestSequence ls=new LongestSequence();
		int result[]=ls.longestSequence(input);
		Assert.assertArrayEquals(expected, result);
	}

}
