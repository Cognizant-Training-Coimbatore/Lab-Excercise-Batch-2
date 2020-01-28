import java.util.Scanner;

public class date_27_positive {
	static void st(int n)
	{
		if(n>=0)
		{
			System.out.println("number accepted");
		}
		else
		{
			throw new ArithmeticException("negative numbers are not allowed");
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
