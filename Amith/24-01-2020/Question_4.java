import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) 
	{


		int num=5,j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("i'm guessing a number between 0-9..can you guess it.(3)attempts left");
		for(int i=3;i>0;i--)
		{
			
			int user=sc.nextInt();
			if(user==num)
			{
				System.out.println("correct");
				j=0;
				System.exit(0);
				
			}
			else
			{
				System.out.println("sorry wrong number...try again("+(i-1)+")attempts left");
			}
			if(j!=0);
			{
				
			}
			
		}
		if(j!=0);
		{
			System.out.println("the correct answer is "+num);
		}
		
		
	}

}
