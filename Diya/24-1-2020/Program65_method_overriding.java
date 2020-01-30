class javaclassA
{
	void display()
	{
		System.out.println("javaclassA is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("javaclassB is running");
	}
}
public class Program65_method_overriding {

	public static void main(String[] args) {
		javaclassB obj = new javaclassB();
		obj.display();

	}

}
