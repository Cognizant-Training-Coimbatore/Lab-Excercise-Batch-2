import java.util.Scanner;

public class pro_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scn = new Scanner(System.in);
	         System.out.print("Enter number of element count: ");
	        int inputValue = scn.nextInt(), temp;   
	        System.out.print("Enter array values\n");
	        int[] arr = new int[inputValue];    
	        for(int i =0; i<inputValue;i++){             
	            arr[i]=scn.nextInt();
	        }
	        for(int m=0;m<arr.length;m++){
	            for(int n=m+1;n<arr.length;n++){
	                if(arr[m]>arr[n]){
	                    temp = arr[m];
	                    arr[m]=arr[n];
	                    arr[n]=temp;
	                }}}
	        System.out.print("Ascending order for the numbers are: \n");
	        for(int t: arr){
	            System.out.println(t);
	        } 
	for(int m=0;m<arr.length;m++){
	    for(int n=m+1;n<arr.length;n++){
	        if(arr[m]<arr[n]){
	            temp = arr[m];
	            arr[m]=arr[n];
	            arr[n]=temp;
	        }}}
	System.out.print("Descending order for the numbers  are: \n");
	for(int t: arr){
	    System.out.println(t);
	}
	    }
	 }
