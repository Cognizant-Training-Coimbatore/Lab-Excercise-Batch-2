class javaclassA
{
	void display()
	{
	System.out.println("javaclass a is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
	System.out.println("javaclass b is running");
	}
}
public class program111_method_overriding {

	public static void main(String[] args) {
		javaclassB obj = new javaclassB();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
