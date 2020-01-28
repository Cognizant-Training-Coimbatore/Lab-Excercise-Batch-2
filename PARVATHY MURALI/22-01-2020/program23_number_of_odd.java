import java.util.Scanner;

public class program23_number_of_odd 
{

	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter"+(i+1)+" number:");
			int num=sc.nextInt();
			if(num%2!=0)
			{
				count=count+1;
			}
		}
		
		
		System.out.println("The number of odd number is "+count);

	}

}
