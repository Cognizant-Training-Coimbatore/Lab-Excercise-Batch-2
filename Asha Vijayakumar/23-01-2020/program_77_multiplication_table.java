import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;
public class program_77_multiplication_table
{

	public static void main(String[] args) 
	{
		int a,i,b;
		System.out.println("Enter an integer:");
		Scanner scanner = new Scanner(System.in);
		a =scanner.nextInt();
		System.out.println("Multiplication result upto n numbers: ");
		for(i=1;i<=a;i++)
		{
			b=i*a;
			System.out.println(b);
			
			
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
