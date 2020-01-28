import java.util.Scanner;

public class pgm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     
    	 while(n<0)
    		 throw new ArithmeticException("Invalid number");
     
	}

}
