import java.util.Scanner;

public class qstn9 {

	public static void main(String[] args) 
	{
		int a[]=new int[10];
		System.out.println("enter the numbers");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number you want o search");
		int num= sc.nextInt();
		int c=0;
		for(int i=0;i<10;i++)
		{
			if(a[i]==num)
			{
				c++;
			}
		}
		if(c!=0)
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
		

	}

}
