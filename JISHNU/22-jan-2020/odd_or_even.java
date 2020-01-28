package demo;
import java.util.Scanner;
public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		if(a==0)
		{
		System.out.println("Zero is neither odd nor even");
		}
		else
			{
			if(a%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("odd Number");
			}
			}
			
		
	}

}
