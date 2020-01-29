package javasersion8;
class outer
{
	void display()
	{
		System.out.println("Outer class function");
	}
	class inner
	{
		void dispaly()
		{
			System.out.println("inner class function");
		}
	}
}

public class Q5_inner_and_outer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj1=new outer();
		outer.inner obj2=new outer().new inner();
		obj1.display();
		obj2.dispaly();

	}

}
