import java.util.Scanner;

public class program_11 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=Math.pow((a+b),2);
		System.out.println("Result=" +c);
	}

}
