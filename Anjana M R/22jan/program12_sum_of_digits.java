import java.util.Scanner;

public class program12_sum_of_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r,s=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(;n>0;)
		{
			r=n%10;
			s=s+r;
			n=n/10;
			
		}
		System.out.println("Sum of the digits="+s);
				

	}

}
