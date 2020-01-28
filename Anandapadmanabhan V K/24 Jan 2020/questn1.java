import java.util.Scanner;

public class questn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		i=sc.nextInt();
		System.out.println("Enter the last number");
		n=sc.nextInt();
		for(;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
