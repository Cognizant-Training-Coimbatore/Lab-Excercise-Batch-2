class outer
{
	void display()
	{
		System.out.println("This is Outer Class");
	}
	class inner 
	{
		void display()
		{
			System.out.println("This is Inner Class");
		}
	}
}

public class question5 {

	public static void main(String[] args)
	{
		outer  obj = new outer();
		outer.inner obj1 = obj.new inner();
		obj.display();
		obj1.display();
	}

}
