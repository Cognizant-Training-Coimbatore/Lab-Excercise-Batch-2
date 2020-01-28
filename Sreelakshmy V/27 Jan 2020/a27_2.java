import java.util.Scanner;

public class a27_2 {
	
	static void number(int x,int y)
	{
		int z;
		z=x/y;
		if (y!=0)
			
		{
			System.out.println("Ans="+z);
		}
		else
		{
			throw new ArithmeticException("zero division");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("to check den is zero");
		Scanner scanner =new Scanner(System.in);
		a = scanner.nextInt();
		b=scanner.nextInt();
		number(a,b);
		
	}

	
}
