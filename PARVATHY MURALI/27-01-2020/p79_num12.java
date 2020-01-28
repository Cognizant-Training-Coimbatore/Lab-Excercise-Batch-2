
import java.lang.*;
import java.util.Scanner;
class p79_num12 
		{
			public static void main(String[] args) 
			{
				try
				{
					System.out.println("Enter the number1:");
					Scanner sc=new Scanner(System.in);
					int n1=sc.nextInt();
					System.out.println("Enter the number1:");
					int n2=sc.nextInt();
					int c=n1/n2;
					if(n2>0)
					System.out.println("number1/number2="+n1+"/"+n2+"="+c);
					
						
				}
				catch(ArithmeticException e)
				{
					System.out.println("Arthemetic Execption occurs.....number 2 cannot be zero");
					
				}
				
			}

		

	}


