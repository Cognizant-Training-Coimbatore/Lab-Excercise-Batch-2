package jan31;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 digit number");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		if(y>x) {
			if(z>y) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		}
		else {
			System.out.println("false");
		}

	}

}
