import java.util.Scanner;

public class pgm_arrayss {

	public static void main(String[] args) 
	{
		int n,number,greater;
		System.out.println("enter the maximum size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int numbers1[]=new int[n];
		int i;
		System.out.println("enter number 0");
		number=sc.nextInt();
		numbers1[0]=number;
		greater=number;
		for(i=1;i<n;i++)
		{
			System.out.println("enter number" + i);
			number=sc.nextInt();
			numbers1[i]=number;
			if(number>greater)
			{
				greater=number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("numbers are" +numbers1[i]);
			
		}
		System.out.println("greatest number" + greater);
		
	}

}
