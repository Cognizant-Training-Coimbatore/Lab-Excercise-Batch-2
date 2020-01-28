import java.util.Scanner;

public class exercise27_Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		 try 
		 {     	
			 int a[]=new int[5];     
			 a[5]=m;
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
			  System.out.println(m/1); 
		 }
	}
}
