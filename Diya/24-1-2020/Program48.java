import java.util.Scanner;

class integers
{
	int i,s,c;
	void display(int s,int c)
	{
		for(i=s;i<=c;i++)
		{
			System.out.println(i);
		}
	}
}
public class Program48 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int s = sc.nextInt();
		System.out.println("Enter the 2nd value");
		int c = sc.nextInt();
		integers obj = new integers();
		obj.display(s,c);

	}

}
