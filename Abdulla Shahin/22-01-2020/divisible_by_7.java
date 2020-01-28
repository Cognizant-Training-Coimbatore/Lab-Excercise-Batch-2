import java.util.Scanner;

public class divisible_by_7 {

	public static void main(String[] args)
	{
		System.out.println("enter ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%7==0)
		{
			System.out.println("divisible by 7");
		}

		else
		{
			System.out.println("not divisible by 7");
		}
	}

}
