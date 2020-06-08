import java.util.Scanner;

public class MatrixAddition{
	public static void main(String[] args) {
		
		int rowsDim, colsDim;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the dimensions of the matrices: - ");
		System.out.print("Rows:");
		rowsDim = scanner.nextInt();
		System.out.print("Columns:");
		colsDim = scanner.nextInt();

		int mat1[][]= new int[rowsDim][colsDim];
		int mat2[][]= new int[rowsDim][colsDim];
		int sum[][]= new int[rowsDim][colsDim];

		System.out.println("Enter the values of the matrix1: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=0; j<colsDim; j++)
				mat1[i][j] = scanner.nextInt();
		}

		System.out.println("Enter the values of the matrix2: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=0; j<colsDim; j++)
			{
				mat2[i][j] = scanner.nextInt();
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		System.out.println("The sum of the 2 matrices: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=0; j<colsDim; j++)
				System.out.print(sum[i][j] + "\t");
			System.out.println();
		}









	}
}