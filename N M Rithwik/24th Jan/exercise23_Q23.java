class a6
{
	void display1()
	{
		System.out.println("This is the parent class 'a'..");
	}
}
class b6 extends a6
{
	void display2()
	{
		System.out.println("This is the child class 'b'..");
	}
}
class c6 extends a6
{
	void display3()
	{
		System.out.println("This is the child class 'c'..");
	}
}
public class exercise23_Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a6 obj1 = new a6();
		b6 obj2 = new b6();
		c6 obj3 = new c6();
		obj1.display1();
		obj2.display2();
		obj3.display3();
		obj3.display1();
	}

}
