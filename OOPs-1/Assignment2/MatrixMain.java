import java.util.Scanner;


public class MatrixMain {

	public static void main(String s[]){
		Matrix object=new Matrix(3,3);
		Scanner sc=new Scanner(System.in);
		int row=object.matrix.length;
		int col=object.matrix[0].length;
		for(int rowNum=0;rowNum<row;rowNum++){
			for(int colNum=0;colNum<col;colNum++){
				object.addElements(sc.nextInt(), rowNum, colNum);
			}
		}
		
		int result[][]=object.show();
		for(int rowNum=0;rowNum<row;rowNum++){
			for(int colNum=0;colNum<col;colNum++){
				System.out.print(object.matrix[rowNum][colNum] + " ");
			}
			System.out.println();
		}
		
		result=object.transpose();		
		for(int rowNum=0;rowNum<row;rowNum++){
			for(int colNum=0;colNum<col;colNum++){
				System.out.print(result[rowNum][colNum] + " ");
			}
			System.out.println();
		}
		
		result=object.multiply(object.matrix,result);
		for(int rowNum=0;rowNum<row;rowNum++){
			for(int colNum=0;colNum<col;colNum++){
				System.out.print(result[rowNum][colNum] + " ");
			}
			System.out.println();
		}
		
	}
	
}
