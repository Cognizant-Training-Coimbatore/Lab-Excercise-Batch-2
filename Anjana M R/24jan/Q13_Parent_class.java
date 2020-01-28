class parent
{
	void display1()
	{
		System.out.println("Parent");
	}
}
class child extends parent
{
	void display2()
	{
		System.out.println("Child");
	}
}
public class Q13_Parent_class {

	public static void main(String[] args) {
	parent obj1=new parent();
	child obj2=new child();
	obj1.display1();
	obj2.display2();
	obj2.display1();

	}

}
