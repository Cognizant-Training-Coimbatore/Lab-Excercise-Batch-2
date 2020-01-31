import java.util.Scanner;

public class j31_q4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Odd numbers from 1 to 99 are:");
		for(int i=1;i<100;i++)
		{ 
			if((i%2)!= 0)
			{
				System.out.println(i);
			}
		}

	}

}
