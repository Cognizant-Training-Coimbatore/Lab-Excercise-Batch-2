class test
{
	int x=10;
	void assign(int p) //name of method is assign
	{
		x=p;
	}
	void display()
	{
		System.out.println(x);
		//System.out.println(p); //there will be error
	}
}
public class program26_define_class {

	public static void main(String[] args) 
	{
		test obj=new test();
		obj.assign(10);
		obj.display();

	}

}
