class t1
{
	int x=5;
}
class t2 extends t1
{
	int y=3;
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class t3 extends t2
{
	int z=x+y;
	void display1()
	{
		System.out.println(z);
	}
	
}
public class program47_multilevel_inheritance {

	public static void main(String[] args) {
		t3 obj=new t3();
		obj.display();
		obj.display1();
	}

}
