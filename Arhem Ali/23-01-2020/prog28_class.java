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
public class prog28_class 
{

	public static void main(String[] args) 
	{
		test obj= new test();
		obj.assign(10);
		obj.display();
		obj.assign(20);
		obj.display();

	}

}
