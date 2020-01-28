package Jishnu;

import java.util.Scanner;

class Area
{
	int returnArea(int a, int b)
	{
		int area=a*b;
		return area;
	}
}
public class Q3_area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
		Area obj=new Area();
		area=obj.returnArea(length, breadth);
		System.out.println("Area="+area);
		
	}

}
