class b1
{
	int x=10;
}
class b2 extends b1
{
	int x=100;
	void display()
	{
		System.out.println(super.x);
	}
}
public class program_super_keyword {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		b2 obj=new b2();
		obj.display();
	}

}
