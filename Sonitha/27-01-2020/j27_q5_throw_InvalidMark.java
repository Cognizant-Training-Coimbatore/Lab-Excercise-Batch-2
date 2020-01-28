import java.util.Scanner;

public abstract class j27_q5_throw_InvalidMark {
 static void display(int m) {
	 if(m>0 & m<100) {
		 System.out.println("Valid mark");
	 }else
	 {
		 throw new ArithmeticException("Invalid mark");
	 }
	 
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark = sc.nextInt();
		display(mark);

	}

}
