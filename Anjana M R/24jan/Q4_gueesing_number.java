import java.util.Scanner;
import java.util.Random;
public class Q4_gueesing_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int a=r.nextInt(10);
		int i;
		System.out.println("Enter the value");
		
		for(i=3;i>0;i--)
		{
			int n=sc.nextInt();
			if(a==n)
			{
				System.out.println("correct");
				break;
			}
			else
			{
				System.out.println("Sorry,Wrong number"+"Attempt left="+(i-1));
				continue;
			}
		}
		if(i==0)
		{
			System.out.println("Correct value="+a);
		}
		
		
		

	}

}
