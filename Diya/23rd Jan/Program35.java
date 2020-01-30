import java.util.Scanner;

class arithmetic
{
	int n1, n2;
void addition(int a1, int b1)
{
	int c1=a1+b1;
	System.out.println(c1);
}
void subtraction(int a2, int b2)
{
	int c2=a2-b2;
	System.out.println(c2);
}
void multiplication(int a3, int b3)
{
	int c3=a3*b3;
	System.out.println(c3);
}
void division(int a4, int b4)
{
	int c4=a4/b4;
	System.out.println(c4);
}
}
public class Program35 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = sc.nextInt();
		System.out.println("Enter n2");
		int n2 = sc.nextInt();
		arithmetic obj= new arithmetic();
		obj.addition(n1, n2);
		obj.subtraction(n1, n2);
		obj.multiplication(n1, n2);
		obj.division(n1, n2);
		

	}

}
