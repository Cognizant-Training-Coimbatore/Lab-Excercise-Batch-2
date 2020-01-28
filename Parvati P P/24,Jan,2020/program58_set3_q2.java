package Package2;

class t1
{
	int a=2;
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
public class program58_set3_q2 {

	public static void main(String[] args) {
	t3 obj = new t3();
	obj.display();

	}

}
