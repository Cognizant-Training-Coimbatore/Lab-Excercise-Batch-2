class test2
{
	void display()
	{
		System.out.println("Display without argument");
	}
	void display(int x)
	{
		System.out.println("New dispaly method");
	}
}
public class prog32_mthd_ovrldng {

	public static void main(String[] args)
	{
		test2 obj=new test2();
		obj.display();
		obj.display(5);
		// TODO Auto-generated method stub

	}

}
