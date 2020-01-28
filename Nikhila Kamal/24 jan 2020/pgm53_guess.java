import java.util.Scanner;

public class pgm53_guess {

	public static void main(String[] args) 
	{
		System.out.println("pick the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("guess the number");
		Scanner s=new Scanner(System.in);
		int g=s.nextInt();
		
			
		
		if(n==g)
		{
			System.out.println("guessed number is correct");
		}
		else 
			System.out.println("wrong");
			for(int i=2;i>0;i--)
			{
				
		
			System.out.println("sorry wrong number...guess the  number.."+ i +" attempts left");
			
			g=s.nextInt();
			if(n==g) {
				System.out.println("guessed number is correct");
				break;
			}
		}
			 if(n!=g)
			{
				System.out.println("sorry...wrong number...the correct number is : "+ n  );
			}
		
		}
		
		

	}



