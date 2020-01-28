import java.util.Scanner;

public class pgm23_elec_bill {

	public static void main(String[] args)
	{
		int o,n;
		System.out.println("enter old meter reading");
		Scanner sc=new Scanner(System.in);
		o=sc.nextInt();
		System.out.println("enter new meter reading");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int units=n-o;
		if(units>=1&&units<=100)
		{
			System.out.println("Free");
		}
		else if(units>=101&&units<=200)
		{
			System.out.println(units*1);
		}
		else if(units>=201&&units<=300)
		{
			System.out.println(units*2);
		}
		else if(units>=301&&units<=400)
		{
			System.out.println(units*3);
		}
		else 
		{
			System.out.println((units*4*.1)+(units*4));
		}
		
		
	}

}
