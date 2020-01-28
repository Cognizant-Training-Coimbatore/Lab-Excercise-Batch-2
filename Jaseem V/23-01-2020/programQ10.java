class area
{
	 public static area obj1;
	area(int x)
	{
		System.out.println("Area of Square is :"+x*x);
	}
	 area(int a,int b)
	 {
		 System.out.println("Area of rectangle is :"+a*b);
	 }
}
public class programQ10 {

	public static void main(String[] args)
	{
		area obj1=new area(5);
		area obj2 = new area(3,4);

	}

}
