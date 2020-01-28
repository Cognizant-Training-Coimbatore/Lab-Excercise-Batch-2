package demo;
class t11
{
	int a=5;
}
class t12 extends t11
{
	int b=5;
	void display()
	{
		System.out.println(a+b);
	}
}
class t13 extends t12
{
	int c=3;
	void display()
	{
		System.out.println(c+b);
	}
}
class t14 extends t11
{
	int d=7;
	void display()
	{
		System.out.println(d+a);
	}
	
}
public class program19_hiearchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
t12 obj=new t12();
obj.display();
t13 obj2=new t13();
obj2.display();
t14 obj3=new t14();
obj3.display();

}

}
