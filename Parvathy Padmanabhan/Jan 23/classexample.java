import java.util.Scanner;
class example
{
	int x;
	example()
	{
		System.out.println(x);
	}
	
	int oddoreven(int p)
	{
		if(p%2==0)
		{
			System.out.println(x);
			return 0;
		}
		else
		{
			return 1;
		}
		
	}
	
}
public class classexample {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter");
		int a=input.nextInt();
		example c = new example();
		int result=c.oddoreven(a);
		c.x=9;
		if(result==0)
		{
			System.out.println("Even");
		}
		else if(result==1)
		{
			System.out.println("Odd");
		}
		
		input.close();
	}

}
