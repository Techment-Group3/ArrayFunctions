import java.util.Scanner;

public class ArrayDuplicateRemoval{
	public static void main(String[] args) {
		
		int size, countDuplicates=0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array:");
		size = scanner.nextInt();
		int array[] = new int[size];
		int arrayDistinct[] = new int[size];


		System.out.print("Enter the values of the array:");
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();

		//Sorting the array
		for(int i=0; i<size; i++)
		{
			for (int j=0; j<size-i-1; j++) {
				if(array[j]>array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		int j = 0;

		for( int i = 0; i<size-1; i++)
		{
			if(array[i]!=array[i+1])
				arrayDistinct[j++]= array[i];
			else
				countDuplicates++;
		}
		arrayDistinct[j++] = array[size-1];

		System.out.println("After removing " +countDuplicates+ "duplicates");			
		for(int i=0; i<size; i++){
			if(arrayDistinct[i]==0)
				break;
			System.out.println(arrayDistinct[i]);
		}



	}
}