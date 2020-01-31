import java.util.Scanner;

public class p18 {

	public static void main(String[] args)
	{
		System.out.println("enter three nos.:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x==y&&y==z&&x==z)
		{
			System.out.println("All numbers are equal");
		}
		else if(x!=y&&y!=z&&z!=x)
		{
			System.out.println("All are different");
		}
		else 
		{
			System.out.println("Neither all are equal or different");
		}
	
		
	}

}
