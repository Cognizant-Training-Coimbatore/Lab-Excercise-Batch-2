package exercises;
interface test
{
	void square();
	
}
class ToTestInt
{

	
	public void display() {
		System.out.println("totestint is running");
		
	}
	
}
class arithematic extends ToTestInt implements test
{

	@Override
	public void square() 
	{
		System.out.println("arithematic is running");
		
	}
	
}
public class lab4 {

	public static void main(String[] args) {
		arithematic obj=new arithematic();
		obj.square();
		obj.display();
		

	}

}
