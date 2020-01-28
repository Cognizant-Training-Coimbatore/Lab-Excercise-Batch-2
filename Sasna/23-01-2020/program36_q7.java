import java.util.Scanner;

class PrintSomething {
	
	void print_intChar(int n, char c) {
		System.out.println("the integer is :" + n);
		System.out.println("the char is :" + c);
	}
	
	void print_intChar(char c, int n) {
		System.out.println("the char is :" + c);
		System.out.println("the integer is :" + n);
	}
	
}


public class program36_q7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int y;
		char b;
		System.out.println("enter the integer");
		   Scanner sc = new Scanner(System.in);
		   y = sc.nextInt();
		   System.out.println("enter the charecter");
		   b = sc.next().charAt(0);
		
		PrintSomething obj1 = new PrintSomething();
		obj1.print_intChar(y,b);
		obj1.print_intChar(b,y);
	}

}
