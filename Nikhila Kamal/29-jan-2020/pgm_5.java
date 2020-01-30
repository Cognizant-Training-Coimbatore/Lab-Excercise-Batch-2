class outerclass
{
	public void display()
	{
		System.out.println("outer class");
	}
	class innerclass
	{
		public void display()
		{
			System.out.println("inner class");
		}
	}
	}
public class pgm_5 {

	public static void main(String[] args) {
		outerclass obj=new outerclass();
		outerclass.innerclass ob=obj.new innerclass();
		obj.display();
		ob.display();

	}

}
