import java.util.Scanner;

public class prog51_multiplication_table 
{

	public static void main(String[] args)
	{
		int num;
		 Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			num=s.nextInt();
			
		        for(int i=1; i <=num; i++)
		        {
		            System.out.println(num+" * "+i+" = "+num*i);
		        }
		// TODO Auto-generated method stub

	}

}
