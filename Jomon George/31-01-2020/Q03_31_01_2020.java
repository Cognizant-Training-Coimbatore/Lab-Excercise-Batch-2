package Exercise;

import java.util.Scanner;

public class Q03_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Heaxagon side length : ");
		int side = scanner.nextInt();
		double area = (6 * Math.pow(side,2))/(4* (0.57735026919));
		System.out.println(area);
	}

}
