import java.util.Scanner;

public class program1_positiveinteger {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
	System.out.println("The number is "+n);
else
	throw new ArithmeticException("The input is invalid");


	}

}
