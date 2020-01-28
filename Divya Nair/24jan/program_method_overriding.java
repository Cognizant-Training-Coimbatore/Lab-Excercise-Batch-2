class javaA
{
	void display()
	{
		System.out.println("JavaclassA is running");
	}
}
class javaclassB extends javaA
{
	void display()
	{

		System.out.println("JavaclassB is running");
	}
}
public class program_method_overriding {

	public static void main(String[] args) 
	{
		javaA obj=new javaA();
		obj.display();

	}

}
