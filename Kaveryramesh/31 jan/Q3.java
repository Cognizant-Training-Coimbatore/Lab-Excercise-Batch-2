package practical_excercise;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter length of side");
         Scanner s=new Scanner(System.in);
         float side=s.nextFloat();
         double Area=(6*(side*side))/(4*(Math.tan(Math.PI/6)));
         System.out.println("Area is"+Area);
         
	}

	
	

}
