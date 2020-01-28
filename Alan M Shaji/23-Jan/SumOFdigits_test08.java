import java.util.Scanner;

public class SumOFdigits_test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n,digit;
		System.out.print("Enter number-->");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			digit=n%10;
			sum+=digit;
			n/=10;
		}
		System.out.println("Sum --> "+sum);
		sc.close();

	}

}
