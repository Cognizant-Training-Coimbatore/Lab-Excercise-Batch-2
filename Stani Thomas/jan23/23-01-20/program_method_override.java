class javaclassA
{
	void display()
	{
		System.out.println("javaclassA is runnimg");
	}
	
}
class javaclassB extends javaclassA
{
	void display()
	{
		System.out.println("javaclassB is runnimg");	
	}
}
public class program_method_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
javaclassB obj=new javaclassB();
obj.display();
	}

}
