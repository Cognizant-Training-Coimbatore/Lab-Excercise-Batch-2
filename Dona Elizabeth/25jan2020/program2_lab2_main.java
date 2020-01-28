import demo1.program2_class2;

class B extends program2_class2
{
	void display()
	{
		System.out.println(a+b);
	}
}
public class program2_lab2_main {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();
		
	}

}
