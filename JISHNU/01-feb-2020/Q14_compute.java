import java.util.Scanner;

public class Q14_compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x,y,n in xn%y");
		x=sc.nextInt();
		y=sc.nextInt();
		n=sc.nextInt();
		int res=(x*n);
		System.out.println(res%y);

	}

}
