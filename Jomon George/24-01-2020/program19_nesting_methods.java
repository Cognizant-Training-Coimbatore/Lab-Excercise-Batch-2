package demo;

class sample2{
	void display1()
	{
		System.out.println("Display 1");
		display2();
	}
	void display2()
	{
		System.out.println("Display 2");
	}
}
public class program19_nesting_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 obj = new sample2();
		obj.display1();
		obj.display2();
	}

}
