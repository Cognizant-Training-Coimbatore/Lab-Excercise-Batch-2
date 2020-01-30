import java.util.Scanner;

public class Program_97 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		 try 
		 {     	
			 int a[]=new int[5];     
			 a[5]=n;
			 System.out.println(a[6]/0);   
		 }     
		 catch(ArithmeticException e)   
		 {   
			 System.out.println("Arithmetic Exception occurs");    
		 }     
		 catch(ArrayIndexOutOfBoundsException e)   
		 {   
			 System.out.println("ArrayIndexOutOfBounds Exception occurs");
		 }     
		 finally 
		 {             
			  System.out.println(n/1); 
		 }
	}
}
