package project1;

class outer
{
	void display()
	{
		System.out.println("Inside outer class....");
	}
	class inner
	{
		void display1()
		{
			System.out.println("Inside inner class....");
		}
	}
	inner inn=new inner();
	//inn.display1();
}
public class pgmex5_innerouter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o=new outer();
		o.display();
	}

}
