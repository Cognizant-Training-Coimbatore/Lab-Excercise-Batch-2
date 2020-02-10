import java.util.Scanner;

public class lab18_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b&&b==c&&a==c)
		{
			System.out.println("All numbers are equal");
		}
		else if(a!=b&&b!=c&&a!=c)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or differnt");
		}
	}

}
