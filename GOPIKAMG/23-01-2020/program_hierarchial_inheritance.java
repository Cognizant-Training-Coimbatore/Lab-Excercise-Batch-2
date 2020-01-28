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
public class program_hierarchial_inheritance {

	public static void main(String[] args) 
	{
		x2 obj2=new x2();
		obj2.display();
		x3 obj3=new x3();
		obj3.display();
		x4 obj4=new x4();
		obj4.display();

	}

}
