package demo;
class a
{
	int a=20;
}
class b extends a
{
	int b=25;
	void display()
	{
		System.out.println(a+b);
	}
}
public class q21_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();
obj.display();
	}

}
