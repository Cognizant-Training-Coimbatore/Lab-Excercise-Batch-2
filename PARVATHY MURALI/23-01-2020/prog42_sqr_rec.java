
class sqr_rec
{
	void area(int x)
	{
		System.out.println("Area of square: "+(x*x));
	}
	void area(int l, int b)
	{
		System.out.println("Area of rectangle "+(l*b));
	}
}
public class prog42_sqr_rec 
{

	public static void main(String[] args)
	{
		sqr_rec ob=new sqr_rec();
		ob.area(3);
		ob.area(7,3);
		
		

	}

}
