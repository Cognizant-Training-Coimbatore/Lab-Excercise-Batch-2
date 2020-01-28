class t1
{
	int a=1;
}
class t2 extends t1
{
	int b=2;
}
class t3 extends t2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class program24_multilevel_inheritance {

	public static void main(String[] args) {
		t3 obj=new t3();
		obj.display();
		// TODO Auto-generated method stub

	}

}
