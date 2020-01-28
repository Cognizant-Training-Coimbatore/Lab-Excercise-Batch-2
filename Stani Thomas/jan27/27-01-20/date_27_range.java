import java.util.Scanner;

public class date_27_range {
	static void st(int n)
	{
		if(n>101&&n<200)
		{
			System.out.println("number accepted");
		}
		else
		{
			throw new ArithmeticException("Input rejected");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		st(n);
	}

}
