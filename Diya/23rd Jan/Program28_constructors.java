class test1
{
	int a,b;
	void assign(int x,int y)
	{
		a=x;
		b=y;
	}
	test1()
	{
		a=10;
		b=30;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class Program28_constructors {

	public static void main(String[] args) {
		
     test1 obj = new test1();
     obj.display();

}
}
