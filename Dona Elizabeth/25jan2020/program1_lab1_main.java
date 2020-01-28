import demo1.program1_lab1;

class A extends program1_lab1
{
	int b=30;
	void display()
	{
		System.out.println(a+b);
	}
}

public class program1_lab1_main {

	public static void main(String[] args) {
		A obj=new A();
		obj.display();
	}

}
