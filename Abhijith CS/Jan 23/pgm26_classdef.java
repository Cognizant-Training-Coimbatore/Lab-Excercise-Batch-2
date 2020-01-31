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
public class pgm26_classdef {

	public static void main(String[] args) 
	{
		test ts = new test();
		ts.assign(7);
		ts.display();
	}

}
