class ts
{
	void display1() {
		System.out.println("this is parent class");
	}
}
class ts2 extends ts
{
	void display2()
	{
		System.out.println("this is child class");
	}
}
public class qu12 {

	public static void main(String[] args)
	{
		ts obj1 = new ts();
		ts2 obj2 = new ts2();
		obj1.display1();
		obj2.display2();
		obj2.display1();

	}

}
