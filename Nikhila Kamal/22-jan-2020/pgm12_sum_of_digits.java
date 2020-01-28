import java.util.Scanner;

public class pgm12_sum_of_digits {

	public static void main(String[] args) 
	{
	int n,s=0;
	int m;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n>0)
	{
		m=n%10;
		s=s+m;
		n=n/10;
		
	}
	System.out.println("The sum of digits:" + s);
	}

}
