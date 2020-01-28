class a
{
	int a=2;
}
class b extends a
{
	int b=3;
}
class c extends b
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class questn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.display();
	}

}
