package jan31;

import java.util.Scanner;

public class question11 {
	
	static int powerof(int a1)
	{
		int a = a1;
		while(a>1)
		{
			if(a%4!=0)
			{
				return 0;
			}
			a=a/4;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(powerof(n)==1)
		{
			System.out.println("The number is power of 4");
		}
		else
		{
			System.out.println("The number is not power of 4");
		}

	}

}
