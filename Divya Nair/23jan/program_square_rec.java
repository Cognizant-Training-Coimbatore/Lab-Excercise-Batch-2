class area2
{
	int side,length,breadth;
	void display(int s)
	{
		side=s;
		System.out.println(side);
		
	}
	void display(int l,int b)
	{
		length=l;
		breadth=b;
		System.out.println(length);
		System.out.println(breadth);
	}
	void disarea()
	{
		System.out.println("Area of the square is"+(side*side));
		System.out.println("Area of rectangle is"+(length*breadth));
	}
}
public class program_square_rec {

	public static void main(String[] args)
	{
		area2 obj=new area2();
		obj.display(100);
		obj.display(50,25);
		obj.disarea();
		

	}

}
