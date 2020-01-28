import java.util.Scanner;

public class exercise26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min,sum=0,i;

		
		double avg=0;
		
		Scanner scanner = new Scanner(System.in);
		int a[]=new int[10];
		
		System.out.println("enter 10 numbers");
		for(i=0;i<10;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		min=max=a[0];

		for(i=0;i<10;i++) {
		
			
			if(a[i]<min)
				{min=a[i];}
			if(a[i]>max)
				{max=a[i];}
			
			
			sum=sum+a[i];
		}
		
		avg = sum/10;
		System.out.println("min of 10 numbers: " +min);
		System.out.println("max of 10 numbers: " +max);
		

	
		System.out.println("average of 10 numbers: " +avg);
		

	}

}
