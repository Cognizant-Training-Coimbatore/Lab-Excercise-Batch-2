class test2
{
	void display()
	{
		System.out.println("Display without arg");
	}
	void display(int x)
	{
		System.out.println(x+5);
	}
}
public class program29_methover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test2 obj = new test2();
			obj.display();
			obj.display(2);
	}

}
