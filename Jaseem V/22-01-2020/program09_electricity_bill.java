import java.util.Scanner;

public class program09_electricity_bill {

	public static void main(String[] args) 
	{
		int old;
		int new1;
		System.out.println("Enter the old meter reading");
		Scanner sc=new Scanner(System.in);
		old=sc.nextInt();
		System.out.println("Enter the current meter reading");
		new1=sc.nextInt();
		int u= new1-old;
		if((u<=100)&&(u>=1))
	
		{
			System.out.println("You dont want to pay anything");
		}
		else if((u<=200)&&(u>=101))
		{
			System.out.println("You need to pay"+u*1);
		}
		else if((u<=300)&&(u>=201))
		{
			System.out.println("You need to pay"+u*2);
		}
		
			
		else if((u<=400)&&(u>=301))
		{
			System.out.println("You need to pay"+u*3);
		}
	
		else
		{
			int amount=(u*4);
			System.out.println("You need to pay"+(amount+(amount*10/100)));
		}
			
		

	}

}
