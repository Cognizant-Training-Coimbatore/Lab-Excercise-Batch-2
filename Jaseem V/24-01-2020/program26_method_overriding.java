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
		System.out.println("javaclassB is running ");
	}
}
public class program26_method_overriding {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		javaclassB obj=new javaclassB();
		obj.display();
	}

}
