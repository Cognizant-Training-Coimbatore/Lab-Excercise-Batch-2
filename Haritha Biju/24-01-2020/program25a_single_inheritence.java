package demo;

class a2
{
	int x=5;
}

class b extends a2 //single inheritence
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}

public class program25a_single_inheritence
{

	public static void main(String[] args) 
	{
		b ob1=new b();
		ob1.display();

	}

}
