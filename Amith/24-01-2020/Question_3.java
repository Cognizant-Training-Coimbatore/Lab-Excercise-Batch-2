import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) 
	{
		int a[],i;
		System.out.println("enter your numbers");
		a=new int[10];
		Scanner sc= new Scanner(System.in);
		for(i=0;i<=9;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
	
		int sum=0;
		int max=a[0];
		int min=a[0];
		for(i=1;i<=9;i++)
		{
			if(a[i]>max)
			{
			max=a[i];
			}
		}
		for(i=1;i<=9;i++)
		{
			if(a[i]<min)
			{
			min=a[i];
			}
		}
		for(i=0;i<=9;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("maximum is "+max);
		System.out.println("minimum is "+min);
		System.out.println("average  is "+(sum/10));

	}

}
