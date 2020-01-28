import java.util.Scanner;
public class p7 {
	static void validate(int n)throws myexceptions
	{
		if(n>=101&&n<=200)
			System.out.println("valid");
		else
		throw new myexceptions("rejected");
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("enter a number");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			validate(n);
		}
			catch(Exception m)
			{
				System.out.println("exception occured: " + m);
			}
	}
}