import java.util.Scanner;

public class qstn7 
{
	static void validate(int s)throws myexceptions
	{
		if(s<101||s>200)
		{
			System.out.println("Input Rejected");
		}
		else
		{
			System.out.println("Input accepted");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		try
		{
			validate(x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
