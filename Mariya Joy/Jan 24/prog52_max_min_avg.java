import java.util.Scanner;

public class prog52_max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,max,min,sum=0;
		double avg;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		min=max=a[0];
		for(i=0;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
			sum=sum+a[i];
			
		}
		avg=sum/10;
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+min);
		System.out.println("The average of all number is "+avg);
		
		

	}

}
