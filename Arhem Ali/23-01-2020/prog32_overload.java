class test2
{
	void display()
	{
		System.out.println("display without argument");
	}
	void display(int x)
	{
		System.out.println(x);
	}
}
public class prog32_overload {

	public static void main(String[] args) {
		test2 obj=new test2();
		obj.display();
		obj.display(5);
		

	}

}
