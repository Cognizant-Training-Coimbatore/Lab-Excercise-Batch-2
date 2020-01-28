package demo;
class sample3
{
void display1()
  {
	System.out.println("display 1 is running");
	}
void display2()
{
	System.out.println("display 2 is running");
	display1();
}

}

public class Nesting_of_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample3 obj1=new sample3();
		obj1.display1();
		obj1.display2();
	}

}
