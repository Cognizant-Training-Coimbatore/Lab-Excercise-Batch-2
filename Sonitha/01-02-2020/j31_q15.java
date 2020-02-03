import java.util.Scanner;

public class j31_q15 {

	static double area(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		return Math.abs((x1*(y2-y3))+(x2*(y1-y3))+(x3*(y1-y2)));
		
	}
	static void isInside(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
		double area,area1,area2,area3;
		area = area(x1,y1,x2,y2,x3,y3);
		area1 = area(x3,y3,x2,y2,x4,y4);
		area2 = area(x1,y1,x2,y2,x4,y4);
		area3 = area(x1,y1,x3,y3,x4,y4);
		if(area ==(area1+area2 +area3))
		{
			System.out.println("The given point lies inside the triangle");
		}
		else
			{
			System.out.println("The given point doesnot lie inside the triangle");
			}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coordinates of the point that is to be checked ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the three points in the triangle");
		int x1 =sc.nextInt();
		int y1 = sc.nextInt();
		int x2 =sc.nextInt();
		int y2 = sc.nextInt();
		int x3 =sc.nextInt();
		int y3 = sc.nextInt();
		isInside(x1, y1, x2, y2, x3, y3, a, b);
	}

}
