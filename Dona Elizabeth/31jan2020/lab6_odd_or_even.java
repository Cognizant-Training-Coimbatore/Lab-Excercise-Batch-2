import java.util.Scanner;

class oddEven
{
	int x;
	void display(int x)
	{
		if((x%2)==0)
		{
			System.out.println(1);
		}
		else
			System.out.println(0);
	}
}
public class lab6_odd_or_even {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int y;
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		oddEven obj=new oddEven();
		obj.display(y);
	}

}
