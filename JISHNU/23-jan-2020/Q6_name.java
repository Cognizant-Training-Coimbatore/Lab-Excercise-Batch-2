package Jishnu;
class Student11
{
	String name="Unknown";
	Student11(String name1)
	{
		name=name1;
	}
	Student11()
	{
		name="Unknown";
	}
	void print()
	{
		System.out.println("Name: "+name);
	}
}
public class Q6_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11 obj=new Student11("Jishnu");
		Student11 obj2=new Student11();
		obj.print();
		obj2.print();
	}

}
