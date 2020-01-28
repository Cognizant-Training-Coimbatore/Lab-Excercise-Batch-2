class javaclassA
{
	void display()
	{
		System.out.println("java a is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("java b is running");
	}
}
public class program40_method_overriding {

	public static void main(String[] args)
	{
		javaclassB obj = new javaclassB();
		obj.display();
	}

}
