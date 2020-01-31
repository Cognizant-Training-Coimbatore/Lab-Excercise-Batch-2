class a1
{
	int x=10;
}
class b1 extends a1
{
	int x=100;// sub class overwriting the property of super class.
	void display()
	{
		System.out.println(super.x);// for printing the value of the super class use the keyword super.
	}
}
public class program25_super_keyword 
{

	public static void main(String[] args) 
	{
		b1 obj = new b1();
		obj.display();

	}

}
