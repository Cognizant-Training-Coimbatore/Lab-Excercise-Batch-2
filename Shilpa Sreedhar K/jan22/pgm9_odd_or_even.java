import java.util.Scanner;

public class pgm9_odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter a number : ");
		  r = s.nextInt();
		  if(r % 2 ==0)
		  {
			  System.out.print("Even number");  
		  }
		  else
		  {
		  System.out.print("Odd number ");
		  }
	}

}
