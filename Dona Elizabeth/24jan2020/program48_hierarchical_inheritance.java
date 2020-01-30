class a1
{
	int n=2;
	
}
class a2 extends a1
{
	int m=3;
	void display()
	{
		System.out.println(n+m);
	}
}
class a3 extends a1
{
	int m=5;
	void display()
	{
		System.out.println(n+m);
	}
}
class a4 extends a1
{
	int s=10;
	void display()
	{
		System.out.println(n+s);
	}
}

public class program48_hierarchical_inheritance {

	public static void main(String[] args) {
		a2 obj=new a2();
		obj.display();
		a3 obj1=new a3();
		obj1.display();
		a4 obj2=new a4();
		obj2.display();
	}

}
