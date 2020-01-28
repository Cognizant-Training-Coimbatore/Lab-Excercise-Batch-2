package Package2;

import java.util.Scanner;

public class program83_set5_q1 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter only positive no.");
		num=sc.nextInt();
		if(num>0)
			System.out.println("The no. is positive");
		else if(num<0)
		{
			throw new ArithmeticException ("Only Positive Numbers & no Letters Please!");
			
               
		}
	}

}
