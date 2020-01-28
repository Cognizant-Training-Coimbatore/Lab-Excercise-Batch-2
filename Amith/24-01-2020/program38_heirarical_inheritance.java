class x1
{
	int a=2;
}
class x2 extends x1
{
	int b=12;
	void display()
	{
		System.out.println(a+b);
	}
}
class x3 extends x1
{
	int c=87;
	void display()
	{
		System.out.println(a+c);
	}
}
class x4 extends x1
{
	int d=20;
	void display()
	{
		System.out.println(a+d);
	}
}
public class program38_heirarical_inheritance {

	public static void main(String[] args)
	{
		x2 obj1 = new x2();
		obj1.display();
		x3 obj2 = new x3();
		obj2.display();
		x4 obj3 = new x4();
		obj3.display();
		

	}

}
