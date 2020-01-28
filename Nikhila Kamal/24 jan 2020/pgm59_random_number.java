import java.util.Random;
import java.util.Scanner;

public class pgm59_random_number {

	public static void main(String[] args) {
		int range;
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("enter the maximum range");
		range=sc.nextInt();
		for(int n=1;n<=10;n++)
		{
			System.out.println(rand.nextInt(range));
		}
		

	}

}
