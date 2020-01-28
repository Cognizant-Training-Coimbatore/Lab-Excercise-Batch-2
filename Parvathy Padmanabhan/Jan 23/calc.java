import java.util.Scanner;
class calcu
{
	int add(int a, int b)
	{
		return a+b;
	}
	int mul(int a, int b)
	{
		return a*b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	int div(int a, int b)
	{
		return a/b;
	}
}

public class calc {

	public static void main(String[] args) {
		calcu obj = new calcu();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a= input.nextInt();
		int b= input.nextInt();
		System.out.println("Enter your choice 1.Add 2. Subtract 3. Multiply 4. Dividion ");
		int c = input.nextInt();
		if(c==1)
		{
			System.out.println("Addition : " + obj.add(a,b));
		}
		else if(c==2)
		{
			System.out.println("Subtraction : " + obj.sub(a,b));
		}
		else if(c==3)
		{
			System.out.println("Multiplication : " + obj.mul(a,b));
		}
		else if(c==4)
		{
			System.out.println("Division : " + obj.div(a,b));
		}
		else
		{
			System.out.println(" wrong input");
		}
		
		
		input.close();
	}

}
