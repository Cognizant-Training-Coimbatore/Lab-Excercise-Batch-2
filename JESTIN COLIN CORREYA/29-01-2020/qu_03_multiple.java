package other;
interface a1
{
	void display1();
}
interface a2
{
	void display2();
}
class b1 implements a1,a2
{
	public void display1()
	{
		System.out.println("from a1");
	}
	public void display2() 
	{
		System.out.println("from a2");
	}
}
public class qu_03_multiple {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
a1 obj=new b1();
obj.display1();
a2 obj1=new b1();
obj1.display2();
	}

}
