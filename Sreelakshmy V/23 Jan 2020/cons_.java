class test1
{
	int a,b;
	test1()
	{
		a=10;
		b=30;
	}
	void display() {
	System.out.println(a);
	System.out.println(b);
	}
}
public class cons_ 
{

	public static void main(String[] args) 
	{
		test1 ob=new test1();
		ob.display();
	}

}