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
public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass obj=new outerClass();
		outerClass.innerClass obj1=obj.new innerClass();
		obj.display();
		obj1.display();

	}

}