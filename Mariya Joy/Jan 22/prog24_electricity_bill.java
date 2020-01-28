import java.util.Scanner;

public class prog24_electricity_bill {

	public static void main(String[] args)
	{
		int a,b,c;
		System.out.println("Enter the old reading");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter the new reading");
		b=scanner.nextInt();
		c=b-a;
		System.out.println("The number of unit consumed="+c);
		if(c>=1 && c<=100)
		{
			System.out.println("Free");
		}
		else if(c>=101 && c<=200)
		{
			System.out.println("Pay "+c*1);
		}
		else if(c>=201 && c<=300)
		{
			System.out.println("Pay "+c*2);
		}
		else if(c>=301 && c<=400)
		{
			System.out.println("Pay "+c*3);
		}
		else
		{
			System.out.println("Pay "+((c*4)+((c*4*10)/100)));
		}
		

	}

}
