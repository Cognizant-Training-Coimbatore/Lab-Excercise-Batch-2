/*3.	Write a Java program to compute the area of a hexagon. 
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
*/
package packone;

import java.util.Scanner;

public class p3_31_arrea_hexagon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of sides of hexagon: ");
		float s=sc.nextFloat();
		System.out.println("Area of hexagon= "+(6 * Math.pow(s, 2))/(4*Math.tan(Math.PI/6)));

	}

}
