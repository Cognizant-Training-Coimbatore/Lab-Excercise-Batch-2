class a
{
	int x=10;
}
class b extends a
{
	int y=20;
	
}
class inherit extends b
{
	
	void display()
	{
		System.out.println(x+y);
	}
}
public class program60_lab11_class {

	public static void main(String[] args) {

		inherit obj=new inherit();
		obj.display();
	}

}
