class outer
{
	void display()
	{
		System.out.println("outer");
	}
	class inner
	{
		void display()
		{
			System.out.println("inner");
		}
	}
}
public class exercise29_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj = new outer();
		obj.display();
		inner obj1 = new inner();
	}

}
