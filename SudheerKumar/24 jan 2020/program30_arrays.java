import java.util.Scanner;

public class program30_arrays {

	public static void main(String[] args) {
		int n,number,greater;
		System.out.println("enter the max size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int number1[]=new int[n];
		int i;
		System.out.println("enter number 0");
		number=sc.nextInt();
		greater=number;
		for(i=1;i<=n;i++)
		{
			System.out.println("enter number"+i);
			number=sc.nextInt();
			number1[i]=number;
			if(number>greater)
			{
				greater=number;
			}
			for(i=0;i<n;i++)
			{
				System.out.println("numbers are" +number1[i]);
			}
			System.out.println("greatest number"+greater);
		}
		// TODO Auto-generated method stub

	}

}
