import java.util.Scanner;

public class Q8_comparison {
	boolean compare(int a,int b, int c)
	{
		if(b>a&&c>b)
			return true;
		else
		{
		return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		System.out.println("Enter 3 numbers a,b,c");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Q8_comparison obj=new Q8_comparison();
		System.out.println(obj.compare(a, b, c));

	}

}
