class one
{
	  void display()
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
public class final_ {

	public static void main(String[] args) {
		two obj=new two();
		obj.display();
		

	}

}
