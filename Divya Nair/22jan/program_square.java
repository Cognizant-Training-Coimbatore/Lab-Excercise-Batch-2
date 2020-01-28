import java.util.Scanner;

public class program_square {

	public static void main(String[] args) 
	{
	int n;
	double c;
	System.out.println("Enter a number");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	c=Math.pow(n,2);
	System.out.println("The square is:" +c);
	
	
	}

}
