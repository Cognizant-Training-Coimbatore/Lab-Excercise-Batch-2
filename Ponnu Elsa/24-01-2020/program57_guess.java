
import java.util.Random;
import java.util.Scanner;

class guess
{
	int gu=8;
	int cmpr(int num)
	{
		if(num==gu)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class program57_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guess obj =new guess();
		int n,i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		for(i=3;i>=1;i--)
		{
			System.out.println("Im thinking about a number between 0 and 9.Can u guess it ?( "+i+" attempt(s) left):");
			n = sc.nextInt();
			flag = obj.cmpr(n);
			if (flag==1)
			{
				System.out.println("Correct guess....");
				break;
			}
			else
			{
				continue;
			}
		}
		if(flag==0)
		{
			System.out.println("Sorry Wrong Number...");
			System.out.println("The correct number is  "+obj.gu);
		}
		sc.close();
	}

}