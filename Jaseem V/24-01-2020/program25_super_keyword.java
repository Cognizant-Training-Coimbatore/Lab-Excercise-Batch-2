class a1
{
	int x =10;
}
class b1 extends a1
{
	int x =100;
	void display()
	{
		System.out.println(super.x);
	}
}
public class program25_super_keyword {

	public static void main(String[] args) 
	{
		b1 obj =new b1();
		obj.display();

	}

}
