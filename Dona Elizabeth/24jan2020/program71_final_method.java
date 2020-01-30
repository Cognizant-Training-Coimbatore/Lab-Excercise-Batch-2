class one
{
	final void display()
	{
		System.out.println("Parent class");
	}
}
class two extends one
{
	void display() // here the error is showing as the method having final keyword cannot be overrrided
	{
		System.out.println("subclass");
	}
}
public class program71_final_method {

	public static void main(String[] args) {
		two obj=new two();
		obj.display();
	}

}
