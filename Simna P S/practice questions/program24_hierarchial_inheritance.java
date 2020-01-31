class x1
{
	int a=3;
}
class x2 extends x1
{
	int b=5;
	void display() 
	{
		System.out.println(a+b);
		
	}
}
class x3 extends x1
{
	int c = 10;
	void display() 
	{
		System.out.println(a+c);
		
	}
}
class x4 extends x1
{
	int d = 100;
	void display() 
	{
		System.out.println(a+d);
		
	}
}
public class program24_hierarchial_inheritance 
{

	public static void main(String[] args) 
	{
		x2 obj1 = new x2();
		x3 obj2 = new x3();
		x4 obj3 = new x4();
		obj1.display();
		obj2.display();
		obj3.display();
		

	}

}
