class sample5
{
	void display() {
		System.out.println("nesting of methods");
	}
	void display2()
	{
		display();
	}
}
public class nestofmethods {

	public static void main(String[] args)
	{
		sample5 obj = new sample5();
		obj.display2();
	}

}
