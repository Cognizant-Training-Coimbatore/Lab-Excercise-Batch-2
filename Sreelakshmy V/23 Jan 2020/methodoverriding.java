class javaclassA
{
	void display()
	{
		System.out.println("Javaclass A is running");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("JavaclassB is running");
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
javaclassB ob=new javaclassB();
ob.display();
	}

}
