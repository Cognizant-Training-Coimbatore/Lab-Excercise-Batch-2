class area2
{
	int a;
	void area1(int s)
	{
		
		a=s*s;
		System.out.println("Area of the square: "+a);
	}
	void area1(int l , int b)
	{
		a=l*b;
		System.out.println("Area of the rectangle: "+a);
	}
}
public class example20_Q10 
{

	public static void main(String[] args) 
	{
		area2 obj = new area2();
		obj.area1(4);
		obj.area1(2,3);

	}

}
