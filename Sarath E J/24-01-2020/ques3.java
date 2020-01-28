import java.util.Scanner;

public class prog40 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a,max,min;
		int sum=0;
		int avg=0;
		Scanner sc =new Scanner(System.in);
		
		max=min=sc.nextInt();
		for(int i=0;i<9;i++)
		{
			 a = sc.nextInt();
			 sum+=a;
			if(min>a)
			{
				min=a;
			}
			if(max<a)
			{
				max = a;;
			}
			
		}
		 avg=sum/10;
		 System.out.println("Avg= "+avg);
		 System.out.println("Min= "+min);
		 System.out.println("Max="+max);

	}

}
