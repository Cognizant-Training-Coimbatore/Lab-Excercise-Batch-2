import java.util.Scanner;

public class qstn10 {

	public static void main(String[] args)
	{
		int a[]= new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int small=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("smallest number is :"+small);
	}

}
