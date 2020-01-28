class s1
{
	void display1()
	{
		System.out.println("This is parent class");
	}
}

class s2 extends s1
{
	void display2()
	{
		System.out.println("This is child class");
	}
}



public class ex2_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 obj1=new s1();
		s2 obj2=new s2();
		obj1.display1();
		obj2.display2();
		obj2.display1();
	}

}
