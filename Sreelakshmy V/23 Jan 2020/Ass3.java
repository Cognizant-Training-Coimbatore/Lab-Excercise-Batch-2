import java.util.Scanner;

class Ca
{
	int i,max,min;
	
	void max(int[] a)
	{
		max=a[0];
		for(i=1;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				i=i+1;
			}
		}
		System.out.println("Max="+max);
	}
	void min(int[] a)
	{
		min=a[0];
		for(i=1;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				i=i+1;
			}
		}
		System.out.println("Min="+min);
	}
}
public class Ass3
{
	public static void main(String args[])
	{
		int p;
		int a[]=new int[10];
		Ca ob=new Ca();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 nos");
		for(p=0;p<10;p++)
		{
			a[p]=sc.nextInt();
		}
		ob.max(a);
		ob.min(a);
	}
}