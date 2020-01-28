import java.util.Scanner;
class table
{
	void multiply(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("\n\tTable of "+ i);
			for(int j=1;j <=10;j++)
			{
				System.out.println("\t "+i +"  *  "+ j + "   =  "+ i*j);
			}
		}
	}
}
public class question2 
{
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	table obj = new table();
	int n;
	System.out.println("Enter:");
	n=input.nextInt();
	if (n<10)
	{
		obj.multiply(n);
	
	}
	else
	{
		System.out.println("Enter input between 1 and 9");
	
	}
	input.close();
	}
}