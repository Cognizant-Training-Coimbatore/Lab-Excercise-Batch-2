
class Area1
{
	int a;
	int area(int a)
	{
		return a*a;
	}
	int area(int l,int b)
	{
		return l*b;
	}
}
public class prog37{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 obj=new Area1();
		System.out.println("Area of Square : "+obj.area(5));
		System.out.println("Area of Rectangle : "+obj.area(2,5));
		

	}

}
