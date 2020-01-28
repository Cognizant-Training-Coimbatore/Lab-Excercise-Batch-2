import java.util.Scanner;

public class pgm_52_max_min_avg {

	public static void main(String[] args) {
	System.out.println("enter 10 numbers");
	Scanner sc=new Scanner(System.in);
	int [] num=new int[10];
	for(int i=0;i<num.length;i++)
	{
		
		num[i]=sc.nextInt();
	}
		
			
			int max=num[0];
			int min=num[0];
			int s=0;
			for(int i=1;i<num.length;i++)
			{
				
				
			if(num[i]>max)
			{
				max=num[i];
				
			}
			if(num[i]<min)
			{
				min=num[i];
				
			
			}
			
			s=s+num[i];
			
			}
			int avg=s/10;
			
			
			System.out.println("largest number:" + max);
			System.out.println("smallest number:" + min);
			System.out.println("average is:" + avg);
			
			
			
		}
	}
	

	
	

	
	


