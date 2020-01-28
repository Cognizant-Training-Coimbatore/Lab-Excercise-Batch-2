class a1
{
	int x=10;
}
class b1 extends a1
{
	int x=100;
	void display()
	{
		System.out.println(super.x);
	}
}
public class program26_super {

	public static void main(String[] args) {
		b1 obj=new b1();
		obj.display();
		// TODO Auto-generated method stub

	}

}
