package jan31;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 number");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		if(x==y) {
			if(x==z) {
				System.out.println("All three numbers are equal");
			}
			else {
				System.out.println("All three numbers are defferent");
			}
		}
		else {
			System.out.println("All three numbers are defferent");
		}
	}

}
