import java.util.Scanner;

class Operations
{
	int number1,number2;
	public Operations(int num1,int num2)
	{
		number1=num1;
		number2=num2;
	}
	public int Addition()
	{
		return number1+number2;
	}
	public int Subtraction()
	{
		return number1-number2;
	}
	public int Multiplication()
	{
		return number1*number2;
	}
	public int Division()
	{
		return number1/number2;
	}
}

public class program35_results_of_two_nos {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no..");
		num1=sc.nextInt();
		System.out.println("Enter sec no..");
		num2=sc.nextInt();
		Operations op=new Operations(num1,num2);
		System.out.println("Sum is: "+op.Addition());
		System.out.println("Difference is: "+op.Subtraction());
		System.out.println("Product is: "+op.Multiplication());
		System.out.println("Quotient is: "+op.Division());

	}

}
