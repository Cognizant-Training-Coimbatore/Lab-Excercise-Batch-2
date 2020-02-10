package practical_exercises;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double s ,area=0;
		System.out.println("enter length of side of hexagon");
		Scanner scanner= new Scanner(System.in);
		s=scanner.nextDouble();
		area=(6*s*s)/(4*(Math.tan(Math.PI/6)));
		System.out.println("area of hexagon: " +area);

	}

}
