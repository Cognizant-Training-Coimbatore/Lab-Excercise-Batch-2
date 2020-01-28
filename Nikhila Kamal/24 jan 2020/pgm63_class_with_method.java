class nik
{
	void display()
	{
		System.out.println("This is a parent class");
	}
}
	class nikh extends nik
	{
		void fun()
		{
			System.out.println("This is child class");
		}
	}
	

public class pgm63_class_with_method {

	public static void main(String[] args) {
		nik obj=new nik();
		obj.display();
		nikh obj1=new nikh();
		obj1.fun();
		obj1.display();
		

		

	}

}
