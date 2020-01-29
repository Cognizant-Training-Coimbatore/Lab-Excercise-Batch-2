package demo;

import java.util.Scanner;

class area{
	int x, y,z;
	void assign() {
		System.out.println("enter length");
		Scanner a=new Scanner(System.in);
		x=a. nextInt();
		System.out.println("enter breadth");
		Scanner b=new Scanner(System.in);
		y=b.nextInt();
		
	}
	
	int returnArea() {
		
		z=x*y;
		//System.out.println(z);
		return z;
		
	}
}
public class area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj=new area();
		obj.assign();
		obj.returnArea();
		System.out.println("area="+obj.returnArea());

	}

}
