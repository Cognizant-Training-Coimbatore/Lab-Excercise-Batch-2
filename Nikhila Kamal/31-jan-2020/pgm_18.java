import java.util.Scanner;

public class pgm_18 {

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		Scanner scc=new Scanner(System.in);
		int c=sc.nextInt();
		if(a==b&&b==c&&a==c)
		{
			System.out.println("All numbers are equal");
		}
		else if(a!=b&&b!=c&&c!=a)
		{
			System.out.println("All are different");
		}
		else 
		{
			System.out.println("Neither all are equal or different");
		}
		
			
		
	}

}
