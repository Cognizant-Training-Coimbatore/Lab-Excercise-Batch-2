package jan31;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		double area = (6 * s*s ) / (4*Math.tan(Math.PI/6));
		System.out.println("Area of hexagon is : "+area);
	}

}
