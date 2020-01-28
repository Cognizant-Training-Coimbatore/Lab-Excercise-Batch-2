import java.util.Scanner;
class intop
{
	int max(int a[])
	{
		int maxi=a[0];
		for(int i=0;i<10;i++)
		{
			if(a[i]>maxi)
			{
				maxi=a[i];
			}
		}
		return maxi;
		
	}
	int min(int a[])
	{
		int minimum=a[0];
		for(int i=0;i<10;i++)
		{
			if(a[i]<minimum)
			{
				minimum=a[i];
			}
		}
		return minimum;
		
	}
	double avg(int a[])
	{
		double average=0;
		for(int i=0;i<10;i++)
		{	
			average=a[i]+average;
		}
		return (average/10.0);
	}
}
public class question3 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		intop obj = new intop();
		System.out.println("Enter 10 numbers");
		int a[]= new int[10];
		for(int i=0; i<10;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Maximum value: " + obj.max(a) );
		System.out.println("Minimum value: " + obj.min(a) );
		System.out.println("Average value: " + obj.avg(a) );
		input.close();
	}
}
