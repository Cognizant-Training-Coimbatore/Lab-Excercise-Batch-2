import java.util.Scanner;

public class Q2_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c,d in the expresssion ((a*b-b*b)/(c-d))");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		d=sc.nextFloat();
		e=((a*b-b*b)/(c-d));
		System.out.println("Result ="+e);
	}

}
