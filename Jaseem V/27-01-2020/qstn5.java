import java.util.Scanner;

public class qstn5
{
	static void validate(int num)throws myexceptions
	{
		if(num<=0)
		{
			System.out.println("Invalid marks");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the marks");
		Scanner sc =new Scanner(System.in);
		int y =sc.nextInt();
	
	try
	{
		validate(y);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
