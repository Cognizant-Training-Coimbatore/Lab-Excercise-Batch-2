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
public class super_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b1 o=new b1();
o.display();
	}

}
