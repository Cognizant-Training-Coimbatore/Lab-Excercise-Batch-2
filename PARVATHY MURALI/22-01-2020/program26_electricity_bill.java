import java.util.Scanner;

public class program26_electricity_bill 
{

	public static  void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the old reading:");
		float oldreading=sc.nextInt();
		System.out.println("Enter the new reading:");
		float newreading=sc.nextInt();
		float unit=Math.abs(newreading-oldreading);
		if(unit>=1 && unit<=100)
		{
			System.out.println("You do not want to pay");
			
		}
		else if(unit>=101 && unit<=200)
		{
			System.out.println("Bill:"+(unit*1));
			
		}
		else if(unit>=201 && unit<=300)
		{
			System.out.println("Bill:"+(unit*2));
			
		}
		else if(unit>=301 && unit<=400)
		{
			System.out.println("Bill:"+(unit*3));
			
		}
		else
		{
			System.out.println("Bill:"+((unit*4)+(unit*4*.01)));
		}
		


	}

}
