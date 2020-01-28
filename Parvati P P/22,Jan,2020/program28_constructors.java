class test1
{
	int a,b;
	void assign(int x,int y)
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
public class program28_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj=new test1();
		obj.assign(10, 10);
		obj.display();

	}

}
