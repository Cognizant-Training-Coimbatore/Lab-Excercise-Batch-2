class test1
{
	int a,b;
	test1(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class pgm28_constructor {

	public static void main(String[] args) 
	{
		test1 ts = new test1(10,20);
		ts.display();
	}

}
