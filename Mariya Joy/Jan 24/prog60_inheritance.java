class a
{
	int x=5;
}
class b extends a{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class prog60_inheritance {

	public static void main(String[] args) {
		b obj=new b();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
