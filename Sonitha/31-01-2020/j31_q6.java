import java.util.Scanner;

public class j31_q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numbers dividible by 3 are:");
		for(int n=1;n<=100;n++)
		{
			
			if((n%3==0) )
			{
				System.out.println(n);
			}
		}
		System.out.println("Numbers divisible by 11 are:");
		for(int n=1;n<=100;n++)
		{
			
			if((n%11==0))
			{
				System.out.println(n);
				
			}
		}
		System.out.println("Numbers divisible by both 3 and 11");
		for(int n=1;n<=100;n++)
		{
			
			if((n%3==0) && (n%11==0))
			{
				System.out.println(n);
			}
		
		}
	}

}
