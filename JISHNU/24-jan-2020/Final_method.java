package day3;
class Aa5
{
	final void display()
	{
		System.out.println("Display 1 is working");
	}
}
class Aa6 extends Aa5
{
	void display()//overriding final method is not possible
	{
		System.out.println("Display 2 is working");
	}
}
public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa6 obj=new Aa6();
		obj.display();

	}

}
