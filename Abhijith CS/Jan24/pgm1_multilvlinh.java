class inheritance
{
	int a=5;
}
class a extends inheritance
{
	int b=3;
}
class b extends a
{
	int  c= a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class pgm1_multilvlinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t3 obj = new t3();
		obj.display();
	}

}

