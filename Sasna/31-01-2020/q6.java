import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println(1);		
		}else {
			System.out.println(0);
		}
	}

}
