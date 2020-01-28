package demo;

class b1
{
	int a=2;
	void display()
	{
		System.out.println(a);
	}
	
}
class b2 extends b1
{
	int b=3;
	void display()
	{
		System.out.println(a+b);
		
	}
}
class b3 extends b1 //Hierarchical inheritence
{	
	int c=4;
	void display()
	{
		System.out.println(a+c);
	}
	
}


public class program25c_heirarchical_inheritence
{

	public static void main(String[] args)
	{
		b1 ob1=new b1();
		b2 ob2=new b2();
		b3 ob3=new b3();
		ob1.display();
		ob2.display();
		ob3.display();
	
	}
}
