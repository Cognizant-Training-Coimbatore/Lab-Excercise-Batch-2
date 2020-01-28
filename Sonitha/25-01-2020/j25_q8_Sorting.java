import java.util.Scanner;

public class j25_q8_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int arr[] = new int[5];
     System.out.println("Enter the 5 elements in the array");
     for(int i=0;i<5;i++) {
    	 arr[i] = sc.nextInt();
     }
     System.out.println("The elements in the ascending order is : ");
     for(int i=0;i<5;i++) 
     {
    	 for(int j=i+1;j<5;j++) 
    	 {
    		 if(arr[i] > arr[j]) 
    		 {
    			int  t= arr[i];
    			 arr[i]= arr[j];
    			 arr[j] = t;
    		 }
    	 }
     }
     for(int i=0;i<5;i++) {
    	 System.out.println(arr[i]+" ");
     }
     
     System.out.println("The elements in the descending order is : ");
     for(int i=0;i<5;i++) 
     {
    	 for(int j=i+1;j<5;j++) 
    	 {
    		 if(arr[i] < arr[j]) 
    		 {
    			int  t= arr[i];
    			 arr[i]= arr[j];
    			 arr[j] = t;
    		 }
    	 }
     }
     for(int i=0;i<5;i++) {
    	 System.out.println(arr[i]+" ");
     }
    
	}

}
