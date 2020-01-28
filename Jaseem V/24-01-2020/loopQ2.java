import java.util.Scanner;

public class loopQ2 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a positive integer between 1 and 9");
		int a =sc.nextInt();
		int i;
		for(i=1;i<=a;i++)
		{
			
			System.out.println(i+ " *1 =" +i*1);
			System.out.println(i+ " *2 =" +i*2);
			System.out.println(i+ " *3 =" +i*3);
			System.out.println(i+ " *4 =" +i*4);
			System.out.println(i+ " *5 =" +i*5);
			System.out.println(i+ " *6 =" +i*6);
			System.out.println(i+ " *7 =" +i*7);
			System.out.println(i+ " *8 =" +i*8);
			System.out.println(i+ " *9 =" +i*9);
			System.out.println(i+ " *10 =" +i*10);
			
		}

	}

}
