interface printable
{
	void display();
	int area=20;
	String car="maruti";
	float salary=200000;
	
}

class rectangle implements printable
{
	 public void display()
	{
		System.out.println("Area of rectangle" + area);
	}
}
class sportcar implements printable
{
	public void display()
	{
		System.out.println("car: " + car);
	}
}
class manager implements printable
{
	public void display()
	{
		System.out.println("salary of manager :" + salary);
	}
}
public class pgm_1 {

	public static void main(String[] args) {
	rectangle obj1=new rectangle();
	obj1.display();
	sportcar obj2=new sportcar();
	obj2.display();
	manager obj3=new manager();
	obj3.display();
	}
		

}
