package Exercise;

class outer{
	void display()
	{
		System.out.println("outer");
	}
	class inner{
		
		void display()
		{
			System.out.println("inner");
		}
	}
}

public class Interface_Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer obj1 = new outer();
		obj1.display();
		outer.inner obj2 = obj1.new inner();
		obj2.display();
	}

}
