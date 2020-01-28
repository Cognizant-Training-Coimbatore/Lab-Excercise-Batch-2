class one
{
	final void display()
	{
		System.out.println("display one s working");
	}
}
class two extends one
{
	void display1()
	{
		System.out.println("display two is working");
	}
}
public class program41_final_method {

	public static void main(String[] args) 
	{
		two obj= new two();
		obj.display();
	}

}
