package demo;
//write a program with protected field of a class be 
//inherited to subclass outside the package?  
import packNEW.program_30_Q1;
class subcls extends program_30_Q1
{
	void disp()
	{
		System.out.println("This is a subclass");
	}
}
public class program_30_Q1_protected_subclass_outside_package
{

	public static void main(String[] args) 
	{
		subcls obj=new subcls();
		obj.display();

	}

}
