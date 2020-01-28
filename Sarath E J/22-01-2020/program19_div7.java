import java.util.Scanner;

public class program19_div7 {

	public static void main(String[] args) 
	{
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		if(n%7==0)
		{
			System.out.println("YES HERO");
		}
		else
		{
			System.out.println("NOPE IDIOT");
		}

	}

}
