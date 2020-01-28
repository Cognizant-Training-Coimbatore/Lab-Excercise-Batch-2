import java.util.Scanner;

public class pgm18_divi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		  System.out.print("enter a number:");
		  num = s.nextInt();
		  if(num%7==0)
		  {
			  System.out.println("number is divisible by 7");
		  }
		  else
		  {
			  System.out.println("number is not divisible by 7"); 
		  }
	}

}
