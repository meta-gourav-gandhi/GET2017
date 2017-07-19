import static org.junit.Assert.*;

import org.junit.Test;



	public class NQueensProblemTest {

	//this test will check NQueen for num = 4
	@Test
	public void test() {
		
	NQueensProblem Queen = new NQueensProblem();
	int board[][]=new int[4][4];
	Boolean bool = Queen.findQueenPlace(board, 0, 4);
	assertEquals(true,bool);
	}

	//this test will check NQueen for num = 3
	@Test
	public void test2() {
	NQueensProblem Queen = new NQueensProblem();
	int board[][]=new int[3][3];
	Boolean bool = Queen.findQueenPlace(board, 0, 3);
	assertEquals(false,bool);
	}
}


