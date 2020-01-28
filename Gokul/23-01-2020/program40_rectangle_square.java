package gokul;

import java.util.Scanner;

class area3
{
	void rectangle(int c, int d)
	{
		int length=c;
		int breadth=d;
		int area=length*breadth;
		System.out.println("Area of the rectagle is : "+area);
	}
	void square(int a)
	{
		int side=a;
		int area=side*side;
		System.out.println("Area of the square is : "+area);
	}
}
public class program40_rectangle_square {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int b=sc.nextInt();
		System.out.println("Enter the side of the square");
		int side=sc.nextInt();
		area3 a=new area3();
		a.rectangle(l, b);
		a.square(side);
	}

}
