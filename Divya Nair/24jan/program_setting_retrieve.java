class instantiate
{
	static int i=5;
	static void menu()
	{
		System.out.println("This is a static method");
		System.out.println(i);
	}
}
public class program_setting_retrieve {

	public static void main(String[] args)
	{
		instantiate obj=new instantiate();
		obj.menu();

	}

}
