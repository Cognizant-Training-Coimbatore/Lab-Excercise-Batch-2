package Exercise;

import java.util.Scanner;

public class Q11_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),flag=0;
		
		for(int i=0;i<n/4;i++)
		{
			if(Math.pow(4, i) == n)
			{
				flag = 1;
			}
		}
		if(flag == 1)
			System.out.println(n + " is a power of 4");
		else
			System.out.println(n + " is not a power of 4");
	}

}
