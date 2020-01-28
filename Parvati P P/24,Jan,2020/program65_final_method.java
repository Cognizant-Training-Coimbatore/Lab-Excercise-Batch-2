class one
{
	void display() //if we make this final method that method is not overridden in subclass
	{
		System.out.println("Display is working..");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("Display2 is working..");
	}
}
public class program65_final_method {

	public static void main(String[] args) {
		two obj=new two();
		obj.display();

	}

}
