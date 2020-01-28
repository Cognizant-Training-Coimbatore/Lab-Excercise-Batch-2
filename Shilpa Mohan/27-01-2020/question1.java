import java.util.Scanner;

public class question1
{
	static void validate(int val)throws myexceptions
	{
		if(val<0)
			throw new myexceptions("not valid");
		else
			System.out.println("value valid");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				try
				{
					System.out.println("Enter a positive value:");
					int b= sc.nextInt();
					validate(b);
				}
				catch(Exception m)
				{
					System.out.println("Exception occured: " +m);
				}
		
	}
}