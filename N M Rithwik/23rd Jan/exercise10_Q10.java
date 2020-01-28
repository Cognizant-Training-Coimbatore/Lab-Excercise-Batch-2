class area2
{
	void area(int a, int b)
	{
		System.out.println("Area of rectangle = " + a*b);
	}
	void area(int s)
	{
		System.out.println("Area of square = " + s*s);
	}
}
public class exercise10_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area2 obj = new area2();
		obj.area(8);
		obj.area(5, 7);
	}

}
