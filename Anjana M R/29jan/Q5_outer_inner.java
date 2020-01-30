class outer
{
	void display()
	{
		String name="Alia";
		System.out.println("Name  :"+name);
	}
	class inner
	{
		void display1()
		{
			String place="Ernakulam";
			System.out.println("Place  :"+place);
		}
	}
}
public class Q5_outer_inner {

	public static void main(String[] args) {
   outer obj=new outer();
   outer.inner obj1=obj.new inner();
   obj.display();
   obj1.display1();
   
	}

}
