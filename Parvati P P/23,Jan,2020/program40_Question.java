
class AreaNew
{
	int length,breadth,area;
	public void Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
		area=length*breadth;
		System.out.println("Area is: "+area);
	}
	public void Square(int p)
	{
		length=p;
		area=length*length;
		System.out.println("Area is: "+area);
	}
	
}
public class program40_Question {

	public static void main(String[] args) {
		AreaNew ar=new AreaNew();
		ar.Rectangle(2,5);
		ar.Square(3);
	}}


