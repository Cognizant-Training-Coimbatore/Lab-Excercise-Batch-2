import java.util.Scanner;

public class questn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,c;
		System.out.println("Pick a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Guess the number");
		m=sc.nextInt();
		{
			if(m==n)
			{
				System.out.println("Your guess is correct");
			}
			else
				for(int i=2;i>0;i--)
			{
				System.out.println("Your guess is wrong( " + i + " attempts left)");
				m=sc.nextInt();
				if(m==n)
				{
					System.out.println("You're right");
					break;
			}
			}
			
		}
		
	}

}
