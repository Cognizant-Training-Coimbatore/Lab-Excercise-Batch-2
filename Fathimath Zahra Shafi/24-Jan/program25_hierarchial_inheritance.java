class x1
{
	int a=4;
}
class x2 extends x1
{
int b=5;

void display()
{
	System.out.println(a+b);
}
}
class x3 extends x1
{
	int c=7;
	void display()
	{
		System.out.println(a+c);
	}
}
public class program25_hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x3 obj = new x3();
		x2 obj1 = new x2();
		obj.display();
		obj1.display();
		

	}

}
