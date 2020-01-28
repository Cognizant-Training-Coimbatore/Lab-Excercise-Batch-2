class a
{
	int x=10;
	
}
class b extends a
{
	int y=100;
	void display()
	{
		System.out.println("sum of x and y is:" +(x+y));
		
	}
}
public class program1_class_inherit {

	public static void main(String[] args) {
		b obj = new b();
		obj.display();
		// TODO Auto-generated method stub

	}

}
