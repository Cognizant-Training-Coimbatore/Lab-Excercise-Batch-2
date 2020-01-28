package set_5;

import java.util.Scanner;

public class qn_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("marks entered");
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
if(y>=0)
{
	System.out.println("marks " +y);
}
else
{
	throw new ArithmeticException("Invalid marks entered");
}
	}

}
