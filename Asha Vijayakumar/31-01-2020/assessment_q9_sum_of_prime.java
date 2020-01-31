import java.util.Scanner;

public class assessment_q9_sum_of_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0,b; 
		 	System.out.println("Enter the end limit:");
		 	Scanner scanner=new Scanner(System.in);
		 	
		b=scanner.nextInt();
		for(int i=1;i<=b;i++)
		{
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					sum=sum+i;
					
				}
			}
		}
		 
		
		 System.out.println(+ sum);
		 
		  }

	}


