package classworkB;
import classworkA.question3_access_package;
class access extends question3_access_package 
{
	public void display()
	
	{
		super.display();
		System.out.println("Sub class");
}
}
public class question3_package {

	public static void main(String[] args) 
	{
		access n=new access();
	    n.display();
		

	}

}


