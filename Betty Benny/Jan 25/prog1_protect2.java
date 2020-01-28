package packB;
import packA.prog1_protect;

public class prog1_protect2 extends prog1_protect
{
	void display()
	{
		System.out.println("Value of variables is  " +a);
	}
	
	public static void main(String[] args)
	{
		prog1_protect2 obj=new prog1_protect2();
	        obj.display();
	
		
	}
}
z