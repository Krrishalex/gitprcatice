package day4;

public class AddMatrix {

	public static void main(String[] args) {
		
		int rows=2,column=2;
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{5,3},{8,9}};
		
		int[][] sum=new int[rows][column];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for (int[] row:sum) {
			for (int column1:row) {
				System.out.print(column1+" ");
			}
			System.out.println();
		}
		
		
	}
}
