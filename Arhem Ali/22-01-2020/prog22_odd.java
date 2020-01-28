import java.util.Scanner;

public class prog22_odd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter fst value: ");
		int a =sc.nextInt();
		System.out.println("Enter 2nd value: ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd value: ");
		int g=sc.nextInt();
		System.out.println("Enter 4th value: ");
		int d=sc.nextInt();
		System.out.println("Enter 5th value: ");
		int e =sc.nextInt();
		if(a%2!=0)
		{
			
		
			c=c+1;
		}
		if(b%2!=0)
		{
			c=c+1;
		}
		if(g%2!=0)
		{
			c=c+1;
		}
		if(d%2!=0)
		{
			
		
			c=c+1;
		}
		if(e%2!=0)
		{
			c=c+1;
		}
		System.out.println("no of odd number is: "+c);
		

	}

}
