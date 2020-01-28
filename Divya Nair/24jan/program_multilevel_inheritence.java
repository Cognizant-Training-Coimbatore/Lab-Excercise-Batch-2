class t
{
	int a=2;
}
class t1 extends t
{
	int b=5;
}
class t2 extends t1
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class program_multilevel_inheritence {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		t2 obj=new t2();
		obj.display();

	}

}
