

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class TestMatrix {

	int mat_row = 3;
	int mat_col = 2;
	int mat1_row = 2;
	int mat1_col = 3;
	Matrix matrix, matrix1;

	@Before
	public void setUp() throws Exception {
		matrix = new Matrix(mat_row, mat_col);
		matrix1 = new Matrix(mat1_row, mat1_col);
	}

	@Test
	public void testAddElements() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		int mat1[] = { 2, 3, 8, 7, 6, 5 };

		// add elements in first matrix
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				Boolean b = matrix.addElements(mat[k++], i, j);
				assertTrue(b);
			}
		}

		k = 0;
		// add elements in second matrix
		for (int i = 0; i < mat1_row; i++) {
			for (int j = 0; j < mat1_col; j++) {
				Boolean b = matrix1.addElements(mat1[k++], i, j);
				assertTrue(b);
			}
		}
	}

	@Test
	public void testTranspose() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				matrix.addElements(mat[k++], i, j);
			}
		}
		int expected[][] = { { 2, 8, 6 }, { 3, 7, 5 } };
		// transpose of first matrix
		int trans[][] = matrix.transpose();
		assertArrayEquals(expected, trans);
	}

	@Test
	public void testShow() {
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		int matr[][] = { { 2, 3 }, { 8, 7 }, { 6, 5 } };
		int k = 0;
		for (int i = 0; i < mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				matrix.addElements(mat[k++], i, j);
			}
		}
		// Checking show is working or not
		assertArrayEquals(matr, matrix.show());
	}

	@Test
	public void testMultiply() {
		int matr[][] = { { 2, 3 }, { 8, 7 }, { 6, 5 } };
		int matr2[][] = { { 2, 3, 8 }, { 7, 6, 5 } };
		int exp[][] = { { 25, 24, 31 }, { 65, 66, 99 }, { 47, 48, 73 } };
		// Multiplying two matrix
		int store[][] = matrix.multiply(matr, matr2);
		assertArrayEquals(exp, store);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyException() {
		int matr[][] = { { 2, 3 }, { 8, 7 }, { 6, 5 } };
		int matr2[][] = { { 2, 3, 8 }, { 7, 6, 5 }, { 1, 2, 3 } };
		int exp[][] = { { 25, 24, 31 }, { 65, 66, 99 }, { 47, 48, 73 } };
		// Multiplying two matrix
		int store[][] = matrix.multiply(matr, matr2);
		assertArrayEquals(exp, store);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAddElementException() {
		int k = 0;
		int mat[] = { 2, 3, 8, 7, 6, 5 };
		for (int i = 0; i <= mat_row; i++) {
			for (int j = 0; j < mat_col; j++) {
				Boolean b = matrix.addElements(mat[k++], i, j);
				assertTrue(b);
			}
		}
	}
}