package gokul;

import java.util.Scanner;

class area
{
	int are(int b,int l)
	{
		int length=l;
		int breadth=b;
		int area=l*b;
		return area;
	}
}
public class Program34_area_rectangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the length of the rectangle ");
		int len=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle ");
		int bre=sc.nextInt();
		
	area a=new area();
	int c=a.are(bre, len);
	System.out.println("The area of the rectangle is : "+c);
	
	

	}

}
