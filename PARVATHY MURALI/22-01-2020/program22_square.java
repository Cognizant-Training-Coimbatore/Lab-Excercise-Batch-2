import java.util.Scanner;

public class program22_square 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		java.util.Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Square of "+num+"is "+(Math.pow(num,2)));

	}

}
