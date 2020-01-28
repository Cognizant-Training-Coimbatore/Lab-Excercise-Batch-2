import java.util.Scanner;

public class program22_count_odd_numbers {

	public static void main(String[] args) {
		int a,b,c,d,e;
		System.out.println("Enter 5 numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		e=scanner.nextInt();
		int count=0;
		if (a%2!=0)
		{
			count=count+1;
		}
		if (b%2!=0)
		{
			count=count+1;
		}
		if (c%2!=0)
		{
			count=count+1;
		}
		if (d%2!=0)
		{
			count=count+1;
		}
		if (e%2!=0)
		{
			count=count+1;
		}
		System.out.println("Total number of odd numbers in the entered number is "+count);
	}

}
