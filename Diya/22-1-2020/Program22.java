import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the old meter reading ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		
		System.out.println("Enter the new meter reading ");
		Scanner scr=new Scanner(System.in);
		b=scr.nextInt();
		
		c=b-a;
		System.out.println("No. of units consumed is " +c);
		
		
		if(c>=1 && c<=100)
		{
			
			System.out.println("Free");
		}
		else if(c>=101 && c<=200)
		{
			System.out.println("Rs. " +c);
		}
		else if(c>=201 && c<=300)
		{
			System.out.println("Rs. "+c*2);
		}
		else if(c>=301 && c<=400)
		{
			System.out.println("Rs. "+c*3);
		}
		else
		{
			System.out.println("Rs. "+((c*4)+(c/10)));
		}
		

	}

}
