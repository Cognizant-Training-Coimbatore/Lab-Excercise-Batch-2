import java.util.Scanner;

public class meter_reading {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter new meter reading");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("enter old meter reading");
		Scanner scanner1=new Scanner(System.in);
		b=scanner.nextInt();
		
		c=a-b;
		System.out.println("no of units consumed " +c );
		if((c>=1)&&(c<=100))
		{
		System.out.println("free");	
		}
		else if((c>=101)&&( c<=200))
		{
			System.out.println(c*1);
		}
		else if((c>=201)&&( c<=300))
		{
			System.out.println(c*2);
		}
		else if((c>=301)&&( c<=400))
		{
			System.out.println(c*3);
		}
		else
		{
			float price= (float )c*4*10/100;
			System.out.println(c*4+ price);
		}

	}

}
