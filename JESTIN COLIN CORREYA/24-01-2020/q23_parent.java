package demo;
class a10
{
	void display1()
	{
		System.out.println("this is parent class");
	}
	
}
class b10 extends a10
{
	void display2()
	{
		System.out.println("this is child class");
	}
}
public class q23_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a10 obj1=new a10();
b10 obj2=new b10();
obj1.display1();
obj2.display2();
obj2.display1();
	}

}
