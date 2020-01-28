import java.util.Scanner;

public class program21_divisible_by_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
                int n;
                n=sc.nextInt();
                if(n%7==0)
                {
                	System.out.println("The number is divisible by 7");
                }
                else
                {
                	System.out.println("The number is not divisible by 7");
                }
	}

}
