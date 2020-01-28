import java.util.Scanner;

public class pgm7_area_of_circle {

	public static void main(String[] args) 
	{
		double r,a;
		double pie=3.14;
		System.out.println("enter the radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		a=pie*r*r;
		System.out.println("the area of circle is " + a);
	}

}
