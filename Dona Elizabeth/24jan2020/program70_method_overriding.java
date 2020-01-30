class javaclassA
{
	void display()
	{
		System.out.println("javaclassA is runnung");
	}
	
}

class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("javaclassB is running");
	}
}
public class program70_method_overriding {

	public static void main(String[] args) {
		javaclassB b=new javaclassB();
		b.display();
	}

}
