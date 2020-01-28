package demo;
class qwe
{
	static int x=100;
	void display()
	{
		x++;
		System.out.println(x);
	}
}
public class q26_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
qwe obj=new qwe();
System.out.println("brfore calling:"+qwe.x);
System.out.print("after calling:");
obj.display();



	}

}
