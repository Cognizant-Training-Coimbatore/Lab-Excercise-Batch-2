interface Printable
{
	void print();
	
}

class rectangle implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle class");
		
	}
	
}

class Sportcar implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sportcar class");
		
	}
	
}

class Manager implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Manager class");
		
	}
	
}
public class lab1 {

	public static void main(String[] args) {
		rectangle obj=new rectangle();
		Sportcar obj1=new Sportcar();
		Manager obj2=new Manager();
		obj.print();
		obj1.print();
		obj2.print();

	}

}
