import java.util.Scanner;
import java.util.Random;
public class question4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a=rand.nextInt(10);
		Scanner input=new Scanner(System.in);
		int count =0,b;
		//System.out.println(a);
		System.out.println("I' m thinking of a number between 0 and 9 . Guess it 3 attempts!!");
		for(count = 3; count>=1;count--)
		{
			b=input.nextInt();
			if(a==b)
			{
				System.out.println("You got it right! Corerct answer is: "+ a);
				break;
			}
			else
			{
				System.out.println("Sorry Wrong number."+(count-1)+" attempts left");
				continue;
			}
		}
		if(count==0)
		{
			System.out.println("Corerct answer is: "+a );
		}
		input.close();
	}
}
