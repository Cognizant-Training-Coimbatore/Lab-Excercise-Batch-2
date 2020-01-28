import java.util.Scanner;

public class lab5 {
	static void mark(int num)
	{
		if (num>=0)
		{
			System.out.println("Mark is valid");
		}
		else
		{
			throw new ArithmeticException("Invalid mark...");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		int num=sc.nextInt();
		mark(num);
		sc.close();
		}

	}


