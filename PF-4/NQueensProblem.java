


/**
 * @author gourav gandhi
 * program to solve NqueenProblem
 *
 */
public class NQueensProblem {
	/**
    	 * @param chessBoard board on which n queens are to be placed	
    	 * @param rowNumber	row number of position where queen is to be placed	
    	 * @param columnNumber row number of position where queen is to be placed
    	 * @param dimensionOfBoard Dimension of board
    	 * @return true if queen can be placed on the position derived from rowNumber and
    	 * columnNumber over chessBoard
    	 */
	boolean safeQueenPlace(int chessboard[][], int rowNumber, int columnNumber,
			int dimensionofboard) {
		int i, j;
		// check particular board row on left side
		for (i = 0; i < columnNumber; i++) {
			if (chessboard[rowNumber][i] == 1)
				return false;
		}
		// Check upper diagonal on left side
		for (i = rowNumber, j = columnNumber; i >= 0 && j >= 0; i--, j--) {
			if (chessboard[i][j] == 1)
				return false;
		}
		// Check lower diagonal on left side
		for (i = rowNumber, j = columnNumber; j >= 0 && i < dimensionofboard; i++, j--) {
			if (chessboard[i][j] == 1)
				return false;
		}
		return true;
	}

	/**
	 * @param chessboard on which n queens can be placed
	 * @param columnNumber is the column on which queen needs to be placed
	 * @param dimensionofboard Dimension of the board
	 * @return true if all the queen can be placed on the board
	 */
	boolean findQueenPlace(int chessboard[][], int columnNumber,
			int dimensionofboard) {
		if (columnNumber >= dimensionofboard) {
			return true;
		}
		for (int rowNumber = 0; rowNumber < dimensionofboard; rowNumber++) {
			if (safeQueenPlace(chessboard, rowNumber, columnNumber,
					dimensionofboard)) {
				chessboard[rowNumber][columnNumber] = 1;

				if (findQueenPlace(chessboard, columnNumber + 1,
						dimensionofboard)) {
					return true;
				}
				//for backtracking
				chessboard[rowNumber][columnNumber] = 0; 
			}

		}
		return false;
	}

}
