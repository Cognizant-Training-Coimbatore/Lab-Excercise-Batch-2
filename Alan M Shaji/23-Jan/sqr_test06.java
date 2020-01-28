import java.util.Scanner;
import java.lang.Math;
public class sqr_test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a-->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double sqrt = Math.pow(a,2);
		System.out.print("Square-->"+sqrt);		
		sc.close();
	}

}
