package day3;
class c1
{
	int x=5;
}
class c2 extends c1
{
	int y=6;
	void display()
	{
		System.out.println(x+y);
	}
}
public class Single_inheritance {

	public static void main(String[] args) {
		c2 obj=new c2();
		obj.display();
	}

}

