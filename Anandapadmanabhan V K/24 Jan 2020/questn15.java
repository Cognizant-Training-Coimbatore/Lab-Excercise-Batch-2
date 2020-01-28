class shape
{
	void display1()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void display2()
	{
		System.out.println("This is rectangular shape");
	}
}
class circle extends shape
{
	void display()
	{
		System.out.println("This is circular shape");
	}
}
class square1 extends rectangle
{
	void display()
	{
		System.out.println("Square is rectangle");
	}
}
public class questn15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square1 obj=new square1();
		obj.display1();
		obj.display();
		obj.display2();
	}

}
