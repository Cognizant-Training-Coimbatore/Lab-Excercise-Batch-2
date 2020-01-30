package Project;
class outer
{
	void display()
	{
		String name="Ali";
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
public class pgm29_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 outer obj=new outer();
		   outer.inner obj1=obj.new inner();
		   obj.display();
		   obj1.display1();
		   
	}

}

