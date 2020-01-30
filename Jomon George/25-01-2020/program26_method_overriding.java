package demo;

class javaclassA{
	void display()
	{
		System.out.println("Java Class A");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("Java Class B");
	}
}

public class program26_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaclassB obj = new javaclassB();
		obj.display();

	}

}
