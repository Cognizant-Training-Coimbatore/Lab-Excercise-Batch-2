import java.util.Scanner;

public class pgm7_25_cpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		int num[]=new int[n];
		int num1[]=new int[n];
		System.out.println("Enter the numbers: ");
		int i;
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			num1[i]=num[i];
		}
		System.out.println("The copied array is :");
		for(i=0;i<n;i++)
		{
			System.out.println(num1[i]);
		}
		sc.close();
	}

}
