import java.util.Scanner;

public class ex11_power
{

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n==1)
		{
			System.out.println("power of 4");
		}
		else
		{
	
		while(n>=8)
		{
			n=n/4;
			
		}
		if(n%4==0)
		
			System.out.println("power of 4");
			
		
		else
			System.out.println("not power of 4");
		

	}

}
}

