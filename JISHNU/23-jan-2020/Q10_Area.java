package Jishnu;
class Area1
{
	void area(int a, int b)
	{
		int area=a*b;
		System.out.println("Area of rectangle ="+area);
	}
	void area(int a)
	{
		int area=a*a;
		System.out.println("Area of sqaure="+area);
	}
}
public class Q10_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 obj=new Area1();
		obj.area(12);
		obj.area(12, 13);
	}

}
