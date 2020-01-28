class c1
{
	int x=5;
	
}
class c2 extends  c1
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c2 obj = new c2();
obj.display();
	}

}
