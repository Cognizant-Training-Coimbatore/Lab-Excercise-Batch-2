import java.util.Scanner;

public class program_7 {

	public static void main(String[] args) {
		double pie=3.14;
		double r,a;
		System.out.println("Enter radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		a=(pie*(r*r));
		System.out.println("Area="+a);
		
	}

}
