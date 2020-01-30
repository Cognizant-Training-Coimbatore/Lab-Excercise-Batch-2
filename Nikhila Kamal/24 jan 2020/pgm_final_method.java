class one
{
	final void display()
	{
		System.out.println("display1 is working");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("display2 is working");
	}
}
public class pgm_final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two obj=new two();
		obj.display();
	}

}
