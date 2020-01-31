import java.util.Scanner;

public class assessment_q8_greater_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter number a:");
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter number b:");
		
		
		b=scanner.nextInt();
		System.out.println("Enter number c:");
		
		
		c=scanner.nextInt();
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("True");
				
			}
			else
			{
				System.out.println("False");
			}
		}
		else
		{
			System.out.println("False");
			
		}
		
		
		
		

	}

}
