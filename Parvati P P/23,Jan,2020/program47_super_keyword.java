class a1
{
	int x=10;
}
class b1 extends a1
{
	int x=100; //u have super class but same variable used in sub class.sub class is overriding the ppties of subclass -OVERRIDING
	void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class program47_super_keyword {

	public static void main(String[] args) {
		b1 obj=new b1();
		obj.display();
		
	}

}
