package jan31;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		if(x%4==0) {
			System.out.println(x+" is power of 4");
		}
		else {
			System.out.println(x+" is not power of 4");
		}

	}

}
