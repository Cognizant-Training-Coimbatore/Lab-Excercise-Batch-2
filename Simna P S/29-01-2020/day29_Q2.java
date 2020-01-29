interface A
{
	void meth1();
	void meth2();
	
}
class Myclass implements A
{
	public void meth1()
	{
		int length=10;
		int breadth=10;
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
		meth2(length,breadth);
		
	}
	
	public void meth2(int a, int b)
	{
		int area=a*b;
		System.out.println("Area="+area);
	}
	
	
}
public class day29_Q2
{

	public static void main(String[] args) 
	{
		Myclass c=new Myclass();
		c.meth1();

	}

}
