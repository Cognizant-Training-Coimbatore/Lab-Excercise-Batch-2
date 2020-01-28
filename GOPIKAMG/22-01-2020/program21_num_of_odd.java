import java.util.Scanner;

public class program21_num_of_odd {

	public static void main(String[] args)
	{
		int i=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		/*for(int i=0;i<5;i++) 
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
			}
			
		}
		
		System.out.println("the number of odd numbers is"+ count);
		
		*/
		if( i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		
		if(i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		if(i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		if(i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		if(i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		if(i<5)
		{
			System.out.println("enter the"+(i+1)+ "number");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
				i++;
			}
		}
		System.out.println("the number of odd numbers is"+ count);
		
	}

}
