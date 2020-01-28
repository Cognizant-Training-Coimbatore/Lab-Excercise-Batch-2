import java.util.Scanner;

class ArithOperations
{
void addition(int a , int b)
{
System.out.println(a+b);
}
void substraction(int a , int b)
{
	System.out.println(a-b);
}
void division(int a , int b)
{
	System.out.println(a/b);
}
void multiplication(int a , int b)
{
	System.out.println(a*b);
}
}
public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArithOperations xx= new ArithOperations();
System.out.println("Enter the two numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
xx.addition(a, b);
xx.substraction(a, b);
xx.division(a, b);
xx.multiplication(a, b);
	
	
	}

}
