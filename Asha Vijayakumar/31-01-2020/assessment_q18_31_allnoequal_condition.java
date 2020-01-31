import java.util.Scanner;

public class assessment_q18_31_allnoequal_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter a number a:");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter a number b:");
		
		b=scanner.nextInt();
		System.out.println("Enter a number c:");
		
		c=scanner.nextInt();
		if(a==b)
		{
			if(a==c)
			{
				System.out.println("All numbers are equal");
				
			}
			else
			{
				System.out.println("All numbers are different");
				
			}
			
		}
		else
		{
			System.out.println("Neither all are equal or different");
			
		}
		
		

	}

}
