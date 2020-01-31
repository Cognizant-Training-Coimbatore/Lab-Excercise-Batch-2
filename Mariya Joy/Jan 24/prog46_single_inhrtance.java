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
public class prog46_single_inhrtance {

	public static void main(String[] args) {
		c2 obj=new c2();
		obj.display();
		// TODO Auto-generated method stub

	}

}
