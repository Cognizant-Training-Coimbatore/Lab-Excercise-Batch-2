import java.util.Scanner;

public class program_sumofdigits {

	public static void main(String[] args) {
		int n,m,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=scanner.nextInt();
		while(n>0)
		{
			m=n%10;
			n=n/10;
			sum=sum+m;
			
		}
		System.out.println("sum of digits " +sum);
		// TODO Auto-generated method stub

	}

}
