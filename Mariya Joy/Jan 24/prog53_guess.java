import java.util.Scanner;

public class prog53_guess {

	public static void main(String[] args) {
		int a=9,b,i;
		Scanner s= new Scanner(System.in);
		System.out.println("Guess the number");
		for(i=0;i<=2;i++)
		{
		
		b=s.nextInt();
		if(b!=a)
			{
			if(i!=2)
			System.out.println("Next chance");
		}
		else
		{
			System.out.println("correct");
			break;
		}
		}
	
	if(i==3)
			{
		System.out.println("better luck next time");
			}

	}
		
		
		
		
		
		// TODO Auto-generated method stub

	}



