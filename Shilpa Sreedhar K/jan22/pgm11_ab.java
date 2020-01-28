import java.util.Scanner;

public class pgm11_ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,res;
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter the value of a : ");
		  a = s.nextInt();
		  System.out.print("Enter the value of b: ");
		  b = s.nextInt();
		  sum= a+b;
		  res=sum*sum;
		  System.out.print("result is " +res);
	}

}
