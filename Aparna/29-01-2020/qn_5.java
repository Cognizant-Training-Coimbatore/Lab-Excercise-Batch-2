package set_7;

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
	public class qn_5 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	        outer ob = new outer();
	        ob.display();
	        ob.displayInner();
	}

}
