package jan29;

class xyz
{
	void display()
	{
		System.out.println("Outer class function");
	}
	class xyz1
	{
		void dispaly()
		{
			System.out.println("inner class function");
		}
	}
}

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj1=new outer();
		outer.xyz1 obj2=new xyz().new xyz1();
		obj1.display();
		obj2.dispaly();

	}

}