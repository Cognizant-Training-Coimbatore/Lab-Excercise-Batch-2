class p
{
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class C extends p
{
	void display2()
	{
		System.out.println("This is child class");
	}
}
public class Program60 {

	public static void main(String[] args) {
		p obj1 = new p();
		obj1.display1();
		C obj2 = new C();
		obj2.display2();
		C obj3 = new C();
		obj3.display1();

	}

}
