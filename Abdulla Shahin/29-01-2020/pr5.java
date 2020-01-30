class outerClass
{
	public void display()
	{
		System.out.println("Outer");		
	}
	class innerClass
	{
		public void display()
		{
			System.out.println("Inner");
		}
	}
}
public class pr5 
{
	public static void main(String[] args)
	{
		outerClass obj=new outerClass();
		outerClass.innerClass obj1=obj.new innerClass();
		obj.display();
		obj1.display();

	}

}