class a
{
	int x=3;
}
class b extends a
{
	int y=5;
}
class inherit extends b
{
	void display()
	{
		System.out.println(x+y);
	}
}
public class question11_class_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit obj = new inherit();
		obj.display();

	}

}
