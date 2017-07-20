package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {

		QuickSort qs = new QuickSort();
		int input[] = { 2, 5, 8, 9, 10, 77, 55, 11 };
		int expected[] = { 2, 5, 8, 9, 10, 11, 55, 77 };
		int actual[] = qs.sort(input, 0, input.length - 1);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testB() {

		QuickSort qs = new QuickSort();
		int input[] = {};
		int expected[] = {};
		int actual[] = qs.sort(input, 0, input.length - 1);
		assertArrayEquals(expected, actual);

	}

}
