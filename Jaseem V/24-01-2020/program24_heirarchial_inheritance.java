class x1
{
	int a=2;
}
class x2 extends x1
{
	int b =3;
	void display()
	{
		System.out.println(a+b);
	}
}
class x3 extends x1
{
	int c =5;
	void display()
	{
		System.out.println(a+c);
	}

}
class x4 extends x1
{
	int d=7;
	void display()
	{
		System.out.println(a+d);
	}
}

public class program24_heirarchial_inheritance {

	public static void main(String[] args)
	{
		
		x2 obj =new x2();
		obj.display();
		x3 obj1 = new x3();
		obj1.display();
		x4 obj2 =new x4();
		obj2.display();
	}

}
