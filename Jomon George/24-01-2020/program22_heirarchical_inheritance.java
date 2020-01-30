package demo;
class x1
{
	int a=2;
}
class x2 extends x1
{
	int b=3;
	void display()
	{
		System.out.println(a+b);
	}
}
class x3 extends x1
{
	int c=4;
	void display()
	{
		System.out.println(a+c);
	}
}
class x4 extends x1
{
	int d=5;
	void display()
	{
		System.out.println(a+d);
	}
}
public class program22_heirarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x2 obj1 = new x2();
		obj1.display();
		x3 obj2 = new x3();
		obj2.display();
		x4 obj3 = new x4();
		obj3.display();

	}

}
