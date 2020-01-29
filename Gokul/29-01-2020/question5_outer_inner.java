class outer
{
	void display()
	{
		System.out.println("Display outer");
	}
	class inner
	{
		void display()
		{
			System.out.println("Display inner");
		}
	}
}
public class question5_outer_inner {

	public static void main(String[] args) {
		outer o=new outer();
		outer.inner i=o.new inner();
		o.display();
		i.display();
	}

}
