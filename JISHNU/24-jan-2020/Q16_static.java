package day3;
class Aa1
{
	static int i;
	static int b;
	void display()
	{
		i++;
		System.out.println(i);
	}
	static int print()
	{
		b=b+2;
		return b;
	}
}
public class Q16_static 
{

	public static void main(String[] args) 
	{
		Aa1 obj1=new Aa1();
		Aa1 obj2=new Aa1();
		obj1.display();
		obj2.display();
		int a=Aa1.print();
		int b=Aa1.print();
		System.out.println(a);
		System.out.println(b);
	}
}
