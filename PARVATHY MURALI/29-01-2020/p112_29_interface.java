interface myinterface
{
	void add();
	int findgreatest(int x,int y);
	int x=5;//any method or variable declared in interface is static and final
	default void display()
	{
		System.out.println("by using default we can define method in interface...else eror is displayed");
	}
}
class classinterface implements myinterface
{
	//x=40;error-----x is final
	int y=6;
	public void add()
	{
		int z=x+y;
		System.out.println("Sum="+z);
	}
	public int findgreatest(int x,int y)
	{
		if(x<y)
		{
			System.out.println("greatest="+y);
		}
		else
		{
			System.out.println("greatest="+x);
		}
		return y;
	}
}
public class p112_29_interface {

	public static void main(String[] args) 
	{
		classinterface ob=new classinterface();
		ob.add();
		//ob.findgreatest(x, y);
		ob.display();
	}

}
