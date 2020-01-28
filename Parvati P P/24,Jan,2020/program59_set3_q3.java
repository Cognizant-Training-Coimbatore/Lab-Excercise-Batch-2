package Package2;

class parent
{
	
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void display2()
	{
		System.out.println("This is child class");
	}
}

public class program59_set3_q3 {

	public static void main(String[] args) {
	parent obj1=new parent();
    child obj2=new child();
    obj1.display1();
    obj2.display2();
    obj2.display1();
	}

}
