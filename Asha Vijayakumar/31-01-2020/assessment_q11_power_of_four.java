import java.util.Scanner;

public class assessment_q11_power_of_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number:");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if(num%4==0)
		{
			System.out.println("The given number is power of four");
			
		}
		else
		{
			System.out.println("The given number is not power of four");
			
		}

	}

}
