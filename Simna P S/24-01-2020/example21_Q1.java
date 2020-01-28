import java.util.Scanner;

class between
{
	int i;
	void pro(int a , int b)
	{
		for(i=a;i<=b;i++)
		{
			System.out.println(i);
		}
	}
}
public class example21_Q1 
{

	public static void main(String[] args) 
	{
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		n1= scanner.nextInt();
		System.out.println("enter the second number");
		n2= scanner.nextInt();
		between obj = new between();
		obj.pro(n1, n2);

	}

}
