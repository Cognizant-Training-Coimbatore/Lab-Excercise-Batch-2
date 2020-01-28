package demo;

import java.util.Scanner;

class Area
{
	int return_area(int l ,int b )
	{
		int a=l*b;
		return a;
	}

}
public class Question_3 
   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Length And Breadth of the rectangle");
		Area area= new Area();
		Scanner scan=new Scanner (System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.println("Area of the rectangle is  "+area.return_area(x,y));
		
	}

}
