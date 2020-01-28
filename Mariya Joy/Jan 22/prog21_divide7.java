import java.util.Scanner;

public class prog21_divide7 {

	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		if(a%7==0)
		{
			System.out.println(a+" is divisible by 7");
		}
		else
			System.out.println("Not a multiple of 7");
		
		// TODO Auto-generated method stub
	}

}
