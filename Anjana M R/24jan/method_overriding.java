class javaclassA
{
	void display()
	{
		System.out.println("java class a is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	
	{
		System.out.println("Java class b is running");
	}
}
public class method_overriding {

	public static void main(String[] args) {
		javaclassB obj=new javaclassB();
		obj.display();
	}

}
