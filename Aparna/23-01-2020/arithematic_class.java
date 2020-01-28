import java.util.Scanner;

class arithematic67
{
	int a,b;
	void arith()
	{
		System.out.println("Enter a: ");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("Enter b: ");
		Scanner scanner1=new Scanner(System.in);
		b=scanner1.nextInt();
		int sum=a+b;
		System.out.println("sum: " +sum);
		int mult = a*b;
		System.out.println("multiplication: "+mult);
		int sub=a-b;
		System.out.println("substraction: "+sub);
		float div=(float) a/b;
		System.out.println("Division: "+div);
		
	}
}
public class arithematic_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithematic67 obj =new arithematic67();
		obj.arith();

	}

}
