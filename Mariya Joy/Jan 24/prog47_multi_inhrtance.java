class t1
{
	int a=5;
}
class t2 extends t1
{
	int b=5;
}
class t3 extends t2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class prog47_multi_inhrtance {

	public static void main(String[] args) {
		t3 obj=new t3();
		obj.display();
		// TODO Auto-generated method stub

	}

}
