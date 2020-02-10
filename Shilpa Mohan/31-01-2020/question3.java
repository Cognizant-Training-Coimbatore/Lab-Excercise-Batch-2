package jan31;

import java.util.Scanner;

public class question3 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int s = 0;
	double area = 0;

	System.out.println("enter the length of side, s: ");
	s = sc.nextInt();
	area = (6*s*s)/(4*(1/1.73));
	System.out.println("area of hexagon is " +area);
}

}
