import java.util.Scanner;

class table
{
	int i,j,n,m;
	void display(int n)
	{
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=10;j++)
			{
		m = i*j;
		System.out.println(i + " * " + j + " = " +m);
		}
		}
	}
}
public class Program49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		table obj = new table();
		obj.display(n);
	}
		

	}

