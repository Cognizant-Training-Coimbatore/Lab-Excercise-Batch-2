import java.util.Scanner;

class calculation {
 double addition(double a, double b){
		return a+b;
	}
 double subtraction(double a,double b) {
	 return a-b;
 }
 double multiplication(double a, double b) {
	 return a*b;
 }
 double division(double a, double b) {
	 return a/b;
 }
}
public class program33_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,z,m,n,q;
		System.out.println("enter the first number");
		   Scanner sc = new Scanner(System.in);
		   x = sc.nextInt();
		   System.out.println("enter the second number");
		   y = sc.nextInt();
		   
		   calculation obj = new calculation();
		   System.out.println("The result of addition is"+ obj.addition(x,y));
		   System.out.println("The result of subtraction is"+ obj.subtraction(x,y));
		   System.out.println("The result of multiplication is"+obj.multiplication(x,y));
		   System.out.println("The result of division is"+ obj.division(x, y));	   
	}

}
