import java.util.Scanner;

public class program10_multiply_corresponding {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		System.out.println("Enter the elements of two arrays");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			c[i]=a[i]*b[i];
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
