package demo;

class overloading
{
	void display(int a,char c)
	{
		System.out.println("The integer and charachter are : "+a+" and "+c);
	}
	void display(char c,int a)
	{
		System.out.println("The charachter and  integer are : "+c+" and "+a);
	}
}

public class program22i_class_funcyion_overloading
{

	public static void main(String[] args)
	{
		overloading ob=new overloading();
		ob.display(1,'s');
		ob.display('s', 2);

	}

}
