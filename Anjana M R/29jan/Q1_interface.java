interface interface1
{
	void display();
}
class rectangle implements interface1
{

	@Override
	public void display() {
		int area,x=2,y=4;
		area=x*y;
		System.out.println("Area of rectangle  :"+area);
		
	}
	}

class Sportcar implements interface1
{

	@Override
	public void display() {
		String s="car";
		System.out.println("Name of the sports car  :"+s);
		
	}

}
class manager implements interface1
{

	@Override
	public void display() {
		String name="Anjana";
		System.out.println("Manager name  :"+name);
	}
	
}
public class Q1_interface {

	public static void main(String[] args) {
		rectangle obj1=new rectangle();
		Sportcar obj2=new Sportcar();
		manager obj3=new manager();
		obj1.display();
		obj2.display();
		obj3.display();
		

	}

}
