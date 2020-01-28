import java.util.Scanner;

public class qs9 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int ar[]=new int[10];
		int flag=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter value"+(i+1));
			int b=sc.nextInt();
			ar[i]=b;
		}
		System.out.println("Enter value to search: ");
		int c= sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(ar[i]==c)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("value found");
		}
		else
		{
			System.out.println("not found");
		}
	

     }
}
