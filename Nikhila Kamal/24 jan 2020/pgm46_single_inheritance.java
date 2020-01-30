class c1
{
	int x=5;
}
class c2 extends c1
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class pgm46_single_inheritance {

	public static void main(String[] args) {
		
		//c1 obj=new c1();
		c2 obj1=new c2();
		obj1.display();
	}

}
