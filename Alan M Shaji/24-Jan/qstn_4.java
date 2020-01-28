import java.util.Random;
import java.util.Scanner;

public class qstn_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("I'm guessing a number bw 0 and 9. c an u guess it?(3 attempts left)");
		Random r= new Random();
		int guess= r.nextInt(10);
		for(int i=3;i>0;i--)
		{
			int a=sc.nextInt();
			if(a==guess)
			{
				System.out.println("ohmGAAD! Correct");
				sc.close();
				return;
			}
			else if(i==1)
				System.out.println("Sorry. Wrong number. Correct answer is "+ guess);
			else
			{
				System.out.println("Sorry. Wrong number. I'm guessing a number bw 0 and 9. c an u guess it?("+(i-1)+" attempts left)");
			}
		}
		sc.close();
	}

}
