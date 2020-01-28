import java.util.Scanner;

public class program_12 {

	public static void main(String[] args) 
	{
	int n,s=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	n=sc.nextInt();
	while(n!=0)
	{
		s=s+n%10;
	n=n/10;
	}
	System.out.println("Sum="+s);
	}

}
