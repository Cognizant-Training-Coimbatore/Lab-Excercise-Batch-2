import java.util.Scanner;

public class exercise14_Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range,b,i,flag=0;
		range = 9;
		Scanner sc = new Scanner(System.in);
		int rand = (int)(Math.random() * range);
		System.out.println("I am thinking about a number between 0 and 9. can you guess it? (3 attempts left)");
		for(i=1;i<=3;i++)
		{
			b = sc.nextInt();
			if(b==rand)
			{
				flag=1;
				System.out.println("Correct answer!!");
				break;
			}
			else if(i!=3)
			{
				System.out.println("Sorry. wrong answer. Try again. (" + (3-i) + " attempts left)");
			}
		}
		if(flag==0)
		{
			System.out.println("Soory.Wrong number. The answer is : " + rand);
		}
	}

}
