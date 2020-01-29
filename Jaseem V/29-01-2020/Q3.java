package exercise;
interface x
{
	void display1();
}
interface y
{
	void display2();
}
class b1 implements x,y
{
	public void display1()
	{
		System.out.println("from x");
	}
	public void display2() 
	{
		System.out.println("from y");
	}
}
public class Q3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
x obj=new b1();
obj.display1();
y obj1=new b1();
obj1.display2();
	}

}