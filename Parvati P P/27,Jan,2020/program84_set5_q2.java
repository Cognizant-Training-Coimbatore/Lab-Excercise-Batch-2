package Package2;

import java.util.Scanner;

public class program84_set5_q2 {

	public static void main(String[] args) {
		float num1,num2,div = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1");
		num1=sc.nextInt();
		System.out.println("Enter num 2");
		num2=sc.nextInt();
		if(num2!=0)
		{
			div=num1/num2;
			System.out.println("The result is.."+div);
		}
		if(num2==0)
		{
			throw new ArithmeticException ("Division by zero impossible");
			
               
		}
	}

}
