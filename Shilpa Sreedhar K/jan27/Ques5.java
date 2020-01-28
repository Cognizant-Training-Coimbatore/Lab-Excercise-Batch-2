import java.util.Scanner;

public class Ques5  {
	static void validate(int n) throws pgm30_custom_exc
	{
		if(n>0)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new pgm30_custom_exc("Invalid");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		try {
			validate(n);
		} catch (pgm30_custom_exc e) {
			System.out.println(e);
		}
	}

}