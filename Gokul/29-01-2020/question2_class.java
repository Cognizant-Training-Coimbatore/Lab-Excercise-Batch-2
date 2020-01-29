interface A
{
	void method1();
	void method2();
	
}
class Myclass implements A
{
	public void method1()
	{
		int length=10;
		int breadth=10;
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
		method2(length,breadth);
		
	}
	
	public void method2(int a, int b)
	{
		int area=a*b;
		System.out.println("Area="+area);
	}
	
	
}
public class question2_class {

	public static void main(String[] args) 
	{
		Myclass c=new Myclass();
		c.method1();
	}

}
