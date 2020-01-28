import java.util.Scanner;

class multiplication
{
	int i,j,a;
	void multi(int n)
	{
		for(i=1;i<=n;i++)
		{
			System.out.println(" the multiplication table of "+i+" : ");
			for(j=1;j<=10;j++)
			{
				a=i*j;
				System.out.println(a);
			}
		}
	}
}
public class example22_Q2 
{

	public static void main(String[] args) 
	{
		int n1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number between 1 and 9: ");
		n1= scanner.nextInt();
		multiplication obj = new multiplication();
		obj.multi(n1);
	}

}
