class test
{
	int x;
	void assign(int p)
	{
		x=p;
	}
	void display()
	{
		System.out.println(x);
	}
}
public class program28_define_class {

	public static void main(String[] args)
	{
		test obj= new test();
		obj.assign(10);
		obj.display();
		
	}

}
