package exercises;
interface inter
{
	void display();
}
class Rectangle implements inter
{

	@Override
	public void display() {
		System.out.println("rectangles");
	}
	
}
class SportCar implements inter
{

	@Override
	public void display() {
		System.out.println("sportcar");
		
	}
	
}
class Manager implements inter
{

	@Override
	public void display() {
		System.out.println("manager class");
	}
	
}
public class lab1 {

	public static void main(String[] args) 
	{
		Rectangle obj=new Rectangle();
		obj.display();
		SportCar obj1=new SportCar();
		obj1.display();
		Manager obj2=new Manager();
		obj2.display();
	}

}
