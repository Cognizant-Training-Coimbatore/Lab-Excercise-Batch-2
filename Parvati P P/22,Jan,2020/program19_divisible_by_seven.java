import java.util.Scanner;

public class program19_divisible_by_seven {

	public static void main(String[] args) {
		int num,rem=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no..");
		num=sc.nextInt();
		rem=num%7;
		if(rem==0)
		{
			System.out.println("Divisible by 7");
		}
		else
		{
			System.out.println("Not divisible by 7");
		}
	}

}
