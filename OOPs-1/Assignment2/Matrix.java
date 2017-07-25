public class Matrix {

	int[][] matrix;

	/**
	 * @param rows number of rows in the matrix
	 * @param cols number of column in the matrix
	 * @throws NegativeArraySizeException if rows and column is less than zero
	 */
	public Matrix(int rows, int cols) throws NegativeArraySizeException {
		if (rows <= 0 || cols <= 0) {
			throw new NegativeArraySizeException();
		}
		matrix = new int[rows][cols];
	}

	
	/**
	 * @param value to be entered in the matrix
	 * @param row on which value to be entered
	 * @param col on which value to be entered
	 * @return true if the element is successfully entered
	 * @throws ArrayIndexOutOfBoundsException 
	 */
	public boolean addElements(int value, int row, int col)
			throws ArrayIndexOutOfBoundsException {
		boolean flag = false;
		if (!(row < matrix.length || col < matrix[0].length)) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			matrix[row][col] = value;
			flag = true;

		}
		return flag;
	}

	// This function will return the matrix
	public int[][] show() {
		return matrix;
	}

	// This function will return the value of matrix at given position
	public int show(int row, int col) {
		return matrix[row][col];
	}

	
	/**
	 * @return tranpose of a given matrix
	 */
	public int[][] transpose() {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] transposeMatrix = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				transposeMatrix[i][j] = matrix[j][i];
			}
		}
		return transposeMatrix;
	}

	/**
	 * @param matrix1 first matrix
	 * @param matrix2 second matrix
	 * @return the product of two matrix
	 * @throws IllegalArgumentException if the column of first matrix is not
	 * equals to the row of second matrix
	 */
	public int[][] multiply(int[][] matrix1, int[][] matrix2)
			throws IllegalArgumentException {
		int matrix1_row = matrix1.length;
		int matrix1_col = matrix1[0].length;
		int matrix2_row = matrix2.length;
		int matrix2_col = matrix2[0].length;
		int sum = 0;
		int[][] multiply_matrix = new int[matrix1_row][matrix2_col];
		if (matrix1_col != matrix2_row) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < matrix1_row; i++) {
				for (int j = 0; j < matrix2_col; j++) {
					for (int k = 0; k < matrix1_col; k++) {
						sum = sum + matrix1[i][k] * matrix2[k][j];
					}
					multiply_matrix[i][j] = sum;
					sum = 0;
				}
			}
		}
		return multiply_matrix;
	}
}
