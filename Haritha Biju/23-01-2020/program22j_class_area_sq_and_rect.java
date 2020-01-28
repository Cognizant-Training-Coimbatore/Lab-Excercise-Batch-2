package demo;

import java.util.Scanner;

/*Create a class to print the area of a square and a rectangle. 
 * The class has two methods with the same name but different number of parameters. 
 * The method for printing area of rectangle has two parameters which are length and breadth 
 * respetively while the other method for printing area of square has one parameter which is
 *  side of square.
 */

class findArea
{
	void Area(double s)
	{
		System.out.println("The area of square is "+s*s+" sq.cm ");
	}
	void Area(double l,double b)
	{
		System.out.println("The area of rectangle is "+l*b+" sq.cm ");
	}
}
public class program22j_class_area_sq_and_rect 
{
	public static void main(String[] args)
	{
		findArea ob1=new findArea();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square");
		double a=sc.nextDouble();
		ob1.Area(a);
		System.out.println("Enter the length and breadth of the rectangle");
		double l,b;
		l=sc.nextDouble();
		b=sc.nextDouble();
		ob1.Area(l, b);
	}
}
