class x1
{
	int a=7;
}
class x2 extends x1
{
	int b=5;
	void display() {
		System.out.println(a+b);
	}
}
class x3 extends x1
{
	int c=10;
	void display1()
	{
		System.out.println(c+a);
	}
}

public class heirar_inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
x2 obj =new x2 ();
obj.display();
x3 obj2 =new x3();
obj2.display1();
	}

}
