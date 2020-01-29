package project1;
interface printable
{
	void display();
	
	
}
class rect implements printable 
{

	
	public void display() {
		System.out.println("Rectangle");
	}

	}
class sportcar implements printable
{
	public void display() {
		System.out.println("Sportcar");
	}}
	class manager implements printable
	{
		public void display() {
			System.out.println("Manager");
		}
	}

public class jan29_ex1 {

	public static void main(String[] args) {
		rect obj1=new rect();
		obj1.display();
		sportcar obj2=new sportcar();
		obj2.display();
		manager obj3=new manager();
		obj3.display();
			}

		}
