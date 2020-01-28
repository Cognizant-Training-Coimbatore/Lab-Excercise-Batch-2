package set_5;

import java.util.Scanner;

public class qn_1 {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		if(x>0)
		{
			System.out.println("no is positive");
		}
		
		else
		{
			throw new ArithmeticException("no is negative");
		}		

	}

}
