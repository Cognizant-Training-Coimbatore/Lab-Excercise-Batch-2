package samplepackage;
class outer
{
	void display()
	{
		System.out.println("This is the outer class");
	}
	void displayInner()
	{
		inner obj = new inner();
		obj.display();
	}
	class inner
	{
		void display()
		{
			System.out.println("This is the inner class");
		}
	}
}
public class j29_q5_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        outer ob = new outer();
        ob.display();
        ob.displayInner();
	}

}
