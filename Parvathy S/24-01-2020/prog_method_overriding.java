class javaclassA
{
	void display()
	{
		System.out.println("Running...");
	}
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("Walking...");
	}
}
public class prog_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        javaclassB obj = new javaclassB();
        obj.display();
	}

}
