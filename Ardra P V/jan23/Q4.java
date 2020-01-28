import java.util.Scanner;

class operation{
	int a;
	int b;
	void assign() {
		int x,y;
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		System.out.println("Enter a number");
		y=scanner.nextInt();
		a=x;
		b=y;	
	}
	int addition() {
		return a+b;
	}
	int subtraction() {
		return a-b;
	}
	int multiplication() {
		return a*b;
	}
	int division() {
		return a/b;
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation op=new operation();
		op.assign();
		op.addition();
		op.subtraction();
		op.multiplication();
		op.division();
		System.out.println("Addition of two number : " +op.addition());
		System.out.println("Subtraction of two number : " +op.subtraction());
		System.out.println("Multiplication of two number : " +op.multiplication());
		System.out.println("Division of two number : " +op.division());

	}

}
