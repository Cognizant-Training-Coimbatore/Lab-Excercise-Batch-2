import java.util.Scanner;

public class sqr_test07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a-->");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Enter b-->");
		int b=sc.nextInt();
		int sqrt = a*a+2*b*a+b*b; //Math.pow((a+b),2)
		System.out.print("Square-->"+sqrt);		
		sc.close();
		
	}


}
