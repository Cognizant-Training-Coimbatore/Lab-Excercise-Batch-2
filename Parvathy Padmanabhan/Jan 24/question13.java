class disp1
{
	void display()
	{
		System.out.println("This is parent class");
	}
}
class subdisp extends disp1
{
	void subdisplay()
	{
		System.out.println("This is child class");
	}
}
public class question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp1 obj = new disp1();
		subdisp obj1 = new subdisp();
		obj.display();
		obj1.subdisplay();
		obj1.display();
	}

}
