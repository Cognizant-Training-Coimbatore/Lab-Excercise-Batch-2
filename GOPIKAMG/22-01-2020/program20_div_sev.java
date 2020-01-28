import java.util.Scanner;

public class program20_div_sev {

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0) 
		{
			System.out.println(n+ "is divisible by 7");
		}
		else
		{
			System.out.println(n+ "is not divisible by 7");
		}
		

	}

}
