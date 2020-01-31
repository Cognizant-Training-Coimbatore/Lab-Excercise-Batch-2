class test
{
	int x=10;
	void assign(int p)
	{
		x = p; // p is the argument and is available inside the method assign only.
	}
	void display()
	{
		System.out.println(x);
		
	}
}
public class program15_define_class 
{

	public static void main(String[] args) 
	{
		test obj =new test();//creating object
		obj.assign(10);
		obj.display();

	}

}
