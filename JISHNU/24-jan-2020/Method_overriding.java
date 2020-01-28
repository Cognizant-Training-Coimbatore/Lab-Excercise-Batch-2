package day3;
class Aa4
{
	void display()
	{
		System.out.println("Class Aa4 is running");
	}
}
class Aa3 extends Aa4
{
	void display()
	{
		System.out.println("Class Aa3 is running");
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa3 obj=new Aa3();
		obj.display();
		

	}

}
