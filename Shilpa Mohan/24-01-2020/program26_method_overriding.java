class javaclassA
{
	void display()
	{
		System.out.println("JavaClassA is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("JavaClassB is running");
	}
}
public class program26_method_overriding {

	public static void main(String[] args)
	{
	javaclassB obj = new javaclassB();
	obj.display();
	}

}
