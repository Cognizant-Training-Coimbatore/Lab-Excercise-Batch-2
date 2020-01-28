import java.util.Scanner;

public class Ques7 {

	static void validate(int n) throws pgm30_custom_exc
	{
		if(n<=101 && n>=200)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new pgm30_custom_exc("Rejected");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee code");
		int n=sc.nextInt();
		try {
			validate(n);
		} catch (pgm30_custom_exc e) {
			System.out.println(e);
		}
	}

}