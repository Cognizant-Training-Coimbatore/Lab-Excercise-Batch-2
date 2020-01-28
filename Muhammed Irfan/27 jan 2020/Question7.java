package monday;

import java.util.Scanner;

public class Question7 {

	

		static void check(int num)
		{
			if(num>=101 && num<=200)
			{
				System.out.println("Employer ID is valid");
			}
			else
			{
				throw new ArithmeticException("Employer ID is invalid");
			}
		}
		
       public static void main(String[] args) 
       {
	
    	   Scanner scan=new Scanner(System.in);
   		int id;
   		System.out.println("enter  ID");
   		id=scan.nextInt();
   		check(id);
   		
   		scan.close();

}
}
