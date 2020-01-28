package demo;
class c1
{
	int a=2;
	void display()
	{
		System.out.println(a);
	}
	
}
class c2 extends c1
{
	int b=3;
	void display()
	{
		System.out.println(a+b);
		
	}
}
class c3 extends c2 //multilevel inheritence
{	
	int c=4;
	void display()
	{
		System.out.println(a+b+c);
	}
	
}
public class program25b_multilevel_inheritence 
{

	public static void main(String[] args)
	{
		c1 ob1=new c1();
		c2 ob2=new c2();
		c3 ob3=new c3();
		ob1.display();
		ob2.display();
		ob3.display();
	}

}
