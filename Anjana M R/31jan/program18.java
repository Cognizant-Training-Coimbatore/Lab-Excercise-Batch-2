import java.util.Scanner;

public class program18 {

	public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a==b&&b==c&&a==c)
	{
		System.out.println("All numbers are equal");
	}
	if(a!=b && b!=c && c!=a)
	{
		System.out.println("All are different");
	}
	}

}
