class a
{
	int x=5;
}
class b extends a
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class program60_single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj = new b();
		obj.display();

	}

}

