class test2
{
	void display()
	{
		System.out.println("display mtd without argument");
	}
	void display(int x)
	{
		System.out.println("new display");
	}
}
public class pgm24_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.display();
		obj.display(5);

	}

}
