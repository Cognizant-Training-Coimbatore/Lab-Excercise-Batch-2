class test1
{
	int a,b;
	/*void assign(int x, int y)
	{
		a=x;
		b=y;
		
	}*/
	test1()
	{
		a=10;
		b=10;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class program32_constructors 
{

	public static void main(String[] args) 
	{
		test1 ob=new test1();
		//ob.assign(10,10);
		ob.display();
		

	}

}
