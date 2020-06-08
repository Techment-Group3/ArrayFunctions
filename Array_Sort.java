import java.util.Scanner;

class Array_Sort {
   public static void main(String[] args) {
        int n,temp;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        n = in.nextInt();
     
        
        int a[] = new int[n];
       
        
        System.out.print("Enter elements of array : ");
        
        for(int i = 0; i < n; i++){
           
                a[i] = in.nextInt();
            }
        
            
        //Sort the array in ascending order    
        for (int i = 0; i <n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i <n; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}