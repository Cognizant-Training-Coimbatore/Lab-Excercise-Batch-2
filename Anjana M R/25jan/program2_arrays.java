import java.util.Scanner;

public class program2_arrays {

	public static void main(String[] args) {
		int n,number,g;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the max value");;
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter number 0");
		number=sc.nextInt();
		g=number;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter number"+i);
			number=sc.nextInt();
			a[i]=number;
			if(number>g)
			{
				g=number;
			}
	
	     }
		for(i=0;i<n;i++)
		{
			System.out.println("numbers are"+a[i]);
		}
		System.out.println("greatest number"+g);
		}
	}
	


