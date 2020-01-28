package day3;
class a11
{
	void print()
	{
		System.out.println("This is parent class");
	}
}
class a22 extends a11
{
	void display()
	{
		System.out.println("This is child class");
	}
}
public class Q13_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a11 obj1=new a11();
		a22 obj2=new a22();
		obj1.print();
		obj2.display();
		obj2.print();
	}

}
