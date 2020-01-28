package demo;
class test2
{
	void display()
	{
		
		System.out.println("display method without argument");
	}
	void display(int x)
	{
		System.out.println("new display method");
	}
}

public class program13_methodoverloading {

	public program13_methodoverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.display(3);
		obj.display();

	}

}
