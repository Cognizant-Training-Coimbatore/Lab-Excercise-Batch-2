import java.util.Scanner;

public class prog21_bill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the old meter reading");
		float a= sc.nextFloat();
		System.out.println("Enter the new meter reading");
		float b= sc.nextFloat();
		float c;
		c=b-a;
		System.out.println("No. of units consumed= "+c);
		if(c>=1 && c<=100)
		{
			System.out.println("Price= Free");
		}
		else if(c>=101 && c<=200)
		{
			System.out.println("Price= rs."+(c*1));
		}
		else if(c>=201 && c<=300)
		{
			System.out.println("Price= rs."+(c*2));
		}
		else if(c>=301 && c<=400)
		{
			System.out.println("Price= rs."+(c*3));
		}
		else
		{
			float x=(c*4);
			System.out.println("Price= rs."+(x+(x*10/100)));
		}
	}

}
