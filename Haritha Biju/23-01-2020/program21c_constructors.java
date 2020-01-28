package demo;
class test1
{
	int a,b;
	void assign(int x, int y)
	{ 
		a=x;
		b=y;
	 
	}
	test1()		//user defined constructor
	{
		a=100;
		b=900;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class program21c_constructors {

	public static void main(String[] args) {
		test1 obj= new test1();
	//	obj.assign(10, 10);
		obj.display();
	}

}
