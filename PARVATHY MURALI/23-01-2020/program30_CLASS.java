class test
{
	int x;//variable of test---scope---whole class test
	void assign(int p)// void means this method does not return a value
	{
		x=p;//argument of assign---scope--assign()
	}
	void display()
	{
		System.out.println(x);
		//System.out.println(p);//---p gives error as it is out of the scope--p scope only in assign
	}
}//new class definition
public class program30_CLASS 
{

	public static void main(String[] args) 
	{
		test ob=new test();
		ob.assign(10);
		ob.display();

	}

}
