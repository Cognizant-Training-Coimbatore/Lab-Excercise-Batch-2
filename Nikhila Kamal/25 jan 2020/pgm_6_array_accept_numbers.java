import java.util.Scanner;

public class pgm_6_array_accept_numbers {

	public static void main(String[] args)
	{
		int num;
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		
		int n[]=new int[5];
		int s=0;
		
		

		for(int i=0;i<5;i++)
		{
			
			num=sc.nextInt();
			n[i]=num;
		}
		int sum=n[0]+n[1]+n[2]+n[3]+n[4];
		double avg=sum/5;
		System.out.println("sum is:" + sum);
		System.out.println("average is:" + avg);
		
		
		

	}

}