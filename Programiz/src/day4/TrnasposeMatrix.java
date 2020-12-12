package day4;

public class TrnasposeMatrix {
	
	public static void main(String[] args) {
		int rows=2,column=2;
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{5,3},{8,9}};
		
		int[][] transpose=new int[rows][column];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				
				transpose[j][i]=a[i][j];
			}
		}
		
		for (int[] row:transpose) {
			for (int column1:row) {
				System.out.print(column1+" ");
			}
			System.out.println();
		}
		
	}

}
