class main
{
	int a=2;
}
class x1 extends main
{
	int b=2;
	void display()
	{
		System.out.println(a+b);
	}
	
}
class x2 extends main
{
	int c=3;
	void display()
	{
		System.out.println(a+c);
	}
}
class x3 extends main
{
	int d=5;
	void display()
	{
		System.out.println(a+d);
	}
	
	
}
public class prog38_hierachial {

	public static void main(String[] args) {
		x1 ob1= new x1();
		ob1.display();
		x2 ob2= new x2();
		ob2.display();
		x3 ob3= new x3();
		ob3.display();

	}

}
