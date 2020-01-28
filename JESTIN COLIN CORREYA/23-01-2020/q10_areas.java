package demo;

import java.util.Scanner;

class area1
{
	void areas(int a)
	{
		int c= a*a;
		System.out.println("area of square:"+c);
	}
	void areas(int b,int c)
	{
		int d=b*c;
		System.out.println("area of rectangle:"+d);
	}
}
public class q10_areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter side of square:");
		Scanner s=new Scanner(System.in);
				int x=s.nextInt();
area1 obj=new area1();
obj.areas(x);
System.out.print("enter length:");
int y=s.nextInt();
System.out.print("enter breadth:");
int z=s.nextInt();
area1 obj2=new area1();
obj.areas(y,z);
	}

}
