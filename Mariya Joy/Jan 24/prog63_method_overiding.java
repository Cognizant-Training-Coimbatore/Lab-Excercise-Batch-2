class javaclassA
{
	void display()
	{
		System.out.println("JavaclassA is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("JavaclassB is running");
	}
}
public class prog63_method_overiding {

	public static void main(String[] args) {
		javaclassB obj=new javaclassB();
		obj.display();
		// TODO Auto-generated method stub

	}

}
